package com.anhe.entity;

import java.util.List;

/**
 * Created by Albert.Tang on 2019/4/12 12:19 AM.
 */
public class ConfigUsers {
    private String type;
    private List<AdminUser> users;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<AdminUser> getUsers() {
        return users;
    }

    public void setUsers(List<AdminUser> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "ConfigUsers{" +
                "type='" + type + '\'' +
                ", users=" + users +
                '}';
    }
}
