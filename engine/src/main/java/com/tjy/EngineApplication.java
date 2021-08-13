package com.tjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan("com.tjy.pojo")
@MapperScan("com.tjy.dao")
public class EngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(EngineApplication.class,args);
    }
}
