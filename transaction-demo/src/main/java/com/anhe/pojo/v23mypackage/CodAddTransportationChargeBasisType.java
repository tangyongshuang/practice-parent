
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CodAddTransportationChargeBasisType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CodAddTransportationChargeBasisType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COD_SURCHARGE"/>
 *     &lt;enumeration value="NET_CHARGE"/>
 *     &lt;enumeration value="NET_FREIGHT"/>
 *     &lt;enumeration value="TOTAL_CUSTOMER_CHARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodAddTransportationChargeBasisType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CodAddTransportationChargeBasisType {

    COD_SURCHARGE,
    NET_CHARGE,
    NET_FREIGHT,
    TOTAL_CUSTOMER_CHARGE;

    public String value() {
        return name();
    }

    public static CodAddTransportationChargeBasisType fromValue(String v) {
        return valueOf(v);
    }

}
