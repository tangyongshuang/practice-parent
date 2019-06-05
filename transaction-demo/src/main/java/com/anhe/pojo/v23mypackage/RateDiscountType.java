
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateDiscountType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RateDiscountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BONUS"/>
 *     &lt;enumeration value="COUPON"/>
 *     &lt;enumeration value="EARNED"/>
 *     &lt;enumeration value="INCENTIVE"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="VOLUME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateDiscountType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RateDiscountType {

    BONUS,
    COUPON,
    EARNED,
    INCENTIVE,
    OTHER,
    VOLUME;

    public String value() {
        return name();
    }

    public static RateDiscountType fromValue(String v) {
        return valueOf(v);
    }

}
