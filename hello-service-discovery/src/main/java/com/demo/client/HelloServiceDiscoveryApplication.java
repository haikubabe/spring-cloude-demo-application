package com.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceDiscoveryApplication.class, args);
    }

    @RequestMapping("/")
    public String sayHello() {
        return "Hello!!!";
    }
}
