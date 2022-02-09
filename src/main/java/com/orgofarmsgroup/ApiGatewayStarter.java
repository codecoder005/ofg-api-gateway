package com.orgofarmsgroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ApiGatewayStarter {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayStarter.class, args);
    }
}
