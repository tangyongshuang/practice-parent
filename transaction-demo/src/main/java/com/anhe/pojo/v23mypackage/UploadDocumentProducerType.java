
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UploadDocumentProducerType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="UploadDocumentProducerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UploadDocumentProducerType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum UploadDocumentProducerType {

    CUSTOMER;

    public String value() {
        return name();
    }

    public static UploadDocumentProducerType fromValue(String v) {
        return valueOf(v);
    }

}
