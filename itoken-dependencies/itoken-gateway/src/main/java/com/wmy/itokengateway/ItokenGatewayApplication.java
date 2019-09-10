package com.wmy.itokengateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ItokenGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItokenGatewayApplication.class, args);
    }

}
