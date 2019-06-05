
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AncillaryFeeAndTaxType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AncillaryFeeAndTaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLEARANCE_ENTRY_FEE"/>
 *     &lt;enumeration value="GOODS_AND_SERVICES_TAX"/>
 *     &lt;enumeration value="HARMONIZED_SALES_TAX"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AncillaryFeeAndTaxType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum AncillaryFeeAndTaxType {

    CLEARANCE_ENTRY_FEE,
    GOODS_AND_SERVICES_TAX,
    HARMONIZED_SALES_TAX,
    OTHER;

    public String value() {
        return name();
    }

    public static AncillaryFeeAndTaxType fromValue(String v) {
        return valueOf(v);
    }

}
