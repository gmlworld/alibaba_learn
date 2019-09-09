package com.gongml.cloud.demo5.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: alibaba_learn
 * @description:
 **/
@Slf4j
@RestController
@RefreshScope
public class TestController {
    /**
     * 进入Nacos的控制页面，在配置列表功能页面中，点击右上角的“+”按钮，进入“新建配置”页面，如下图填写内容：
     *其中：
     * Data ID：填入alibaba-nacos-test.yml
     * Group：不修改，使用默认值DEFAULT_GROUP
     * 配置格式：选择yml
     * 配置内容：应用要加载的配置内容，这里仅作为示例，做简单配置，比如：name: spring-cloud-alibaba-learning
     */
    @Value("${name:}")
    private String name;


    @GetMapping("/test")
    public String hello() {
        return name;
    }
}
