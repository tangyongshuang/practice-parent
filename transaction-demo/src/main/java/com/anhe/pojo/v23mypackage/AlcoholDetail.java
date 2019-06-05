
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies details for a package containing alcohol
 * 
 * <p>AlcoholDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AlcoholDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecipientType" type="{http://fedex.com/ws/ship/v23}AlcoholRecipientType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlcoholDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "recipientType"
})
public class AlcoholDetail {

    @XmlElement(name = "RecipientType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected AlcoholRecipientType recipientType;

    /**
     * 获取recipientType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AlcoholRecipientType }
     *     
     */
    public AlcoholRecipientType getRecipientType() {
        return recipientType;
    }

    /**
     * 设置recipientType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholRecipientType }
     *     
     */
    public void setRecipientType(AlcoholRecipientType value) {
        this.recipientType = value;
    }

}
