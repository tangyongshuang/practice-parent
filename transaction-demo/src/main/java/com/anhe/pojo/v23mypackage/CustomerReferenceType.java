
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerReferenceType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerReferenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER_REFERENCE"/>
 *     &lt;enumeration value="DEPARTMENT_NUMBER"/>
 *     &lt;enumeration value="INTRACOUNTRY_REGULATORY_REFERENCE"/>
 *     &lt;enumeration value="INVOICE_NUMBER"/>
 *     &lt;enumeration value="P_O_NUMBER"/>
 *     &lt;enumeration value="RMA_ASSOCIATION"/>
 *     &lt;enumeration value="SHIPMENT_INTEGRITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerReferenceType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CustomerReferenceType {

    CUSTOMER_REFERENCE,
    DEPARTMENT_NUMBER,
    INTRACOUNTRY_REGULATORY_REFERENCE,
    INVOICE_NUMBER,
    P_O_NUMBER,
    RMA_ASSOCIATION,
    SHIPMENT_INTEGRITY;

    public String value() {
        return name();
    }

    public static CustomerReferenceType fromValue(String v) {
        return valueOf(v);
    }

}
