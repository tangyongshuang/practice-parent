package com.anhe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return restTemplate.getForEntity("http://BASICAPPILICATION/hello",String.class).getBody();
    }
}
