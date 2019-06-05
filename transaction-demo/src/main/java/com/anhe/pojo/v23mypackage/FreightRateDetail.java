
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Rate data specific to FedEx Freight or FedEx National Freight services.
 * 
 * <p>FreightRateDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FreightRateDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteType" type="{http://fedex.com/ws/ship/v23}FreightRateQuoteType" minOccurs="0"/>
 *         &lt;element name="BaseChargeCalculation" type="{http://fedex.com/ws/ship/v23}FreightBaseChargeCalculationType" minOccurs="0"/>
 *         &lt;element name="BaseCharges" type="{http://fedex.com/ws/ship/v23}FreightBaseCharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notations" type="{http://fedex.com/ws/ship/v23}FreightRateNotation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightRateDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "quoteNumber",
    "quoteType",
    "baseChargeCalculation",
    "baseCharges",
    "notations"
})
public class FreightRateDetail {

    @XmlElement(name = "QuoteNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String quoteNumber;
    @XmlElement(name = "QuoteType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightRateQuoteType quoteType;
    @XmlElement(name = "BaseChargeCalculation", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightBaseChargeCalculationType baseChargeCalculation;
    @XmlElement(name = "BaseCharges", namespace = "http://fedex.com/ws/ship/v23")
    protected List<FreightBaseCharge> baseCharges;
    @XmlElement(name = "Notations", namespace = "http://fedex.com/ws/ship/v23")
    protected List<FreightRateNotation> notations;

    /**
     * 获取quoteNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNumber() {
        return quoteNumber;
    }

    /**
     * 设置quoteNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNumber(String value) {
        this.quoteNumber = value;
    }

    /**
     * 获取quoteType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightRateQuoteType }
     *     
     */
    public FreightRateQuoteType getQuoteType() {
        return quoteType;
    }

    /**
     * 设置quoteType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightRateQuoteType }
     *     
     */
    public void setQuoteType(FreightRateQuoteType value) {
        this.quoteType = value;
    }

    /**
     * 获取baseChargeCalculation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightBaseChargeCalculationType }
     *     
     */
    public FreightBaseChargeCalculationType getBaseChargeCalculation() {
        return baseChargeCalculation;
    }

    /**
     * 设置baseChargeCalculation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBaseChargeCalculationType }
     *     
     */
    public void setBaseChargeCalculation(FreightBaseChargeCalculationType value) {
        this.baseChargeCalculation = value;
    }

    /**
     * Gets the value of the baseCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreightBaseCharge }
     * 
     * 
     */
    public List<FreightBaseCharge> getBaseCharges() {
        if (baseCharges == null) {
            baseCharges = new ArrayList<FreightBaseCharge>();
        }
        return this.baseCharges;
    }

    /**
     * Gets the value of the notations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreightRateNotation }
     * 
     * 
     */
    public List<FreightRateNotation> getNotations() {
        if (notations == null) {
            notations = new ArrayList<FreightRateNotation>();
        }
        return this.notations;
    }

}
