package com.anhe.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;

/**
 * Created by Albert.Tang on 2019/5/7 9:24 AM.
 */
public class JsonObjectTest {
    public static void main(String[] args) {
        Bean bean = new Bean();
        bean.setB(true);
        bean.setBig(new BigDecimal(2));
        bean.setS("it's a String");
        JSONObject data = new JSONObject();
        data.put("fruit","apple");
        data.put("bigDecimal",new BigDecimal(1));
        data.put("int",1);
        data.put("beanObject",bean);
        System.out.println(111);
        System.out.println(JSON.toJSONString(data));
    }
}
