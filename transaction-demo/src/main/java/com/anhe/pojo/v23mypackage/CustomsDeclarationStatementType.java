
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomsDeclarationStatementType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomsDeclarationStatementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NAFTA_LOW_VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomsDeclarationStatementType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum CustomsDeclarationStatementType {

    NAFTA_LOW_VALUE;

    public String value() {
        return name();
    }

    public static CustomsDeclarationStatementType fromValue(String v) {
        return valueOf(v);
    }

}
