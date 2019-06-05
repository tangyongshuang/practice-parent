
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PickupRequestSourceType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PickupRequestSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTOMATION"/>
 *     &lt;enumeration value="CUSTOMER_SERVICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PickupRequestSourceType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PickupRequestSourceType {

    AUTOMATION,
    CUSTOMER_SERVICE;

    public String value() {
        return name();
    }

    public static PickupRequestSourceType fromValue(String v) {
        return valueOf(v);
    }

}
