
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShippingDocumentImageType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingDocumentImageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOC"/>
 *     &lt;enumeration value="EPL2"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="RTF"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="ZPLII"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingDocumentImageType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ShippingDocumentImageType {

    DOC("DOC"),
    @XmlEnumValue("EPL2")
    EPL_2("EPL2"),
    PDF("PDF"),
    PNG("PNG"),
    RTF("RTF"),
    TEXT("TEXT"),
    ZPLII("ZPLII");
    private final String value;

    ShippingDocumentImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingDocumentImageType fromValue(String v) {
        for (ShippingDocumentImageType c: ShippingDocumentImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
