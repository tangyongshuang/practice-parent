package com.anhe.test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Albert.Tang on 2019/4/22 2:57 PM.
 * //        Stream<BigDecimal> sortedSet = set.stream().sorted(Comparator.naturalOrder());
 */
public class LambdaSetSortTest {
    public static void main(String[] args) {
        HashSet<BigDecimal> set = new HashSet<>();
        set.add(new BigDecimal(1.2).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.3).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(3.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(0.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(9.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        TreeSet<BigDecimal> sortedSet = new TreeSet<>(((o1, o2) -> o1.compareTo(o2)));
        sortedSet.addAll(set);
        System.out.println(sortedSet);
    }
}
