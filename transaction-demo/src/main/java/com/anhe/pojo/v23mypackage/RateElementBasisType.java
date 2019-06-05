
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateElementBasisType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RateElementBasisType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASE_CHARGE"/>
 *     &lt;enumeration value="NET_CHARGE"/>
 *     &lt;enumeration value="NET_CHARGE_EXCLUDING_TAXES"/>
 *     &lt;enumeration value="NET_FREIGHT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateElementBasisType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RateElementBasisType {

    BASE_CHARGE,
    NET_CHARGE,
    NET_CHARGE_EXCLUDING_TAXES,
    NET_FREIGHT;

    public String value() {
        return name();
    }

    public static RateElementBasisType fromValue(String v) {
        return valueOf(v);
    }

}
