
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies and describes an individual hazardous commodity. For 201001 load, this is based on data from the FedEx Ground Hazardous Materials Shipping Guide.
 * 
 * <p>ValidatedHazardousCommodityDescription complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ValidatedHazardousCommodityDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="PackingGroup" type="{http://fedex.com/ws/ship/v23}HazardousCommodityPackingGroupType" minOccurs="0"/>
 *         &lt;element name="PackingInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProperShippingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProperShippingNameAndDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HazardClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubsidiaryClasses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Symbols" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TunnelRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialProvisions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://fedex.com/ws/ship/v23}HazardousCommodityAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LabelText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidatedHazardousCommodityDescription", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "id",
    "sequenceNumber",
    "packingGroup",
    "packingInstructions",
    "properShippingName",
    "properShippingNameAndDescription",
    "technicalName",
    "hazardClass",
    "subsidiaryClasses",
    "symbols",
    "tunnelRestrictionCode",
    "specialProvisions",
    "attributes",
    "authorization",
    "labelText"
})
public class ValidatedHazardousCommodityDescription {

    @XmlElement(name = "Id", namespace = "http://fedex.com/ws/ship/v23")
    protected String id;
    @XmlElement(name = "SequenceNumber", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "PackingGroup", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected HazardousCommodityPackingGroupType packingGroup;
    @XmlElement(name = "PackingInstructions", namespace = "http://fedex.com/ws/ship/v23")
    protected String packingInstructions;
    @XmlElement(name = "ProperShippingName", namespace = "http://fedex.com/ws/ship/v23")
    protected String properShippingName;
    @XmlElement(name = "ProperShippingNameAndDescription", namespace = "http://fedex.com/ws/ship/v23")
    protected String properShippingNameAndDescription;
    @XmlElement(name = "TechnicalName", namespace = "http://fedex.com/ws/ship/v23")
    protected String technicalName;
    @XmlElement(name = "HazardClass", namespace = "http://fedex.com/ws/ship/v23")
    protected String hazardClass;
    @XmlElement(name = "SubsidiaryClasses", namespace = "http://fedex.com/ws/ship/v23")
    protected List<String> subsidiaryClasses;
    @XmlElement(name = "Symbols", namespace = "http://fedex.com/ws/ship/v23")
    protected String symbols;
    @XmlElement(name = "TunnelRestrictionCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String tunnelRestrictionCode;
    @XmlElement(name = "SpecialProvisions", namespace = "http://fedex.com/ws/ship/v23")
    protected String specialProvisions;
    @XmlElement(name = "Attributes", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<HazardousCommodityAttributeType> attributes;
    @XmlElement(name = "Authorization", namespace = "http://fedex.com/ws/ship/v23")
    protected String authorization;
    @XmlElement(name = "LabelText", namespace = "http://fedex.com/ws/ship/v23")
    protected String labelText;

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
     * 获取packingInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingInstructions() {
        return packingInstructions;
    }

    /**
     * 设置packingInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingInstructions(String value) {
        this.packingInstructions = value;
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
     * 获取properShippingNameAndDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperShippingNameAndDescription() {
        return properShippingNameAndDescription;
    }

    /**
     * 设置properShippingNameAndDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperShippingNameAndDescription(String value) {
        this.properShippingNameAndDescription = value;
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
     * 获取symbols属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbols() {
        return symbols;
    }

    /**
     * 设置symbols属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbols(String value) {
        this.symbols = value;
    }

    /**
     * 获取tunnelRestrictionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnelRestrictionCode() {
        return tunnelRestrictionCode;
    }

    /**
     * 设置tunnelRestrictionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnelRestrictionCode(String value) {
        this.tunnelRestrictionCode = value;
    }

    /**
     * 获取specialProvisions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialProvisions() {
        return specialProvisions;
    }

    /**
     * 设置specialProvisions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialProvisions(String value) {
        this.specialProvisions = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousCommodityAttributeType }
     * 
     * 
     */
    public List<HazardousCommodityAttributeType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<HazardousCommodityAttributeType>();
        }
        return this.attributes;
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

}
