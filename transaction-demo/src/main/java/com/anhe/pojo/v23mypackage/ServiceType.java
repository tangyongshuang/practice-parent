
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EUROPE_FIRST_INTERNATIONAL_PRIORITY"/>
 *     &lt;enumeration value="FEDEX_1_DAY_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_2_DAY"/>
 *     &lt;enumeration value="FEDEX_2_DAY_AM"/>
 *     &lt;enumeration value="FEDEX_2_DAY_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_3_DAY_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_DISTANCE_DEFERRED"/>
 *     &lt;enumeration value="FEDEX_EXPRESS_SAVER"/>
 *     &lt;enumeration value="FEDEX_FIRST_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_FREIGHT_ECONOMY"/>
 *     &lt;enumeration value="FEDEX_FREIGHT_PRIORITY"/>
 *     &lt;enumeration value="FEDEX_GROUND"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_AFTERNOON"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_EARLY_MORNING"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_END_OF_DAY"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_MID_MORNING"/>
 *     &lt;enumeration value="FIRST_OVERNIGHT"/>
 *     &lt;enumeration value="GROUND_HOME_DELIVERY"/>
 *     &lt;enumeration value="INTERNATIONAL_ECONOMY"/>
 *     &lt;enumeration value="INTERNATIONAL_ECONOMY_FREIGHT"/>
 *     &lt;enumeration value="INTERNATIONAL_FIRST"/>
 *     &lt;enumeration value="INTERNATIONAL_PRIORITY"/>
 *     &lt;enumeration value="INTERNATIONAL_PRIORITY_EXPRESS"/>
 *     &lt;enumeration value="INTERNATIONAL_PRIORITY_FREIGHT"/>
 *     &lt;enumeration value="PRIORITY_OVERNIGHT"/>
 *     &lt;enumeration value="SAME_DAY"/>
 *     &lt;enumeration value="SAME_DAY_CITY"/>
 *     &lt;enumeration value="SMART_POST"/>
 *     &lt;enumeration value="STANDARD_OVERNIGHT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ServiceType {

    EUROPE_FIRST_INTERNATIONAL_PRIORITY,
    FEDEX_1_DAY_FREIGHT,
    FEDEX_2_DAY,
    FEDEX_2_DAY_AM,
    FEDEX_2_DAY_FREIGHT,
    FEDEX_3_DAY_FREIGHT,
    FEDEX_DISTANCE_DEFERRED,
    FEDEX_EXPRESS_SAVER,
    FEDEX_FIRST_FREIGHT,
    FEDEX_FREIGHT_ECONOMY,
    FEDEX_FREIGHT_PRIORITY,
    FEDEX_GROUND,
    FEDEX_NEXT_DAY_AFTERNOON,
    FEDEX_NEXT_DAY_EARLY_MORNING,
    FEDEX_NEXT_DAY_END_OF_DAY,
    FEDEX_NEXT_DAY_FREIGHT,
    FEDEX_NEXT_DAY_MID_MORNING,
    FIRST_OVERNIGHT,
    GROUND_HOME_DELIVERY,
    INTERNATIONAL_ECONOMY,
    INTERNATIONAL_ECONOMY_FREIGHT,
    INTERNATIONAL_FIRST,
    INTERNATIONAL_PRIORITY,
    INTERNATIONAL_PRIORITY_EXPRESS,
    INTERNATIONAL_PRIORITY_FREIGHT,
    PRIORITY_OVERNIGHT,
    SAME_DAY,
    SAME_DAY_CITY,
    SMART_POST,
    STANDARD_OVERNIGHT;

    public String value() {
        return name();
    }

    public static ServiceType fromValue(String v) {
        return valueOf(v);
    }

}
