
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Payment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentType" type="{http://fedex.com/ws/ship/v23}PaymentType"/>
 *         &lt;element name="Payor" type="{http://fedex.com/ws/ship/v23}Payor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "paymentType",
    "payor"
})
public class Payment {

    @XmlElement(name = "PaymentType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentType paymentType;
    @XmlElement(name = "Payor", namespace = "http://fedex.com/ws/ship/v23")
    protected Payor payor;

    /**
     * 获取paymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * 获取payor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Payor }
     *     
     */
    public Payor getPayor() {
        return payor;
    }

    /**
     * 设置payor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Payor }
     *     
     */
    public void setPayor(Payor value) {
        this.payor = value;
    }

}
