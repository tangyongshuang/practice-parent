
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HazardousCommodityOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HazardousCommodityOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BATTERY"/>
 *     &lt;enumeration value="HAZARDOUS_MATERIALS"/>
 *     &lt;enumeration value="LIMITED_QUANTITIES_COMMODITIES"/>
 *     &lt;enumeration value="ORM_D"/>
 *     &lt;enumeration value="REPORTABLE_QUANTITIES"/>
 *     &lt;enumeration value="SMALL_QUANTITY_EXCEPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum HazardousCommodityOptionType {

    BATTERY,
    HAZARDOUS_MATERIALS,
    LIMITED_QUANTITIES_COMMODITIES,
    ORM_D,
    REPORTABLE_QUANTITIES,
    SMALL_QUANTITY_EXCEPTION;

    public String value() {
        return name();
    }

    public static HazardousCommodityOptionType fromValue(String v) {
        return valueOf(v);
    }

}
