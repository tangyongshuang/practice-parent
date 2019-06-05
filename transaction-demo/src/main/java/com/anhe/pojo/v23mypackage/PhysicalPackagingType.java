
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PhysicalPackagingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PhysicalPackagingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAG"/>
 *     &lt;enumeration value="BARREL"/>
 *     &lt;enumeration value="BASKET"/>
 *     &lt;enumeration value="BOX"/>
 *     &lt;enumeration value="BUCKET"/>
 *     &lt;enumeration value="BUNDLE"/>
 *     &lt;enumeration value="CARTON"/>
 *     &lt;enumeration value="CASE"/>
 *     &lt;enumeration value="CONTAINER"/>
 *     &lt;enumeration value="CRATE"/>
 *     &lt;enumeration value="CYLINDER"/>
 *     &lt;enumeration value="DRUM"/>
 *     &lt;enumeration value="ENVELOPE"/>
 *     &lt;enumeration value="HAMPER"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PAIL"/>
 *     &lt;enumeration value="PALLET"/>
 *     &lt;enumeration value="PIECE"/>
 *     &lt;enumeration value="REEL"/>
 *     &lt;enumeration value="ROLL"/>
 *     &lt;enumeration value="SKID"/>
 *     &lt;enumeration value="TANK"/>
 *     &lt;enumeration value="TUBE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhysicalPackagingType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum PhysicalPackagingType {

    BAG,
    BARREL,
    BASKET,
    BOX,
    BUCKET,
    BUNDLE,
    CARTON,
    CASE,
    CONTAINER,
    CRATE,
    CYLINDER,
    DRUM,
    ENVELOPE,
    HAMPER,
    OTHER,
    PAIL,
    PALLET,
    PIECE,
    REEL,
    ROLL,
    SKID,
    TANK,
    TUBE;

    public String value() {
        return name();
    }

    public static PhysicalPackagingType fromValue(String v) {
        return valueOf(v);
    }

}
