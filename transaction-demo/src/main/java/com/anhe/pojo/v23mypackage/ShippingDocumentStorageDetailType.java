
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShippingDocumentStorageDetailType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingDocumentStorageDetailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASYNC_SERVICE"/>
 *     &lt;enumeration value="LOCAL_FILE_SYSTEM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentStorageDetailType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ShippingDocumentStorageDetailType {

    ASYNC_SERVICE,
    LOCAL_FILE_SYSTEM;

    public String value() {
        return name();
    }

    public static ShippingDocumentStorageDetailType fromValue(String v) {
        return valueOf(v);
    }

}
