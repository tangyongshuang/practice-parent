
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelStockType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LabelStockType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAPER_4X6"/>
 *     &lt;enumeration value="PAPER_4X6.75"/>
 *     &lt;enumeration value="PAPER_4X8"/>
 *     &lt;enumeration value="PAPER_4X9"/>
 *     &lt;enumeration value="PAPER_7X4.75"/>
 *     &lt;enumeration value="PAPER_8.5X11_BOTTOM_HALF_LABEL"/>
 *     &lt;enumeration value="PAPER_8.5X11_TOP_HALF_LABEL"/>
 *     &lt;enumeration value="PAPER_LETTER"/>
 *     &lt;enumeration value="STOCK_4X6"/>
 *     &lt;enumeration value="STOCK_4X6.75"/>
 *     &lt;enumeration value="STOCK_4X6.75_LEADING_DOC_TAB"/>
 *     &lt;enumeration value="STOCK_4X6.75_TRAILING_DOC_TAB"/>
 *     &lt;enumeration value="STOCK_4X8"/>
 *     &lt;enumeration value="STOCK_4X9"/>
 *     &lt;enumeration value="STOCK_4X9_LEADING_DOC_TAB"/>
 *     &lt;enumeration value="STOCK_4X9_TRAILING_DOC_TAB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelStockType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum LabelStockType {

    @XmlEnumValue("PAPER_4X6")
    PAPER_4_X_6("PAPER_4X6"),
    @XmlEnumValue("PAPER_4X6.75")
    PAPER_4_X_6_75("PAPER_4X6.75"),
    @XmlEnumValue("PAPER_4X8")
    PAPER_4_X_8("PAPER_4X8"),
    @XmlEnumValue("PAPER_4X9")
    PAPER_4_X_9("PAPER_4X9"),
    @XmlEnumValue("PAPER_7X4.75")
    PAPER_7_X_4_75("PAPER_7X4.75"),
    @XmlEnumValue("PAPER_8.5X11_BOTTOM_HALF_LABEL")
    PAPER_8_5_X_11_BOTTOM_HALF_LABEL("PAPER_8.5X11_BOTTOM_HALF_LABEL"),
    @XmlEnumValue("PAPER_8.5X11_TOP_HALF_LABEL")
    PAPER_8_5_X_11_TOP_HALF_LABEL("PAPER_8.5X11_TOP_HALF_LABEL"),
    PAPER_LETTER("PAPER_LETTER"),
    @XmlEnumValue("STOCK_4X6")
    STOCK_4_X_6("STOCK_4X6"),
    @XmlEnumValue("STOCK_4X6.75")
    STOCK_4_X_6_75("STOCK_4X6.75"),
    @XmlEnumValue("STOCK_4X6.75_LEADING_DOC_TAB")
    STOCK_4_X_6_75_LEADING_DOC_TAB("STOCK_4X6.75_LEADING_DOC_TAB"),
    @XmlEnumValue("STOCK_4X6.75_TRAILING_DOC_TAB")
    STOCK_4_X_6_75_TRAILING_DOC_TAB("STOCK_4X6.75_TRAILING_DOC_TAB"),
    @XmlEnumValue("STOCK_4X8")
    STOCK_4_X_8("STOCK_4X8"),
    @XmlEnumValue("STOCK_4X9")
    STOCK_4_X_9("STOCK_4X9"),
    @XmlEnumValue("STOCK_4X9_LEADING_DOC_TAB")
    STOCK_4_X_9_LEADING_DOC_TAB("STOCK_4X9_LEADING_DOC_TAB"),
    @XmlEnumValue("STOCK_4X9_TRAILING_DOC_TAB")
    STOCK_4_X_9_TRAILING_DOC_TAB("STOCK_4X9_TRAILING_DOC_TAB");
    private final String value;

    LabelStockType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LabelStockType fromValue(String v) {
        for (LabelStockType c: LabelStockType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
