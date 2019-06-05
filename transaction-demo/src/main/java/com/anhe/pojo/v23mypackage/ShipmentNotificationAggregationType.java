
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipmentNotificationAggregationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentNotificationAggregationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PER_PACKAGE"/>
 *     &lt;enumeration value="PER_SHIPMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentNotificationAggregationType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ShipmentNotificationAggregationType {

    PER_PACKAGE,
    PER_SHIPMENT;

    public String value() {
        return name();
    }

    public static ShipmentNotificationAggregationType fromValue(String v) {
        return valueOf(v);
    }

}
