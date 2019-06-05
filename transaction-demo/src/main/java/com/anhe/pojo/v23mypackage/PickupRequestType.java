
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PickupRequestType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PickupRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FUTURE_DAY"/>
 *     &lt;enumeration value="SAME_DAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PickupRequestType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PickupRequestType {

    FUTURE_DAY,
    SAME_DAY;

    public String value() {
        return name();
    }

    public static PickupRequestType fromValue(String v) {
        return valueOf(v);
    }

}
