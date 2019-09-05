package com.gongml.cloud.demo3.controller;

import com.gongml.cloud.demo3.config.FeignConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: alibaba_learn
 * @description:
 **/
@Slf4j
@RestController
public class TestController3 {
    @Autowired
    FeignConfig.Client client;

    @GetMapping("/test3")
    public String test3() {
        String result = client.hello("gongml");
        return "Return : " + result;
    }
}
