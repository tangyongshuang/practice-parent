
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocumentFormatOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentFormatOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUPPRESS_ADDITIONAL_LANGUAGES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentFormatOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum DocumentFormatOptionType {

    SUPPRESS_ADDITIONAL_LANGUAGES;

    public String value() {
        return name();
    }

    public static DocumentFormatOptionType fromValue(String v) {
        return valueOf(v);
    }

}
