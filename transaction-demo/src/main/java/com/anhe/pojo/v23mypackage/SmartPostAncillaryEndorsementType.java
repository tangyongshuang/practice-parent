
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SmartPostAncillaryEndorsementType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SmartPostAncillaryEndorsementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDRESS_CORRECTION"/>
 *     &lt;enumeration value="CARRIER_LEAVE_IF_NO_RESPONSE"/>
 *     &lt;enumeration value="CHANGE_SERVICE"/>
 *     &lt;enumeration value="FORWARDING_SERVICE"/>
 *     &lt;enumeration value="RETURN_SERVICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmartPostAncillaryEndorsementType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum SmartPostAncillaryEndorsementType {

    ADDRESS_CORRECTION,
    CARRIER_LEAVE_IF_NO_RESPONSE,
    CHANGE_SERVICE,
    FORWARDING_SERVICE,
    RETURN_SERVICE;

    public String value() {
        return name();
    }

    public static SmartPostAncillaryEndorsementType fromValue(String v) {
        return valueOf(v);
    }

}
