package com.anhe.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.anhe.dto.Apple;
import com.anhe.util.NeedSetValue;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by Albert.Tang on 2019/5/5 11:23 AM.
 */
public class ArrayListTest {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        apple1.setName("red");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        apple1.setStrings(strings);

        String app1 = JSON.toJSONString(apple1);

        com.anhe.entity.Apple apple = JSONObject.parseObject(app1, com.anhe.entity.Apple.class);
        System.out.println(JSON.toJSONString(apple));

        Class<?> clazz = strings.iterator().next().getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            NeedSetValue needSetValue = field.getAnnotation(NeedSetValue.class);
            if (needSetValue==null){
                continue;
            }
            field.setAccessible(true);

        }

    }
}
