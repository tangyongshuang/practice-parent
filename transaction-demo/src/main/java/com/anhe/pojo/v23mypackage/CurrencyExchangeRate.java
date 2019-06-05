
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CurrencyExchangeRate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CurrencyExchangeRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntoCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchangeRate", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "fromCurrency",
    "intoCurrency",
    "rate"
})
public class CurrencyExchangeRate {

    @XmlElement(name = "FromCurrency", namespace = "http://fedex.com/ws/ship/v23")
    protected String fromCurrency;
    @XmlElement(name = "IntoCurrency", namespace = "http://fedex.com/ws/ship/v23")
    protected String intoCurrency;
    @XmlElement(name = "Rate", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal rate;

    /**
     * 获取fromCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCurrency() {
        return fromCurrency;
    }

    /**
     * 设置fromCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCurrency(String value) {
        this.fromCurrency = value;
    }

    /**
     * 获取intoCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntoCurrency() {
        return intoCurrency;
    }

    /**
     * 设置intoCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntoCurrency(String value) {
        this.intoCurrency = value;
    }

    /**
     * 获取rate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置rate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

}
