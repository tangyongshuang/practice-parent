
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomLabelCoordinateUnits的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomLabelCoordinateUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MILS"/>
 *     &lt;enumeration value="PIXELS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomLabelCoordinateUnits", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CustomLabelCoordinateUnits {

    MILS,
    PIXELS;

    public String value() {
        return name();
    }

    public static CustomLabelCoordinateUnits fromValue(String v) {
        return valueOf(v);
    }

}
