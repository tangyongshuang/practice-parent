
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompletedEtdType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CompletedEtdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ELECTRONIC_DOCUMENTS_ONLY"/>
 *     &lt;enumeration value="ELECTRONIC_DOCUMENTS_WITH_ORIGINALS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompletedEtdType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CompletedEtdType {

    ELECTRONIC_DOCUMENTS_ONLY,
    ELECTRONIC_DOCUMENTS_WITH_ORIGINALS;

    public String value() {
        return name();
    }

    public static CompletedEtdType fromValue(String v) {
        return valueOf(v);
    }

}
