
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrackingIdType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TrackingIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXPRESS"/>
 *     &lt;enumeration value="FEDEX"/>
 *     &lt;enumeration value="FREIGHT"/>
 *     &lt;enumeration value="GROUND"/>
 *     &lt;enumeration value="USPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackingIdType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum TrackingIdType {

    EXPRESS,
    FEDEX,
    FREIGHT,
    GROUND,
    USPS;

    public String value() {
        return name();
    }

    public static TrackingIdType fromValue(String v) {
        return valueOf(v);
    }

}
