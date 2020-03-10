package com.Spring_Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.Spring_Boot.dao")
public class Manager {
    public static void main(String[] args) {
        SpringApplication.run(Manager.class);
    }
}
