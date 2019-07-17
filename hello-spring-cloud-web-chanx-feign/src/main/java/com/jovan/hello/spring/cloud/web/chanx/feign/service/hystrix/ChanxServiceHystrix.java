package com.jovan.hello.spring.cloud.web.chanx.feign.service.hystrix;

import com.jovan.hello.spring.cloud.web.chanx.feign.service.ChanxService;
import org.springframework.stereotype.Component;

@Component
public class ChanxServiceHystrix implements ChanxService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is: %s, but request is bad", message);
    }
}
