package com.anhe.controller;

import com.anhe.entity.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Albert.Tang on 2019/5/10 4:17 PM.
 */
@RestController
public class XMLRestController {
    @GetMapping(path = "/xml/user", produces = MediaType.APPLICATION_XML_VALUE)
    public User user() {

        User user = new User();

        user.setName("XML");
        user.setAge(30);

        return user;
    }
}
