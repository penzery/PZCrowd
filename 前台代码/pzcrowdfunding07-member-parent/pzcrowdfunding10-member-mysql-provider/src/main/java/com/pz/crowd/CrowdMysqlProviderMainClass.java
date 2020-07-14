package com.pz.crowd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pz.crowd.mapper")
@SpringBootApplication
public class CrowdMysqlProviderMainClass {
    public static void main(String[] args) {
        SpringApplication.run(CrowdMysqlProviderMainClass.class,args);
    }
}
