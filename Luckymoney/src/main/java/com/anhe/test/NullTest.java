package com.anhe.test;

/**
 * Created by Albert.Tang on 2019/5/17 3:11 PM.
 */
public class NullTest {
    public static void main(String[] args) {
        String s=null;
        if ("SENDER".equals(s)){
            System.out.println(111);
        }else {
            System.out.println(222);
        }
    }
}
