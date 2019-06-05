
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PriorityAlertEnhancementType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PriorityAlertEnhancementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIORITY_ALERT_PLUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriorityAlertEnhancementType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PriorityAlertEnhancementType {

    PRIORITY_ALERT_PLUS;

    public String value() {
        return name();
    }

    public static PriorityAlertEnhancementType fromValue(String v) {
        return valueOf(v);
    }

}
