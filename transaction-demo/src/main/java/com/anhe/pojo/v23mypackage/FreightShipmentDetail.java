
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
 * Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and FEDEX_FREIGHT_PRIORITY services.
 * 
 * <p>FreightShipmentDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FreightShipmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FedExFreightAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FedExFreightBillingContactAndAddress" type="{http://fedex.com/ws/ship/v23}ContactAndAddress" minOccurs="0"/>
 *         &lt;element name="AlternateBilling" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *         &lt;element name="PrintedReferences" type="{http://fedex.com/ws/ship/v23}PrintedReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://fedex.com/ws/ship/v23}FreightShipmentRoleType" minOccurs="0"/>
 *         &lt;element name="CollectTermsType" type="{http://fedex.com/ws/ship/v23}FreightCollectTermsType" minOccurs="0"/>
 *         &lt;element name="DeclaredValuePerUnit" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="DeclaredValueUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LiabilityCoverageDetail" type="{http://fedex.com/ws/ship/v23}LiabilityCoverageDetail" minOccurs="0"/>
 *         &lt;element name="Coupons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalHandlingUnits" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ClientDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PalletWeight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="ShipmentDimensions" type="{http://fedex.com/ws/ship/v23}Dimensions" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialServicePayments" type="{http://fedex.com/ws/ship/v23}FreightSpecialServicePayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HazardousMaterialsEmergencyContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HazardousMaterialsOfferor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineItems" type="{http://fedex.com/ws/ship/v23}FreightShipmentLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightShipmentDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "fedExFreightAccountNumber",
    "fedExFreightBillingContactAndAddress",
    "alternateBilling",
    "printedReferences",
    "role",
    "collectTermsType",
    "declaredValuePerUnit",
    "declaredValueUnits",
    "liabilityCoverageDetail",
    "coupons",
    "totalHandlingUnits",
    "clientDiscountPercent",
    "palletWeight",
    "shipmentDimensions",
    "comment",
    "specialServicePayments",
    "hazardousMaterialsEmergencyContactNumber",
    "hazardousMaterialsOfferor",
    "lineItems"
})
public class FreightShipmentDetail {

