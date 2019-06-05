
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FreightChargeBasisType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FreightChargeBasisType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CWT"/>
 *     &lt;enumeration value="FLAT"/>
 *     &lt;enumeration value="MINIMUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FreightChargeBasisType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum FreightChargeBasisType {

    CWT,
    FLAT,
    MINIMUM;

    public String value() {
        return name();
    }

    public static FreightChargeBasisType fromValue(String v) {
        return valueOf(v);
    }

}
