
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FreightOnValueType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FreightOnValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CARRIER_RISK"/>
 *     &lt;enumeration value="OWN_RISK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FreightOnValueType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum FreightOnValueType {

    CARRIER_RISK,
    OWN_RISK;

    public String value() {
        return name();
    }

    public static FreightOnValueType fromValue(String v) {
        return valueOf(v);
    }

}
