
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RecipientCustomsIdType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RecipientCustomsIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="INDIVIDUAL"/>
 *     &lt;enumeration value="PASSPORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecipientCustomsIdType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RecipientCustomsIdType {

    COMPANY,
    INDIVIDUAL,
    PASSPORT;

    public String value() {
        return name();
    }

    public static RecipientCustomsIdType fromValue(String v) {
        return valueOf(v);
    }

}
