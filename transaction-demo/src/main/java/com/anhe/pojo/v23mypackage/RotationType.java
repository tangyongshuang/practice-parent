
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RotationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RotationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEFT"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="RIGHT"/>
 *     &lt;enumeration value="UPSIDE_DOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RotationType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RotationType {

    LEFT,
    NONE,
    RIGHT,
    UPSIDE_DOWN;

    public String value() {
        return name();
    }

    public static RotationType fromValue(String v) {
        return valueOf(v);
    }

}
