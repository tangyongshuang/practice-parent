
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FreightRateQuoteType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FreightRateQuoteType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTOMATED"/>
 *     &lt;enumeration value="MANUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FreightRateQuoteType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum FreightRateQuoteType {

    AUTOMATED,
    MANUAL;

    public String value() {
        return name();
    }

    public static FreightRateQuoteType fromValue(String v) {
        return valueOf(v);
    }

}
