package com.jovan.hello.spring.cloud.web.chanx.feign.service;

import com.jovan.hello.spring.cloud.web.chanx.feign.service.hystrix.ChanxServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-chanx", fallback = ChanxServiceHystrix.class)
public interface ChanxService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
