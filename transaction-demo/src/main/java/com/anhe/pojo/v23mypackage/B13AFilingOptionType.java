
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>B13AFilingOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="B13AFilingOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEDEX_TO_STAMP"/>
 *     &lt;enumeration value="FILED_ELECTRONICALLY"/>
 *     &lt;enumeration value="MANUALLY_ATTACHED"/>
 *     &lt;enumeration value="NOT_REQUIRED"/>
 *     &lt;enumeration value="SUMMARY_REPORTING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "B13AFilingOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum B13AFilingOptionType {

    FEDEX_TO_STAMP,
    FILED_ELECTRONICALLY,
    MANUALLY_ATTACHED,
    NOT_REQUIRED,
    SUMMARY_REPORTING;

    public String value() {
        return name();
    }

    public static B13AFilingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
