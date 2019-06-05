
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FreightCollectTermsType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FreightCollectTermsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NON_RECOURSE_SHIPPER_SIGNED"/>
 *     &lt;enumeration value="STANDARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FreightCollectTermsType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum FreightCollectTermsType {

    NON_RECOURSE_SHIPPER_SIGNED,
    STANDARD;

    public String value() {
        return name();
    }

    public static FreightCollectTermsType fromValue(String v) {
        return valueOf(v);
    }

}
