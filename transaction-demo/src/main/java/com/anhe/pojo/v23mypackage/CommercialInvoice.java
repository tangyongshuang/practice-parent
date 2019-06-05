
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * CommercialInvoice element is required for electronic upload of CI data. It will serve to create/transmit an Electronic Commercial Invoice through the FedEx Systems. Customers are responsible for printing their own Commercial Invoice.If you would likeFedEx to generate a Commercial Invoice and transmit it to Customs. for clearance purposes, you need to specify that in the ShippingDocumentSpecification element. If you would like a copy of the Commercial Invoice that FedEx generated returned to you in reply it needs to be specified in the ETDDetail/RequestedDocumentCopies element. Commercial Invoice support consists of maximum of 99 commodity line items.
 * 
 * <p>CommercialInvoice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CommercialInvoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="FreightCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TaxesOrMiscellaneousCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TaxesOrMiscellaneousChargeType" type="{http://fedex.com/ws/ship/v23}TaxesOrMiscellaneousChargeType" minOccurs="0"/>
 *         &lt;element name="PackingCosts" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="HandlingCosts" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeclarationStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{http://fedex.com/ws/ship/v23}PurposeOfShipmentType" minOccurs="0"/>
 *         &lt;element name="CustomerReferences" type="{http://fedex.com/ws/ship/v23}CustomerReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OriginatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialInvoice", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "comments",
    "freightCharge",
    "taxesOrMiscellaneousCharge",
    "taxesOrMiscellaneousChargeType",
    "packingCosts",
    "handlingCosts",
    "specialInstructions",
    "declarationStatement",
    "paymentTerms",
    "purpose",
    "customerReferences",
    "originatorName",
    "termsOfSale"
})
public class CommercialInvoice {

    @XmlElement(name = "Comments", namespace = "http://fedex.com/ws/ship/v23")
    protected List<String> comments;
    @XmlElement(name = "FreightCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money freightCharge;
    @XmlElement(name = "TaxesOrMiscellaneousCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money taxesOrMiscellaneousCharge;
    @XmlElement(name = "TaxesOrMiscellaneousChargeType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected TaxesOrMiscellaneousChargeType taxesOrMiscellaneousChargeType;
    @XmlElement(name = "PackingCosts", namespace = "http://fedex.com/ws/ship/v23")
    protected Money packingCosts;
    @XmlElement(name = "HandlingCosts", namespace = "http://fedex.com/ws/ship/v23")
    protected Money handlingCosts;
    @XmlElement(name = "SpecialInstructions", namespace = "http://fedex.com/ws/ship/v23")
    protected String specialInstructions;
    @XmlElement(name = "DeclarationStatement", namespace = "http://fedex.com/ws/ship/v23")
    protected String declarationStatement;
    @XmlElement(name = "PaymentTerms", namespace = "http://fedex.com/ws/ship/v23")
    protected String paymentTerms;
    @XmlElement(name = "Purpose", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PurposeOfShipmentType purpose;
    @XmlElement(name = "CustomerReferences", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomerReference> customerReferences;
    @XmlElement(name = "OriginatorName", namespace = "http://fedex.com/ws/ship/v23")
    protected String originatorName;
    @XmlElement(name = "TermsOfSale", namespace = "http://fedex.com/ws/ship/v23")
    protected String termsOfSale;

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComments() {
        if (comments == null) {
            comments = new ArrayList<String>();
        }
        return this.comments;
    }

    /**
     * 获取freightCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFreightCharge() {
        return freightCharge;
    }

    /**
     * 设置freightCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFreightCharge(Money value) {
        this.freightCharge = value;
    }

    /**
     * 获取taxesOrMiscellaneousCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTaxesOrMiscellaneousCharge() {
        return taxesOrMiscellaneousCharge;
    }

    /**
     * 设置taxesOrMiscellaneousCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTaxesOrMiscellaneousCharge(Money value) {
        this.taxesOrMiscellaneousCharge = value;
    }

    /**
     * 获取taxesOrMiscellaneousChargeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxesOrMiscellaneousChargeType }
     *     
     */
    public TaxesOrMiscellaneousChargeType getTaxesOrMiscellaneousChargeType() {
        return taxesOrMiscellaneousChargeType;
    }

    /**
     * 设置taxesOrMiscellaneousChargeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesOrMiscellaneousChargeType }
     *     
     */
    public void setTaxesOrMiscellaneousChargeType(TaxesOrMiscellaneousChargeType value) {
        this.taxesOrMiscellaneousChargeType = value;
    }

    /**
     * 获取packingCosts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPackingCosts() {
        return packingCosts;
    }

    /**
     * 设置packingCosts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPackingCosts(Money value) {
        this.packingCosts = value;
    }

    /**
     * 获取handlingCosts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getHandlingCosts() {
        return handlingCosts;
    }

    /**
     * 设置handlingCosts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setHandlingCosts(Money value) {
        this.handlingCosts = value;
    }

    /**
     * 获取specialInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * 设置specialInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructions(String value) {
        this.specialInstructions = value;
    }

    /**
     * 获取declarationStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationStatement() {
        return declarationStatement;
    }

    /**
     * 设置declarationStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationStatement(String value) {
        this.declarationStatement = value;
    }

    /**
     * 获取paymentTerms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * 设置paymentTerms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerms(String value) {
        this.paymentTerms = value;
    }

    /**
     * 获取purpose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PurposeOfShipmentType }
     *     
     */
    public PurposeOfShipmentType getPurpose() {
        return purpose;
    }

    /**
     * 设置purpose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeOfShipmentType }
     *     
     */
    public void setPurpose(PurposeOfShipmentType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the customerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReference }
     * 
     * 
     */
    public List<CustomerReference> getCustomerReferences() {
        if (customerReferences == null) {
            customerReferences = new ArrayList<CustomerReference>();
        }
        return this.customerReferences;
    }

    /**
     * 获取originatorName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorName() {
        return originatorName;
    }

    /**
     * 设置originatorName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorName(String value) {
        this.originatorName = value;
    }

    /**
     * 获取termsOfSale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfSale() {
        return termsOfSale;
    }

    /**
     * 设置termsOfSale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfSale(String value) {
        this.termsOfSale = value;
    }

}
