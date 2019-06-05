
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HazardousCommodityLabelTextOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HazardousCommodityLabelTextOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPEND"/>
 *     &lt;enumeration value="OVERRIDE"/>
 *     &lt;enumeration value="STANDARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityLabelTextOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum HazardousCommodityLabelTextOptionType {

    APPEND,
    OVERRIDE,
    STANDARD;

    public String value() {
        return name();
    }

    public static HazardousCommodityLabelTextOptionType fromValue(String v) {
        return valueOf(v);
    }

}
