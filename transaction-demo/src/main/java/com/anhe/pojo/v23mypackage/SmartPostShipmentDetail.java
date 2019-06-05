
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data required for shipments handled under the SMART_POST and GROUND_SMART_POST service types.
 * 
 * <p>SmartPostShipmentDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SmartPostShipmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessingOptionsRequested" type="{http://fedex.com/ws/ship/v23}SmartPostShipmentProcessingOptionsRequested" minOccurs="0"/>
 *         &lt;element name="Indicia" type="{http://fedex.com/ws/ship/v23}SmartPostIndiciaType" minOccurs="0"/>
 *         &lt;element name="AncillaryEndorsement" type="{http://fedex.com/ws/ship/v23}SmartPostAncillaryEndorsementType" minOccurs="0"/>
 *         &lt;element name="HubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerManifestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartPostShipmentDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "processingOptionsRequested",
    "indicia",
    "ancillaryEndorsement",
    "hubId",
    "customerManifestId"
})
public class SmartPostShipmentDetail {

    @XmlElement(name = "ProcessingOptionsRequested", namespace = "http://fedex.com/ws/ship/v23")
    protected SmartPostShipmentProcessingOptionsRequested processingOptionsRequested;
    @XmlElement(name = "Indicia", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected SmartPostIndiciaType indicia;
    @XmlElement(name = "AncillaryEndorsement", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected SmartPostAncillaryEndorsementType ancillaryEndorsement;
    @XmlElement(name = "HubId", namespace = "http://fedex.com/ws/ship/v23")
    protected String hubId;
    @XmlElement(name = "CustomerManifestId", namespace = "http://fedex.com/ws/ship/v23")
    protected String customerManifestId;

    /**
     * 获取processingOptionsRequested属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SmartPostShipmentProcessingOptionsRequested }
     *     
     */
    public SmartPostShipmentProcessingOptionsRequested getProcessingOptionsRequested() {
        return processingOptionsRequested;
    }

    /**
     * 设置processingOptionsRequested属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SmartPostShipmentProcessingOptionsRequested }
     *     
     */
    public void setProcessingOptionsRequested(SmartPostShipmentProcessingOptionsRequested value) {
        this.processingOptionsRequested = value;
    }

    /**
     * 获取indicia属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SmartPostIndiciaType }
     *     
     */
    public SmartPostIndiciaType getIndicia() {
        return indicia;
    }

    /**
     * 设置indicia属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SmartPostIndiciaType }
     *     
     */
    public void setIndicia(SmartPostIndiciaType value) {
        this.indicia = value;
    }

    /**
     * 获取ancillaryEndorsement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SmartPostAncillaryEndorsementType }
     *     
     */
    public SmartPostAncillaryEndorsementType getAncillaryEndorsement() {
        return ancillaryEndorsement;
    }

    /**
     * 设置ancillaryEndorsement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SmartPostAncillaryEndorsementType }
     *     
     */
    public void setAncillaryEndorsement(SmartPostAncillaryEndorsementType value) {
        this.ancillaryEndorsement = value;
    }

    /**
     * 获取hubId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHubId() {
        return hubId;
    }

    /**
     * 设置hubId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHubId(String value) {
        this.hubId = value;
    }

    /**
     * 获取customerManifestId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerManifestId() {
        return customerManifestId;
    }

    /**
     * 设置customerManifestId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerManifestId(String value) {
        this.customerManifestId = value;
    }

}
