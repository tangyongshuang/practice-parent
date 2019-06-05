
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InternationalControlledExportType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InternationalControlledExportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEA_036"/>
 *     &lt;enumeration value="DEA_236"/>
 *     &lt;enumeration value="DEA_486"/>
 *     &lt;enumeration value="DSP_05"/>
 *     &lt;enumeration value="DSP_61"/>
 *     &lt;enumeration value="DSP_73"/>
 *     &lt;enumeration value="DSP_85"/>
 *     &lt;enumeration value="DSP_94"/>
 *     &lt;enumeration value="DSP_LICENSE_AGREEMENT"/>
 *     &lt;enumeration value="FROM_FOREIGN_TRADE_ZONE"/>
 *     &lt;enumeration value="WAREHOUSE_WITHDRAWAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InternationalControlledExportType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum InternationalControlledExportType {

    DEA_036,
    DEA_236,
    DEA_486,
    DSP_05,
    DSP_61,
    DSP_73,
    DSP_85,
    DSP_94,
    DSP_LICENSE_AGREEMENT,
    FROM_FOREIGN_TRADE_ZONE,
    WAREHOUSE_WITHDRAWAL;

    public String value() {
        return name();
    }

    public static InternationalControlledExportType fromValue(String v) {
        return valueOf(v);
    }

}
