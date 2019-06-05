package com.anhe.controller.testpojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Created by Albert.Tang on 2019/4/11 11:29 PM.
 */
@XStreamAlias("User")
public class User {
//    @XStreamAlias("name")
    private String name;
//    @XStreamAlias("age")
    private String age;
//    @XStreamAlias("Customer")
    private List<Customer> customers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
