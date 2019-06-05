package com.anhe.dao;


import com.alibaba.fastjson.JSON;
import com.anhe.entity.CloseoutInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


/**
 * Created by Albert.Tang on 2019/5/4 5:02 PM.
 */
@RunWith(JUnit4.class)
@SpringBootTest
public class CloseoutInfoDaoTest {

    @Autowired
    private CloseoutInfoDao closeoutInfoDao;

    @Test
    public void test(){
        List<CloseoutInfo> closeoutInfos = closeoutInfoDao.findByValueIsLike("53018541");
        System.out.println(JSON.toJSONString(closeoutInfos));
    }

}
