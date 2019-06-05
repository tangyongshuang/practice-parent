
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelPrintingOrientationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LabelPrintingOrientationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOTTOM_EDGE_OF_TEXT_FIRST"/>
 *     &lt;enumeration value="TOP_EDGE_OF_TEXT_FIRST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelPrintingOrientationType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum LabelPrintingOrientationType {

    BOTTOM_EDGE_OF_TEXT_FIRST,
    TOP_EDGE_OF_TEXT_FIRST;

    public String value() {
        return name();
    }

    public static LabelPrintingOrientationType fromValue(String v) {
        return valueOf(v);
    }

}
