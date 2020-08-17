package com.pz.crowd.util;

import com.alibaba.fastjson.JSONArray;
import com.pz.crowd.api.CrowdRedisRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@ConfigurationProperties("bloom.filter")
@Component
public class MyBloomFilter {
    private long expectSize;
    private double fpp;
    @Autowired
    private CrowdRedisRemoteService crowdRedisRemoteService;

    private static final String BIT_MAP_KEY = "crowd:bloomFilter";
    private long numBits;
    private int hashMethods;

    public long getExpectSize() {
        return expectSize;
    }

    public void setExpectSize(long expectSize) {
        this.expectSize = expectSize;
    }

    public double getFpp() {
        return fpp;
    }

    public void setFpp(double fpp) {
        this.fpp = fpp;
    }

    @PostConstruct
    public void init(){
        numBits = getNumOfBits(expectSize,fpp);
        hashMethods = getNumOfHashMethods(expectSize,numBits);
        if (!crowdRedisRemoteService.existsBitMap(BIT_MAP_KEY).getData()){
            crowdRedisRemoteService.createBitMap(BIT_MAP_KEY,numBits,false);
        }
    }

    private long getNumOfBits(long expectSize,double fpp) {
        return (long)(-expectSize*Math.log(fpp)/(Math.log(2)*Math.log(2)));
    }

    // 使用位数组长度/预计元素个数得到 hash方法数
    private int getNumOfHashMethods(long expectSize,long numBits){
        double d = numBits;
        return Math.max(1, (int) Math.round(numBits / expectSize * Math.log(2)));
    }

    public void put(String key){
        long[] index = getIndex(key);
        String indexsJSON = JSONArray.toJSONString(index);
        crowdRedisRemoteService.putToBitMap(indexsJSON,BIT_MAP_KEY);
    }

    public boolean exists(String key){
        long[] index = getIndex(key);
        String indexsJSON = JSONArray.toJSONString(index);

        ResultEntity<Boolean> booleanResultEntity = crowdRedisRemoteService.keyExists(indexsJSON, BIT_MAP_KEY);
        return booleanResultEntity.getData();
    }

    // 根据key获取bitmap下标
    private long[] getIndex(String key){
        long hash1 = key.hashCode();
        long hash2 = hash1 >>> 16;
        long[] result = new long[hashMethods];
        for (int i = 0; i < hashMethods; i++) {
            long finalHash = hash1*i+hash2;
            if (finalHash<0){
                finalHash = ~finalHash;
            }
            result[i] = finalHash % numBits;
        }
        return result;
    }

}
