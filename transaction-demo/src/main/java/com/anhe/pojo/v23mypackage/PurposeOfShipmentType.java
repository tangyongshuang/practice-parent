
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PurposeOfShipmentType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PurposeOfShipmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GIFT"/>
 *     &lt;enumeration value="NOT_SOLD"/>
 *     &lt;enumeration value="PERSONAL_EFFECTS"/>
 *     &lt;enumeration value="REPAIR_AND_RETURN"/>
 *     &lt;enumeration value="SAMPLE"/>
 *     &lt;enumeration value="SOLD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurposeOfShipmentType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PurposeOfShipmentType {

    GIFT,
    NOT_SOLD,
    PERSONAL_EFFECTS,
    REPAIR_AND_RETURN,
    SAMPLE,
    SOLD;

    public String value() {
        return name();
    }

    public static PurposeOfShipmentType fromValue(String v) {
        return valueOf(v);
    }

}
