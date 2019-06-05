
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShippingDocumentDispositionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingDocumentDispositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFERRED_STORED"/>
 *     &lt;enumeration value="EMAILED"/>
 *     &lt;enumeration value="QUEUED"/>
 *     &lt;enumeration value="RETURNED"/>
 *     &lt;enumeration value="STORED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentDispositionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ShippingDocumentDispositionType {

    DEFERRED_STORED,
    EMAILED,
    QUEUED,
    RETURNED,
    STORED;

    public String value() {
        return name();
    }

    public static ShippingDocumentDispositionType fromValue(String v) {
        return valueOf(v);
    }

}
