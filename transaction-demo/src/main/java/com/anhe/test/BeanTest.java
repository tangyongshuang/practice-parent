package com.anhe.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;

/**
 * Created by Albert.Tang on 2019/4/23 1:19 PM.
 */
public class BeanTest {
    public static void main(String[] args) {
//        Bean bean = new Bean("", true, new BigDecimal(0.2));
        Bean bean = new Bean();
        bean.setS("string");
        bean.setBig(new BigDecimal("0.1"));
        bean.setB(true);
        String s = JSON.toJSONString(bean);
        Bean bean1 = JSONObject.parseObject(s, Bean.class);
        System.out.println(bean1);
    }
}
