
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data required to produce a custom-specified document, either at shipment or package level.
 * 
 * <p>CustomDocumentDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomDocumentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Format" type="{http://fedex.com/ws/ship/v23}ShippingDocumentFormat" minOccurs="0"/>
 *         &lt;element name="LabelPrintingOrientation" type="{http://fedex.com/ws/ship/v23}LabelPrintingOrientationType" minOccurs="0"/>
 *         &lt;element name="LabelRotation" type="{http://fedex.com/ws/ship/v23}LabelRotationType" minOccurs="0"/>
 *         &lt;element name="SpecificationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomDocumentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocTabContent" type="{http://fedex.com/ws/ship/v23}DocTabContent" minOccurs="0"/>
 *         &lt;element name="CustomContent" type="{http://fedex.com/ws/ship/v23}CustomLabelDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomDocumentDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "format",
    "labelPrintingOrientation",
    "labelRotation",
    "specificationId",
    "customDocumentIdentifier",
    "docTabContent",
    "customContent"
})
public class CustomDocumentDetail {

    @XmlElement(name = "Format", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocumentFormat format;
    @XmlElement(name = "LabelPrintingOrientation", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected LabelPrintingOrientationType labelPrintingOrientation;
    @XmlElement(name = "LabelRotation", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected LabelRotationType labelRotation;
    @XmlElement(name = "SpecificationId", namespace = "http://fedex.com/ws/ship/v23")
    protected String specificationId;
    @XmlElement(name = "CustomDocumentIdentifier", namespace = "http://fedex.com/ws/ship/v23")
    protected String customDocumentIdentifier;
    @XmlElement(name = "DocTabContent", namespace = "http://fedex.com/ws/ship/v23")
    protected DocTabContent docTabContent;
    @XmlElement(name = "CustomContent", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomLabelDetail customContent;

    /**
     * 获取format属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public ShippingDocumentFormat getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public void setFormat(ShippingDocumentFormat value) {
        this.format = value;
    }

    /**
     * 获取labelPrintingOrientation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LabelPrintingOrientationType }
     *     
     */
    public LabelPrintingOrientationType getLabelPrintingOrientation() {
        return labelPrintingOrientation;
    }

    /**
     * 设置labelPrintingOrientation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LabelPrintingOrientationType }
     *     
     */
    public void setLabelPrintingOrientation(LabelPrintingOrientationType value) {
        this.labelPrintingOrientation = value;
    }

    /**
     * 获取labelRotation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LabelRotationType }
     *     
     */
    public LabelRotationType getLabelRotation() {
        return labelRotation;
    }

    /**
     * 设置labelRotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRotationType }
     *     
     */
    public void setLabelRotation(LabelRotationType value) {
        this.labelRotation = value;
    }

    /**
     * 获取specificationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationId() {
        return specificationId;
    }

    /**
     * 设置specificationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationId(String value) {
        this.specificationId = value;
    }

    /**
     * 获取customDocumentIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDocumentIdentifier() {
        return customDocumentIdentifier;
    }

    /**
     * 设置customDocumentIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDocumentIdentifier(String value) {
        this.customDocumentIdentifier = value;
    }

    /**
     * 获取docTabContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocTabContent }
     *     
     */
    public DocTabContent getDocTabContent() {
        return docTabContent;
    }

    /**
     * 设置docTabContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabContent }
     *     
     */
    public void setDocTabContent(DocTabContent value) {
        this.docTabContent = value;
    }

    /**
     * 获取customContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelDetail }
     *     
     */
    public CustomLabelDetail getCustomContent() {
        return customContent;
    }

    /**
     * 设置customContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelDetail }
     *     
     */
    public void setCustomContent(CustomLabelDetail value) {
        this.customContent = value;
    }

}
