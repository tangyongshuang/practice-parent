
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RatedWeightMethod的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RatedWeightMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTUAL"/>
 *     &lt;enumeration value="AVERAGE_PACKAGE_WEIGHT_MINIMUM"/>
 *     &lt;enumeration value="BALLOON"/>
 *     &lt;enumeration value="DEFAULT_WEIGHT_APPLIED"/>
 *     &lt;enumeration value="DIM"/>
 *     &lt;enumeration value="FREIGHT_MINIMUM"/>
 *     &lt;enumeration value="MIXED"/>
 *     &lt;enumeration value="OVERSIZE"/>
 *     &lt;enumeration value="OVERSIZE_1"/>
 *     &lt;enumeration value="OVERSIZE_2"/>
 *     &lt;enumeration value="OVERSIZE_3"/>
 *     &lt;enumeration value="PACKAGING_MINIMUM"/>
 *     &lt;enumeration value="WEIGHT_BREAK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RatedWeightMethod", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RatedWeightMethod {

    ACTUAL,
    AVERAGE_PACKAGE_WEIGHT_MINIMUM,
    BALLOON,
    DEFAULT_WEIGHT_APPLIED,
    DIM,
    FREIGHT_MINIMUM,
    MIXED,
    OVERSIZE,
    OVERSIZE_1,
    OVERSIZE_2,
    OVERSIZE_3,
    PACKAGING_MINIMUM,
    WEIGHT_BREAK;

    public String value() {
        return name();
    }

    public static RatedWeightMethod fromValue(String v) {
        return valueOf(v);
    }

}
