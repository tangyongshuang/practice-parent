
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AccessorRoleType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AccessorRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHIPMENT_COMPLETOR"/>
 *     &lt;enumeration value="SHIPMENT_INITIATOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessorRoleType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum AccessorRoleType {

    SHIPMENT_COMPLETOR,
    SHIPMENT_INITIATOR;

    public String value() {
        return name();
    }

    public static AccessorRoleType fromValue(String v) {
        return valueOf(v);
    }

}
