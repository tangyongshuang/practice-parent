
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomsRoleType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomsRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXPORTER"/>
 *     &lt;enumeration value="IMPORTER"/>
 *     &lt;enumeration value="LEGAL_AGENT"/>
 *     &lt;enumeration value="PRODUCER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomsRoleType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CustomsRoleType {

    EXPORTER,
    IMPORTER,
    LEGAL_AGENT,
    PRODUCER;

    public String value() {
        return name();
    }

    public static CustomsRoleType fromValue(String v) {
        return valueOf(v);
    }

}
