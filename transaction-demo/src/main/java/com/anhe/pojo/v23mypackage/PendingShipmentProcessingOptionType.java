
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PendingShipmentProcessingOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PendingShipmentProcessingOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALLOW_MODIFICATIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PendingShipmentProcessingOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PendingShipmentProcessingOptionType {

    ALLOW_MODIFICATIONS;

    public String value() {
        return name();
    }

    public static PendingShipmentProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
