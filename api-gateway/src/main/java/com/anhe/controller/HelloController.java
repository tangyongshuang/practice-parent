package com.anhe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实现api网关的本地跳转demo
 */
@RestController
public class HelloController {

    @RequestMapping("/local/hello")
    public String hello(){
        return "Hello this is api local jump";
    }
}
