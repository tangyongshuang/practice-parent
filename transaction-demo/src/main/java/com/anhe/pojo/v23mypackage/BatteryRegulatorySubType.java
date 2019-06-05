
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatteryRegulatorySubType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BatteryRegulatorySubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IATA_SECTION_II"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatteryRegulatorySubType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum BatteryRegulatorySubType {

    IATA_SECTION_II;

    public String value() {
        return name();
    }

    public static BatteryRegulatorySubType fromValue(String v) {
        return valueOf(v);
    }

}
