
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A single part of a shipping document, such as one page of a multiple-page document whose format requires a separate image per page.
 * 
 * <p>ShippingDocumentPart complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentPartSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentPart", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "documentPartSequenceNumber",
    "image"
})
public class ShippingDocumentPart {

    @XmlElement(name = "DocumentPartSequenceNumber", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger documentPartSequenceNumber;
    @XmlElement(name = "Image", namespace = "http://fedex.com/ws/ship/v23")
    protected byte[] image;

    /**
     * 获取documentPartSequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentPartSequenceNumber() {
        return documentPartSequenceNumber;
    }

    /**
     * 设置documentPartSequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentPartSequenceNumber(BigInteger value) {
        this.documentPartSequenceNumber = value;
    }

    /**
     * 获取image属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * 设置image属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

}
