
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for a package's rates, as calculated per a specific rate type.
 * 
 * <p>PackageRateDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PackageRateDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateType" type="{http://fedex.com/ws/ship/v23}ReturnedRateType" minOccurs="0"/>
 *         &lt;element name="RatedWeightMethod" type="{http://fedex.com/ws/ship/v23}RatedWeightMethod" minOccurs="0"/>
 *         &lt;element name="MinimumChargeType" type="{http://fedex.com/ws/ship/v23}MinimumChargeType" minOccurs="0"/>
 *         &lt;element name="BillingWeight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="DimWeight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="OversizeWeight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="BaseCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalFreightDiscounts" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="NetFreight" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalSurcharges" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="NetFedExCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalTaxes" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="NetCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalRebates" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="FreightDiscounts" type="{http://fedex.com/ws/ship/v23}RateDiscount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rebates" type="{http://fedex.com/ws/ship/v23}Rebate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Surcharges" type="{http://fedex.com/ws/ship/v23}Surcharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://fedex.com/ws/ship/v23}Tax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariableHandlingCharges" type="{http://fedex.com/ws/ship/v23}VariableHandlingCharges" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageRateDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "rateType",
    "ratedWeightMethod",
    "minimumChargeType",
    "billingWeight",
    "dimWeight",
    "oversizeWeight",
    "baseCharge",
    "totalFreightDiscounts",
    "netFreight",
    "totalSurcharges",
    "netFedExCharge",
    "totalTaxes",
    "netCharge",
    "totalRebates",
    "freightDiscounts",
    "rebates",
    "surcharges",
    "taxes",
    "variableHandlingCharges"
})
public class PackageRateDetail {

