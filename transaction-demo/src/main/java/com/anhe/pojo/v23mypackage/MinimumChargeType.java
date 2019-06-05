
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MinimumChargeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MinimumChargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER"/>
 *     &lt;enumeration value="CUSTOMER_FREIGHT_WEIGHT"/>
 *     &lt;enumeration value="EARNED_DISCOUNT"/>
 *     &lt;enumeration value="MIXED"/>
 *     &lt;enumeration value="RATE_SCALE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MinimumChargeType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum MinimumChargeType {

    CUSTOMER,
    CUSTOMER_FREIGHT_WEIGHT,
    EARNED_DISCOUNT,
    MIXED,
    RATE_SCALE;

    public String value() {
        return name();
    }

    public static MinimumChargeType fromValue(String v) {
        return valueOf(v);
    }

}
