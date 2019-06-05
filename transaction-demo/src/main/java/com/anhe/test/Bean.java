package com.anhe.test;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Albert.Tang on 2019/4/23 1:19 PM.
 */
public class Bean implements Serializable {
    private String s;
    private Boolean b;
    private BigDecimal big;

//    private Bean(String s, Boolean b, BigDecimal big) {
//        this.s = s;
//        this.b = b;
//        this.big = big;
//    }


    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Boolean getB() {
        return b;
    }

    public void setB(Boolean b) {
        this.b = b;
    }

    public BigDecimal getBig() {
        return big;
    }

    public void setBig(BigDecimal big) {
        this.big = big;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "s='" + s + '\'' +
                ", b=" + b +
                ", big=" + big +
                '}';
    }
}
