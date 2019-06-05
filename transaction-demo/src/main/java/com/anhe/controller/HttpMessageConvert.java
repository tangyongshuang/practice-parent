package com.anhe.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Albert.Tang on 2019/4/30 6:22 AM.
 */
@RestController
public class HttpMessageConvert {

    @GetMapping("/msg")
    public String getString(){
        return JSON.toJSONString("It's a MessageConvert");
    }

}
