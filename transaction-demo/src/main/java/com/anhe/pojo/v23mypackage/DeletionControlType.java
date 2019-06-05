
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeletionControlType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DeletionControlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DELETE_ALL_PACKAGES"/>
 *     &lt;enumeration value="DELETE_ENTIRE_CONSOLIDATION"/>
 *     &lt;enumeration value="DELETE_ONE_PACKAGE"/>
 *     &lt;enumeration value="LEGACY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeletionControlType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum DeletionControlType {

    DELETE_ALL_PACKAGES,
    DELETE_ENTIRE_CONSOLIDATION,
    DELETE_ONE_PACKAGE,
    LEGACY;

    public String value() {
        return name();
    }

    public static DeletionControlType fromValue(String v) {
        return valueOf(v);
    }

}
