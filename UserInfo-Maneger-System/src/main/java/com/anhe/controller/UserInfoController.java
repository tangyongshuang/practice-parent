package com.anhe.controller;

import com.alibaba.fastjson.JSON;
import com.anhe.entity.UserInfo;
import com.anhe.service.UserInfoService;
import com.anhe.utils.BaseResult;
import com.anhe.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserInfoController {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);


    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/findAll")
    public String findAll(HttpServletRequest request) {

        List<UserInfo> userInfos = userInfoService.findAll();

        logger.info("userInfos ————> {}", JSON.toJSONString(userInfos));


        return JSON.toJSONString(ResultUtils.success(userInfos));
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserInfo userInfo, HttpServletRequest request) {
        BaseResult result = userInfoService.addUser(userInfo);
        return JSON.toJSONString(result);

    }

    @PutMapping("/update/{id}")
    public String updateUser(@RequestBody UserInfo userInfo, HttpServletRequest request, @PathVariable Long id) {
        BaseResult result = userInfoService.updataById(userInfo, id);
        return JSON.toJSONString(result);
    }

    @DeleteMapping("/data/{id}")
    public String deleteUser(@PathVariable Long id) {
        BaseResult result = userInfoService.deleteById(id);
        return JSON.toJSONString(result);
    }
}
