package com.anhe.controller;


import com.alibaba.fastjson.JSON;
import com.anhe.dao.RecordDao;
import com.anhe.entity.Record;
import com.anhe.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Albert.Tang on 2019/5/4 2:08 PM.
 */
@RestController
public class RecordController {

    @Autowired
    private RecordService recordService;

    private final RecordDao recordDao;


    @Autowired
    public RecordController(RecordDao recordDao) {
        this.recordDao = recordDao;
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
}
