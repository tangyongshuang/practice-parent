
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PricingCodeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PricingCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTUAL"/>
 *     &lt;enumeration value="ALTERNATE"/>
 *     &lt;enumeration value="BASE"/>
 *     &lt;enumeration value="HUNDREDWEIGHT"/>
 *     &lt;enumeration value="HUNDREDWEIGHT_ALTERNATE"/>
 *     &lt;enumeration value="INTERNATIONAL_DISTRIBUTION"/>
 *     &lt;enumeration value="INTERNATIONAL_ECONOMY_SERVICE"/>
 *     &lt;enumeration value="LTL_FREIGHT"/>
 *     &lt;enumeration value="PACKAGE"/>
 *     &lt;enumeration value="SHIPMENT"/>
 *     &lt;enumeration value="SHIPMENT_FIVE_POUND_OPTIONAL"/>
 *     &lt;enumeration value="SHIPMENT_OPTIONAL"/>
 *     &lt;enumeration value="SPECIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingCodeType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PricingCodeType {

    ACTUAL,
    ALTERNATE,
    BASE,
    HUNDREDWEIGHT,
    HUNDREDWEIGHT_ALTERNATE,
    INTERNATIONAL_DISTRIBUTION,
    INTERNATIONAL_ECONOMY_SERVICE,
    LTL_FREIGHT,
    PACKAGE,
    SHIPMENT,
    SHIPMENT_FIVE_POUND_OPTIONAL,
    SHIPMENT_OPTIONAL,
    SPECIAL;

    public String value() {
        return name();
    }

    public static PricingCodeType fromValue(String v) {
        return valueOf(v);
    }

}
