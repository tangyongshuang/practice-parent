
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RadioactiveLabelType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RadioactiveLabelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="III_YELLOW"/>
 *     &lt;enumeration value="II_YELLOW"/>
 *     &lt;enumeration value="I_WHITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RadioactiveLabelType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RadioactiveLabelType {

    III_YELLOW,
    II_YELLOW,
    I_WHITE;

    public String value() {
        return name();
    }

    public static RadioactiveLabelType fromValue(String v) {
        return valueOf(v);
    }

}
