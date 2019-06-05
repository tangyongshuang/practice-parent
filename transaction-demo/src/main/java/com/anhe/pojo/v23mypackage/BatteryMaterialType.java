
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatteryMaterialType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BatteryMaterialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LITHIUM_ION"/>
 *     &lt;enumeration value="LITHIUM_METAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatteryMaterialType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum BatteryMaterialType {

    LITHIUM_ION,
    LITHIUM_METAL;

    public String value() {
        return name();
    }

    public static BatteryMaterialType fromValue(String v) {
        return valueOf(v);
    }

}
