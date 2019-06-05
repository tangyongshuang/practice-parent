package com.anhe.controller.testpojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * Created by Albert.Tang on 2019/4/11 11:30 PM.
 */
@XStreamAlias("Customer")
public class Customer {
//    @XStreamAlias("commodity")
    private String commodity;

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }
}
