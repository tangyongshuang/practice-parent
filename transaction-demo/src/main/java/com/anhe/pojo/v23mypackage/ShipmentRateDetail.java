
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for a shipment's total/summary rates, as calculated per a specific rate type. The "total..." fields may differ from the sum of corresponding package data for Multiweight or Express MPS.
 * 
 * <p>ShipmentRateDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShipmentRateDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateType" type="{http://fedex.com/ws/ship/v23}ReturnedRateType" minOccurs="0"/>
 *         &lt;element name="RateScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricingCode" type="{http://fedex.com/ws/ship/v23}PricingCodeType" minOccurs="0"/>
 *         &lt;element name="RatedWeightMethod" type="{http://fedex.com/ws/ship/v23}RatedWeightMethod" minOccurs="0"/>
 *         &lt;element name="MinimumChargeType" type="{http://fedex.com/ws/ship/v23}MinimumChargeType" minOccurs="0"/>
 *         &lt;element name="CurrencyExchangeRate" type="{http://fedex.com/ws/ship/v23}CurrencyExchangeRate" minOccurs="0"/>
 *         &lt;element name="SpecialRatingApplied" type="{http://fedex.com/ws/ship/v23}SpecialRatingAppliedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DimDivisor" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="DimDivisorType" type="{http://fedex.com/ws/ship/v23}RateDimensionalDivisorType" minOccurs="0"/>
 *         &lt;element name="FuelSurchargePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalBillingWeight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="TotalDimWeight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="TotalBaseCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalFreightDiscounts" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalNetFreight" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalSurcharges" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalNetFedExCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalTaxes" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalNetCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalRebates" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalDutiesAndTaxes" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalAncillaryFeesAndTaxes" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalDutiesTaxesAndFees" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalNetChargeWithDutiesAndTaxes" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="ShipmentLegRateDetails" type="{http://fedex.com/ws/ship/v23}ShipmentLegRateDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FreightRateDetail" type="{http://fedex.com/ws/ship/v23}FreightRateDetail" minOccurs="0"/>
 *         &lt;element name="FreightDiscounts" type="{http://fedex.com/ws/ship/v23}RateDiscount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rebates" type="{http://fedex.com/ws/ship/v23}Rebate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Surcharges" type="{http://fedex.com/ws/ship/v23}Surcharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://fedex.com/ws/ship/v23}Tax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DutiesAndTaxes" type="{http://fedex.com/ws/ship/v23}EdtCommodityTax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AncillaryFeesAndTaxes" type="{http://fedex.com/ws/ship/v23}AncillaryFeeAndTax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariableHandlingCharges" type="{http://fedex.com/ws/ship/v23}VariableHandlingCharges" minOccurs="0"/>
 *         &lt;element name="TotalVariableHandlingCharges" type="{http://fedex.com/ws/ship/v23}VariableHandlingCharges" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentRateDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "rateType",
    "rateScale",
    "rateZone",
    "pricingCode",
    "ratedWeightMethod",
    "minimumChargeType",
    "currencyExchangeRate",
    "specialRatingApplied",
    "dimDivisor",
    "dimDivisorType",
    "fuelSurchargePercent",
    "totalBillingWeight",
    "totalDimWeight",
    "totalBaseCharge",
    "totalFreightDiscounts",
    "totalNetFreight",
    "totalSurcharges",
    "totalNetFedExCharge",
    "totalTaxes",
    "totalNetCharge",
    "totalRebates",
    "totalDutiesAndTaxes",
    "totalAncillaryFeesAndTaxes",
    "totalDutiesTaxesAndFees",
    "totalNetChargeWithDutiesAndTaxes",
    "shipmentLegRateDetails",
    "freightRateDetail",
    "freightDiscounts",
    "rebates",
    "surcharges",
    "taxes",
    "dutiesAndTaxes",
    "ancillaryFeesAndTaxes",
    "variableHandlingCharges",
    "totalVariableHandlingCharges"
})
public class ShipmentRateDetail {

