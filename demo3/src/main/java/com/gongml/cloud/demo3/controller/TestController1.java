package com.gongml.cloud.demo3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: alibaba_learn
 * @description:
 **/
@Slf4j
@RestController
public class TestController1 {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test1")
    public String test1() {
        String result = restTemplate.getForObject("http://alibaba-nacos-demo1/hello?name=gongml", String.class);
        return "Return : " + result;
    }
}
