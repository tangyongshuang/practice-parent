
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaxesOrMiscellaneousChargeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TaxesOrMiscellaneousChargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMMISSIONS"/>
 *     &lt;enumeration value="DISCOUNTS"/>
 *     &lt;enumeration value="HANDLING_FEES"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="ROYALTIES_AND_LICENSE_FEES"/>
 *     &lt;enumeration value="TAXES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxesOrMiscellaneousChargeType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum TaxesOrMiscellaneousChargeType {

    COMMISSIONS,
    DISCOUNTS,
    HANDLING_FEES,
    OTHER,
    ROYALTIES_AND_LICENSE_FEES,
    TAXES;

    public String value() {
        return name();
    }

    public static TaxesOrMiscellaneousChargeType fromValue(String v) {
        return valueOf(v);
    }

}
