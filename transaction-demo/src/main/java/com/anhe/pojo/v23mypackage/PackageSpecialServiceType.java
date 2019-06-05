
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PackageSpecialServiceType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PackageSpecialServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALCOHOL"/>
 *     &lt;enumeration value="APPOINTMENT_DELIVERY"/>
 *     &lt;enumeration value="BATTERY"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="DANGEROUS_GOODS"/>
 *     &lt;enumeration value="DRY_ICE"/>
 *     &lt;enumeration value="NON_STANDARD_CONTAINER"/>
 *     &lt;enumeration value="PRIORITY_ALERT"/>
 *     &lt;enumeration value="SIGNATURE_OPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageSpecialServiceType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PackageSpecialServiceType {

    ALCOHOL,
    APPOINTMENT_DELIVERY,
    BATTERY,
    COD,
    DANGEROUS_GOODS,
    DRY_ICE,
    NON_STANDARD_CONTAINER,
    PRIORITY_ALERT,
    SIGNATURE_OPTION;

    public String value() {
        return name();
    }

    public static PackageSpecialServiceType fromValue(String v) {
        return valueOf(v);
    }

}
