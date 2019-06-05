
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelFormatType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LabelFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMMON2D"/>
 *     &lt;enumeration value="LABEL_DATA_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelFormatType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum LabelFormatType {

    @XmlEnumValue("COMMON2D")
    COMMON_2_D("COMMON2D"),
    LABEL_DATA_ONLY("LABEL_DATA_ONLY");
    private final String value;

    LabelFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LabelFormatType fromValue(String v) {
        for (LabelFormatType c: LabelFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
