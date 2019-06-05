
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the information associated with a package that has COD special service in a ground shipment.
 * 
 * <p>CodReturnPackageDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CodReturnPackageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollectionAmount" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="AdjustmentType" type="{http://fedex.com/ws/ship/v23}CodAdjustmentType" minOccurs="0"/>
 *         &lt;element name="Electronic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Barcodes" type="{http://fedex.com/ws/ship/v23}PackageBarcodes" minOccurs="0"/>
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
@XmlType(name = "CodReturnPackageDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "collectionAmount",
    "adjustmentType",
    "electronic",
    "barcodes",
    "label"
})
public class CodReturnPackageDetail {

    @XmlElement(name = "CollectionAmount", namespace = "http://fedex.com/ws/ship/v23")
    protected Money collectionAmount;
    @XmlElement(name = "AdjustmentType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CodAdjustmentType adjustmentType;
    @XmlElement(name = "Electronic", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean electronic;
    @XmlElement(name = "Barcodes", namespace = "http://fedex.com/ws/ship/v23")
    protected PackageBarcodes barcodes;
    @XmlElement(name = "Label", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocument label;

    /**
     * 获取collectionAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCollectionAmount() {
        return collectionAmount;
    }

    /**
     * 设置collectionAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCollectionAmount(Money value) {
        this.collectionAmount = value;
    }

    /**
     * 获取adjustmentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodAdjustmentType }
     *     
     */
    public CodAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * 设置adjustmentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodAdjustmentType }
     *     
     */
    public void setAdjustmentType(CodAdjustmentType value) {
        this.adjustmentType = value;
    }

    /**
     * 获取electronic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronic() {
        return electronic;
    }

    /**
     * 设置electronic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronic(Boolean value) {
        this.electronic = value;
    }

    /**
     * 获取barcodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageBarcodes }
     *     
     */
    public PackageBarcodes getBarcodes() {
        return barcodes;
    }

    /**
     * 设置barcodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageBarcodes }
     *     
     */
    public void setBarcodes(PackageBarcodes value) {
        this.barcodes = value;
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