    @XmlElement(name = "RateType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ReturnedRateType rateType;
    @XmlElement(name = "RateScale", namespace = "http://fedex.com/ws/ship/v23")
    protected String rateScale;
    @XmlElement(name = "RateZone", namespace = "http://fedex.com/ws/ship/v23")
    protected String rateZone;
    @XmlElement(name = "PricingCode", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PricingCodeType pricingCode;
    @XmlElement(name = "RatedWeightMethod", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RatedWeightMethod ratedWeightMethod;
    @XmlElement(name = "MinimumChargeType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected MinimumChargeType minimumChargeType;
    @XmlElement(name = "CurrencyExchangeRate", namespace = "http://fedex.com/ws/ship/v23")
    protected CurrencyExchangeRate currencyExchangeRate;
    @XmlElement(name = "SpecialRatingApplied", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<SpecialRatingAppliedType> specialRatingApplied;
    @XmlElement(name = "DimDivisor", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dimDivisor;
    @XmlElement(name = "DimDivisorType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RateDimensionalDivisorType dimDivisorType;
    @XmlElement(name = "FuelSurchargePercent", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal fuelSurchargePercent;
    @XmlElement(name = "TotalBillingWeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight totalBillingWeight;
    @XmlElement(name = "TotalDimWeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight totalDimWeight;
    @XmlElement(name = "TotalBaseCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalBaseCharge;
    @XmlElement(name = "TotalFreightDiscounts", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalFreightDiscounts;
    @XmlElement(name = "TotalNetFreight", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalNetFreight;
    @XmlElement(name = "TotalSurcharges", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalSurcharges;
    @XmlElement(name = "TotalNetFedExCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalNetFedExCharge;
    @XmlElement(name = "TotalTaxes", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalTaxes;
    @XmlElement(name = "TotalNetCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalNetCharge;
    @XmlElement(name = "TotalRebates", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalRebates;
    @XmlElement(name = "TotalDutiesAndTaxes", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalDutiesAndTaxes;
    @XmlElement(name = "TotalAncillaryFeesAndTaxes", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalAncillaryFeesAndTaxes;
    @XmlElement(name = "TotalDutiesTaxesAndFees", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalDutiesTaxesAndFees;
    @XmlElement(name = "TotalNetChargeWithDutiesAndTaxes", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalNetChargeWithDutiesAndTaxes;
    @XmlElement(name = "ShipmentLegRateDetails", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ShipmentLegRateDetail> shipmentLegRateDetails;
    @XmlElement(name = "FreightRateDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected FreightRateDetail freightRateDetail;
    @XmlElement(name = "FreightDiscounts", namespace = "http://fedex.com/ws/ship/v23")
    protected List<RateDiscount> freightDiscounts;
    @XmlElement(name = "Rebates", namespace = "http://fedex.com/ws/ship/v23")
    protected List<Rebate> rebates;
    @XmlElement(name = "Surcharges", namespace = "http://fedex.com/ws/ship/v23")
    protected List<Surcharge> surcharges;
    @XmlElement(name = "Taxes", namespace = "http://fedex.com/ws/ship/v23")
    protected List<Tax> taxes;
    @XmlElement(name = "DutiesAndTaxes", namespace = "http://fedex.com/ws/ship/v23")
    protected List<EdtCommodityTax> dutiesAndTaxes;
    @XmlElement(name = "AncillaryFeesAndTaxes", namespace = "http://fedex.com/ws/ship/v23")
    protected List<AncillaryFeeAndTax> ancillaryFeesAndTaxes;
    @XmlElement(name = "VariableHandlingCharges", namespace = "http://fedex.com/ws/ship/v23")
    protected VariableHandlingCharges variableHandlingCharges;
    @XmlElement(name = "TotalVariableHandlingCharges", namespace = "http://fedex.com/ws/ship/v23")
    protected VariableHandlingCharges totalVariableHandlingCharges;

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
     * 获取rateScale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateScale() {
        return rateScale;
    }

    /**
     * 设置rateScale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateScale(String value) {
        this.rateScale = value;
    }

    /**
     * 获取rateZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateZone() {
        return rateZone;
    }

    /**
     * 设置rateZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateZone(String value) {
        this.rateZone = value;
    }

    /**
     * 获取pricingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricingCodeType }
     *     
     */
    public PricingCodeType getPricingCode() {
        return pricingCode;
    }

    /**
     * 设置pricingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricingCodeType }
     *     
     */
    public void setPricingCode(PricingCodeType value) {
        this.pricingCode = value;
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
     * 获取currencyExchangeRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchangeRate }
     *     
     */
    public CurrencyExchangeRate getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }

    /**
     * 设置currencyExchangeRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchangeRate }
     *     
     */
    public void setCurrencyExchangeRate(CurrencyExchangeRate value) {
        this.currencyExchangeRate = value;
    }

    /**
     * Gets the value of the specialRatingApplied property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialRatingApplied property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialRatingApplied().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRatingAppliedType }
     * 
     * 
     */
    public List<SpecialRatingAppliedType> getSpecialRatingApplied() {
        if (specialRatingApplied == null) {
            specialRatingApplied = new ArrayList<SpecialRatingAppliedType>();
        }
        return this.specialRatingApplied;
    }

    /**
     * 获取dimDivisor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDimDivisor() {
        return dimDivisor;
    }

    /**
     * 设置dimDivisor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDimDivisor(BigInteger value) {
        this.dimDivisor = value;
    }

    /**
     * 获取dimDivisorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateDimensionalDivisorType }
     *     
     */
    public RateDimensionalDivisorType getDimDivisorType() {
        return dimDivisorType;
    }

    /**
     * 设置dimDivisorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateDimensionalDivisorType }
     *     
     */
    public void setDimDivisorType(RateDimensionalDivisorType value) {
        this.dimDivisorType = value;
    }

    /**
     * 获取fuelSurchargePercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelSurchargePercent() {
        return fuelSurchargePercent;
    }

    /**
     * 设置fuelSurchargePercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelSurchargePercent(BigDecimal value) {
        this.fuelSurchargePercent = value;
    }

    /**
     * 获取totalBillingWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getTotalBillingWeight() {
        return totalBillingWeight;
    }

    /**
     * 设置totalBillingWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setTotalBillingWeight(Weight value) {
        this.totalBillingWeight = value;
    }

    /**
     * 获取totalDimWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getTotalDimWeight() {
        return totalDimWeight;
    }

    /**
     * 设置totalDimWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setTotalDimWeight(Weight value) {
        this.totalDimWeight = value;
    }

    /**
     * 获取totalBaseCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalBaseCharge() {
        return totalBaseCharge;
    }

    /**
     * 设置totalBaseCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalBaseCharge(Money value) {
        this.totalBaseCharge = value;
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
     * 获取totalNetFreight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalNetFreight() {
        return totalNetFreight;
    }

    /**
     * 设置totalNetFreight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalNetFreight(Money value) {
        this.totalNetFreight = value;
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
     * 获取totalNetFedExCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalNetFedExCharge() {
        return totalNetFedExCharge;
    }

    /**
     * 设置totalNetFedExCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalNetFedExCharge(Money value) {
        this.totalNetFedExCharge = value;
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
     * 获取totalNetCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalNetCharge() {
        return totalNetCharge;
    }

    /**
     * 设置totalNetCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalNetCharge(Money value) {
        this.totalNetCharge = value;
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
     * 获取totalDutiesAndTaxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalDutiesAndTaxes() {
        return totalDutiesAndTaxes;
    }

    /**
     * 设置totalDutiesAndTaxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalDutiesAndTaxes(Money value) {
        this.totalDutiesAndTaxes = value;
    }

    /**
     * 获取totalAncillaryFeesAndTaxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalAncillaryFeesAndTaxes() {
        return totalAncillaryFeesAndTaxes;
    }

    /**
     * 设置totalAncillaryFeesAndTaxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalAncillaryFeesAndTaxes(Money value) {
        this.totalAncillaryFeesAndTaxes = value;
    }

    /**
     * 获取totalDutiesTaxesAndFees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalDutiesTaxesAndFees() {
        return totalDutiesTaxesAndFees;
    }

    /**
     * 设置totalDutiesTaxesAndFees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalDutiesTaxesAndFees(Money value) {
        this.totalDutiesTaxesAndFees = value;
    }

    /**
     * 获取totalNetChargeWithDutiesAndTaxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalNetChargeWithDutiesAndTaxes() {
        return totalNetChargeWithDutiesAndTaxes;
    }

    /**
     * 设置totalNetChargeWithDutiesAndTaxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalNetChargeWithDutiesAndTaxes(Money value) {
        this.totalNetChargeWithDutiesAndTaxes = value;
    }

    /**
     * Gets the value of the shipmentLegRateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentLegRateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentLegRateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentLegRateDetail }
     * 
     * 
     */
    public List<ShipmentLegRateDetail> getShipmentLegRateDetails() {
        if (shipmentLegRateDetails == null) {
            shipmentLegRateDetails = new ArrayList<ShipmentLegRateDetail>();
        }
        return this.shipmentLegRateDetails;
    }

    /**
     * 获取freightRateDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightRateDetail }
     *     
     */
    public FreightRateDetail getFreightRateDetail() {
        return freightRateDetail;
    }

    /**
     * 设置freightRateDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightRateDetail }
     *     
     */
    public void setFreightRateDetail(FreightRateDetail value) {
        this.freightRateDetail = value;
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
     * Gets the value of the dutiesAndTaxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dutiesAndTaxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDutiesAndTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdtCommodityTax }
     * 
     * 
     */
    public List<EdtCommodityTax> getDutiesAndTaxes() {
        if (dutiesAndTaxes == null) {
            dutiesAndTaxes = new ArrayList<EdtCommodityTax>();
        }
        return this.dutiesAndTaxes;
    }

    /**
     * Gets the value of the ancillaryFeesAndTaxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryFeesAndTaxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryFeesAndTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryFeeAndTax }
     * 
     * 
     */
    public List<AncillaryFeeAndTax> getAncillaryFeesAndTaxes() {
        if (ancillaryFeesAndTaxes == null) {
            ancillaryFeesAndTaxes = new ArrayList<AncillaryFeeAndTax>();
        }
        return this.ancillaryFeesAndTaxes;
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

    /**
     * 获取totalVariableHandlingCharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableHandlingCharges }
     *     
     */
    public VariableHandlingCharges getTotalVariableHandlingCharges() {
        return totalVariableHandlingCharges;
    }

    /**
     * 设置totalVariableHandlingCharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableHandlingCharges }
     *     
     */
    public void setTotalVariableHandlingCharges(VariableHandlingCharges value) {
        this.totalVariableHandlingCharges = value;
    }

}
