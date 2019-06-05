
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NaftaProducerSpecificationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NaftaProducerSpecificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVAILABLE_UPON_REQUEST"/>
 *     &lt;enumeration value="MULTIPLE_SPECIFIED"/>
 *     &lt;enumeration value="SAME"/>
 *     &lt;enumeration value="SINGLE_SPECIFIED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaftaProducerSpecificationType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum NaftaProducerSpecificationType {

    AVAILABLE_UPON_REQUEST,
    MULTIPLE_SPECIFIED,
    SAME,
    SINGLE_SPECIFIED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static NaftaProducerSpecificationType fromValue(String v) {
        return valueOf(v);
    }

}
