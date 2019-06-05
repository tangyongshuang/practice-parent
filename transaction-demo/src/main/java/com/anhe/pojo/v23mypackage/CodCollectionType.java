
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CodCollectionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CodCollectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="COMPANY_CHECK"/>
 *     &lt;enumeration value="GUARANTEED_FUNDS"/>
 *     &lt;enumeration value="PERSONAL_CHECK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodCollectionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CodCollectionType {

    ANY,
    CASH,
    COMPANY_CHECK,
    GUARANTEED_FUNDS,
    PERSONAL_CHECK;

    public String value() {
        return name();
    }

    public static CodCollectionType fromValue(String v) {
        return valueOf(v);
    }

}
