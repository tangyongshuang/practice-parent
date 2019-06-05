
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CodReturnReferenceIndicatorType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CodReturnReferenceIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="REFERENCE"/>
 *     &lt;enumeration value="TRACKING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodReturnReferenceIndicatorType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CodReturnReferenceIndicatorType {

    INVOICE,
    PO,
    REFERENCE,
    TRACKING;

    public String value() {
        return name();
    }

    public static CodReturnReferenceIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
