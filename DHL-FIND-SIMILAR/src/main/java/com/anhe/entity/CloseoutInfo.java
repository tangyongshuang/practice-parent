package com.anhe.entity;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by Albert.Tang on 2019/5/4 4:55 PM.
 */
@Entity
@Table(name = "closeout_info")
public class CloseoutInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    private String construct;
    private String value;
    private Integer pickup_num;
    private String trackings;
    private Date create_time;
    private Date update_time;
//    private boolean del_status;

    public CloseoutInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getConstruct() {
//        return construct;
//    }
//
//    public void setConstruct(String construct) {
//        this.construct = construct;
//    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getPickup_num() {
        return pickup_num;
    }

    public void setPickup_num(Integer pickup_num) {
        this.pickup_num = pickup_num;
    }

    public String getTrackings() {
        return trackings;
    }

    public void setTrackings(String trackings) {
        this.trackings = trackings;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

//    public boolean isDel_status() {
//        return del_status;
//    }
//
//    public void setDel_status(boolean del_status) {
//        this.del_status = del_status;
//    }
}
