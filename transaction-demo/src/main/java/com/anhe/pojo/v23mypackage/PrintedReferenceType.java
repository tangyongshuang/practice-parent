
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PrintedReferenceType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PrintedReferenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BILL_OF_LADING"/>
 *     &lt;enumeration value="CONSIGNEE_ID_NUMBER"/>
 *     &lt;enumeration value="SHIPPER_ID_NUMBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrintedReferenceType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PrintedReferenceType {

    BILL_OF_LADING,
    CONSIGNEE_ID_NUMBER,
    SHIPPER_ID_NUMBER;

    public String value() {
        return name();
    }

    public static PrintedReferenceType fromValue(String v) {
        return valueOf(v);
    }

}
