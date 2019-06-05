package com.anhe.controller;


import com.alibaba.fastjson.JSON;
import com.anhe.dao.CloseoutInfoDao;
import com.anhe.dao.RecordDao;
import com.anhe.entity.CloseoutInfo;
import com.anhe.entity.Record;
import com.anhe.service.RecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Albert.Tang on 2019/5/4 2:08 PM.
 */
@RestController
@Slf4j
public class RecordController {

    private final CloseoutInfoDao closeoutInfoDao;

    private final RecordService recordService;

    private final RecordDao recordDao;


    @Autowired
    public RecordController(RecordDao recordDao, RecordService recordService, CloseoutInfoDao closeoutInfoDao) {
        this.recordDao = recordDao;
        this.recordService = recordService;
        this.closeoutInfoDao = closeoutInfoDao;
    }

    @GetMapping("/findAll")
    public String findAll() {
        List<Record> records = recordDao.findAll();
        return JSON.toJSONString(records);
    }

    @PostMapping("/add")
    public String add(@RequestParam("receiver") String receiver,
                      @RequestParam("provider") String provider,
                      @RequestParam("money") BigDecimal money) {
        Record record = new Record();
        record.setMoney(money);
        record.setProvider(provider);
        record.setReceiver(receiver);
        recordDao.save(record);
        return JSON.toJSONString(recordDao.findAll());
    }

//    @GetMapping("/{id}")
//    public String getById(@PathVariable("id") Long id) {
//
//        return JSON.toJSONString(recordDao.findOne(id));
//    }

    @PostMapping("/addtwo")
    public String addtwo() {

        return JSON.toJSONString(recordService.addtwo());
    }

    @PostMapping("/findByvalue")
    public String findByvalue(@RequestParam("value") List<String> values) {
        log.info("start find ===== value is {}", values);
        ArrayList<CloseoutInfo> result = new ArrayList<>();
        for (String value : values) {
            value = "%" + value + "%";
            List<CloseoutInfo> infos = closeoutInfoDao.findByValueLike(value);
            result.addAll(infos);
        }
        log.info(JSON.toJSONString(result));
        return JSON.toJSONString(result);

    }
}
