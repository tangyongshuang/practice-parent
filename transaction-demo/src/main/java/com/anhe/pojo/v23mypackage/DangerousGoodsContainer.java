
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
 * Describes an approved container used to package dangerous goods commodities. This does not describe any individual inner receptacles that may be within this container.
 * 
 * <p>DangerousGoodsContainer complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DangerousGoodsContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackingType" type="{http://fedex.com/ws/ship/v23}HazardousContainerPackingType" minOccurs="0"/>
 *         &lt;element name="ContainerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioactiveContainerClass" type="{http://fedex.com/ws/ship/v23}RadioactiveContainerClassType" minOccurs="0"/>
 *         &lt;element name="NumberOfContainers" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="HazardousCommodities" type="{http://fedex.com/ws/ship/v23}HazardousCommodityContent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousGoodsContainer", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "packingType",
    "containerType",
    "radioactiveContainerClass",
    "numberOfContainers",
    "hazardousCommodities"
})
public class DangerousGoodsContainer {

    @XmlElement(name = "PackingType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected HazardousContainerPackingType packingType;
    @XmlElement(name = "ContainerType", namespace = "http://fedex.com/ws/ship/v23")
    protected String containerType;
    @XmlElement(name = "RadioactiveContainerClass", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RadioactiveContainerClassType radioactiveContainerClass;
    @XmlElement(name = "NumberOfContainers", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfContainers;
    @XmlElement(name = "HazardousCommodities", namespace = "http://fedex.com/ws/ship/v23")
    protected List<HazardousCommodityContent> hazardousCommodities;

    /**
     * 获取packingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousContainerPackingType }
     *     
     */
    public HazardousContainerPackingType getPackingType() {
        return packingType;
    }

    /**
     * 设置packingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousContainerPackingType }
     *     
     */
    public void setPackingType(HazardousContainerPackingType value) {
        this.packingType = value;
    }

    /**
     * 获取containerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerType() {
        return containerType;
    }

    /**
     * 设置containerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerType(String value) {
        this.containerType = value;
    }

    /**
     * 获取radioactiveContainerClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RadioactiveContainerClassType }
     *     
     */
    public RadioactiveContainerClassType getRadioactiveContainerClass() {
        return radioactiveContainerClass;
    }

    /**
     * 设置radioactiveContainerClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RadioactiveContainerClassType }
     *     
     */
    public void setRadioactiveContainerClass(RadioactiveContainerClassType value) {
        this.radioactiveContainerClass = value;
    }

    /**
     * 获取numberOfContainers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfContainers() {
        return numberOfContainers;
    }

    /**
     * 设置numberOfContainers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfContainers(BigInteger value) {
        this.numberOfContainers = value;
    }

    /**
     * Gets the value of the hazardousCommodities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousCommodities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousCommodities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousCommodityContent }
     * 
     * 
     */
    public List<HazardousCommodityContent> getHazardousCommodities() {
        if (hazardousCommodities == null) {
            hazardousCommodities = new ArrayList<HazardousCommodityContent>();
        }
        return this.hazardousCommodities;
    }

}
