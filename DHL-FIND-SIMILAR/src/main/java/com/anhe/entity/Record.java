package com.anhe.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Albert.Tang on 2019/5/4 1:51 PM.
 */
@SuppressWarnings("all")

//@Table()
@Entity(name = "lucky")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "money")
    private BigDecimal money;
    private String receiver;
    private String provider;

    public Record() {
    }

    public Record(String provider) {
        this.provider = provider;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
