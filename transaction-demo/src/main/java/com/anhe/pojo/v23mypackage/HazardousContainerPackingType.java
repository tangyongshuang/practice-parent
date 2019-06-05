
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HazardousContainerPackingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HazardousContainerPackingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_PACKED_IN_ONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazardousContainerPackingType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum HazardousContainerPackingType {

    ALL_PACKED_IN_ONE;

    public String value() {
        return name();
    }

    public static HazardousContainerPackingType fromValue(String v) {
        return valueOf(v);
    }

}
