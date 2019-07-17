package com.jovan.hello.spring.cloud.service.chanx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceChanxApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceChanxApplication.class, args);
    }
}
