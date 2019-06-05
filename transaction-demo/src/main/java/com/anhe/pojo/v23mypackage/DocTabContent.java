
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocTabContent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocTabContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocTabContentType" type="{http://fedex.com/ws/ship/v23}DocTabContentType"/>
 *         &lt;element name="Zone001" type="{http://fedex.com/ws/ship/v23}DocTabContentZone001" minOccurs="0"/>
 *         &lt;element name="Barcoded" type="{http://fedex.com/ws/ship/v23}DocTabContentBarcoded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocTabContent", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "docTabContentType",
    "zone001",
    "barcoded"
})
public class DocTabContent {

    @XmlElement(name = "DocTabContentType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected DocTabContentType docTabContentType;
    @XmlElement(name = "Zone001", namespace = "http://fedex.com/ws/ship/v23")
    protected DocTabContentZone001 zone001;
    @XmlElement(name = "Barcoded", namespace = "http://fedex.com/ws/ship/v23")
    protected DocTabContentBarcoded barcoded;

    /**
     * 获取docTabContentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocTabContentType }
     *     
     */
    public DocTabContentType getDocTabContentType() {
        return docTabContentType;
    }

    /**
     * 设置docTabContentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabContentType }
     *     
     */
    public void setDocTabContentType(DocTabContentType value) {
        this.docTabContentType = value;
    }

    /**
     * 获取zone001属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocTabContentZone001 }
     *     
     */
    public DocTabContentZone001 getZone001() {
        return zone001;
    }

    /**
     * 设置zone001属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabContentZone001 }
     *     
     */
    public void setZone001(DocTabContentZone001 value) {
        this.zone001 = value;
    }

    /**
     * 获取barcoded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocTabContentBarcoded }
     *     
     */
    public DocTabContentBarcoded getBarcoded() {
        return barcoded;
    }

    /**
     * 设置barcoded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabContentBarcoded }
     *     
     */
    public void setBarcoded(DocTabContentBarcoded value) {
        this.barcoded = value;
    }

}
