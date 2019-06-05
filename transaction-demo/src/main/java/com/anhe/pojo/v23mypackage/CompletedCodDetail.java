
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the results of processing for the COD special service.
 * 
 * <p>CompletedCodDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedCodDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollectionAmount" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="AdjustmentType" type="{http://fedex.com/ws/ship/v23}CodAdjustmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedCodDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "collectionAmount",
    "adjustmentType"
})
public class CompletedCodDetail {

    @XmlElement(name = "CollectionAmount", namespace = "http://fedex.com/ws/ship/v23")
    protected Money collectionAmount;
    @XmlElement(name = "AdjustmentType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CodAdjustmentType adjustmentType;

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

}
