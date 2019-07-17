package com.jovan.hello.spring.cloud.web.chanx.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChanxService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        return restTemplate.getForObject("http://hello-spring-cloud-service-chanx/hi?message=" + message, String.class);
    }

    public String hiError(String message) {
        return String.format("Hi, your message is: %s, but request is bad", message);
    }
}
