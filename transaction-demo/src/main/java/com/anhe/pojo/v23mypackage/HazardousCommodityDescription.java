
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
 * Identifies and describes an individual hazardous commodity.
 * 
 * <p>HazardousCommodityDescription complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HazardousCommodityDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="PackingGroup" type="{http://fedex.com/ws/ship/v23}HazardousCommodityPackingGroupType" minOccurs="0"/>
 *         &lt;element name="PackingDetails" type="{http://fedex.com/ws/ship/v23}HazardousCommodityPackingDetail" minOccurs="0"/>
 *         &lt;element name="ReportableQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProperShippingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HazardClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubsidiaryClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LabelText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessingOptions" type="{http://fedex.com/ws/ship/v23}HazardousCommodityDescriptionProcessingOptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousCommodityDescription", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "id",
    "sequenceNumber",
    "packingGroup",
    "packingDetails",
    "reportableQuantity",
    "properShippingName",
    "technicalName",
    "percentage",
    "hazardClass",
    "subsidiaryClasses",
    "labelText",
    "processingOptions",
    "authorization"
})
public class HazardousCommodityDescription {

    @XmlElement(name = "Id", namespace = "http://fedex.com/ws/ship/v23")
    protected String id;
    @XmlElement(name = "SequenceNumber", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "PackingGroup", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected HazardousCommodityPackingGroupType packingGroup;
    @XmlElement(name = "PackingDetails", namespace = "http://fedex.com/ws/ship/v23")
    protected HazardousCommodityPackingDetail packingDetails;
    @XmlElement(name = "ReportableQuantity", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean reportableQuantity;
    @XmlElement(name = "ProperShippingName", namespace = "http://fedex.com/ws/ship/v23")
    protected String properShippingName;
    @XmlElement(name = "TechnicalName", namespace = "http://fedex.com/ws/ship/v23")
    protected String technicalName;
    @XmlElement(name = "Percentage", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal percentage;
    @XmlElement(name = "HazardClass", namespace = "http://fedex.com/ws/ship/v23")
    protected String hazardClass;
    @XmlElement(name = "SubsidiaryClasses", namespace = "http://fedex.com/ws/ship/v23")
    protected List<String> subsidiaryClasses;
    @XmlElement(name = "LabelText", namespace = "http://fedex.com/ws/ship/v23")
    protected String labelText;
    @XmlElement(name = "ProcessingOptions", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<HazardousCommodityDescriptionProcessingOptionType> processingOptions;
    @XmlElement(name = "Authorization", namespace = "http://fedex.com/ws/ship/v23")
    protected String authorization;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取sequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 设置sequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * 获取packingGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityPackingGroupType }
     *     
     */
    public HazardousCommodityPackingGroupType getPackingGroup() {
        return packingGroup;
    }

    /**
     * 设置packingGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityPackingGroupType }
     *     
     */
    public void setPackingGroup(HazardousCommodityPackingGroupType value) {
        this.packingGroup = value;
    }

    /**
     * 获取packingDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityPackingDetail }
     *     
     */
    public HazardousCommodityPackingDetail getPackingDetails() {
        return packingDetails;
    }

    /**
     * 设置packingDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityPackingDetail }
     *     
     */
    public void setPackingDetails(HazardousCommodityPackingDetail value) {
        this.packingDetails = value;
    }

    /**
     * 获取reportableQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportableQuantity() {
        return reportableQuantity;
    }

    /**
     * 设置reportableQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportableQuantity(Boolean value) {
        this.reportableQuantity = value;
    }

    /**
     * 获取properShippingName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperShippingName() {
        return properShippingName;
    }

    /**
     * 设置properShippingName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperShippingName(String value) {
        this.properShippingName = value;
    }

    /**
     * 获取technicalName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalName() {
        return technicalName;
    }

    /**
     * 设置technicalName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalName(String value) {
        this.technicalName = value;
    }

    /**
     * 获取percentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * 设置percentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * 获取hazardClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardClass() {
        return hazardClass;
    }

    /**
     * 设置hazardClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardClass(String value) {
        this.hazardClass = value;
    }

    /**
     * Gets the value of the subsidiaryClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiaryClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiaryClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubsidiaryClasses() {
        if (subsidiaryClasses == null) {
            subsidiaryClasses = new ArrayList<String>();
        }
        return this.subsidiaryClasses;
    }

    /**
     * 获取labelText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelText() {
        return labelText;
    }

    /**
     * 设置labelText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelText(String value) {
        this.labelText = value;
    }

    /**
     * Gets the value of the processingOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousCommodityDescriptionProcessingOptionType }
     * 
     * 
     */
    public List<HazardousCommodityDescriptionProcessingOptionType> getProcessingOptions() {
        if (processingOptions == null) {
            processingOptions = new ArrayList<HazardousCommodityDescriptionProcessingOptionType>();
        }
        return this.processingOptions;
    }

    /**
     * 获取authorization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
     * 设置authorization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorization(String value) {
        this.authorization = value;
    }

}
