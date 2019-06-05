package com.anhe.test;

import org.apache.commons.collections.SetUtils;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * Created by Albert.Tang on 2019/4/22 2:57 PM.
 */
public class TraditionalSetSortTest {
    public static void main(String[] args) {
        HashSet<BigDecimal> set = new HashSet<>();
        set.add(new BigDecimal(1.2).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.3).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(3.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(2.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(0.4).setScale(2, BigDecimal.ROUND_HALF_UP));
        set.add(new BigDecimal(9.4).setScale(2, BigDecimal.ROUND_HALF_UP));

        TreeSet<BigDecimal> sortSet = new TreeSet<>(new Comparator<BigDecimal>() {
            @Override
            public int compare(BigDecimal o1, BigDecimal o2) {
                return o1.compareTo(o2);
            }
        });
        sortSet.addAll(set);

        System.out.println(sortSet);
    }
}
