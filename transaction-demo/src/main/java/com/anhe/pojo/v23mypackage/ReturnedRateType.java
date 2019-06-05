
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReturnedRateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnedRateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCENTIVE"/>
 *     &lt;enumeration value="NEGOTIATED"/>
 *     &lt;enumeration value="PAYOR_ACCOUNT_PACKAGE"/>
 *     &lt;enumeration value="PAYOR_ACCOUNT_SHIPMENT"/>
 *     &lt;enumeration value="PAYOR_LIST_PACKAGE"/>
 *     &lt;enumeration value="PAYOR_LIST_SHIPMENT"/>
 *     &lt;enumeration value="PREFERRED_ACCOUNT_PACKAGE"/>
 *     &lt;enumeration value="PREFERRED_ACCOUNT_SHIPMENT"/>
 *     &lt;enumeration value="PREFERRED_LIST_PACKAGE"/>
 *     &lt;enumeration value="PREFERRED_LIST_SHIPMENT"/>
 *     &lt;enumeration value="PREFERRED_NEGOTIATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnedRateType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ReturnedRateType {

    INCENTIVE,
    NEGOTIATED,
    PAYOR_ACCOUNT_PACKAGE,
    PAYOR_ACCOUNT_SHIPMENT,
    PAYOR_LIST_PACKAGE,
    PAYOR_LIST_SHIPMENT,
    PREFERRED_ACCOUNT_PACKAGE,
    PREFERRED_ACCOUNT_SHIPMENT,
    PREFERRED_LIST_PACKAGE,
    PREFERRED_LIST_SHIPMENT,
    PREFERRED_NEGOTIATED;

    public String value() {
        return name();
    }

    public static ReturnedRateType fromValue(String v) {
        return valueOf(v);
    }

}
