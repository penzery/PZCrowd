package com.pz.crowd.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pz.crowd.api.CrowdMysqlRemoteService;
import com.pz.crowd.api.CrowdRedisRemoteService;
import com.pz.crowd.entity.vo.DetailProjectVO;
import com.pz.crowd.service.api.DetailProjectService;
import com.pz.crowd.util.MyBloomFilter;
import com.pz.crowd.util.ResultEntity;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class DetailProjectServiceImpl implements DetailProjectService {
    @Autowired
    private CrowdMysqlRemoteService crowdMysqlRemoteService;
    @Autowired
    private CrowdRedisRemoteService crowdRedisRemoteService;
    @Autowired
    private MyBloomFilter myBloomFilter;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedissonClient redissonClient;
    @Override
    public DetailProjectVO getDetailProjectVO(Long projectId) {
        String redisKey = "project:"+projectId;
        ResultEntity<DetailProjectVO> detailProjectVORemote = crowdRedisRemoteService.getDetailProjectVORemote(projectId);
        if (detailProjectVORemote!=null){
            DetailProjectVO detailProjectVO = detailProjectVORemote.getData();
            return detailProjectVO;
        }else{
            // 缓存里没有
            if (!myBloomFilter.exists(redisKey)){
                // 布隆过滤器没见过，数据库里必定没有
                return null;
            }
            //布隆过滤器有
            /*
              防止缓存击穿：
                缓存击穿：一个热点数据缓存失效，此时大量请求并发访问同时进入数据库，造成数据库崩溃
                预防办法：如果判定缓存里没有，布隆过滤器说有，那么加一层分布式锁，只让一个线程去访问数据库然后写入缓存
                         加锁之后再判断一次缓存里有无，第二个线程判断就会发现缓存里有，就不用去访问数据库
             */
            String lockKey = "lock:project:"+projectId;
            RLock lock = redissonClient.getLock(lockKey);
            try {
                while (true){
                    if(lock.tryLock(1,2000, TimeUnit.MILLISECONDS)){
                        // 获取分布式锁之后再检查一次缓存，防止前期所有请求都查数据库
                        ResultEntity<DetailProjectVO> detailProjectVORemote1 = crowdRedisRemoteService.getDetailProjectVORemote(projectId);
                        if (detailProjectVORemote!=null) {
                            DetailProjectVO detailProjectVO = detailProjectVORemote.getData();
                            return detailProjectVO;
                        }
                        // 查数据库
                        DetailProjectVO detailProjectVO = crowdMysqlRemoteService.getDetailProjectVORemote(projectId).getData();
                        System.out.println("进行数据库查询");
                        if (detailProjectVO==null){
                            // 数据库里可能没有，布隆过滤器误判，实际上没有，因为hash冲突判断为有
                            return null;
                        }
                        // 数据库里有，加入到缓存
                        Random random = new Random();
                        double v = random.nextDouble();
                        int v1 = (int)(5 + v) * 24 * 60 * 60;
                        stringRedisTemplate.opsForValue().set(redisKey, JSON.toJSONString(detailProjectVO),v1, TimeUnit.SECONDS);
                        return detailProjectVO;
                    }else{
                        System.out.println("没拿到锁的查缓存");
                        ResultEntity<DetailProjectVO> detailProjectVORemote2 = crowdRedisRemoteService.getDetailProjectVORemote(projectId);
                        if (detailProjectVORemote!=null) {
                            DetailProjectVO detailProjectVO = detailProjectVORemote.getData();
                            return detailProjectVO;
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (lock.isHeldByCurrentThread()){
                    lock.unlock();
                }
            }

            return null;
        }
    }
}
