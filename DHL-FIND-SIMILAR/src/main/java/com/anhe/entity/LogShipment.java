package com.anhe.entity;

import javax.persistence.*;

/**
 * Created by Albert.Tang on 2019/5/4 10:05 PM.
 */
@Entity
@Table(name = "log_shipment")
public class LogShipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shipNo;

    private String shipOwner;

    private String shipShipmentNo;

    public LogShipment() {
    }

    public Long getShipNo() {
        return shipNo;
    }

    public void setShipNo(Long shipNo) {
        this.shipNo = shipNo;
    }

    public String getShipOwner() {
        return shipOwner;
    }

    public void setShipOwner(String shipOwner) {
        this.shipOwner = shipOwner;
    }

    public String getShipShipmentNo() {
        return shipShipmentNo;
    }

    public void setShipShipmentNo(String shipShipmentNo) {
        this.shipShipmentNo = shipShipmentNo;
    }
}
