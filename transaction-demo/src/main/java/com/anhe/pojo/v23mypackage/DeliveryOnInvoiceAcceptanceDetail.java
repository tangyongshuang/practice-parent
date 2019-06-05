
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeliveryOnInvoiceAcceptanceDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeliveryOnInvoiceAcceptanceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recipient" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *         &lt;element name="TrackingId" type="{http://fedex.com/ws/ship/v23}TrackingId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryOnInvoiceAcceptanceDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "recipient",
    "trackingId"
})
public class DeliveryOnInvoiceAcceptanceDetail {

    @XmlElement(name = "Recipient", namespace = "http://fedex.com/ws/ship/v23")
    protected Party recipient;
    @XmlElement(name = "TrackingId", namespace = "http://fedex.com/ws/ship/v23")
    protected TrackingId trackingId;

    /**
     * 获取recipient属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getRecipient() {
        return recipient;
    }

    /**
     * 设置recipient属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setRecipient(Party value) {
        this.recipient = value;
    }

    /**
     * 获取trackingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrackingId }
     *     
     */
    public TrackingId getTrackingId() {
        return trackingId;
    }

    /**
     * 设置trackingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingId }
     *     
     */
    public void setTrackingId(TrackingId value) {
        this.trackingId = value;
    }

}
