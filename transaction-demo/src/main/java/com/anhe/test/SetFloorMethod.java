package com.anhe.test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Albert.Tang on 2019/4/22 8:51 PM.
 */
public class SetFloorMethod {
    public static void main(String[] args) {
        Set<BigDecimal> set = new HashSet<>();
        set.add(new BigDecimal(1.2).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.3).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(3.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(0.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(9.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        TreeSet<BigDecimal> sortedSet = new TreeSet<>(Comparator.naturalOrder());
        sortedSet.addAll(set);
        System.out.println(sortedSet);
        BigDecimal value1 = sortedSet.ceiling(new BigDecimal(0.40).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("根据0.40可以取到元素：" + value1);
        BigDecimal value2 = sortedSet.ceiling(new BigDecimal(2.35).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("根据2.35可以取到元素：" + value2);
        BigDecimal value3 = sortedSet.ceiling(new BigDecimal(9.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("根据11可以取到元素：" + value3);
    }
}
