
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DayOfWeekType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FRI"/>
 *     &lt;enumeration value="MON"/>
 *     &lt;enumeration value="SAT"/>
 *     &lt;enumeration value="SUN"/>
 *     &lt;enumeration value="THU"/>
 *     &lt;enumeration value="TUE"/>
 *     &lt;enumeration value="WED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeekType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum DayOfWeekType {

    FRI,
    MON,
    SAT,
    SUN,
    THU,
    TUE,
    WED;

    public String value() {
        return name();
    }

    public static DayOfWeekType fromValue(String v) {
        return valueOf(v);
    }

}
