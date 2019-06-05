
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaxType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXPORT"/>
 *     &lt;enumeration value="GST"/>
 *     &lt;enumeration value="HST"/>
 *     &lt;enumeration value="INTRACOUNTRY"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PST"/>
 *     &lt;enumeration value="VAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum TaxType {

    EXPORT,
    GST,
    HST,
    INTRACOUNTRY,
    OTHER,
    PST,
    VAT;

    public String value() {
        return name();
    }

    public static TaxType fromValue(String v) {
        return valueOf(v);
    }

}
