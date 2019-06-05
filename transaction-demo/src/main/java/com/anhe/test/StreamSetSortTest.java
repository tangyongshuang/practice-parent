package com.anhe.test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Albert.Tang on 2019/4/22 2:57 PM.
 * //        Stream<BigDecimal> sortedSet = set.stream().sorted(Comparator.naturalOrder());
 */
public class StreamSetSortTest {
    public static void main(String[] args) {
        Set<BigDecimal> set = new HashSet<>();
        set.add(new BigDecimal(1.2).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.3).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(3.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(0.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(9.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        List list = set.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        Set newSet = set.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toSet());
        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.addAll(newSet);
        System.out.println(treeSet);
    }
}
