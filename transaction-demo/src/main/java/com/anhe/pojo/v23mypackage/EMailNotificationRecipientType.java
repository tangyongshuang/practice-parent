
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EMailNotificationRecipientType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EMailNotificationRecipientType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BROKER"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="SHIPPER"/>
 *     &lt;enumeration value="THIRD_PARTY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMailNotificationRecipientType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum EMailNotificationRecipientType {

    BROKER,
    OTHER,
    RECIPIENT,
    SHIPPER,
    THIRD_PARTY;

    public String value() {
        return name();
    }

    public static EMailNotificationRecipientType fromValue(String v) {
        return valueOf(v);
    }

}
