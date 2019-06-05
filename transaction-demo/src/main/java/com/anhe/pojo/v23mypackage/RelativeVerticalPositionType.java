
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RelativeVerticalPositionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RelativeVerticalPositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABOVE"/>
 *     &lt;enumeration value="BELOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelativeVerticalPositionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RelativeVerticalPositionType {

    ABOVE,
    BELOW;

    public String value() {
        return name();
    }

    public static RelativeVerticalPositionType fromValue(String v) {
        return valueOf(v);
    }

}
