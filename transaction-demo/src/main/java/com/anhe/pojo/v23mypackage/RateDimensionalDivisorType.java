
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateDimensionalDivisorType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RateDimensionalDivisorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COUNTRY"/>
 *     &lt;enumeration value="CUSTOMER"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PRODUCT"/>
 *     &lt;enumeration value="WAIVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateDimensionalDivisorType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RateDimensionalDivisorType {

    COUNTRY,
    CUSTOMER,
    OTHER,
    PRODUCT,
    WAIVED;

    public String value() {
        return name();
    }

    public static RateDimensionalDivisorType fromValue(String v) {
        return valueOf(v);
    }

}
