
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EdtRequestType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EdtRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EdtRequestType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum EdtRequestType {

    ALL,
    NONE;

    public String value() {
        return name();
    }

    public static EdtRequestType fromValue(String v) {
        return valueOf(v);
    }

}
