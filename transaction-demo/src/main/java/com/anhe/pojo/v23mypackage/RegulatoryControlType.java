
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RegulatoryControlType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RegulatoryControlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FOOD_OR_PERISHABLE"/>
 *     &lt;enumeration value="NAFTA"/>
 *     &lt;enumeration value="NOT_APPLICABLE_FOR_LOW_CUSTOMS_VALUE_EXCEPTION"/>
 *     &lt;enumeration value="NOT_IN_FREE_CIRCULATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegulatoryControlType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RegulatoryControlType {

    FOOD_OR_PERISHABLE,
    NAFTA,
    NOT_APPLICABLE_FOR_LOW_CUSTOMS_VALUE_EXCEPTION,
    NOT_IN_FREE_CIRCULATION;

    public String value() {
        return name();
    }

    public static RegulatoryControlType fromValue(String v) {
        return valueOf(v);
    }

}
