
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HazardousCommodityDescriptionProcessingOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HazardousCommodityDescriptionProcessingOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUDE_SPECIAL_PROVISIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityDescriptionProcessingOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum HazardousCommodityDescriptionProcessingOptionType {

    INCLUDE_SPECIAL_PROVISIONS;

    public String value() {
        return name();
    }

    public static HazardousCommodityDescriptionProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
