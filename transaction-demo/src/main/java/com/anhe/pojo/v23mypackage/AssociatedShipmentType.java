
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AssociatedShipmentType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AssociatedShipmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN"/>
 *     &lt;enumeration value="COD_RETURN"/>
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssociatedShipmentType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum AssociatedShipmentType {

    COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN,
    COD_RETURN,
    DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN;

    public String value() {
        return name();
    }

    public static AssociatedShipmentType fromValue(String v) {
        return valueOf(v);
    }

}
