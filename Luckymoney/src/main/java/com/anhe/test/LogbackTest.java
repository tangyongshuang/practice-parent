package com.anhe.test;

import ch.qos.logback.core.util.DefaultInvocationGate;

/**
 * Created by Albert.Tang on 2019/5/16 7:30 PM.
 */
public class LogbackTest extends DefaultInvocationGate {
    public static void main(String[] args) {
        DefaultInvocationGate defaultInvocationGate = new DefaultInvocationGate();
        long now = System.currentTimeMillis();
        System.out.println(now);
        boolean tooSoon = defaultInvocationGate.isTooSoon(now);
        boolean tooSoon2 = defaultInvocationGate.isTooSoon(now);
        System.out.println(tooSoon);
        System.out.println(tooSoon2);
        System.out.println((48 & 16));
    }
}
