
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateRequestType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RateRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIST"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="PREFERRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateRequestType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RateRequestType {

    LIST,
    NONE,
    PREFERRED;

    public String value() {
        return name();
    }

    public static RateRequestType fromValue(String v) {
        return valueOf(v);
    }

}
