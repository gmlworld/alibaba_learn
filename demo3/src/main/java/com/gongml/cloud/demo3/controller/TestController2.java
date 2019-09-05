package com.gongml.cloud.demo3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @program: alibaba_learn
 * @description:
 **/
@Slf4j
@RestController
public class TestController2 {
    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/test2")
    public Mono<String> test2() {
        Mono<String> result = webClientBuilder.build()
                .get()
                .uri("http://alibaba-nacos-demo1/hello?name=gongml")
                .retrieve()
                .bodyToMono(String.class);
        return result;
    }
}
