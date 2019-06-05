package com.anhe.dao;

import com.anhe.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Albert.Tang on 2019/5/4 2:06 PM.
 */
public interface RecordDao extends JpaRepository<Record, Long> {


    List<Record> findByProvider(String provider);
}
