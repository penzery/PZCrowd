package com.pz.crowd.controller;

import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class RedisProviderController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

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
