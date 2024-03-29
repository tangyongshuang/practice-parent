
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NaftaPreferenceCriterionCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NaftaPreferenceCriterionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaftaPreferenceCriterionCode", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum NaftaPreferenceCriterionCode {

    A,
    B,
    C,
    D,
    E,
    F;

    public String value() {
        return name();
    }

    public static NaftaPreferenceCriterionCode fromValue(String v) {
        return valueOf(v);
    }

}
