
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HazardousCommodityRegulationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HazardousCommodityRegulationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADR"/>
 *     &lt;enumeration value="DOT"/>
 *     &lt;enumeration value="IATA"/>
 *     &lt;enumeration value="ORMD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazardousCommodityRegulationType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum HazardousCommodityRegulationType {

    ADR,
    DOT,
    IATA,
    ORMD;

    public String value() {
        return name();
    }

    public static HazardousCommodityRegulationType fromValue(String v) {
        return valueOf(v);
    }

}
