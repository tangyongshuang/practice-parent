
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Individual charge which contributes to the total base charge for the shipment.
 * 
 * <p>FreightBaseCharge complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FreightBaseCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FreightClass" type="{http://fedex.com/ws/ship/v23}FreightClassType" minOccurs="0"/>
 *         &lt;element name="RatedAsClass" type="{http://fedex.com/ws/ship/v23}FreightClassType" minOccurs="0"/>
 *         &lt;element name="NmfcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="ChargeRate" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="ChargeBasis" type="{http://fedex.com/ws/ship/v23}FreightChargeBasisType" minOccurs="0"/>
 *         &lt;element name="ExtendedAmount" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightBaseCharge", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "freightClass",
    "ratedAsClass",
    "nmfcCode",
    "description",
    "weight",
    "chargeRate",
    "chargeBasis",
    "extendedAmount"
})
public class FreightBaseCharge {

    @XmlElement(name = "FreightClass", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightClassType freightClass;
    @XmlElement(name = "RatedAsClass", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightClassType ratedAsClass;
    @XmlElement(name = "NmfcCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String nmfcCode;
    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected String description;
    @XmlElement(name = "Weight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight weight;
    @XmlElement(name = "ChargeRate", namespace = "http://fedex.com/ws/ship/v23")
    protected Money chargeRate;
    @XmlElement(name = "ChargeBasis", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightChargeBasisType chargeBasis;
    @XmlElement(name = "ExtendedAmount", namespace = "http://fedex.com/ws/ship/v23")
    protected Money extendedAmount;

    /**
     * 获取freightClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightClassType }
     *     
     */
    public FreightClassType getFreightClass() {
        return freightClass;
    }

    /**
     * 设置freightClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightClassType }
     *     
     */
    public void setFreightClass(FreightClassType value) {
        this.freightClass = value;
    }

    /**
     * 获取ratedAsClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightClassType }
     *     
     */
    public FreightClassType getRatedAsClass() {
        return ratedAsClass;
    }

    /**
     * 设置ratedAsClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightClassType }
     *     
     */
    public void setRatedAsClass(FreightClassType value) {
        this.ratedAsClass = value;
    }

    /**
     * 获取nmfcCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmfcCode() {
        return nmfcCode;
    }

    /**
     * 设置nmfcCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmfcCode(String value) {
        this.nmfcCode = value;
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
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setWeight(Weight value) {
        this.weight = value;
    }

    /**
     * 获取chargeRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getChargeRate() {
        return chargeRate;
    }

    /**
     * 设置chargeRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setChargeRate(Money value) {
        this.chargeRate = value;
    }

    /**
     * 获取chargeBasis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightChargeBasisType }
     *     
     */
    public FreightChargeBasisType getChargeBasis() {
        return chargeBasis;
    }

    /**
     * 设置chargeBasis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightChargeBasisType }
     *     
     */
    public void setChargeBasis(FreightChargeBasisType value) {
        this.chargeBasis = value;
    }

    /**
     * 获取extendedAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getExtendedAmount() {
        return extendedAmount;
    }

    /**
     * 设置extendedAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setExtendedAmount(Money value) {
        this.extendedAmount = value;
    }

}
