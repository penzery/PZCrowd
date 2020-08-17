package com.pz.crowd.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pz.crowd.entity.vo.DetailProjectVO;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class RedisProviderController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/provider/key/exists/bitmap")
    public ResultEntity<Boolean> keyExists(
            @RequestParam("indexsJSON") String indexsJSON,
            @RequestParam("BIT_MAP_KEY")String BIT_MAP_KEY
    ){
        List<Long> longs = JSONArray.parseArray(indexsJSON, Long.class);
        List list = stringRedisTemplate.executePipelined(new RedisCallback<Object>() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                redisConnection.openPipeline();
                for (int i = 0; i < longs.size(); i++) {
                    redisConnection.getBit(BIT_MAP_KEY.getBytes(), longs.get(i));
                }
                redisConnection.close();
                return null;
            }
        });
        return ResultEntity.successWithData(!list.contains(false));
    }

    @RequestMapping("/provider/put/to/bitmap")
    public ResultEntity putToBitMap(@RequestParam("indexsJSON")String indexsJSON,@RequestParam("BIT_MAP_KEY")String BIT_MAP_KEY){
        List<Long> longs = JSONArray.parseArray(indexsJSON, Long.class);
        stringRedisTemplate.executePipelined(new RedisCallback<Object>() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                redisConnection.openPipeline();
                for (int i = 0; i < longs.size(); i++) {
                    redisConnection.setBit(BIT_MAP_KEY.getBytes(),longs.get(i),true);
                }
                redisConnection.close();
                return null;
            }
        });
        return ResultEntity.successWithoutData();
    }

    @RequestMapping("/privider/create/bitmap")
    public ResultEntity createBitMap(
            @RequestParam("BIT_MAP_KEY") String BIT_MAP_KEY,
            @RequestParam("maxBitNum") Long maxBitNum,
            @RequestParam("lastBitStatus") Boolean lastBitStatus
    ){
        stringRedisTemplate.opsForValue().setBit(BIT_MAP_KEY,maxBitNum,lastBitStatus);
        return ResultEntity.successWithoutData();
    }

    @RequestMapping("/provider/exists/bitmap")
    public ResultEntity<Boolean> existsBitMap(@RequestParam("BIT_MAP_KEY")String BIT_MAP_KEY){
        if (stringRedisTemplate.opsForValue().get(BIT_MAP_KEY)==null){
            return ResultEntity.successWithData(false);
        }
        return ResultEntity.successWithData(true);
    }

    @RequestMapping("/provider/get/detailProjectVO/remote")
    public ResultEntity<DetailProjectVO> getDetailProjectVORemote(@RequestParam("projectId")Long projectId){
        String redisKey = "project:"+projectId;
        String s = stringRedisTemplate.opsForValue().get(redisKey);
        if (s==null){
            // 缓存里没有
            return null;
        }
        DetailProjectVO detailProjectVO = JSONObject.parseObject(s, DetailProjectVO.class);
        return ResultEntity.successWithData(detailProjectVO);
    }

    @RequestMapping("/provider/set/string/kv/remote")
    public ResultEntity<String> setStringKeyValueRemote(
            @RequestParam("key")String key,
            @RequestParam("value")String value
    ){
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            operations.set(key,value);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }

    }

    @RequestMapping("/provider/set/string/kv/with/timeout/remote")
    public ResultEntity<String> setStringKeyValueWithTimeoutRemote(
            @RequestParam("key")String key,
            @RequestParam("value")String value,
            @RequestParam("time")long time,
            @RequestParam("timeUnit") TimeUnit timeUnit
    ){
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            operations.set(key, value, time, timeUnit);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/provider/get/string/by/key/remote")
    public ResultEntity<String> getStringValueByKeyRemote(@RequestParam("key")String key){
        try {
            ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
            String value = operations.get(key);
            return ResultEntity.successWithData(value);
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }

    }

    @RequestMapping("/provider/remove/key/remote")
    public ResultEntity<String> removeKeyRemote(@RequestParam("key")String key){
        try {
            stringRedisTemplate.delete(key);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }

    }
}
