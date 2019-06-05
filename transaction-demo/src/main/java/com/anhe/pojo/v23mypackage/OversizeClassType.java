
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OversizeClassType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OversizeClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OVERSIZE_1"/>
 *     &lt;enumeration value="OVERSIZE_2"/>
 *     &lt;enumeration value="OVERSIZE_3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OversizeClassType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum OversizeClassType {

    OVERSIZE_1,
    OVERSIZE_2,
    OVERSIZE_3;

    public String value() {
        return name();
    }

    public static OversizeClassType fromValue(String v) {
        return valueOf(v);
    }

}
