package com.anhe.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.concurrent.TimeoutException;

/**
 * Created by Albert.Tang on 2019/4/25 7:26 PM.
 */
@RestControllerAdvice(assignableTypes = HystrixController.class)
public class Aspect {


    @ExceptionHandler(value = TimeoutException.class)
    public Object timeoutHandle() {

        return JSON.toJSONString("请求超时");

    }
}
