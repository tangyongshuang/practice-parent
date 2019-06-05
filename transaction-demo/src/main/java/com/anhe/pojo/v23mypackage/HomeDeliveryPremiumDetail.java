
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>HomeDeliveryPremiumDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HomeDeliveryPremiumDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HomeDeliveryPremiumType" type="{http://fedex.com/ws/ship/v23}HomeDeliveryPremiumType"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HomeDeliveryPremiumDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "homeDeliveryPremiumType",
    "date",
    "phoneNumber"
})
public class HomeDeliveryPremiumDetail {

    @XmlElement(name = "HomeDeliveryPremiumType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected HomeDeliveryPremiumType homeDeliveryPremiumType;
    @XmlElement(name = "Date", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "PhoneNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String phoneNumber;

    /**
     * 获取homeDeliveryPremiumType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HomeDeliveryPremiumType }
     *     
     */
    public HomeDeliveryPremiumType getHomeDeliveryPremiumType() {
        return homeDeliveryPremiumType;
    }

    /**
     * 设置homeDeliveryPremiumType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HomeDeliveryPremiumType }
     *     
     */
    public void setHomeDeliveryPremiumType(HomeDeliveryPremiumType value) {
        this.homeDeliveryPremiumType = value;
    }

    /**
     * 获取date属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * 获取phoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置phoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
