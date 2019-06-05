
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes attributes of a battery or cell that are used for classification purposes. Typically this structure would be used to allow customers to declare batteries or cells for which full dangerous goods documentation and procedures are not required.
 * 
 * <p>BatteryClassificationDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BatteryClassificationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Material" type="{http://fedex.com/ws/ship/v23}BatteryMaterialType" minOccurs="0"/>
 *         &lt;element name="Packing" type="{http://fedex.com/ws/ship/v23}BatteryPackingType" minOccurs="0"/>
 *         &lt;element name="RegulatorySubType" type="{http://fedex.com/ws/ship/v23}BatteryRegulatorySubType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatteryClassificationDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "material",
    "packing",
    "regulatorySubType"
})
public class BatteryClassificationDetail {

    @XmlElement(name = "Material", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected BatteryMaterialType material;
    @XmlElement(name = "Packing", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected BatteryPackingType packing;
    @XmlElement(name = "RegulatorySubType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected BatteryRegulatorySubType regulatorySubType;

    /**
     * 获取material属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryMaterialType }
     *     
     */
    public BatteryMaterialType getMaterial() {
        return material;
    }

    /**
     * 设置material属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryMaterialType }
     *     
     */
    public void setMaterial(BatteryMaterialType value) {
        this.material = value;
    }

    /**
     * 获取packing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryPackingType }
     *     
     */
    public BatteryPackingType getPacking() {
        return packing;
    }

    /**
     * 设置packing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryPackingType }
     *     
     */
    public void setPacking(BatteryPackingType value) {
        this.packing = value;
    }

    /**
     * 获取regulatorySubType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryRegulatorySubType }
     *     
     */
    public BatteryRegulatorySubType getRegulatorySubType() {
        return regulatorySubType;
    }

    /**
     * 设置regulatorySubType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryRegulatorySubType }
     *     
     */
    public void setRegulatorySubType(BatteryRegulatorySubType value) {
        this.regulatorySubType = value;
    }

}
