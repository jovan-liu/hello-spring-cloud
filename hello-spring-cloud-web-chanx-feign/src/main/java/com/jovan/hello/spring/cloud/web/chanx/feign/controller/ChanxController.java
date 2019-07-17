package com.jovan.hello.spring.cloud.web.chanx.feign.controller;

import com.jovan.hello.spring.cloud.web.chanx.feign.service.ChanxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChanxController {

    @Autowired
    private ChanxService chanxService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String message) {
        return chanxService.sayHi(message);
    }
}