    @XmlElement(name = "RateType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ReturnedRateType rateType;
    @XmlElement(name = "RatedWeightMethod", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RatedWeightMethod ratedWeightMethod;
    @XmlElement(name = "MinimumChargeType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected MinimumChargeType minimumChargeType;
    @XmlElement(name = "BillingWeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight billingWeight;
    @XmlElement(name = "DimWeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight dimWeight;
    @XmlElement(name = "OversizeWeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight oversizeWeight;
    @XmlElement(name = "BaseCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money baseCharge;
    @XmlElement(name = "TotalFreightDiscounts", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalFreightDiscounts;
    @XmlElement(name = "NetFreight", namespace = "http://fedex.com/ws/ship/v23")
    protected Money netFreight;
    @XmlElement(name = "TotalSurcharges", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalSurcharges;
    @XmlElement(name = "NetFedExCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money netFedExCharge;
    @XmlElement(name = "TotalTaxes", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalTaxes;
    @XmlElement(name = "NetCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money netCharge;
    @XmlElement(name = "TotalRebates", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalRebates;
    @XmlElement(name = "FreightDiscounts", namespace = "http://fedex.com/ws/ship/v23")
    protected List<RateDiscount> freightDiscounts;
    @XmlElement(name = "Rebates", namespace = "http://fedex.com/ws/ship/v23")
    protected List<Rebate> rebates;
    @XmlElement(name = "Surcharges", namespace = "http://fedex.com/ws/ship/v23")
    protected List<Surcharge> surcharges;
    @XmlElement(name = "Taxes", namespace = "http://fedex.com/ws/ship/v23")
    protected List<Tax> taxes;
    @XmlElement(name = "VariableHandlingCharges", namespace = "http://fedex.com/ws/ship/v23")
    protected VariableHandlingCharges variableHandlingCharges;

    /**
     * 获取rateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnedRateType }
     *     
     */
    public ReturnedRateType getRateType() {
        return rateType;
    }

    /**
     * 设置rateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnedRateType }
     *     
     */
    public void setRateType(ReturnedRateType value) {
        this.rateType = value;
    }

    /**
     * 获取ratedWeightMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RatedWeightMethod }
     *     
     */
    public RatedWeightMethod getRatedWeightMethod() {
        return ratedWeightMethod;
    }

    /**
     * 设置ratedWeightMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RatedWeightMethod }
     *     
     */
    public void setRatedWeightMethod(RatedWeightMethod value) {
        this.ratedWeightMethod = value;
    }

    /**
     * 获取minimumChargeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MinimumChargeType }
     *     
     */
    public MinimumChargeType getMinimumChargeType() {
        return minimumChargeType;
    }

    /**
     * 设置minimumChargeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumChargeType }
     *     
     */
    public void setMinimumChargeType(MinimumChargeType value) {
        this.minimumChargeType = value;
    }

    /**
     * 获取billingWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getBillingWeight() {
        return billingWeight;
    }

    /**
     * 设置billingWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setBillingWeight(Weight value) {
        this.billingWeight = value;
    }

    /**
     * 获取dimWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getDimWeight() {
        return dimWeight;
    }

    /**
     * 设置dimWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setDimWeight(Weight value) {
        this.dimWeight = value;
    }

    /**
     * 获取oversizeWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getOversizeWeight() {
        return oversizeWeight;
    }

    /**
     * 设置oversizeWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setOversizeWeight(Weight value) {
        this.oversizeWeight = value;
    }

    /**
     * 获取baseCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBaseCharge() {
        return baseCharge;
    }

    /**
     * 设置baseCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBaseCharge(Money value) {
        this.baseCharge = value;
    }

    /**
     * 获取totalFreightDiscounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalFreightDiscounts() {
        return totalFreightDiscounts;
    }

    /**
     * 设置totalFreightDiscounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalFreightDiscounts(Money value) {
        this.totalFreightDiscounts = value;
    }

    /**
     * 获取netFreight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNetFreight() {
        return netFreight;
    }

    /**
     * 设置netFreight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNetFreight(Money value) {
        this.netFreight = value;
    }

    /**
     * 获取totalSurcharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalSurcharges() {
        return totalSurcharges;
    }

    /**
     * 设置totalSurcharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalSurcharges(Money value) {
        this.totalSurcharges = value;
    }

    /**
     * 获取netFedExCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNetFedExCharge() {
        return netFedExCharge;
    }

    /**
     * 设置netFedExCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNetFedExCharge(Money value) {
        this.netFedExCharge = value;
    }

    /**
     * 获取totalTaxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalTaxes() {
        return totalTaxes;
    }

    /**
     * 设置totalTaxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalTaxes(Money value) {
        this.totalTaxes = value;
    }

    /**
     * 获取netCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNetCharge() {
        return netCharge;
    }

    /**
     * 设置netCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNetCharge(Money value) {
        this.netCharge = value;
    }

    /**
     * 获取totalRebates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalRebates() {
        return totalRebates;
    }

    /**
     * 设置totalRebates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalRebates(Money value) {
        this.totalRebates = value;
    }

    /**
     * Gets the value of the freightDiscounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freightDiscounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreightDiscounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateDiscount }
     * 
     * 
     */
    public List<RateDiscount> getFreightDiscounts() {
        if (freightDiscounts == null) {
            freightDiscounts = new ArrayList<RateDiscount>();
        }
        return this.freightDiscounts;
    }

    /**
     * Gets the value of the rebates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rebates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRebates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rebate }
     * 
     * 
     */
    public List<Rebate> getRebates() {
        if (rebates == null) {
            rebates = new ArrayList<Rebate>();
        }
        return this.rebates;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surcharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurcharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Surcharge }
     * 
     * 
     */
    public List<Surcharge> getSurcharges() {
        if (surcharges == null) {
            surcharges = new ArrayList<Surcharge>();
        }
        return this.surcharges;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * 
     * 
     */
    public List<Tax> getTaxes() {
        if (taxes == null) {
            taxes = new ArrayList<Tax>();
        }
        return this.taxes;
    }

    /**
     * 获取variableHandlingCharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableHandlingCharges }
     *     
     */
    public VariableHandlingCharges getVariableHandlingCharges() {
        return variableHandlingCharges;
    }

    /**
     * 设置variableHandlingCharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableHandlingCharges }
     *     
     */
    public void setVariableHandlingCharges(VariableHandlingCharges value) {
        this.variableHandlingCharges = value;
    }

}
