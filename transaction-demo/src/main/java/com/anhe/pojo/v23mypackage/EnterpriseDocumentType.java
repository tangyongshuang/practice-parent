
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnterpriseDocumentType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnterpriseDocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AIR_WAYBILL"/>
 *     &lt;enumeration value="CERTIFICATE_OF_ORIGIN"/>
 *     &lt;enumeration value="COMMERCIAL_INVOICE"/>
 *     &lt;enumeration value="NAFTA_CERTIFICATE_OF_ORIGIN"/>
 *     &lt;enumeration value="PRO_FORMA_INVOICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnterpriseDocumentType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum EnterpriseDocumentType {

    AIR_WAYBILL,
    CERTIFICATE_OF_ORIGIN,
    COMMERCIAL_INVOICE,
    NAFTA_CERTIFICATE_OF_ORIGIN,
    PRO_FORMA_INVOICE;

    public String value() {
        return name();
    }

    public static EnterpriseDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
