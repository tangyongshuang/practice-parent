
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * These special services are available at the shipment level for some or all service types. If the shipper is requesting a special service which requires additional data (such as the COD amount), the shipment special service type must be present in the specialServiceTypes collection, and the supporting detail must be provided in the appropriate sub-object below.
 * 
 * <p>ShipmentSpecialServicesRequested complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShipmentSpecialServicesRequested">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialServiceTypes" type="{http://fedex.com/ws/ship/v23}ShipmentSpecialServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodDetail" type="{http://fedex.com/ws/ship/v23}CodDetail" minOccurs="0"/>
 *         &lt;element name="DeliveryOnInvoiceAcceptanceDetail" type="{http://fedex.com/ws/ship/v23}DeliveryOnInvoiceAcceptanceDetail" minOccurs="0"/>
 *         &lt;element name="HoldAtLocationDetail" type="{http://fedex.com/ws/ship/v23}HoldAtLocationDetail" minOccurs="0"/>
 *         &lt;element name="EventNotificationDetail" type="{http://fedex.com/ws/ship/v23}ShipmentEventNotificationDetail" minOccurs="0"/>
 *         &lt;element name="ReturnShipmentDetail" type="{http://fedex.com/ws/ship/v23}ReturnShipmentDetail" minOccurs="0"/>
 *         &lt;element name="PendingShipmentDetail" type="{http://fedex.com/ws/ship/v23}PendingShipmentDetail" minOccurs="0"/>
 *         &lt;element name="InternationalControlledExportDetail" type="{http://fedex.com/ws/ship/v23}InternationalControlledExportDetail" minOccurs="0"/>
 *         &lt;element name="InternationalTrafficInArmsRegulationsDetail" type="{http://fedex.com/ws/ship/v23}InternationalTrafficInArmsRegulationsDetail" minOccurs="0"/>
 *         &lt;element name="ShipmentDryIceDetail" type="{http://fedex.com/ws/ship/v23}ShipmentDryIceDetail" minOccurs="0"/>
 *         &lt;element name="HomeDeliveryPremiumDetail" type="{http://fedex.com/ws/ship/v23}HomeDeliveryPremiumDetail" minOccurs="0"/>
 *         &lt;element name="FreightGuaranteeDetail" type="{http://fedex.com/ws/ship/v23}FreightGuaranteeDetail" minOccurs="0"/>
 *         &lt;element name="EtdDetail" type="{http://fedex.com/ws/ship/v23}EtdDetail" minOccurs="0"/>
 *         &lt;element name="CustomDeliveryWindowDetail" type="{http://fedex.com/ws/ship/v23}CustomDeliveryWindowDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentSpecialServicesRequested", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "specialServiceTypes",
    "codDetail",
    "deliveryOnInvoiceAcceptanceDetail",
    "holdAtLocationDetail",
    "eventNotificationDetail",
    "returnShipmentDetail",
    "pendingShipmentDetail",
    "internationalControlledExportDetail",
    "internationalTrafficInArmsRegulationsDetail",
    "shipmentDryIceDetail",
    "homeDeliveryPremiumDetail",
    "freightGuaranteeDetail",
    "etdDetail",
    "customDeliveryWindowDetail"
})
public class ShipmentSpecialServicesRequested {

