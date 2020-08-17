package com.pz.crowd;

import org.redisson.Redisson;
import org.redisson.config.Config;
import org.redisson.api.RedissonClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrowdRedisProviderMainClass {
    @Bean
    public RedissonClient redissonClient(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379").setConnectionPoolSize(100);
        return Redisson.create(config);
    }
    public static void main(String[] args) {
        SpringApplication.run(CrowdRedisProviderMainClass.class,args);
    }
}
