package com.anhe.test2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Albert.Tang on 2019/4/12 3:38 PM.
 */
public class DateTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String format = sdf.format(new Date());
        System.out.println(format);
    }
}
