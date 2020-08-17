package com.pz.crowd;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class CrowdProjectMainClass {
    @Bean
    public RedissonClient redissonClient(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379").setConnectionPoolSize(100);
        return Redisson.create(config);
    }
    public static void main(String[] args) {
        SpringApplication.run(CrowdProjectMainClass.class,args);
    }
}
