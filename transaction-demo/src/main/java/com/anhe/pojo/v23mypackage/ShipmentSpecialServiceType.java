
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipmentSpecialServiceType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentSpecialServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BROKER_SELECT_OPTION"/>
 *     &lt;enumeration value="CALL_BEFORE_DELIVERY"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="CUSTOM_DELIVERY_WINDOW"/>
 *     &lt;enumeration value="CUT_FLOWERS"/>
 *     &lt;enumeration value="DANGEROUS_GOODS"/>
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE"/>
 *     &lt;enumeration value="DO_NOT_BREAK_DOWN_PALLETS"/>
 *     &lt;enumeration value="DO_NOT_STACK_PALLETS"/>
 *     &lt;enumeration value="DRY_ICE"/>
 *     &lt;enumeration value="EAST_COAST_SPECIAL"/>
 *     &lt;enumeration value="ELECTRONIC_TRADE_DOCUMENTS"/>
 *     &lt;enumeration value="EVENT_NOTIFICATION"/>
 *     &lt;enumeration value="EXCLUDE_FROM_CONSOLIDATION"/>
 *     &lt;enumeration value="EXTREME_LENGTH"/>
 *     &lt;enumeration value="FEDEX_ONE_RATE"/>
 *     &lt;enumeration value="FOOD"/>
 *     &lt;enumeration value="FREIGHT_GUARANTEE"/>
 *     &lt;enumeration value="FREIGHT_TO_COLLECT"/>
 *     &lt;enumeration value="FUTURE_DAY_SHIPMENT"/>
 *     &lt;enumeration value="HOLD_AT_LOCATION"/>
 *     &lt;enumeration value="HOME_DELIVERY_PREMIUM"/>
 *     &lt;enumeration value="INSIDE_DELIVERY"/>
 *     &lt;enumeration value="INSIDE_PICKUP"/>
 *     &lt;enumeration value="INTERNATIONAL_CONTROLLED_EXPORT_SERVICE"/>
 *     &lt;enumeration value="INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS"/>
 *     &lt;enumeration value="LIFTGATE_DELIVERY"/>
 *     &lt;enumeration value="LIFTGATE_PICKUP"/>
 *     &lt;enumeration value="LIMITED_ACCESS_DELIVERY"/>
 *     &lt;enumeration value="LIMITED_ACCESS_PICKUP"/>
 *     &lt;enumeration value="OVER_LENGTH"/>
 *     &lt;enumeration value="PENDING_SHIPMENT"/>
 *     &lt;enumeration value="PHARMACY_DELIVERY"/>
 *     &lt;enumeration value="POISON"/>
 *     &lt;enumeration value="PROTECTION_FROM_FREEZING"/>
 *     &lt;enumeration value="RETURNS_CLEARANCE"/>
 *     &lt;enumeration value="RETURN_SHIPMENT"/>
 *     &lt;enumeration value="SATURDAY_DELIVERY"/>
 *     &lt;enumeration value="SATURDAY_PICKUP"/>
 *     &lt;enumeration value="THIRD_PARTY_CONSIGNEE"/>
 *     &lt;enumeration value="TOP_LOAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentSpecialServiceType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ShipmentSpecialServiceType {

    BROKER_SELECT_OPTION,
    CALL_BEFORE_DELIVERY,
    COD,
    CUSTOM_DELIVERY_WINDOW,
    CUT_FLOWERS,
    DANGEROUS_GOODS,
    DELIVERY_ON_INVOICE_ACCEPTANCE,
    DO_NOT_BREAK_DOWN_PALLETS,
    DO_NOT_STACK_PALLETS,
    DRY_ICE,
    EAST_COAST_SPECIAL,
    ELECTRONIC_TRADE_DOCUMENTS,
    EVENT_NOTIFICATION,
    EXCLUDE_FROM_CONSOLIDATION,
    EXTREME_LENGTH,
    FEDEX_ONE_RATE,
    FOOD,
    FREIGHT_GUARANTEE,
    FREIGHT_TO_COLLECT,
    FUTURE_DAY_SHIPMENT,
    HOLD_AT_LOCATION,
    HOME_DELIVERY_PREMIUM,
    INSIDE_DELIVERY,
    INSIDE_PICKUP,
    INTERNATIONAL_CONTROLLED_EXPORT_SERVICE,
    INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS,
    LIFTGATE_DELIVERY,
    LIFTGATE_PICKUP,
    LIMITED_ACCESS_DELIVERY,
    LIMITED_ACCESS_PICKUP,
    OVER_LENGTH,
    PENDING_SHIPMENT,
    PHARMACY_DELIVERY,
    POISON,
    PROTECTION_FROM_FREEZING,
    RETURNS_CLEARANCE,
    RETURN_SHIPMENT,
    SATURDAY_DELIVERY,
    SATURDAY_PICKUP,
    THIRD_PARTY_CONSIGNEE,
    TOP_LOAD;

    public String value() {
        return name();
    }

    public static ShipmentSpecialServiceType fromValue(String v) {
        return valueOf(v);
    }

}
