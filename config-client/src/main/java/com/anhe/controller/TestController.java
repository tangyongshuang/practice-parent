package com.anhe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    /**
     * 注意这里引用的是org.springframework.core.env.Environment，并不是org.springframework.cloud.config.environment.Environment
     */
    @Autowired
    private org.springframework.core.env.Environment springEnv;

    @RequestMapping("/from2")
    public String from2(){
        return springEnv.getProperty("from");
    }


    @RequestMapping("/from")
    public String from(){
        return this.from;
    }
}
