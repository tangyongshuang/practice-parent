package com.anhe.dao;

import com.anhe.entity.LogShipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Albert.Tang on 2019/5/4 10:09 PM.
 */
public interface LogShipmentDao extends JpaRepository<LogShipment,Long> {


    List<LogShipment> findByShipShipmentNoIn(List<String> shipmentNos);
}
