package com.Alipay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Source_Alipay {
    public static void main(String[] args) {
        SpringApplication.run(Source_Alipay.class);
    }
}