    @XmlElement(name = "SpecialServiceTypes", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<ShipmentSpecialServiceType> specialServiceTypes;
    @XmlElement(name = "CodDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CodDetail codDetail;
    @XmlElement(name = "DeliveryOnInvoiceAcceptanceDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected DeliveryOnInvoiceAcceptanceDetail deliveryOnInvoiceAcceptanceDetail;
    @XmlElement(name = "HoldAtLocationDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected HoldAtLocationDetail holdAtLocationDetail;
    @XmlElement(name = "EventNotificationDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentEventNotificationDetail eventNotificationDetail;
    @XmlElement(name = "ReturnShipmentDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ReturnShipmentDetail returnShipmentDetail;
    @XmlElement(name = "PendingShipmentDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected PendingShipmentDetail pendingShipmentDetail;
    @XmlElement(name = "InternationalControlledExportDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected InternationalControlledExportDetail internationalControlledExportDetail;
    @XmlElement(name = "InternationalTrafficInArmsRegulationsDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected InternationalTrafficInArmsRegulationsDetail internationalTrafficInArmsRegulationsDetail;
    @XmlElement(name = "ShipmentDryIceDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentDryIceDetail shipmentDryIceDetail;
    @XmlElement(name = "HomeDeliveryPremiumDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected HomeDeliveryPremiumDetail homeDeliveryPremiumDetail;
    @XmlElement(name = "FreightGuaranteeDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected FreightGuaranteeDetail freightGuaranteeDetail;
    @XmlElement(name = "EtdDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected EtdDetail etdDetail;
    @XmlElement(name = "CustomDeliveryWindowDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomDeliveryWindowDetail customDeliveryWindowDetail;

    /**
     * Gets the value of the specialServiceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentSpecialServiceType }
     * 
     * 
     */
    public List<ShipmentSpecialServiceType> getSpecialServiceTypes() {
        if (specialServiceTypes == null) {
            specialServiceTypes = new ArrayList<ShipmentSpecialServiceType>();
        }
        return this.specialServiceTypes;
    }

    /**
     * 获取codDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodDetail }
     *     
     */
    public CodDetail getCodDetail() {
        return codDetail;
    }

    /**
     * 设置codDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodDetail }
     *     
     */
    public void setCodDetail(CodDetail value) {
        this.codDetail = value;
    }

    /**
     * 获取deliveryOnInvoiceAcceptanceDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeliveryOnInvoiceAcceptanceDetail }
     *     
     */
    public DeliveryOnInvoiceAcceptanceDetail getDeliveryOnInvoiceAcceptanceDetail() {
        return deliveryOnInvoiceAcceptanceDetail;
    }

    /**
     * 设置deliveryOnInvoiceAcceptanceDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryOnInvoiceAcceptanceDetail }
     *     
     */
    public void setDeliveryOnInvoiceAcceptanceDetail(DeliveryOnInvoiceAcceptanceDetail value) {
        this.deliveryOnInvoiceAcceptanceDetail = value;
    }

    /**
     * 获取holdAtLocationDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HoldAtLocationDetail }
     *     
     */
    public HoldAtLocationDetail getHoldAtLocationDetail() {
        return holdAtLocationDetail;
    }

    /**
     * 设置holdAtLocationDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HoldAtLocationDetail }
     *     
     */
    public void setHoldAtLocationDetail(HoldAtLocationDetail value) {
        this.holdAtLocationDetail = value;
    }

    /**
     * 获取eventNotificationDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentEventNotificationDetail }
     *     
     */
    public ShipmentEventNotificationDetail getEventNotificationDetail() {
        return eventNotificationDetail;
    }

    /**
     * 设置eventNotificationDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentEventNotificationDetail }
     *     
     */
    public void setEventNotificationDetail(ShipmentEventNotificationDetail value) {
        this.eventNotificationDetail = value;
    }

    /**
     * 获取returnShipmentDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnShipmentDetail }
     *     
     */
    public ReturnShipmentDetail getReturnShipmentDetail() {
        return returnShipmentDetail;
    }

    /**
     * 设置returnShipmentDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnShipmentDetail }
     *     
     */
    public void setReturnShipmentDetail(ReturnShipmentDetail value) {
        this.returnShipmentDetail = value;
    }

    /**
     * 获取pendingShipmentDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PendingShipmentDetail }
     *     
     */
    public PendingShipmentDetail getPendingShipmentDetail() {
        return pendingShipmentDetail;
    }

    /**
     * 设置pendingShipmentDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PendingShipmentDetail }
     *     
     */
    public void setPendingShipmentDetail(PendingShipmentDetail value) {
        this.pendingShipmentDetail = value;
    }

    /**
     * 获取internationalControlledExportDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InternationalControlledExportDetail }
     *     
     */
    public InternationalControlledExportDetail getInternationalControlledExportDetail() {
        return internationalControlledExportDetail;
    }

    /**
     * 设置internationalControlledExportDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalControlledExportDetail }
     *     
     */
    public void setInternationalControlledExportDetail(InternationalControlledExportDetail value) {
        this.internationalControlledExportDetail = value;
    }

    /**
     * 获取internationalTrafficInArmsRegulationsDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InternationalTrafficInArmsRegulationsDetail }
     *     
     */
    public InternationalTrafficInArmsRegulationsDetail getInternationalTrafficInArmsRegulationsDetail() {
        return internationalTrafficInArmsRegulationsDetail;
    }

    /**
     * 设置internationalTrafficInArmsRegulationsDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTrafficInArmsRegulationsDetail }
     *     
     */
    public void setInternationalTrafficInArmsRegulationsDetail(InternationalTrafficInArmsRegulationsDetail value) {
        this.internationalTrafficInArmsRegulationsDetail = value;
    }

    /**
     * 获取shipmentDryIceDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public ShipmentDryIceDetail getShipmentDryIceDetail() {
        return shipmentDryIceDetail;
    }

    /**
     * 设置shipmentDryIceDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public void setShipmentDryIceDetail(ShipmentDryIceDetail value) {
        this.shipmentDryIceDetail = value;
    }

    /**
     * 获取homeDeliveryPremiumDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HomeDeliveryPremiumDetail }
     *     
     */
    public HomeDeliveryPremiumDetail getHomeDeliveryPremiumDetail() {
        return homeDeliveryPremiumDetail;
    }

    /**
     * 设置homeDeliveryPremiumDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HomeDeliveryPremiumDetail }
     *     
     */
    public void setHomeDeliveryPremiumDetail(HomeDeliveryPremiumDetail value) {
        this.homeDeliveryPremiumDetail = value;
    }

    /**
     * 获取freightGuaranteeDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightGuaranteeDetail }
     *     
     */
    public FreightGuaranteeDetail getFreightGuaranteeDetail() {
        return freightGuaranteeDetail;
    }

    /**
     * 设置freightGuaranteeDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightGuaranteeDetail }
     *     
     */
    public void setFreightGuaranteeDetail(FreightGuaranteeDetail value) {
        this.freightGuaranteeDetail = value;
    }

    /**
     * 获取etdDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EtdDetail }
     *     
     */
    public EtdDetail getEtdDetail() {
        return etdDetail;
    }

    /**
     * 设置etdDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EtdDetail }
     *     
     */
    public void setEtdDetail(EtdDetail value) {
        this.etdDetail = value;
    }

    /**
     * 获取customDeliveryWindowDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomDeliveryWindowDetail }
     *     
     */
    public CustomDeliveryWindowDetail getCustomDeliveryWindowDetail() {
        return customDeliveryWindowDetail;
    }

    /**
     * 设置customDeliveryWindowDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDeliveryWindowDetail }
     *     
     */
    public void setCustomDeliveryWindowDetail(CustomDeliveryWindowDetail value) {
        this.customDeliveryWindowDetail = value;
    }

}
