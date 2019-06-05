
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data required to produce the Freight handling-unit-level address labels. Note that the number of UNIQUE labels (the N as in 1 of N, 2 of N, etc.) is determined by total handling units.
 * 
 * <p>FreightAddressLabelDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FreightAddressLabelDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Format" type="{http://fedex.com/ws/ship/v23}ShippingDocumentFormat" minOccurs="0"/>
 *         &lt;element name="Copies" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="StartingPosition" type="{http://fedex.com/ws/ship/v23}PageQuadrantType" minOccurs="0"/>
 *         &lt;element name="DocTabContent" type="{http://fedex.com/ws/ship/v23}DocTabContent" minOccurs="0"/>
 *         &lt;element name="CustomContentPosition" type="{http://fedex.com/ws/ship/v23}RelativeVerticalPositionType" minOccurs="0"/>
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
@XmlType(name = "FreightAddressLabelDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "format",
    "copies",
    "startingPosition",
    "docTabContent",
    "customContentPosition",
    "customContent"
})
public class FreightAddressLabelDetail {

    @XmlElement(name = "Format", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocumentFormat format;
    @XmlElement(name = "Copies", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger copies;
    @XmlElement(name = "StartingPosition", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PageQuadrantType startingPosition;
    @XmlElement(name = "DocTabContent", namespace = "http://fedex.com/ws/ship/v23")
    protected DocTabContent docTabContent;
    @XmlElement(name = "CustomContentPosition", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RelativeVerticalPositionType customContentPosition;
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
     * 获取copies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCopies() {
        return copies;
    }

    /**
     * 设置copies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCopies(BigInteger value) {
        this.copies = value;
    }

    /**
     * 获取startingPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PageQuadrantType }
     *     
     */
    public PageQuadrantType getStartingPosition() {
        return startingPosition;
    }

    /**
     * 设置startingPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PageQuadrantType }
     *     
     */
    public void setStartingPosition(PageQuadrantType value) {
        this.startingPosition = value;
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
     * 获取customContentPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelativeVerticalPositionType }
     *     
     */
    public RelativeVerticalPositionType getCustomContentPosition() {
        return customContentPosition;
    }

    /**
     * 设置customContentPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeVerticalPositionType }
     *     
     */
    public void setCustomContentPosition(RelativeVerticalPositionType value) {
        this.customContentPosition = value;
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
