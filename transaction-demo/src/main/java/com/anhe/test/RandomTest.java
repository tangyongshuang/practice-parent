package com.anhe.test;

import java.util.Random;

/**
 * Created by Albert.Tang on 2019/4/28 10:37 PM.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(random.nextInt(10));

        }
    }
}
