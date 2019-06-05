package com.anhe.test;

import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;

/**
 * Created by Albert.Tang on 2019/5/17 4:13 PM.
 */
public class IntTest {
    public static void main(String[] args) {
        Integer i =null;
        if (StringUtils.isEmpty(i)){
            System.out.println(11);
        }else {
            System.out.println(22);
        }
    }
}
