package com.anhe.service;

import com.alibaba.fastjson.JSON;
import com.anhe.dao.CloseoutInfoDao;
import com.anhe.dao.LogShipmentDao;
import com.anhe.dao.SysUserDao;
import com.anhe.entity.CloseoutInfo;
import com.anhe.entity.LogShipment;
import com.anhe.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by Albert.Tang on 2019/5/4 6:43 PM.
 */
@Service
@Slf4j
public class CloseoutInfoService {

    private final CloseoutInfoDao closeoutInfoDao;

    private final SysUserDao sysUserDao;

    private final LogShipmentDao logShipmentDao;


    @Autowired
    public CloseoutInfoService(CloseoutInfoDao closeoutInfoDao, SysUserDao sysUserDao, LogShipmentDao logShipmentDao) {
        this.closeoutInfoDao = closeoutInfoDao;
        this.sysUserDao = sysUserDao;
        this.logShipmentDao = logShipmentDao;
    }

    public String getCompletedData(List<String> values) {
        ArrayList<CloseoutInfo> dhlResult = new ArrayList<>();
        for (String value : values) {
            value = "%" + value + "%";
            List<CloseoutInfo> infos = closeoutInfoDao.findByValueLike(value);
            dhlResult.addAll(infos);
        }
        log.info("=================closeout_info查询结果========================");
        log.info(JSON.toJSONString(dhlResult));
        Assert.notEmpty(dhlResult, "closeout_info查询结果为空");

        // TODO 我们只需要查询出List.tracking就可以了，最后再拿这个数据去做联表查询就行了


        List<String> trackings = dhlResult.stream().map(CloseoutInfo::getTrackings).collect(Collectors.toList());
        List<LogShipment> logShipments = logShipmentDao.findByShipShipmentNoIn(trackings);

        List<String> userIds = logShipments.stream().map(LogShipment::getShipOwner).collect(Collectors.toList());
        List<SysUser> users = sysUserDao.findByUseIdIn(userIds);

        for (CloseoutInfo closeoutInfo : dhlResult) {

//            logShipments.
        }


        return JSON.toJSONString("");
    }
}
