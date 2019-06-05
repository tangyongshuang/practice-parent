
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FedExLocationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FedExLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEDEX_AUTHORIZED_SHIP_CENTER"/>
 *     &lt;enumeration value="FEDEX_EXPRESS_STATION"/>
 *     &lt;enumeration value="FEDEX_FACILITY"/>
 *     &lt;enumeration value="FEDEX_FREIGHT_SERVICE_CENTER"/>
 *     &lt;enumeration value="FEDEX_GROUND_TERMINAL"/>
 *     &lt;enumeration value="FEDEX_HOME_DELIVERY_STATION"/>
 *     &lt;enumeration value="FEDEX_OFFICE"/>
 *     &lt;enumeration value="FEDEX_ONSITE"/>
 *     &lt;enumeration value="FEDEX_SELF_SERVICE_LOCATION"/>
 *     &lt;enumeration value="FEDEX_SHIPSITE"/>
 *     &lt;enumeration value="FEDEX_SHIP_AND_GET"/>
 *     &lt;enumeration value="FEDEX_SMART_POST_HUB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FedExLocationType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum FedExLocationType {

    FEDEX_AUTHORIZED_SHIP_CENTER,
    FEDEX_EXPRESS_STATION,
    FEDEX_FACILITY,
    FEDEX_FREIGHT_SERVICE_CENTER,
    FEDEX_GROUND_TERMINAL,
    FEDEX_HOME_DELIVERY_STATION,
    FEDEX_OFFICE,
    FEDEX_ONSITE,
    FEDEX_SELF_SERVICE_LOCATION,
    FEDEX_SHIPSITE,
    FEDEX_SHIP_AND_GET,
    FEDEX_SMART_POST_HUB;

    public String value() {
        return name();
    }

    public static FedExLocationType fromValue(String v) {
        return valueOf(v);
    }

}
