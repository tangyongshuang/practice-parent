
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelOrderType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LabelOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHIPPING_LABEL_FIRST"/>
 *     &lt;enumeration value="SHIPPING_LABEL_LAST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelOrderType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum LabelOrderType {

    SHIPPING_LABEL_FIRST,
    SHIPPING_LABEL_LAST;

    public String value() {
        return name();
    }

    public static LabelOrderType fromValue(String v) {
        return valueOf(v);
    }

}
