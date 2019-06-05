
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShippingDocumentGroupingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingDocumentGroupingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONSOLIDATED_BY_DOCUMENT_TYPE"/>
 *     &lt;enumeration value="INDIVIDUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentGroupingType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ShippingDocumentGroupingType {

    CONSOLIDATED_BY_DOCUMENT_TYPE,
    INDIVIDUAL;

    public String value() {
        return name();
    }

    public static ShippingDocumentGroupingType fromValue(String v) {
        return valueOf(v);
    }

}
