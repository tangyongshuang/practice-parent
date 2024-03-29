
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipmentNotificationRoleType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentNotificationRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BROKER"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="SHIPPER"/>
 *     &lt;enumeration value="THIRD_PARTY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentNotificationRoleType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ShipmentNotificationRoleType {

    BROKER,
    OTHER,
    RECIPIENT,
    SHIPPER,
    THIRD_PARTY;

    public String value() {
        return name();
    }

    public static ShipmentNotificationRoleType fromValue(String v) {
        return valueOf(v);
    }

}
