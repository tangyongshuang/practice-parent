
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RequestedShipment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequestedShipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DropoffType" type="{http://fedex.com/ws/ship/v23}DropoffType"/>
 *         &lt;element name="ServiceType" type="{http://fedex.com/ws/ship/v23}ServiceType"/>
 *         &lt;element name="PackagingType" type="{http://fedex.com/ws/ship/v23}PackagingType"/>
 *         &lt;element name="ManifestDetail" type="{http://fedex.com/ws/ship/v23}ShipmentManifestDetail" minOccurs="0"/>
 *         &lt;element name="TotalWeight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="TotalInsuredValue" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="PreferredCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentAuthorizationDetail" type="{http://fedex.com/ws/ship/v23}ShipmentAuthorizationDetail" minOccurs="0"/>
 *         &lt;element name="Shipper" type="{http://fedex.com/ws/ship/v23}Party"/>
 *         &lt;element name="Recipient" type="{http://fedex.com/ws/ship/v23}Party"/>
 *         &lt;element name="RecipientLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://fedex.com/ws/ship/v23}ContactAndAddress" minOccurs="0"/>
 *         &lt;element name="SoldTo" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *         &lt;element name="ShippingChargesPayment" type="{http://fedex.com/ws/ship/v23}Payment" minOccurs="0"/>
 *         &lt;element name="SpecialServicesRequested" type="{http://fedex.com/ws/ship/v23}ShipmentSpecialServicesRequested" minOccurs="0"/>
 *         &lt;element name="ExpressFreightDetail" type="{http://fedex.com/ws/ship/v23}ExpressFreightDetail" minOccurs="0"/>
 *         &lt;element name="FreightShipmentDetail" type="{http://fedex.com/ws/ship/v23}FreightShipmentDetail" minOccurs="0"/>
 *         &lt;element name="DeliveryInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariableHandlingChargeDetail" type="{http://fedex.com/ws/ship/v23}VariableHandlingChargeDetail" minOccurs="0"/>
 *         &lt;element name="CustomsClearanceDetail" type="{http://fedex.com/ws/ship/v23}CustomsClearanceDetail" minOccurs="0"/>
 *         &lt;element name="PickupDetail" type="{http://fedex.com/ws/ship/v23}PickupDetail" minOccurs="0"/>
 *         &lt;element name="SmartPostDetail" type="{http://fedex.com/ws/ship/v23}SmartPostShipmentDetail" minOccurs="0"/>
 *         &lt;element name="BlockInsightVisibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LabelSpecification" type="{http://fedex.com/ws/ship/v23}LabelSpecification"/>
 *         &lt;element name="ShippingDocumentSpecification" type="{http://fedex.com/ws/ship/v23}ShippingDocumentSpecification" minOccurs="0"/>
 *         &lt;element name="RateRequestTypes" type="{http://fedex.com/ws/ship/v23}RateRequestType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EdtRequestType" type="{http://fedex.com/ws/ship/v23}EdtRequestType" minOccurs="0"/>
 *         &lt;element name="MasterTrackingId" type="{http://fedex.com/ws/ship/v23}TrackingId" minOccurs="0"/>
 *         &lt;element name="PackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="ConfigurationData" type="{http://fedex.com/ws/ship/v23}ShipmentConfigurationData" minOccurs="0"/>
 *         &lt;element name="RequestedPackageLineItems" type="{http://fedex.com/ws/ship/v23}RequestedPackageLineItem" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedShipment", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "shipTimestamp",
    "dropoffType",
    "serviceType",
    "packagingType",
    "manifestDetail",
    "totalWeight",
    "totalInsuredValue",
    "preferredCurrency",
    "shipmentAuthorizationDetail",
    "shipper",
    "recipient",
    "recipientLocationNumber",
    "origin",
    "soldTo",
    "shippingChargesPayment",
    "specialServicesRequested",
    "expressFreightDetail",
    "freightShipmentDetail",
    "deliveryInstructions",
    "variableHandlingChargeDetail",
    "customsClearanceDetail",
    "pickupDetail",
    "smartPostDetail",
    "blockInsightVisibility",
    "labelSpecification",
    "shippingDocumentSpecification",
    "rateRequestTypes",
    "edtRequestType",
    "masterTrackingId",
    "packageCount",
    "configurationData",
    "requestedPackageLineItems"
})
public class RequestedShipment {

    @XmlElement(name = "ShipTimestamp", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipTimestamp;
    @XmlElement(name = "DropoffType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected DropoffType dropoffType;
    @XmlElement(name = "ServiceType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceType serviceType;
    @XmlElement(name = "PackagingType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected PackagingType packagingType;
    @XmlElement(name = "ManifestDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentManifestDetail manifestDetail;
    @XmlElement(name = "TotalWeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight totalWeight;
    @XmlElement(name = "TotalInsuredValue", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalInsuredValue;
    @XmlElement(name = "PreferredCurrency", namespace = "http://fedex.com/ws/ship/v23")
    protected String preferredCurrency;
    @XmlElement(name = "ShipmentAuthorizationDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentAuthorizationDetail shipmentAuthorizationDetail;
    @XmlElement(name = "Shipper", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected Party shipper;
    @XmlElement(name = "Recipient", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected Party recipient;
    @XmlElement(name = "RecipientLocationNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String recipientLocationNumber;
    @XmlElement(name = "Origin", namespace = "http://fedex.com/ws/ship/v23")
    protected ContactAndAddress origin;
    @XmlElement(name = "SoldTo", namespace = "http://fedex.com/ws/ship/v23")
    protected Party soldTo;
    @XmlElement(name = "ShippingChargesPayment", namespace = "http://fedex.com/ws/ship/v23")
    protected Payment shippingChargesPayment;
    @XmlElement(name = "SpecialServicesRequested", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentSpecialServicesRequested specialServicesRequested;
    @XmlElement(name = "ExpressFreightDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ExpressFreightDetail expressFreightDetail;
    @XmlElement(name = "FreightShipmentDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected FreightShipmentDetail freightShipmentDetail;
    @XmlElement(name = "DeliveryInstructions", namespace = "http://fedex.com/ws/ship/v23")
    protected String deliveryInstructions;
    @XmlElement(name = "VariableHandlingChargeDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected VariableHandlingChargeDetail variableHandlingChargeDetail;
    @XmlElement(name = "CustomsClearanceDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomsClearanceDetail customsClearanceDetail;
    @XmlElement(name = "PickupDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected PickupDetail pickupDetail;
    @XmlElement(name = "SmartPostDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected SmartPostShipmentDetail smartPostDetail;
    @XmlElement(name = "BlockInsightVisibility", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean blockInsightVisibility;
    @XmlElement(name = "LabelSpecification", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected LabelSpecification labelSpecification;
    @XmlElement(name = "ShippingDocumentSpecification", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocumentSpecification shippingDocumentSpecification;
    @XmlElement(name = "RateRequestTypes", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<RateRequestType> rateRequestTypes;
    @XmlElement(name = "EdtRequestType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected EdtRequestType edtRequestType;
    @XmlElement(name = "MasterTrackingId", namespace = "http://fedex.com/ws/ship/v23")
    protected TrackingId masterTrackingId;
    @XmlElement(name = "PackageCount", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageCount;
    @XmlElement(name = "ConfigurationData", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentConfigurationData configurationData;
    @XmlElement(name = "RequestedPackageLineItems", namespace = "http://fedex.com/ws/ship/v23")
    protected List<RequestedPackageLineItem> requestedPackageLineItems;

    /**
     * 获取shipTimestamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipTimestamp() {
        return shipTimestamp;
    }

    /**
     * 设置shipTimestamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipTimestamp(XMLGregorianCalendar value) {
        this.shipTimestamp = value;
    }

    /**
     * 获取dropoffType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DropoffType }
     *     
     */
    public DropoffType getDropoffType() {
        return dropoffType;
    }

    /**
     * 设置dropoffType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DropoffType }
     *     
     */
    public void setDropoffType(DropoffType value) {
        this.dropoffType = value;
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
     * 获取manifestDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentManifestDetail }
     *     
     */
    public ShipmentManifestDetail getManifestDetail() {
        return manifestDetail;
    }

    /**
     * 设置manifestDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentManifestDetail }
     *     
     */
    public void setManifestDetail(ShipmentManifestDetail value) {
        this.manifestDetail = value;
    }

    /**
     * 获取totalWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }

    /**
     * 设置totalWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setTotalWeight(Weight value) {
        this.totalWeight = value;
    }

    /**
     * 获取totalInsuredValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalInsuredValue() {
        return totalInsuredValue;
    }

    /**
     * 设置totalInsuredValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalInsuredValue(Money value) {
        this.totalInsuredValue = value;
    }

    /**
     * 获取preferredCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCurrency() {
        return preferredCurrency;
    }

    /**
     * 设置preferredCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCurrency(String value) {
        this.preferredCurrency = value;
    }

    /**
     * 获取shipmentAuthorizationDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentAuthorizationDetail }
     *     
     */
    public ShipmentAuthorizationDetail getShipmentAuthorizationDetail() {
        return shipmentAuthorizationDetail;
    }

    /**
     * 设置shipmentAuthorizationDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentAuthorizationDetail }
     *     
     */
    public void setShipmentAuthorizationDetail(ShipmentAuthorizationDetail value) {
        this.shipmentAuthorizationDetail = value;
    }

    /**
     * 获取shipper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getShipper() {
        return shipper;
    }

    /**
     * 设置shipper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setShipper(Party value) {
        this.shipper = value;
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
     * 获取recipientLocationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientLocationNumber() {
        return recipientLocationNumber;
    }

    /**
     * 设置recipientLocationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientLocationNumber(String value) {
        this.recipientLocationNumber = value;
    }

    /**
     * 获取origin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getOrigin() {
        return origin;
    }

    /**
     * 设置origin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setOrigin(ContactAndAddress value) {
        this.origin = value;
    }

    /**
     * 获取soldTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getSoldTo() {
        return soldTo;
    }

    /**
     * 设置soldTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setSoldTo(Party value) {
        this.soldTo = value;
    }

    /**
     * 获取shippingChargesPayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getShippingChargesPayment() {
        return shippingChargesPayment;
    }

    /**
     * 设置shippingChargesPayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setShippingChargesPayment(Payment value) {
        this.shippingChargesPayment = value;
    }

    /**
     * 获取specialServicesRequested属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentSpecialServicesRequested }
     *     
     */
    public ShipmentSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }

    /**
     * 设置specialServicesRequested属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentSpecialServicesRequested }
     *     
     */
    public void setSpecialServicesRequested(ShipmentSpecialServicesRequested value) {
        this.specialServicesRequested = value;
    }

    /**
     * 获取expressFreightDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExpressFreightDetail }
     *     
     */
    public ExpressFreightDetail getExpressFreightDetail() {
        return expressFreightDetail;
    }

    /**
     * 设置expressFreightDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressFreightDetail }
     *     
     */
    public void setExpressFreightDetail(ExpressFreightDetail value) {
        this.expressFreightDetail = value;
    }

    /**
     * 获取freightShipmentDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightShipmentDetail }
     *     
     */
    public FreightShipmentDetail getFreightShipmentDetail() {
        return freightShipmentDetail;
    }

    /**
     * 设置freightShipmentDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightShipmentDetail }
     *     
     */
    public void setFreightShipmentDetail(FreightShipmentDetail value) {
        this.freightShipmentDetail = value;
    }

    /**
     * 获取deliveryInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * 设置deliveryInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstructions(String value) {
        this.deliveryInstructions = value;
    }

    /**
     * 获取variableHandlingChargeDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariableHandlingChargeDetail }
     *     
     */
    public VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }

    /**
     * 设置variableHandlingChargeDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariableHandlingChargeDetail }
     *     
     */
    public void setVariableHandlingChargeDetail(VariableHandlingChargeDetail value) {
        this.variableHandlingChargeDetail = value;
    }

    /**
     * 获取customsClearanceDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomsClearanceDetail }
     *     
     */
    public CustomsClearanceDetail getCustomsClearanceDetail() {
        return customsClearanceDetail;
    }

    /**
     * 设置customsClearanceDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsClearanceDetail }
     *     
     */
    public void setCustomsClearanceDetail(CustomsClearanceDetail value) {
        this.customsClearanceDetail = value;
    }

    /**
     * 获取pickupDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PickupDetail }
     *     
     */
    public PickupDetail getPickupDetail() {
        return pickupDetail;
    }

    /**
     * 设置pickupDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PickupDetail }
     *     
     */
    public void setPickupDetail(PickupDetail value) {
        this.pickupDetail = value;
    }

    /**
     * 获取smartPostDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SmartPostShipmentDetail }
     *     
     */
    public SmartPostShipmentDetail getSmartPostDetail() {
        return smartPostDetail;
    }

    /**
     * 设置smartPostDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SmartPostShipmentDetail }
     *     
     */
    public void setSmartPostDetail(SmartPostShipmentDetail value) {
        this.smartPostDetail = value;
    }

    /**
     * 获取blockInsightVisibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockInsightVisibility() {
        return blockInsightVisibility;
    }

    /**
     * 设置blockInsightVisibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockInsightVisibility(Boolean value) {
        this.blockInsightVisibility = value;
    }

    /**
     * 获取labelSpecification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LabelSpecification }
     *     
     */
    public LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }

    /**
     * 设置labelSpecification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LabelSpecification }
     *     
     */
    public void setLabelSpecification(LabelSpecification value) {
        this.labelSpecification = value;
    }

    /**
     * 获取shippingDocumentSpecification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentSpecification }
     *     
     */
    public ShippingDocumentSpecification getShippingDocumentSpecification() {
        return shippingDocumentSpecification;
    }

    /**
     * 设置shippingDocumentSpecification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentSpecification }
     *     
     */
    public void setShippingDocumentSpecification(ShippingDocumentSpecification value) {
        this.shippingDocumentSpecification = value;
    }

    /**
     * Gets the value of the rateRequestTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateRequestTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateRequestTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateRequestType }
     * 
     * 
     */
    public List<RateRequestType> getRateRequestTypes() {
        if (rateRequestTypes == null) {
            rateRequestTypes = new ArrayList<RateRequestType>();
        }
        return this.rateRequestTypes;
    }

    /**
     * 获取edtRequestType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EdtRequestType }
     *     
     */
    public EdtRequestType getEdtRequestType() {
        return edtRequestType;
    }

    /**
     * 设置edtRequestType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EdtRequestType }
     *     
     */
    public void setEdtRequestType(EdtRequestType value) {
        this.edtRequestType = value;
    }

    /**
     * 获取masterTrackingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrackingId }
     *     
     */
    public TrackingId getMasterTrackingId() {
        return masterTrackingId;
    }

    /**
     * 设置masterTrackingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingId }
     *     
     */
    public void setMasterTrackingId(TrackingId value) {
        this.masterTrackingId = value;
    }

    /**
     * 获取packageCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageCount() {
        return packageCount;
    }

    /**
     * 设置packageCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageCount(BigInteger value) {
        this.packageCount = value;
    }

    /**
     * 获取configurationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentConfigurationData }
     *     
     */
    public ShipmentConfigurationData getConfigurationData() {
        return configurationData;
    }

    /**
     * 设置configurationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentConfigurationData }
     *     
     */
    public void setConfigurationData(ShipmentConfigurationData value) {
        this.configurationData = value;
    }

    /**
     * Gets the value of the requestedPackageLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedPackageLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedPackageLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedPackageLineItem }
     * 
     * 
     */
    public List<RequestedPackageLineItem> getRequestedPackageLineItems() {
        if (requestedPackageLineItems == null) {
            requestedPackageLineItems = new ArrayList<RequestedPackageLineItem>();
        }
        return this.requestedPackageLineItems;
    }

}
