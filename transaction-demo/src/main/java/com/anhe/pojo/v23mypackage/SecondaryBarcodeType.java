
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SecondaryBarcodeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SecondaryBarcodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMMON_2D"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SSCC_18"/>
 *     &lt;enumeration value="USPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecondaryBarcodeType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum SecondaryBarcodeType {

    @XmlEnumValue("COMMON_2D")
    COMMON_2_D("COMMON_2D"),
    NONE("NONE"),
    SSCC_18("SSCC_18"),
    USPS("USPS");
    private final String value;

    SecondaryBarcodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecondaryBarcodeType fromValue(String v) {
        for (SecondaryBarcodeType c: SecondaryBarcodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
