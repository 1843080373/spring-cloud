package com.pking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider02ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Provider02ServerApplication.class, args);
    }
}