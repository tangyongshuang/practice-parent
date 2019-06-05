package com.anhe.controller;

import com.alibaba.fastjson.JSON;
import com.anhe.entity.ShipmentC;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Albert.Tang on 2019/5/10 2:57 PM.
 */
@Slf4j
@Controller
public class JSONController {

    @RequestMapping(path = "/create", consumes = MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String getJson(@RequestBody ShipmentC shipmentC, HttpServletRequest request) {

        log.info(JSON.toJSONString(shipmentC));
        return JSON.toJSONString(shipmentC);

    }
}
