package com.anhe.invoke;

import com.anhe.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceFallback.class);


    @Override
    public String hello() {
        logger.error("invoke hello failure...");
        return "服务调用异常";
    }

    @Override
    public String hello1(String name) {
        logger.error("invoke hello1 failure...");
        return "服务调用异常";
    }

    @Override
    public User hello2(String name, Integer age) {
        logger.error("invoke hello2 failure...");
        return new User(false,"服务调用异常");
    }

    @Override
    public String hello3(User user) {
        logger.error("invoke hello3 failure...");
        return "服务调用异常";
    }
}
