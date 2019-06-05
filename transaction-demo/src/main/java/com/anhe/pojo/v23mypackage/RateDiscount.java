
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RateDiscount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RateDiscount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateDiscountType" type="{http://fedex.com/ws/ship/v23}RateDiscountType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDiscount", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "rateDiscountType",
    "description",
    "amount",
    "percent"
})
public class RateDiscount {

    @XmlElement(name = "RateDiscountType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RateDiscountType rateDiscountType;
    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected String description;
    @XmlElement(name = "Amount", namespace = "http://fedex.com/ws/ship/v23")
    protected Money amount;
    @XmlElement(name = "Percent", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal percent;

    /**
     * 获取rateDiscountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateDiscountType }
     *     
     */
    public RateDiscountType getRateDiscountType() {
        return rateDiscountType;
    }

    /**
     * 设置rateDiscountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateDiscountType }
     *     
     */
    public void setRateDiscountType(RateDiscountType value) {
        this.rateDiscountType = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

    /**
     * 获取percent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * 设置percent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

}
