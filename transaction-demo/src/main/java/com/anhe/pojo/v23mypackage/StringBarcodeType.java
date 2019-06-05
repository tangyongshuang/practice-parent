
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StringBarcodeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="StringBarcodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="ASTRA"/>
 *     &lt;enumeration value="FEDEX_1D"/>
 *     &lt;enumeration value="GROUND"/>
 *     &lt;enumeration value="POSTAL"/>
 *     &lt;enumeration value="USPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StringBarcodeType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum StringBarcodeType {

    ADDRESS("ADDRESS"),
    ASTRA("ASTRA"),
    @XmlEnumValue("FEDEX_1D")
    FEDEX_1_D("FEDEX_1D"),
    GROUND("GROUND"),
    POSTAL("POSTAL"),
    USPS("USPS");
    private final String value;

    StringBarcodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StringBarcodeType fromValue(String v) {
        for (StringBarcodeType c: StringBarcodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
