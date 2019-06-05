
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of an individual commodity or class of content in a shipment.
 * 
 * <p>FreightShipmentLineItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FreightShipmentLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreightClass" type="{http://fedex.com/ws/ship/v23}FreightClassType" minOccurs="0"/>
 *         &lt;element name="ClassProvidedByCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandlingUnits" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Packaging" type="{http://fedex.com/ws/ship/v23}PhysicalPackagingType" minOccurs="0"/>
 *         &lt;element name="Pieces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NmfcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HazardousMaterials" type="{http://fedex.com/ws/ship/v23}HazardousCommodityOptionType" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="Dimensions" type="{http://fedex.com/ws/ship/v23}Dimensions" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://fedex.com/ws/ship/v23}Volume" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightShipmentLineItem", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "id",
    "freightClass",
    "classProvidedByCustomer",
    "handlingUnits",
    "packaging",
    "pieces",
    "nmfcCode",
    "hazardousMaterials",
    "purchaseOrderNumber",
    "description",
    "weight",
    "dimensions",
    "volume"
})
public class FreightShipmentLineItem {

    @XmlElement(name = "Id", namespace = "http://fedex.com/ws/ship/v23")
    protected String id;
    @XmlElement(name = "FreightClass", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightClassType freightClass;
    @XmlElement(name = "ClassProvidedByCustomer", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean classProvidedByCustomer;
    @XmlElement(name = "HandlingUnits", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger handlingUnits;
    @XmlElement(name = "Packaging", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PhysicalPackagingType packaging;
    @XmlElement(name = "Pieces", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pieces;
    @XmlElement(name = "NmfcCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String nmfcCode;
    @XmlElement(name = "HazardousMaterials", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected HazardousCommodityOptionType hazardousMaterials;
    @XmlElement(name = "PurchaseOrderNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String purchaseOrderNumber;
    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected String description;
    @XmlElement(name = "Weight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight weight;
    @XmlElement(name = "Dimensions", namespace = "http://fedex.com/ws/ship/v23")
    protected Dimensions dimensions;
    @XmlElement(name = "Volume", namespace = "http://fedex.com/ws/ship/v23")
    protected Volume volume;

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
     * 获取freightClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightClassType }
     *     
     */
    public FreightClassType getFreightClass() {
        return freightClass;
    }

    /**
     * 设置freightClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightClassType }
     *     
     */
    public void setFreightClass(FreightClassType value) {
        this.freightClass = value;
    }

    /**
     * 获取classProvidedByCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassProvidedByCustomer() {
        return classProvidedByCustomer;
    }

    /**
     * 设置classProvidedByCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassProvidedByCustomer(Boolean value) {
        this.classProvidedByCustomer = value;
    }

    /**
     * 获取handlingUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHandlingUnits() {
        return handlingUnits;
    }

    /**
     * 设置handlingUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHandlingUnits(BigInteger value) {
        this.handlingUnits = value;
    }

    /**
     * 获取packaging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhysicalPackagingType }
     *     
     */
    public PhysicalPackagingType getPackaging() {
        return packaging;
    }

    /**
     * 设置packaging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalPackagingType }
     *     
     */
    public void setPackaging(PhysicalPackagingType value) {
        this.packaging = value;
    }

    /**
     * 获取pieces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPieces() {
        return pieces;
    }

    /**
     * 设置pieces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPieces(BigInteger value) {
        this.pieces = value;
    }

    /**
     * 获取nmfcCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmfcCode() {
        return nmfcCode;
    }

    /**
     * 设置nmfcCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmfcCode(String value) {
        this.nmfcCode = value;
    }

    /**
     * 获取hazardousMaterials属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityOptionType }
     *     
     */
    public HazardousCommodityOptionType getHazardousMaterials() {
        return hazardousMaterials;
    }

    /**
     * 设置hazardousMaterials属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityOptionType }
     *     
     */
    public void setHazardousMaterials(HazardousCommodityOptionType value) {
        this.hazardousMaterials = value;
    }

    /**
     * 获取purchaseOrderNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * 设置purchaseOrderNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * 获取volume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * 设置volume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    public void setVolume(Volume value) {
        this.volume = value;
    }

}
