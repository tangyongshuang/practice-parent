package com.anhe.entity;

import java.util.List;

/**
 * Created by Albert.Tang on 2019/4/12 12:20 AM.
 */
public class AdminUser {
    private String name;
    private String pwd;
    private List<String> ip;

    private AdminUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIp() {
        return ip;
    }

    public void setIp(List<String> ip) {
        this.ip = ip;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", ip=" + ip +
                '}';
    }
}
