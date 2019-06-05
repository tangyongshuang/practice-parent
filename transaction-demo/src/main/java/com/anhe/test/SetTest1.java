package com.anhe.test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Albert.Tang on 2019/4/22 2:57 PM.
 */
public class SetTest1 {
    public static void main(String[] args) {
        HashSet<BigDecimal> set = new HashSet<>();
        set.add(new BigDecimal(1.2).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.3).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(3.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(0.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(9.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        TreeSet<BigDecimal> sortSet = new TreeSet<>((o1, o2) -> o1.compareTo(o2));
        TreeSet<BigDecimal> sortSet2 = new TreeSet<>(Comparator.reverseOrder());
        sortSet2.addAll(set);
        BigDecimal ceiling = sortSet2.floor(new BigDecimal(10).setScale(2, BigDecimal.ROUND_HALF_UP));


        System.out.println(ceiling);
        System.out.println(1 > 2 ? 3 : 5);
    }
}
