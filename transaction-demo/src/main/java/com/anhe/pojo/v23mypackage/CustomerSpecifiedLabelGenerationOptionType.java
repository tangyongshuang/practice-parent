
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerSpecifiedLabelGenerationOptionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerSpecifiedLabelGenerationOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTENT_ON_SHIPPING_LABEL_ONLY"/>
 *     &lt;enumeration value="CONTENT_ON_SHIPPING_LABEL_PREFERRED"/>
 *     &lt;enumeration value="CONTENT_ON_SUPPLEMENTAL_LABEL_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerSpecifiedLabelGenerationOptionType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CustomerSpecifiedLabelGenerationOptionType {

    CONTENT_ON_SHIPPING_LABEL_ONLY,
    CONTENT_ON_SHIPPING_LABEL_PREFERRED,
    CONTENT_ON_SUPPLEMENTAL_LABEL_ONLY;

    public String value() {
        return name();
    }

    public static CustomerSpecifiedLabelGenerationOptionType fromValue(String v) {
        return valueOf(v);
    }

}
