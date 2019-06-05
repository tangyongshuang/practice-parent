
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PageQuadrantType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PageQuadrantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOTTOM_LEFT"/>
 *     &lt;enumeration value="BOTTOM_RIGHT"/>
 *     &lt;enumeration value="TOP_LEFT"/>
 *     &lt;enumeration value="TOP_RIGHT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PageQuadrantType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PageQuadrantType {

    BOTTOM_LEFT,
    BOTTOM_RIGHT,
    TOP_LEFT,
    TOP_RIGHT;

    public String value() {
        return name();
    }

    public static PageQuadrantType fromValue(String v) {
        return valueOf(v);
    }

}
