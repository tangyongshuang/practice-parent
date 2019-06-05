
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DropoffType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DropoffType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUSINESS_SERVICE_CENTER"/>
 *     &lt;enumeration value="DROP_BOX"/>
 *     &lt;enumeration value="REGULAR_PICKUP"/>
 *     &lt;enumeration value="REQUEST_COURIER"/>
 *     &lt;enumeration value="STATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DropoffType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum DropoffType {

    BUSINESS_SERVICE_CENTER,
    DROP_BOX,
    REGULAR_PICKUP,
    REQUEST_COURIER,
    STATION;

    public String value() {
        return name();
    }

    public static DropoffType fromValue(String v) {
        return valueOf(v);
    }

}
