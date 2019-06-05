
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DangerousGoodsDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DangerousGoodsDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UploadedTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Regulation" type="{http://fedex.com/ws/ship/v23}HazardousCommodityRegulationType" minOccurs="0"/>
 *         &lt;element name="Accessibility" type="{http://fedex.com/ws/ship/v23}DangerousGoodsAccessibilityType" minOccurs="0"/>
 *         &lt;element name="CargoAircraftOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://fedex.com/ws/ship/v23}HazardousCommodityOptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PackingOption" type="{http://fedex.com/ws/ship/v23}DangerousGoodsPackingOptionType" minOccurs="0"/>
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Containers" type="{http://fedex.com/ws/ship/v23}DangerousGoodsContainer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Packaging" type="{http://fedex.com/ws/ship/v23}HazardousCommodityPackagingDetail" minOccurs="0"/>
 *         &lt;element name="Signatory" type="{http://fedex.com/ws/ship/v23}DangerousGoodsSignatory" minOccurs="0"/>
 *         &lt;element name="EmergencyContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Offeror" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfectiousSubstanceResponsibleContact" type="{http://fedex.com/ws/ship/v23}Contact" minOccurs="0"/>
 *         &lt;element name="AdditionalHandling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioactivityDetail" type="{http://fedex.com/ws/ship/v23}RadioactivityDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousGoodsDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "uploadedTrackingNumber",
    "regulation",
    "accessibility",
    "cargoAircraftOnly",
    "options",
    "packingOption",
    "referenceId",
    "containers",
    "packaging",
    "signatory",
    "emergencyContactNumber",
    "offeror",
    "infectiousSubstanceResponsibleContact",
    "additionalHandling",
    "radioactivityDetail"
})
public class DangerousGoodsDetail {

    @XmlElement(name = "UploadedTrackingNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String uploadedTrackingNumber;
    @XmlElement(name = "Regulation", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected HazardousCommodityRegulationType regulation;
    @XmlElement(name = "Accessibility", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected DangerousGoodsAccessibilityType accessibility;
    @XmlElement(name = "CargoAircraftOnly", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean cargoAircraftOnly;
    @XmlElement(name = "Options", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<HazardousCommodityOptionType> options;
    @XmlElement(name = "PackingOption", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected DangerousGoodsPackingOptionType packingOption;
    @XmlElement(name = "ReferenceId", namespace = "http://fedex.com/ws/ship/v23")
    protected String referenceId;
    @XmlElement(name = "Containers", namespace = "http://fedex.com/ws/ship/v23")
    protected List<DangerousGoodsContainer> containers;
    @XmlElement(name = "Packaging", namespace = "http://fedex.com/ws/ship/v23")
    protected HazardousCommodityPackagingDetail packaging;
    @XmlElement(name = "Signatory", namespace = "http://fedex.com/ws/ship/v23")
    protected DangerousGoodsSignatory signatory;
    @XmlElement(name = "EmergencyContactNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String emergencyContactNumber;
    @XmlElement(name = "Offeror", namespace = "http://fedex.com/ws/ship/v23")
    protected String offeror;
    @XmlElement(name = "InfectiousSubstanceResponsibleContact", namespace = "http://fedex.com/ws/ship/v23")
    protected Contact infectiousSubstanceResponsibleContact;
    @XmlElement(name = "AdditionalHandling", namespace = "http://fedex.com/ws/ship/v23")
    protected String additionalHandling;
    @XmlElement(name = "RadioactivityDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected RadioactivityDetail radioactivityDetail;

    /**
     * 获取uploadedTrackingNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadedTrackingNumber() {
        return uploadedTrackingNumber;
    }

    /**
     * 设置uploadedTrackingNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadedTrackingNumber(String value) {
        this.uploadedTrackingNumber = value;
    }

    /**
     * 获取regulation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityRegulationType }
     *     
     */
    public HazardousCommodityRegulationType getRegulation() {
        return regulation;
    }

    /**
     * 设置regulation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityRegulationType }
     *     
     */
    public void setRegulation(HazardousCommodityRegulationType value) {
        this.regulation = value;
    }

    /**
     * 获取accessibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsAccessibilityType }
     *     
     */
    public DangerousGoodsAccessibilityType getAccessibility() {
        return accessibility;
    }

    /**
     * 设置accessibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsAccessibilityType }
     *     
     */
    public void setAccessibility(DangerousGoodsAccessibilityType value) {
        this.accessibility = value;
    }

    /**
     * 获取cargoAircraftOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCargoAircraftOnly() {
        return cargoAircraftOnly;
    }

    /**
     * 设置cargoAircraftOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCargoAircraftOnly(Boolean value) {
        this.cargoAircraftOnly = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousCommodityOptionType }
     * 
     * 
     */
    public List<HazardousCommodityOptionType> getOptions() {
        if (options == null) {
            options = new ArrayList<HazardousCommodityOptionType>();
        }
        return this.options;
    }

    /**
     * 获取packingOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsPackingOptionType }
     *     
     */
    public DangerousGoodsPackingOptionType getPackingOption() {
        return packingOption;
    }

    /**
     * 设置packingOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsPackingOptionType }
     *     
     */
    public void setPackingOption(DangerousGoodsPackingOptionType value) {
        this.packingOption = value;
    }

    /**
     * 获取referenceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * 设置referenceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the containers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousGoodsContainer }
     * 
     * 
     */
    public List<DangerousGoodsContainer> getContainers() {
        if (containers == null) {
            containers = new ArrayList<DangerousGoodsContainer>();
        }
        return this.containers;
    }

    /**
     * 获取packaging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityPackagingDetail }
     *     
     */
    public HazardousCommodityPackagingDetail getPackaging() {
        return packaging;
    }

    /**
     * 设置packaging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityPackagingDetail }
     *     
     */
    public void setPackaging(HazardousCommodityPackagingDetail value) {
        this.packaging = value;
    }

    /**
     * 获取signatory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsSignatory }
     *     
     */
    public DangerousGoodsSignatory getSignatory() {
        return signatory;
    }

    /**
     * 设置signatory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsSignatory }
     *     
     */
    public void setSignatory(DangerousGoodsSignatory value) {
        this.signatory = value;
    }

    /**
     * 获取emergencyContactNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    /**
     * 设置emergencyContactNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactNumber(String value) {
        this.emergencyContactNumber = value;
    }

    /**
     * 获取offeror属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferor() {
        return offeror;
    }

    /**
     * 设置offeror属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferor(String value) {
        this.offeror = value;
    }

    /**
     * 获取infectiousSubstanceResponsibleContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getInfectiousSubstanceResponsibleContact() {
        return infectiousSubstanceResponsibleContact;
    }

    /**
     * 设置infectiousSubstanceResponsibleContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setInfectiousSubstanceResponsibleContact(Contact value) {
        this.infectiousSubstanceResponsibleContact = value;
    }

    /**
     * 获取additionalHandling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalHandling() {
        return additionalHandling;
    }

    /**
     * 设置additionalHandling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalHandling(String value) {
        this.additionalHandling = value;
    }

    /**
     * 获取radioactivityDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RadioactivityDetail }
     *     
     */
    public RadioactivityDetail getRadioactivityDetail() {
        return radioactivityDetail;
    }

    /**
     * 设置radioactivityDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RadioactivityDetail }
     *     
     */
    public void setRadioactivityDetail(RadioactivityDetail value) {
        this.radioactivityDetail = value;
    }

}
