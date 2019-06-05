
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipmentDryIceProcessingOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentDryIceProcessingOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHIPMENT_LEVEL_DRY_ICE_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentDryIceProcessingOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ShipmentDryIceProcessingOptionType {

    SHIPMENT_LEVEL_DRY_ICE_ONLY;

    public String value() {
        return name();
    }

    public static ShipmentDryIceProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
