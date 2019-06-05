
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CarrierCodeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CarrierCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FDXC"/>
 *     &lt;enumeration value="FDXE"/>
 *     &lt;enumeration value="FDXG"/>
 *     &lt;enumeration value="FXCC"/>
 *     &lt;enumeration value="FXFR"/>
 *     &lt;enumeration value="FXSP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarrierCodeType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CarrierCodeType {

    FDXC,
    FDXE,
    FDXG,
    FXCC,
    FXFR,
    FXSP;

    public String value() {
        return name();
    }

    public static CarrierCodeType fromValue(String v) {
        return valueOf(v);
    }

}
