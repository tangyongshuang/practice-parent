
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
 * This class rationalizes RequestedPackage and RequestedPackageSummary from previous interfaces.
 * 
 * <p>RequestedPackageLineItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequestedPackageLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="GroupNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="GroupPackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="VariableHandlingChargeDetail" type="{http://fedex.com/ws/ship/v23}VariableHandlingChargeDetail" minOccurs="0"/>
 *         &lt;element name="InsuredValue" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="Dimensions" type="{http://fedex.com/ws/ship/v23}Dimensions" minOccurs="0"/>
 *         &lt;element name="PhysicalPackaging" type="{http://fedex.com/ws/ship/v23}PhysicalPackagingType" minOccurs="0"/>
 *         &lt;element name="AssociatedFreightLineItems" type="{http://fedex.com/ws/ship/v23}AssociatedFreightLineItemDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemDescriptionForClearance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerReferences" type="{http://fedex.com/ws/ship/v23}CustomerReference" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SpecialServicesRequested" type="{http://fedex.com/ws/ship/v23}PackageSpecialServicesRequested" minOccurs="0"/>
 *         &lt;element name="ContentRecords" type="{http://fedex.com/ws/ship/v23}ContentRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedPackageLineItem", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "sequenceNumber",
    "groupNumber",
    "groupPackageCount",
    "variableHandlingChargeDetail",
    "insuredValue",
    "weight",
    "dimensions",
    "physicalPackaging",
    "associatedFreightLineItems",
    "itemDescription",
    "itemDescriptionForClearance",
    "customerReferences",
    "specialServicesRequested",
    "contentRecords"
})
public class RequestedPackageLineItem {

    @XmlElement(name = "SequenceNumber", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "GroupNumber", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupNumber;
    @XmlElement(name = "GroupPackageCount", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupPackageCount;
    @XmlElement(name = "VariableHandlingChargeDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected VariableHandlingChargeDetail variableHandlingChargeDetail;
    @XmlElement(name = "InsuredValue", namespace = "http://fedex.com/ws/ship/v23")
    protected Money insuredValue;
    @XmlElement(name = "Weight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight weight;
    @XmlElement(name = "Dimensions", namespace = "http://fedex.com/ws/ship/v23")
    protected Dimensions dimensions;
    @XmlElement(name = "PhysicalPackaging", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PhysicalPackagingType physicalPackaging;
    @XmlElement(name = "AssociatedFreightLineItems", namespace = "http://fedex.com/ws/ship/v23")
    protected List<AssociatedFreightLineItemDetail> associatedFreightLineItems;
    @XmlElement(name = "ItemDescription", namespace = "http://fedex.com/ws/ship/v23")
    protected String itemDescription;
    @XmlElement(name = "ItemDescriptionForClearance", namespace = "http://fedex.com/ws/ship/v23")
    protected String itemDescriptionForClearance;
    @XmlElement(name = "CustomerReferences", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomerReference> customerReferences;
    @XmlElement(name = "SpecialServicesRequested", namespace = "http://fedex.com/ws/ship/v23")
    protected PackageSpecialServicesRequested specialServicesRequested;
    @XmlElement(name = "ContentRecords", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ContentRecord> contentRecords;

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
     * 获取groupNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupNumber() {
        return groupNumber;
    }

    /**
     * 设置groupNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupNumber(BigInteger value) {
        this.groupNumber = value;
    }

    /**
     * 获取groupPackageCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupPackageCount() {
        return groupPackageCount;
    }

    /**
     * 设置groupPackageCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupPackageCount(BigInteger value) {
        this.groupPackageCount = value;
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
     * 获取insuredValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getInsuredValue() {
        return insuredValue;
    }

    /**
     * 设置insuredValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setInsuredValue(Money value) {
        this.insuredValue = value;
    }

    /**
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setWeight(Weight value) {
        this.weight = value;
    }

    /**
     * 获取dimensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * 设置dimensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setDimensions(Dimensions value) {
        this.dimensions = value;
    }

    /**
     * 获取physicalPackaging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPackagingType }
     *     
     */
    public PhysicalPackagingType getPhysicalPackaging() {
        return physicalPackaging;
    }

    /**
     * 设置physicalPackaging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPackagingType }
     *     
     */
    public void setPhysicalPackaging(PhysicalPackagingType value) {
        this.physicalPackaging = value;
    }

    /**
     * Gets the value of the associatedFreightLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedFreightLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedFreightLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedFreightLineItemDetail }
     * 
     * 
     */
    public List<AssociatedFreightLineItemDetail> getAssociatedFreightLineItems() {
        if (associatedFreightLineItems == null) {
            associatedFreightLineItems = new ArrayList<AssociatedFreightLineItemDetail>();
        }
        return this.associatedFreightLineItems;
    }

    /**
     * 获取itemDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * 设置itemDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * 获取itemDescriptionForClearance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescriptionForClearance() {
        return itemDescriptionForClearance;
    }

    /**
     * 设置itemDescriptionForClearance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescriptionForClearance(String value) {
        this.itemDescriptionForClearance = value;
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
     * 获取specialServicesRequested属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageSpecialServicesRequested }
     *     
     */
    public PackageSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }

    /**
     * 设置specialServicesRequested属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageSpecialServicesRequested }
     *     
     */
    public void setSpecialServicesRequested(PackageSpecialServicesRequested value) {
        this.specialServicesRequested = value;
    }

    /**
     * Gets the value of the contentRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentRecord }
     * 
     * 
     */
    public List<ContentRecord> getContentRecords() {
        if (contentRecords == null) {
            contentRecords = new ArrayList<ContentRecord>();
        }
        return this.contentRecords;
    }

}
