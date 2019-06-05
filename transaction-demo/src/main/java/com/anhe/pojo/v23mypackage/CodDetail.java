
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Descriptive data required for a FedEx COD (Collect-On-Delivery) shipment.
 * 
 * <p>CodDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CodDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodCollectionAmount" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="AddTransportationChargesDetail" type="{http://fedex.com/ws/ship/v23}CodAddTransportationChargesDetail" minOccurs="0"/>
 *         &lt;element name="CollectionType" type="{http://fedex.com/ws/ship/v23}CodCollectionType"/>
 *         &lt;element name="CodRecipient" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *         &lt;element name="FinancialInstitutionContactAndAddress" type="{http://fedex.com/ws/ship/v23}ContactAndAddress" minOccurs="0"/>
 *         &lt;element name="RemitToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceIndicator" type="{http://fedex.com/ws/ship/v23}CodReturnReferenceIndicatorType" minOccurs="0"/>
 *         &lt;element name="ReturnTrackingId" type="{http://fedex.com/ws/ship/v23}TrackingId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "codCollectionAmount",
    "addTransportationChargesDetail",
    "collectionType",
    "codRecipient",
    "financialInstitutionContactAndAddress",
    "remitToName",
    "referenceIndicator",
    "returnTrackingId"
})
public class CodDetail {

    @XmlElement(name = "CodCollectionAmount", namespace = "http://fedex.com/ws/ship/v23")
    protected Money codCollectionAmount;
    @XmlElement(name = "AddTransportationChargesDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CodAddTransportationChargesDetail addTransportationChargesDetail;
    @XmlElement(name = "CollectionType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected CodCollectionType collectionType;
    @XmlElement(name = "CodRecipient", namespace = "http://fedex.com/ws/ship/v23")
    protected Party codRecipient;
    @XmlElement(name = "FinancialInstitutionContactAndAddress", namespace = "http://fedex.com/ws/ship/v23")
    protected ContactAndAddress financialInstitutionContactAndAddress;
    @XmlElement(name = "RemitToName", namespace = "http://fedex.com/ws/ship/v23")
    protected String remitToName;
    @XmlElement(name = "ReferenceIndicator", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CodReturnReferenceIndicatorType referenceIndicator;
    @XmlElement(name = "ReturnTrackingId", namespace = "http://fedex.com/ws/ship/v23")
    protected TrackingId returnTrackingId;

    /**
     * 获取codCollectionAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCodCollectionAmount() {
        return codCollectionAmount;
    }

    /**
     * 设置codCollectionAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCodCollectionAmount(Money value) {
        this.codCollectionAmount = value;
    }

    /**
     * 获取addTransportationChargesDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodAddTransportationChargesDetail }
     *     
     */
    public CodAddTransportationChargesDetail getAddTransportationChargesDetail() {
        return addTransportationChargesDetail;
    }

    /**
     * 设置addTransportationChargesDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodAddTransportationChargesDetail }
     *     
     */
    public void setAddTransportationChargesDetail(CodAddTransportationChargesDetail value) {
        this.addTransportationChargesDetail = value;
    }

    /**
     * 获取collectionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodCollectionType }
     *     
     */
    public CodCollectionType getCollectionType() {
        return collectionType;
    }

    /**
     * 设置collectionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodCollectionType }
     *     
     */
    public void setCollectionType(CodCollectionType value) {
        this.collectionType = value;
    }

    /**
     * 获取codRecipient属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getCodRecipient() {
        return codRecipient;
    }

    /**
     * 设置codRecipient属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setCodRecipient(Party value) {
        this.codRecipient = value;
    }

    /**
     * 获取financialInstitutionContactAndAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getFinancialInstitutionContactAndAddress() {
        return financialInstitutionContactAndAddress;
    }

    /**
     * 设置financialInstitutionContactAndAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setFinancialInstitutionContactAndAddress(ContactAndAddress value) {
        this.financialInstitutionContactAndAddress = value;
    }

    /**
     * 获取remitToName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitToName() {
        return remitToName;
    }

    /**
     * 设置remitToName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitToName(String value) {
        this.remitToName = value;
    }

    /**
     * 获取referenceIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodReturnReferenceIndicatorType }
     *     
     */
    public CodReturnReferenceIndicatorType getReferenceIndicator() {
        return referenceIndicator;
    }

    /**
     * 设置referenceIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodReturnReferenceIndicatorType }
     *     
     */
    public void setReferenceIndicator(CodReturnReferenceIndicatorType value) {
        this.referenceIndicator = value;
    }

    /**
     * 获取returnTrackingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrackingId }
     *     
     */
    public TrackingId getReturnTrackingId() {
        return returnTrackingId;
    }

    /**
     * 设置returnTrackingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingId }
     *     
     */
    public void setReturnTrackingId(TrackingId value) {
        this.returnTrackingId = value;
    }

}
