
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AssociatedShipmentDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AssociatedShipmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}AssociatedShipmentType" minOccurs="0"/>
 *         &lt;element name="Sender" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *         &lt;element name="Recipient" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *         &lt;element name="ServiceType" type="{http://fedex.com/ws/ship/v23}ServiceType" minOccurs="0"/>
 *         &lt;element name="PackagingType" type="{http://fedex.com/ws/ship/v23}PackagingType" minOccurs="0"/>
 *         &lt;element name="TrackingId" type="{http://fedex.com/ws/ship/v23}TrackingId" minOccurs="0"/>
 *         &lt;element name="CustomerReferences" type="{http://fedex.com/ws/ship/v23}CustomerReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipmentOperationalDetail" type="{http://fedex.com/ws/ship/v23}ShipmentOperationalDetail" minOccurs="0"/>
 *         &lt;element name="PackageOperationalDetail" type="{http://fedex.com/ws/ship/v23}PackageOperationalDetail" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://fedex.com/ws/ship/v23}ShippingDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedShipmentDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "sender",
    "recipient",
    "serviceType",
    "packagingType",
    "trackingId",
    "customerReferences",
    "shipmentOperationalDetail",
    "packageOperationalDetail",
    "label"
})
public class AssociatedShipmentDetail {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected AssociatedShipmentType type;
    @XmlElement(name = "Sender", namespace = "http://fedex.com/ws/ship/v23")
    protected Party sender;
    @XmlElement(name = "Recipient", namespace = "http://fedex.com/ws/ship/v23")
    protected Party recipient;
    @XmlElement(name = "ServiceType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ServiceType serviceType;
    @XmlElement(name = "PackagingType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PackagingType packagingType;
    @XmlElement(name = "TrackingId", namespace = "http://fedex.com/ws/ship/v23")
    protected TrackingId trackingId;
    @XmlElement(name = "CustomerReferences", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomerReference> customerReferences;
    @XmlElement(name = "ShipmentOperationalDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentOperationalDetail shipmentOperationalDetail;
    @XmlElement(name = "PackageOperationalDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected PackageOperationalDetail packageOperationalDetail;
    @XmlElement(name = "Label", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocument label;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssociatedShipmentType }
     *     
     */
    public AssociatedShipmentType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedShipmentType }
     *     
     */
    public void setType(AssociatedShipmentType value) {
        this.type = value;
    }

    /**
     * 获取sender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getSender() {
        return sender;
    }

    /**
     * 设置sender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setSender(Party value) {
        this.sender = value;
    }

    /**
     * 获取recipient属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getRecipient() {
        return recipient;
    }

    /**
     * 设置recipient属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setRecipient(Party value) {
        this.recipient = value;
    }

    /**
     * 获取serviceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * 设置serviceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * 获取packagingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackagingType }
     *     
     */
    public PackagingType getPackagingType() {
        return packagingType;
    }

    /**
     * 设置packagingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingType }
     *     
     */
    public void setPackagingType(PackagingType value) {
        this.packagingType = value;
    }

    /**
     * 获取trackingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrackingId }
     *     
     */
    public TrackingId getTrackingId() {
        return trackingId;
    }

    /**
     * 设置trackingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingId }
     *     
     */
    public void setTrackingId(TrackingId value) {
        this.trackingId = value;
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
     * 获取shipmentOperationalDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOperationalDetail }
     *     
     */
    public ShipmentOperationalDetail getShipmentOperationalDetail() {
        return shipmentOperationalDetail;
    }

    /**
     * 设置shipmentOperationalDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOperationalDetail }
     *     
     */
    public void setShipmentOperationalDetail(ShipmentOperationalDetail value) {
        this.shipmentOperationalDetail = value;
    }

    /**
     * 获取packageOperationalDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageOperationalDetail }
     *     
     */
    public PackageOperationalDetail getPackageOperationalDetail() {
        return packageOperationalDetail;
    }

    /**
     * 设置packageOperationalDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageOperationalDetail }
     *     
     */
    public void setPackageOperationalDetail(PackageOperationalDetail value) {
        this.packageOperationalDetail = value;
    }

    /**
     * 获取label属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocument }
     *     
     */
    public ShippingDocument getLabel() {
        return label;
    }

    /**
     * 设置label属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocument }
     *     
     */
    public void setLabel(ShippingDocument value) {
        this.label = value;
    }

}
