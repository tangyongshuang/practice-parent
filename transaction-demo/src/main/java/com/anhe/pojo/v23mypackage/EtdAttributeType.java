
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EtdAttributeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EtdAttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POST_SHIPMENT_UPLOAD_REQUESTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EtdAttributeType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum EtdAttributeType {

    POST_SHIPMENT_UPLOAD_REQUESTED;

    public String value() {
        return name();
    }

    public static EtdAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
