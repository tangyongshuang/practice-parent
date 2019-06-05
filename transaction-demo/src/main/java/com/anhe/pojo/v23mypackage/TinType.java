
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TinType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TinType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUSINESS_NATIONAL"/>
 *     &lt;enumeration value="BUSINESS_STATE"/>
 *     &lt;enumeration value="BUSINESS_UNION"/>
 *     &lt;enumeration value="PERSONAL_NATIONAL"/>
 *     &lt;enumeration value="PERSONAL_STATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TinType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum TinType {

    BUSINESS_NATIONAL,
    BUSINESS_STATE,
    BUSINESS_UNION,
    PERSONAL_NATIONAL,
    PERSONAL_STATE;

    public String value() {
        return name();
    }

    public static TinType fromValue(String v) {
        return valueOf(v);
    }

}
