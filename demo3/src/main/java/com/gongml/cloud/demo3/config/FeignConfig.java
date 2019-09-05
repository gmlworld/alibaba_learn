package com.gongml.cloud.demo3.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: alibaba_learn
 * @description:
 **/
@Configuration
@EnableFeignClients
public class FeignConfig {

    @FeignClient("alibaba-nacos-demo1")
    public interface Client {
        @GetMapping("/hello")
        String hello(@RequestParam(name = "name") String name);
    }

}
