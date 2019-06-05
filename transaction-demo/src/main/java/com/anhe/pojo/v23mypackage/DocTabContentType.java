
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocTabContentType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DocTabContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BARCODED"/>
 *     &lt;enumeration value="CUSTOM"/>
 *     &lt;enumeration value="MINIMUM"/>
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="ZONE001"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocTabContentType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum DocTabContentType {

    BARCODED("BARCODED"),
    CUSTOM("CUSTOM"),
    MINIMUM("MINIMUM"),
    STANDARD("STANDARD"),
    @XmlEnumValue("ZONE001")
    ZONE_001("ZONE001");
    private final String value;

    DocTabContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocTabContentType fromValue(String v) {
        for (DocTabContentType c: DocTabContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
