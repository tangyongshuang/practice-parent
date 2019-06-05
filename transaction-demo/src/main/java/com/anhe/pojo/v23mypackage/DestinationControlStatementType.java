
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DestinationControlStatementType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DestinationControlStatementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPARTMENT_OF_COMMERCE"/>
 *     &lt;enumeration value="DEPARTMENT_OF_STATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DestinationControlStatementType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum DestinationControlStatementType {

    DEPARTMENT_OF_COMMERCE,
    DEPARTMENT_OF_STATE;

    public String value() {
        return name();
    }

    public static DestinationControlStatementType fromValue(String v) {
        return valueOf(v);
    }

}
