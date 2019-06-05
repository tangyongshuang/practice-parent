
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FreightGuaranteeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FreightGuaranteeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GUARANTEED_DATE"/>
 *     &lt;enumeration value="GUARANTEED_MORNING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FreightGuaranteeType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum FreightGuaranteeType {

    GUARANTEED_DATE,
    GUARANTEED_MORNING;

    public String value() {
        return name();
    }

    public static FreightGuaranteeType fromValue(String v) {
        return valueOf(v);
    }

}
