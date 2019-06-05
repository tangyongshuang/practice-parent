
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReturnEMailAllowedSpecialServiceType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnEMailAllowedSpecialServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SATURDAY_DELIVERY"/>
 *     &lt;enumeration value="SATURDAY_PICKUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnEMailAllowedSpecialServiceType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ReturnEMailAllowedSpecialServiceType {

    SATURDAY_DELIVERY,
    SATURDAY_PICKUP;

    public String value() {
        return name();
    }

    public static ReturnEMailAllowedSpecialServiceType fromValue(String v) {
        return valueOf(v);
    }

}
