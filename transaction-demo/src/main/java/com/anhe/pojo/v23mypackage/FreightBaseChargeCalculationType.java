
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FreightBaseChargeCalculationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FreightBaseChargeCalculationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BEYOND"/>
 *     &lt;enumeration value="LINE_ITEMS"/>
 *     &lt;enumeration value="UNIT_PRICING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FreightBaseChargeCalculationType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum FreightBaseChargeCalculationType {

    BEYOND,
    LINE_ITEMS,
    UNIT_PRICING;

    public String value() {
        return name();
    }

    public static FreightBaseChargeCalculationType fromValue(String v) {
        return valueOf(v);
    }

}
