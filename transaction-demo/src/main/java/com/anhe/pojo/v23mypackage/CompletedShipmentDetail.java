
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompletedShipmentDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedShipmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://fedex.com/ws/ship/v23}CarrierCodeType" minOccurs="0"/>
 *         &lt;element name="MasterTrackingId" type="{http://fedex.com/ws/ship/v23}TrackingId" minOccurs="0"/>
 *         &lt;element name="ServiceTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceDescription" type="{http://fedex.com/ws/ship/v23}ServiceDescription" minOccurs="0"/>
 *         &lt;element name="PackagingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationalDetail" type="{http://fedex.com/ws/ship/v23}ShipmentOperationalDetail" minOccurs="0"/>
 *         &lt;element name="AccessDetail" type="{http://fedex.com/ws/ship/v23}PendingShipmentAccessDetail" minOccurs="0"/>
 *         &lt;element name="TagDetail" type="{http://fedex.com/ws/ship/v23}CompletedTagDetail" minOccurs="0"/>
 *         &lt;element name="SmartPostDetail" type="{http://fedex.com/ws/ship/v23}CompletedSmartPostDetail" minOccurs="0"/>
 *         &lt;element name="HazardousShipmentDetail" type="{http://fedex.com/ws/ship/v23}CompletedHazardousShipmentDetail" minOccurs="0"/>
 *         &lt;element name="ShipmentRating" type="{http://fedex.com/ws/ship/v23}ShipmentRating" minOccurs="0"/>
 *         &lt;element name="CompletedHoldAtLocationDetail" type="{http://fedex.com/ws/ship/v23}CompletedHoldAtLocationDetail" minOccurs="0"/>
 *         &lt;element name="ExportComplianceStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentRequirements" type="{http://fedex.com/ws/ship/v23}DocumentRequirementsDetail" minOccurs="0"/>
 *         &lt;element name="CompletedEtdDetail" type="{http://fedex.com/ws/ship/v23}CompletedEtdDetail" minOccurs="0"/>
 *         &lt;element name="ShipmentDocuments" type="{http://fedex.com/ws/ship/v23}ShippingDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssociatedShipments" type="{http://fedex.com/ws/ship/v23}AssociatedShipmentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CompletedCodDetail" type="{http://fedex.com/ws/ship/v23}CompletedCodDetail" minOccurs="0"/>
 *         &lt;element name="CompletedPackageDetails" type="{http://fedex.com/ws/ship/v23}CompletedPackageDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedShipmentDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "usDomestic",
    "carrierCode",
    "masterTrackingId",
    "serviceTypeDescription",
    "serviceDescription",
    "packagingDescription",
    "operationalDetail",
    "accessDetail",
    "tagDetail",
    "smartPostDetail",
    "hazardousShipmentDetail",
    "shipmentRating",
    "completedHoldAtLocationDetail",
    "exportComplianceStatement",
    "documentRequirements",
    "completedEtdDetail",
    "shipmentDocuments",
    "associatedShipments",
    "completedCodDetail",
    "completedPackageDetails"
})
public class CompletedShipmentDetail {

