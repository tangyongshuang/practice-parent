
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HomeDeliveryPremiumType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HomeDeliveryPremiumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPOINTMENT"/>
 *     &lt;enumeration value="DATE_CERTAIN"/>
 *     &lt;enumeration value="EVENING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HomeDeliveryPremiumType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum HomeDeliveryPremiumType {

    APPOINTMENT,
    DATE_CERTAIN,
    EVENING;

    public String value() {
        return name();
    }

    public static HomeDeliveryPremiumType fromValue(String v) {
        return valueOf(v);
    }

}
