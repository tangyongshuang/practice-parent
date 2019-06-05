
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VolumeUnits的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="VolumeUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUBIC_FT"/>
 *     &lt;enumeration value="CUBIC_M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumeUnits", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum VolumeUnits {

    CUBIC_FT,
    CUBIC_M;

    public String value() {
        return name();
    }

    public static VolumeUnits fromValue(String v) {
        return valueOf(v);
    }

}
