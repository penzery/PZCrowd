package com.pz.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CrowdEurekaMainClass {
    public static void main(String[] args) {
        SpringApplication.run(CrowdEurekaMainClass.class,args);
    }
}
