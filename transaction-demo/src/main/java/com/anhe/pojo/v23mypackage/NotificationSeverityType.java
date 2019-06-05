
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotificationSeverityType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationSeverityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="FAILURE"/>
 *     &lt;enumeration value="NOTE"/>
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="WARNING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotificationSeverityType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum NotificationSeverityType {

    ERROR,
    FAILURE,
    NOTE,
    SUCCESS,
    WARNING;

    public String value() {
        return name();
    }

    public static NotificationSeverityType fromValue(String v) {
        return valueOf(v);
    }

}
