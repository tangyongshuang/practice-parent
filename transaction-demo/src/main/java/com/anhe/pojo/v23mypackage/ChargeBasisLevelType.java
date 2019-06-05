
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ChargeBasisLevelType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeBasisLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CURRENT_PACKAGE"/>
 *     &lt;enumeration value="SUM_OF_PACKAGES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeBasisLevelType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ChargeBasisLevelType {

    CURRENT_PACKAGE,
    SUM_OF_PACKAGES;

    public String value() {
        return name();
    }

    public static ChargeBasisLevelType fromValue(String v) {
        return valueOf(v);
    }

}
