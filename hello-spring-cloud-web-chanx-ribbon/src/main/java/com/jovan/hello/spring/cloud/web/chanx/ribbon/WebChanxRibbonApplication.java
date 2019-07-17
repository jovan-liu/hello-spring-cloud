package com.jovan.hello.spring.cloud.web.chanx.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class WebChanxRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebChanxRibbonApplication.class, args);
    }
}
