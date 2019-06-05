
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReturnType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEDEX_TAG"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="PRINT_RETURN_LABEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ReturnType {

    FEDEX_TAG,
    PENDING,
    PRINT_RETURN_LABEL;

    public String value() {
        return name();
    }

    public static ReturnType fromValue(String v) {
        return valueOf(v);
    }

}
