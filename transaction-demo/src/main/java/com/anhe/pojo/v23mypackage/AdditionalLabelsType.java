
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AdditionalLabelsType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalLabelsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BROKER"/>
 *     &lt;enumeration value="CONSIGNEE"/>
 *     &lt;enumeration value="CUSTOMS"/>
 *     &lt;enumeration value="DESTINATION"/>
 *     &lt;enumeration value="FREIGHT_REFERENCE"/>
 *     &lt;enumeration value="MANIFEST"/>
 *     &lt;enumeration value="ORIGIN"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="SHIPPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalLabelsType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum AdditionalLabelsType {

    BROKER,
    CONSIGNEE,
    CUSTOMS,
    DESTINATION,
    FREIGHT_REFERENCE,
    MANIFEST,
    ORIGIN,
    RECIPIENT,
    SHIPPER;

    public String value() {
        return name();
    }

    public static AdditionalLabelsType fromValue(String v) {
        return valueOf(v);
    }

}
