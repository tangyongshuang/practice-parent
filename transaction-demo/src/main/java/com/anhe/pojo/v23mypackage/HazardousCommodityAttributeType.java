
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HazardousCommodityAttributeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HazardousCommodityAttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_SUBJECT_TO_REGULATIONS"/>
 *     &lt;enumeration value="PLACARDED_VEHICLE_REQUIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityAttributeType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum HazardousCommodityAttributeType {

    NOT_SUBJECT_TO_REGULATIONS,
    PLACARDED_VEHICLE_REQUIRED;

    public String value() {
        return name();
    }

    public static HazardousCommodityAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
