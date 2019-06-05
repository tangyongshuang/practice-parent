
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InternationalDocumentContentType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InternationalDocumentContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DERIVED"/>
 *     &lt;enumeration value="DOCUMENTS_ONLY"/>
 *     &lt;enumeration value="NON_DOCUMENTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InternationalDocumentContentType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum InternationalDocumentContentType {

    DERIVED,
    DOCUMENTS_ONLY,
    NON_DOCUMENTS;

    public String value() {
        return name();
    }

    public static InternationalDocumentContentType fromValue(String v) {
        return valueOf(v);
    }

}
