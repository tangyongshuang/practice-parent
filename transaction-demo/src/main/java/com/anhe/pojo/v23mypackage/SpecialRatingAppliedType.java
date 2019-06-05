
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SpecialRatingAppliedType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialRatingAppliedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEDEX_ONE_RATE"/>
 *     &lt;enumeration value="FIXED_FUEL_SURCHARGE"/>
 *     &lt;enumeration value="IMPORT_PRICING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialRatingAppliedType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum SpecialRatingAppliedType {

    FEDEX_ONE_RATE,
    FIXED_FUEL_SURCHARGE,
    IMPORT_PRICING;

    public String value() {
        return name();
    }

    public static SpecialRatingAppliedType fromValue(String v) {
        return valueOf(v);
    }

}
