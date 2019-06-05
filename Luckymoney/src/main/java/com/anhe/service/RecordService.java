package com.anhe.service;

import com.anhe.dao.RecordDao;
import com.anhe.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Albert.Tang on 2019/5/4 3:32 PM.
 */
@Service
public class RecordService {

    private final RecordDao recordDao;

    @Autowired
    public RecordService(RecordDao recordDao) {
        this.recordDao = recordDao;
    }

    @Transactional
    @SuppressWarnings("all")
    public List<Record> addtwo() {
        Record record1 = new Record();
        record1.setReceiver("萍");
        record1.setProvider("双");
        record1.setMoney(new BigDecimal(520));
        recordDao.save(record1);

        Record record2 = new Record();
        record2.setReceiver("萍");
        record2.setProvider("双");
        record2.setMoney(new BigDecimal(1314));
        recordDao.save(record2);
        List<Record> result = recordDao.findByProvider("双");
        return result;
    }
}
