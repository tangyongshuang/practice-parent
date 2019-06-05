package com.anhe.test;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Albert.Tang on 2019/5/7 2:16 PM.
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> carrierInfo = new ConcurrentHashMap<>();
        carrierInfo.put("smartPostIndicia","PRESORTED_STANDARD");
//        carrierInfo.put("smartPostIndicia","PARCEL_SELECT");
        BigDecimal weight =new BigDecimal("0.25");
        if (weight.compareTo(BigDecimal.ONE) < 0) {
            carrierInfo.put("smartPostIndicia","PRESORTED_STANDARD");
        }else {
            carrierInfo.put("smartPostIndicia","PARCEL_SELECT");
        }

        System.out.println(11);
    }
}
