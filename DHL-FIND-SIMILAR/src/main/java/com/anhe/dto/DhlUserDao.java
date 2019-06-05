package com.anhe.dto;

/**
 * Created by Albert.Tang on 2019/5/4 10:48 PM.
 */
public class DhlUserDao {

    private String useId;
    private String username;
    private String shipmentNo;
    private String value;

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getShipmentNo() {
        return shipmentNo;
    }

    public void setShipmentNo(String shipmentNo) {
        this.shipmentNo = shipmentNo;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
