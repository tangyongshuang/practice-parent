
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RadioactivityUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RadioactivityUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BQ"/>
 *     &lt;enumeration value="GBQ"/>
 *     &lt;enumeration value="KBQ"/>
 *     &lt;enumeration value="MBQ"/>
 *     &lt;enumeration value="PBQ"/>
 *     &lt;enumeration value="TBQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RadioactivityUnitOfMeasure", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RadioactivityUnitOfMeasure {

    BQ,
    GBQ,
    KBQ,
    MBQ,
    PBQ,
    TBQ;

    public String value() {
        return name();
    }

    public static RadioactivityUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
