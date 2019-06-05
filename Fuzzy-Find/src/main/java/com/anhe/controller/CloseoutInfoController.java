package com.anhe.controller;

import com.alibaba.fastjson.JSON;
import com.anhe.entity.CloseoutInfo;
import com.anhe.entity.CloseoutInfoExample;
import com.anhe.mapper.CloseoutInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Albert.Tang on 2019/4/11 10:02 AM.
 */
@RestController
public class CloseoutInfoController {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Autowired
    private CloseoutInfoMapper closeoutInfoMapper;

//    @RequestMapping("/fuzzy/query")
//    private String fuzzyQuery() {
//        CloseoutInfoExample example = new CloseoutInfoExample();
//        CloseoutInfoExample.Criteria criteria = example.createCriteria();
//        criteria.andValueLike("%" + "69903503608793085" + "%");
//        List<CloseoutInfo> closeoutInfos = closeoutInfoMapper.selectByExample(example);
//        CloseoutInfo closeoutInfo = closeoutInfoMapper.fuzzyQueryByValue("69903503608793085");
//        if (!ObjectUtils.isEmpty(closeoutInfo)){
//            closeoutInfo.setCreateTime(sdf.format(closeoutInfo.getCreateTime()));
//        }
//        return JSON.toJSONString(closeoutInfo);
//    }
}
