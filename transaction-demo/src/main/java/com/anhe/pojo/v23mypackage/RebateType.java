
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RebateType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RebateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BONUS"/>
 *     &lt;enumeration value="EARNED"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RebateType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum RebateType {

    BONUS,
    EARNED,
    OTHER;

    public String value() {
        return name();
    }

    public static RebateType fromValue(String v) {
        return valueOf(v);
    }

}