    @XmlElement(name = "FedExFreightAccountNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String fedExFreightAccountNumber;
    @XmlElement(name = "FedExFreightBillingContactAndAddress", namespace = "http://fedex.com/ws/ship/v23")
    protected ContactAndAddress fedExFreightBillingContactAndAddress;
    @XmlElement(name = "AlternateBilling", namespace = "http://fedex.com/ws/ship/v23")
    protected Party alternateBilling;
    @XmlElement(name = "PrintedReferences", namespace = "http://fedex.com/ws/ship/v23")
    protected List<PrintedReference> printedReferences;
    @XmlElement(name = "Role", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightShipmentRoleType role;
    @XmlElement(name = "CollectTermsType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightCollectTermsType collectTermsType;
    @XmlElement(name = "DeclaredValuePerUnit", namespace = "http://fedex.com/ws/ship/v23")
    protected Money declaredValuePerUnit;
    @XmlElement(name = "DeclaredValueUnits", namespace = "http://fedex.com/ws/ship/v23")
    protected String declaredValueUnits;
    @XmlElement(name = "LiabilityCoverageDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected LiabilityCoverageDetail liabilityCoverageDetail;
    @XmlElement(name = "Coupons", namespace = "http://fedex.com/ws/ship/v23")
    protected List<String> coupons;
    @XmlElement(name = "TotalHandlingUnits", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalHandlingUnits;
    @XmlElement(name = "ClientDiscountPercent", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal clientDiscountPercent;
    @XmlElement(name = "PalletWeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight palletWeight;
    @XmlElement(name = "ShipmentDimensions", namespace = "http://fedex.com/ws/ship/v23")
    protected Dimensions shipmentDimensions;
    @XmlElement(name = "Comment", namespace = "http://fedex.com/ws/ship/v23")
    protected String comment;
    @XmlElement(name = "SpecialServicePayments", namespace = "http://fedex.com/ws/ship/v23")
    protected List<FreightSpecialServicePayment> specialServicePayments;
    @XmlElement(name = "HazardousMaterialsEmergencyContactNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String hazardousMaterialsEmergencyContactNumber;
    @XmlElement(name = "HazardousMaterialsOfferor", namespace = "http://fedex.com/ws/ship/v23")
    protected String hazardousMaterialsOfferor;
    @XmlElement(name = "LineItems", namespace = "http://fedex.com/ws/ship/v23")
    protected List<FreightShipmentLineItem> lineItems;

    /**
     * 获取fedExFreightAccountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFedExFreightAccountNumber() {
        return fedExFreightAccountNumber;
    }

    /**
     * 设置fedExFreightAccountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFedExFreightAccountNumber(String value) {
        this.fedExFreightAccountNumber = value;
    }

    /**
     * 获取fedExFreightBillingContactAndAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getFedExFreightBillingContactAndAddress() {
        return fedExFreightBillingContactAndAddress;
    }

    /**
     * 设置fedExFreightBillingContactAndAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setFedExFreightBillingContactAndAddress(ContactAndAddress value) {
        this.fedExFreightBillingContactAndAddress = value;
    }

    /**
     * 获取alternateBilling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getAlternateBilling() {
        return alternateBilling;
    }

    /**
     * 设置alternateBilling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setAlternateBilling(Party value) {
        this.alternateBilling = value;
    }

    /**
     * Gets the value of the printedReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the printedReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrintedReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrintedReference }
     * 
     * 
     */
    public List<PrintedReference> getPrintedReferences() {
        if (printedReferences == null) {
            printedReferences = new ArrayList<PrintedReference>();
        }
        return this.printedReferences;
    }

    /**
     * 获取role属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightShipmentRoleType }
     *     
     */
    public FreightShipmentRoleType getRole() {
        return role;
    }

    /**
     * 设置role属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightShipmentRoleType }
     *     
     */
    public void setRole(FreightShipmentRoleType value) {
        this.role = value;
    }

    /**
     * 获取collectTermsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightCollectTermsType }
     *     
     */
    public FreightCollectTermsType getCollectTermsType() {
        return collectTermsType;
    }

    /**
     * 设置collectTermsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCollectTermsType }
     *     
     */
    public void setCollectTermsType(FreightCollectTermsType value) {
        this.collectTermsType = value;
    }

    /**
     * 获取declaredValuePerUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDeclaredValuePerUnit() {
        return declaredValuePerUnit;
    }

    /**
     * 设置declaredValuePerUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDeclaredValuePerUnit(Money value) {
        this.declaredValuePerUnit = value;
    }

    /**
     * 获取declaredValueUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclaredValueUnits() {
        return declaredValueUnits;
    }

    /**
     * 设置declaredValueUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclaredValueUnits(String value) {
        this.declaredValueUnits = value;
    }

    /**
     * 获取liabilityCoverageDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LiabilityCoverageDetail }
     *     
     */
    public LiabilityCoverageDetail getLiabilityCoverageDetail() {
        return liabilityCoverageDetail;
    }

    /**
     * 设置liabilityCoverageDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityCoverageDetail }
     *     
     */
    public void setLiabilityCoverageDetail(LiabilityCoverageDetail value) {
        this.liabilityCoverageDetail = value;
    }

    /**
     * Gets the value of the coupons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coupons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoupons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCoupons() {
        if (coupons == null) {
            coupons = new ArrayList<String>();
        }
        return this.coupons;
    }

    /**
     * 获取totalHandlingUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalHandlingUnits() {
        return totalHandlingUnits;
    }

    /**
     * 设置totalHandlingUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalHandlingUnits(BigInteger value) {
        this.totalHandlingUnits = value;
    }

    /**
     * 获取clientDiscountPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClientDiscountPercent() {
        return clientDiscountPercent;
    }

    /**
     * 设置clientDiscountPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClientDiscountPercent(BigDecimal value) {
        this.clientDiscountPercent = value;
    }

    /**
     * 获取palletWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getPalletWeight() {
        return palletWeight;
    }

    /**
     * 设置palletWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setPalletWeight(Weight value) {
        this.palletWeight = value;
    }

    /**
     * 获取shipmentDimensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getShipmentDimensions() {
        return shipmentDimensions;
    }

    /**
     * 设置shipmentDimensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setShipmentDimensions(Dimensions value) {
        this.shipmentDimensions = value;
    }

    /**
     * 获取comment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置comment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the specialServicePayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialServicePayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServicePayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreightSpecialServicePayment }
     * 
     * 
     */
    public List<FreightSpecialServicePayment> getSpecialServicePayments() {
        if (specialServicePayments == null) {
            specialServicePayments = new ArrayList<FreightSpecialServicePayment>();
        }
        return this.specialServicePayments;
    }

    /**
     * 获取hazardousMaterialsEmergencyContactNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousMaterialsEmergencyContactNumber() {
        return hazardousMaterialsEmergencyContactNumber;
    }

    /**
     * 设置hazardousMaterialsEmergencyContactNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousMaterialsEmergencyContactNumber(String value) {
        this.hazardousMaterialsEmergencyContactNumber = value;
    }

    /**
     * 获取hazardousMaterialsOfferor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousMaterialsOfferor() {
        return hazardousMaterialsOfferor;
    }

    /**
     * 设置hazardousMaterialsOfferor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousMaterialsOfferor(String value) {
        this.hazardousMaterialsOfferor = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreightShipmentLineItem }
     * 
     * 
     */
    public List<FreightShipmentLineItem> getLineItems() {
        if (lineItems == null) {
            lineItems = new ArrayList<FreightShipmentLineItem>();
        }
        return this.lineItems;
    }

}
