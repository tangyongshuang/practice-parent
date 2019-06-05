
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatteryPackingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BatteryPackingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTAINED_IN_EQUIPMENT"/>
 *     &lt;enumeration value="PACKED_WITH_EQUIPMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatteryPackingType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum BatteryPackingType {

    CONTAINED_IN_EQUIPMENT,
    PACKED_WITH_EQUIPMENT;

    public String value() {
        return name();
    }

    public static BatteryPackingType fromValue(String v) {
        return valueOf(v);
    }

}
