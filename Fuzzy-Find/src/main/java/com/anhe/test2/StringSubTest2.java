package com.anhe.test2;

/**
 * Created by Albert.Tang on 2019/4/12 2:19 PM.
 */
public class StringSubTest2 {
    public static void main(String[] args) {
        String s ="123456789";
        int i = s.indexOf(",asd");
        System.out.println(i);
        String substring = s.substring(s.indexOf("<BkgDetails>"), s.indexOf("</BkgDetails>")+"<>".length());
        System.out.println(substring);
    }
}
