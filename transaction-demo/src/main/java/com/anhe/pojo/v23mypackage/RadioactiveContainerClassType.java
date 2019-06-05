
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RadioactiveContainerClassType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RadioactiveContainerClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXCEPTED_PACKAGE"/>
 *     &lt;enumeration value="INDUSTRIAL_IP1"/>
 *     &lt;enumeration value="INDUSTRIAL_IP2"/>
 *     &lt;enumeration value="INDUSTRIAL_IP3"/>
 *     &lt;enumeration value="TYPE_A"/>
 *     &lt;enumeration value="TYPE_B_M"/>
 *     &lt;enumeration value="TYPE_B_U"/>
 *     &lt;enumeration value="TYPE_C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RadioactiveContainerClassType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RadioactiveContainerClassType {

    EXCEPTED_PACKAGE("EXCEPTED_PACKAGE"),
    @XmlEnumValue("INDUSTRIAL_IP1")
    INDUSTRIAL_IP_1("INDUSTRIAL_IP1"),
    @XmlEnumValue("INDUSTRIAL_IP2")
    INDUSTRIAL_IP_2("INDUSTRIAL_IP2"),
    @XmlEnumValue("INDUSTRIAL_IP3")
    INDUSTRIAL_IP_3("INDUSTRIAL_IP3"),
    TYPE_A("TYPE_A"),
    TYPE_B_M("TYPE_B_M"),
    TYPE_B_U("TYPE_B_U"),
    TYPE_C("TYPE_C");
    private final String value;

    RadioactiveContainerClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RadioactiveContainerClassType fromValue(String v) {
        for (RadioactiveContainerClassType c: RadioactiveContainerClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
