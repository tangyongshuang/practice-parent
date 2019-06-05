
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PhysicalFormType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PhysicalFormType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GAS"/>
 *     &lt;enumeration value="LIQUID"/>
 *     &lt;enumeration value="SOLID"/>
 *     &lt;enumeration value="SPECIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhysicalFormType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PhysicalFormType {

    GAS,
    LIQUID,
    SOLID,
    SPECIAL;

    public String value() {
        return name();
    }

    public static PhysicalFormType fromValue(String v) {
        return valueOf(v);
    }

}
