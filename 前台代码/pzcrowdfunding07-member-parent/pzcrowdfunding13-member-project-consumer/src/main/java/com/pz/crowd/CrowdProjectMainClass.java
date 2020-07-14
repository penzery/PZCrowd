package com.pz.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CrowdProjectMainClass {
    public static void main(String[] args) {
        SpringApplication.run(CrowdProjectMainClass.class,args);
    }
}
