package com.anhe.test2;

import com.anhe.entity.AdminUser;
import com.anhe.entity.ConfigUsers;
import com.thoughtworks.xstream.XStream;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Albert.Tang on 2019/4/11 11:36 PM.
 */
public class XStreamTest4 {
    public static void main(String[] args) throws IOException {
        InputStream xmlInputStream = new ClassPathResource("admin.xml").getInputStream();
        XStream xStream = new XStream();
        xStream.alias("AdminUser", AdminUser.class);
        xStream.alias("ConfigUser", ConfigUsers.class);
        ConfigUsers users = (ConfigUsers) xStream.fromXML(xmlInputStream);
        List<AdminUser> adminUsers = users.getUsers();
    }
}
