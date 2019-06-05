
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomDeliveryWindowType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomDeliveryWindowType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AFTER"/>
 *     &lt;enumeration value="BEFORE"/>
 *     &lt;enumeration value="BETWEEN"/>
 *     &lt;enumeration value="ON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomDeliveryWindowType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CustomDeliveryWindowType {

    AFTER,
    BEFORE,
    BETWEEN,
    ON;

    public String value() {
        return name();
    }

    public static CustomDeliveryWindowType fromValue(String v) {
        return valueOf(v);
    }

}
