
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShippingDocumentNamingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingDocumentNamingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAST"/>
 *     &lt;enumeration value="LEGACY_FXRS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentNamingType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ShippingDocumentNamingType {

    FAST,
    LEGACY_FXRS;

    public String value() {
        return name();
    }

    public static ShippingDocumentNamingType fromValue(String v) {
        return valueOf(v);
    }

}
