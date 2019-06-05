package com.anhe.dto.com.anhe.service;

import com.anhe.dto.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/refactor")
public interface BasicService {

    @RequestMapping("/hello4")
    String hello4(@RequestParam("name") String name);

    @RequestMapping("/hello5")
    User hello5(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping("/hello6")
    String hello6(@RequestBody User user);

}
