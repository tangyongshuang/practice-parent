package com.anhe.controller;

import com.alibaba.fastjson.JSON;
import com.anhe.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Albert.Tang on 2019/5/11 4:03 PM.
 */
public class TestString {
    public static void main(String[] args) {
        String s = "shuju";
        // replace之后得到的是新的String，并不是之前的String，所以必须使用新的String类型来接收
        s.replace("s", "1");
        System.out.println(s);

        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("sss");
        list.add("ksi");
        list.remove(1);
        System.out.println(list);

        User user = new User();
        user.setAge(27);
        user.setName("mercy");
        user.setName("anhe");
        System.out.println(JSON.toJSONString(user));

        int a = 3;
        a = 6;
        System.out.println(a);
    }
}
