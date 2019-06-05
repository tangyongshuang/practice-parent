
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomsOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomsOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COURTESY_RETURN_LABEL"/>
 *     &lt;enumeration value="EXHIBITION_TRADE_SHOW"/>
 *     &lt;enumeration value="FAULTY_ITEM"/>
 *     &lt;enumeration value="FOLLOWING_REPAIR"/>
 *     &lt;enumeration value="FOR_REPAIR"/>
 *     &lt;enumeration value="ITEM_FOR_LOAN"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="REJECTED"/>
 *     &lt;enumeration value="REPLACEMENT"/>
 *     &lt;enumeration value="TRIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomsOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CustomsOptionType {

    COURTESY_RETURN_LABEL,
    EXHIBITION_TRADE_SHOW,
    FAULTY_ITEM,
    FOLLOWING_REPAIR,
    FOR_REPAIR,
    ITEM_FOR_LOAN,
    OTHER,
    REJECTED,
    REPLACEMENT,
    TRIAL;

    public String value() {
        return name();
    }

    public static CustomsOptionType fromValue(String v) {
        return valueOf(v);
    }

}
