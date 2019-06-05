
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NaftaProducerDeterminationCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NaftaProducerDeterminationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_1"/>
 *     &lt;enumeration value="NO_2"/>
 *     &lt;enumeration value="NO_3"/>
 *     &lt;enumeration value="YES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaftaProducerDeterminationCode", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum NaftaProducerDeterminationCode {

    NO_1,
    NO_2,
    NO_3,
    YES;

    public String value() {
        return name();
    }

    public static NaftaProducerDeterminationCode fromValue(String v) {
        return valueOf(v);
    }

}
