package com.anhe.controller;


import com.alibaba.fastjson.JSON;
import com.anhe.dto.User;
import com.anhe.dto.com.anhe.service.BasicService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorController implements BasicService {


    @Override
    public String hello4(@RequestParam("name") String name) {
        System.out.println("hello4" + name);
        return "hello4 " + name;
    }

    @Override
    public User hello5(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        System.out.println("hello5" + name + " " + age);
        return new User(name, age);
    }

    @Override
    public String hello6(@RequestBody User user) {
        System.out.println("[user] "+ JSON.toJSONString(user));
        return "hello6" + user.toString();
    }
}
