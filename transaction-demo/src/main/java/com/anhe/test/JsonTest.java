package com.anhe.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.*;

/**
 * Created by Albert.Tang on 2019/4/16 11:11 AM.
 */
public class JsonTest {
    private static Long USER_RECOVER_REGISTER_TIME = 1000 * 60 * 60 * 24L;

    public static void main(String[] args) {
        List<Long> messageSengTimeList = new ArrayList<>();
        messageSengTimeList.add(System.currentTimeMillis());
        messageSengTimeList.add(System.currentTimeMillis()+20L);
        Map<String, String> map = new HashMap<>();
        map.put("test", JSON.toJSONString(messageSengTimeList));
        String test = map.get("test");
        List<Long> list = JSONArray.parseArray(test, Long.class);
        Long min = Collections.min(list);
        Long max = Collections.max(list);
        System.out.println(min);
        System.out.println(max);
        list.clear();
        System.out.println(list.size());
        System.out.println(USER_RECOVER_REGISTER_TIME);
    }
}
