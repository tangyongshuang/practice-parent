package com.anhe.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeoutException;

/**
 * Created by Albert.Tang on 2019/4/25 7:11 PM.
 */
@RestController
public class HystrixController {

    private static final Logger logger = LoggerFactory.getLogger(HystrixController.class);

    private static Random random = new Random();

    @GetMapping("/index")
    public String getList() throws Exception {

        int i = random.nextInt(200);
        try {
            if (i > 100) {
                throw new Exception("Time is out,time :" + i);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        return JSON.toJSONString("Hello world");
    }

}
