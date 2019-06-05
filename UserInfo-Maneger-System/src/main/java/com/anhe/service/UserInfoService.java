package com.anhe.service;

import com.alibaba.fastjson.JSON;
import com.anhe.dao.UserInfoDao;
import com.anhe.entity.UserInfo;
import com.anhe.utils.BaseResult;
import com.anhe.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserInfoService {


    @Autowired
    private UserInfoDao userInfoDao;

    public List<UserInfo> findAll() {
        List<UserInfo> users = userInfoDao.findAll();
        return users;
    }

    public BaseResult addUser(UserInfo userInfo) {
        try {
            userInfoDao.save(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.fail(e.getMessage());
        }

        return ResultUtils.success("插入成功");
    }

    public BaseResult updataById(UserInfo userInfo, Long id) {
        log.info("userInfo ————> " + JSON.toJSONString(userInfo));
        log.info("id ————> " + JSON.toJSONString(id));
        userInfoDao.saveAndFlush(userInfo);
        return ResultUtils.success("修改成功");
    }

    public BaseResult deleteById(Long id) {
        userInfoDao.delete(id);
        return ResultUtils.success("删除成功啦！！！");
    }
}
