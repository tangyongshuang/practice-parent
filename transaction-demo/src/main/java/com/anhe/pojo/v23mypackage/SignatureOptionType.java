
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SignatureOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADULT"/>
 *     &lt;enumeration value="DIRECT"/>
 *     &lt;enumeration value="INDIRECT"/>
 *     &lt;enumeration value="NO_SIGNATURE_REQUIRED"/>
 *     &lt;enumeration value="SERVICE_DEFAULT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum SignatureOptionType {

    ADULT,
    DIRECT,
    INDIRECT,
    NO_SIGNATURE_REQUIRED,
    SERVICE_DEFAULT;

    public String value() {
        return name();
    }

    public static SignatureOptionType fromValue(String v) {
        return valueOf(v);
    }

}
