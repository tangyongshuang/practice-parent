
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SmartPostShipmentProcessingOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SmartPostShipmentProcessingOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GROUND_TRACKING_NUMBER_REQUESTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmartPostShipmentProcessingOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum SmartPostShipmentProcessingOptionType {

    GROUND_TRACKING_NUMBER_REQUESTED;

    public String value() {
        return name();
    }

    public static SmartPostShipmentProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
