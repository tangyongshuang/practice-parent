
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides reply information specific to a tag request.
 * 
 * <p>CompletedTagDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedTagDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccessTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="CutoffTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryCommitment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DispatchDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedTagDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "confirmationNumber",
    "accessTime",
    "cutoffTime",
    "location",
    "deliveryCommitment",
    "dispatchDate"
})
public class CompletedTagDetail {

    @XmlElement(name = "ConfirmationNumber", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String confirmationNumber;
    @XmlElement(name = "AccessTime", namespace = "http://fedex.com/ws/ship/v23")
    protected Duration accessTime;
    @XmlElement(name = "CutoffTime", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar cutoffTime;
    @XmlElement(name = "Location", namespace = "http://fedex.com/ws/ship/v23")
    protected String location;
    @XmlElement(name = "DeliveryCommitment", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryCommitment;
    @XmlElement(name = "DispatchDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dispatchDate;

    /**
     * 获取confirmationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * 设置confirmationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationNumber(String value) {
        this.confirmationNumber = value;
    }

    /**
     * 获取accessTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAccessTime() {
        return accessTime;
    }

    /**
     * 设置accessTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAccessTime(Duration value) {
        this.accessTime = value;
    }

    /**
     * 获取cutoffTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutoffTime() {
        return cutoffTime;
    }

    /**
     * 设置cutoffTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutoffTime(XMLGregorianCalendar value) {
        this.cutoffTime = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * 获取deliveryCommitment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryCommitment() {
        return deliveryCommitment;
    }

    /**
     * 设置deliveryCommitment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryCommitment(XMLGregorianCalendar value) {
        this.deliveryCommitment = value;
    }

    /**
     * 获取dispatchDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispatchDate() {
        return dispatchDate;
    }

    /**
     * 设置dispatchDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispatchDate(XMLGregorianCalendar value) {
        this.dispatchDate = value;
    }

}