    @XmlElement(name = "UsDomestic", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean usDomestic;
    @XmlElement(name = "CarrierCode", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CarrierCodeType carrierCode;
    @XmlElement(name = "MasterTrackingId", namespace = "http://fedex.com/ws/ship/v23")
    protected TrackingId masterTrackingId;
    @XmlElement(name = "ServiceTypeDescription", namespace = "http://fedex.com/ws/ship/v23")
    protected String serviceTypeDescription;
    @XmlElement(name = "ServiceDescription", namespace = "http://fedex.com/ws/ship/v23")
    protected ServiceDescription serviceDescription;
    @XmlElement(name = "PackagingDescription", namespace = "http://fedex.com/ws/ship/v23")
    protected String packagingDescription;
    @XmlElement(name = "OperationalDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentOperationalDetail operationalDetail;
    @XmlElement(name = "AccessDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected PendingShipmentAccessDetail accessDetail;
    @XmlElement(name = "TagDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CompletedTagDetail tagDetail;
    @XmlElement(name = "SmartPostDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CompletedSmartPostDetail smartPostDetail;
    @XmlElement(name = "HazardousShipmentDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CompletedHazardousShipmentDetail hazardousShipmentDetail;
    @XmlElement(name = "ShipmentRating", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentRating shipmentRating;
    @XmlElement(name = "CompletedHoldAtLocationDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CompletedHoldAtLocationDetail completedHoldAtLocationDetail;
    @XmlElement(name = "ExportComplianceStatement", namespace = "http://fedex.com/ws/ship/v23")
    protected String exportComplianceStatement;
    @XmlElement(name = "DocumentRequirements", namespace = "http://fedex.com/ws/ship/v23")
    protected DocumentRequirementsDetail documentRequirements;
    @XmlElement(name = "CompletedEtdDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CompletedEtdDetail completedEtdDetail;
    @XmlElement(name = "ShipmentDocuments", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ShippingDocument> shipmentDocuments;
    @XmlElement(name = "AssociatedShipments", namespace = "http://fedex.com/ws/ship/v23")
    protected List<AssociatedShipmentDetail> associatedShipments;
    @XmlElement(name = "CompletedCodDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CompletedCodDetail completedCodDetail;
    @XmlElement(name = "CompletedPackageDetails", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CompletedPackageDetail> completedPackageDetails;

    /**
     * 获取usDomestic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsDomestic() {
        return usDomestic;
    }

    /**
     * 设置usDomestic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsDomestic(Boolean value) {
        this.usDomestic = value;
    }

    /**
     * 获取carrierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierCodeType }
     *     
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }

    /**
     * 设置carrierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierCodeType }
     *     
     */
    public void setCarrierCode(CarrierCodeType value) {
        this.carrierCode = value;
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
     * 获取serviceTypeDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeDescription() {
        return serviceTypeDescription;
    }

    /**
     * 设置serviceTypeDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeDescription(String value) {
        this.serviceTypeDescription = value;
    }

    /**
     * 获取serviceDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescription }
     *     
     */
    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }

    /**
     * 设置serviceDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescription }
     *     
     */
    public void setServiceDescription(ServiceDescription value) {
        this.serviceDescription = value;
    }

    /**
     * 获取packagingDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingDescription() {
        return packagingDescription;
    }

    /**
     * 设置packagingDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingDescription(String value) {
        this.packagingDescription = value;
    }

    /**
     * 获取operationalDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOperationalDetail }
     *     
     */
    public ShipmentOperationalDetail getOperationalDetail() {
        return operationalDetail;
    }

    /**
     * 设置operationalDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOperationalDetail }
     *     
     */
    public void setOperationalDetail(ShipmentOperationalDetail value) {
        this.operationalDetail = value;
    }

    /**
     * 获取accessDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PendingShipmentAccessDetail }
     *     
     */
    public PendingShipmentAccessDetail getAccessDetail() {
        return accessDetail;
    }

    /**
     * 设置accessDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PendingShipmentAccessDetail }
     *     
     */
    public void setAccessDetail(PendingShipmentAccessDetail value) {
        this.accessDetail = value;
    }

    /**
     * 获取tagDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedTagDetail }
     *     
     */
    public CompletedTagDetail getTagDetail() {
        return tagDetail;
    }

    /**
     * 设置tagDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedTagDetail }
     *     
     */
    public void setTagDetail(CompletedTagDetail value) {
        this.tagDetail = value;
    }

    /**
     * 获取smartPostDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedSmartPostDetail }
     *     
     */
    public CompletedSmartPostDetail getSmartPostDetail() {
        return smartPostDetail;
    }

    /**
     * 设置smartPostDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedSmartPostDetail }
     *     
     */
    public void setSmartPostDetail(CompletedSmartPostDetail value) {
        this.smartPostDetail = value;
    }

    /**
     * 获取hazardousShipmentDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedHazardousShipmentDetail }
     *     
     */
    public CompletedHazardousShipmentDetail getHazardousShipmentDetail() {
        return hazardousShipmentDetail;
    }

    /**
     * 设置hazardousShipmentDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedHazardousShipmentDetail }
     *     
     */
    public void setHazardousShipmentDetail(CompletedHazardousShipmentDetail value) {
        this.hazardousShipmentDetail = value;
    }

    /**
     * 获取shipmentRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentRating }
     *     
     */
    public ShipmentRating getShipmentRating() {
        return shipmentRating;
    }

    /**
     * 设置shipmentRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentRating }
     *     
     */
    public void setShipmentRating(ShipmentRating value) {
        this.shipmentRating = value;
    }

    /**
     * 获取completedHoldAtLocationDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedHoldAtLocationDetail }
     *     
     */
    public CompletedHoldAtLocationDetail getCompletedHoldAtLocationDetail() {
        return completedHoldAtLocationDetail;
    }

    /**
     * 设置completedHoldAtLocationDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedHoldAtLocationDetail }
     *     
     */
    public void setCompletedHoldAtLocationDetail(CompletedHoldAtLocationDetail value) {
        this.completedHoldAtLocationDetail = value;
    }

    /**
     * 获取exportComplianceStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportComplianceStatement() {
        return exportComplianceStatement;
    }

    /**
     * 设置exportComplianceStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportComplianceStatement(String value) {
        this.exportComplianceStatement = value;
    }

    /**
     * 获取documentRequirements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentRequirementsDetail }
     *     
     */
    public DocumentRequirementsDetail getDocumentRequirements() {
        return documentRequirements;
    }

    /**
     * 设置documentRequirements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRequirementsDetail }
     *     
     */
    public void setDocumentRequirements(DocumentRequirementsDetail value) {
        this.documentRequirements = value;
    }

    /**
     * 获取completedEtdDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedEtdDetail }
     *     
     */
    public CompletedEtdDetail getCompletedEtdDetail() {
        return completedEtdDetail;
    }

    /**
     * 设置completedEtdDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedEtdDetail }
     *     
     */
    public void setCompletedEtdDetail(CompletedEtdDetail value) {
        this.completedEtdDetail = value;
    }

    /**
     * Gets the value of the shipmentDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocument }
     * 
     * 
     */
    public List<ShippingDocument> getShipmentDocuments() {
        if (shipmentDocuments == null) {
            shipmentDocuments = new ArrayList<ShippingDocument>();
        }
        return this.shipmentDocuments;
    }

    /**
     * Gets the value of the associatedShipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedShipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedShipmentDetail }
     * 
     * 
     */
    public List<AssociatedShipmentDetail> getAssociatedShipments() {
        if (associatedShipments == null) {
            associatedShipments = new ArrayList<AssociatedShipmentDetail>();
        }
        return this.associatedShipments;
    }

    /**
     * 获取completedCodDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedCodDetail }
     *     
     */
    public CompletedCodDetail getCompletedCodDetail() {
        return completedCodDetail;
    }

    /**
     * 设置completedCodDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedCodDetail }
     *     
     */
    public void setCompletedCodDetail(CompletedCodDetail value) {
        this.completedCodDetail = value;
    }

    /**
     * Gets the value of the completedPackageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the completedPackageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompletedPackageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompletedPackageDetail }
     * 
     * 
     */
    public List<CompletedPackageDetail> getCompletedPackageDetails() {
        if (completedPackageDetails == null) {
            completedPackageDetails = new ArrayList<CompletedPackageDetail>();
        }
        return this.completedPackageDetails;
    }

}
