
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCOUNT"/>
 *     &lt;enumeration value="COLLECT"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="SENDER"/>
 *     &lt;enumeration value="THIRD_PARTY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PaymentType {

    ACCOUNT,
    COLLECT,
    RECIPIENT,
    SENDER,
    THIRD_PARTY;

    public String value() {
        return name();
    }

    public static PaymentType fromValue(String v) {
        return valueOf(v);
    }

}
