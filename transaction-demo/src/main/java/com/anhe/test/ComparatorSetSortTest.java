package com.anhe.test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Albert.Tang on 2019/4/22 2:57 PM.
 * //        Stream<BigDecimal> sortedSet = set.stream().sorted(Comparator.naturalOrder());
 */
public class ComparatorSetSortTest {
    public static void main(String[] args) {
        HashSet<BigDecimal> set = new HashSet<>();
        set.add(new BigDecimal(1.2).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.3).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(3.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(0.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(9.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        TreeSet<BigDecimal> sortedSet = new TreeSet<>(Comparator.naturalOrder());
        sortedSet.addAll(set);
        System.out.println(sortedSet);
    }
}
