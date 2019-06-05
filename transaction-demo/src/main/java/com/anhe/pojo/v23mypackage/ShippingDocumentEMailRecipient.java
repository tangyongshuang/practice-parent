
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies an individual recipient of e-mailed shipping document(s).
 * 
 * <p>ShippingDocumentEMailRecipient complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentEMailRecipient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecipientType" type="{http://fedex.com/ws/ship/v23}EMailNotificationRecipientType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentEMailRecipient", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "recipientType",
    "address"
})
public class ShippingDocumentEMailRecipient {

    @XmlElement(name = "RecipientType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected EMailNotificationRecipientType recipientType;
    @XmlElement(name = "Address", namespace = "http://fedex.com/ws/ship/v23")
    protected String address;

    /**
     * 获取recipientType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMailNotificationRecipientType }
     *     
     */
    public EMailNotificationRecipientType getRecipientType() {
        return recipientType;
    }

    /**
     * 设置recipientType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMailNotificationRecipientType }
     *     
     */
    public void setRecipientType(EMailNotificationRecipientType value) {
        this.recipientType = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

}
