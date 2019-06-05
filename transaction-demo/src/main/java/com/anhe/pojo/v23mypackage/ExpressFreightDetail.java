
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExpressFreightDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExpressFreightDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackingListEnclosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippersLoadAndCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BookingConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressFreightDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "packingListEnclosed",
    "shippersLoadAndCount",
    "bookingConfirmationNumber"
})
public class ExpressFreightDetail {

    @XmlElement(name = "PackingListEnclosed", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean packingListEnclosed;
    @XmlElement(name = "ShippersLoadAndCount", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger shippersLoadAndCount;
    @XmlElement(name = "BookingConfirmationNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String bookingConfirmationNumber;

    /**
     * 获取packingListEnclosed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPackingListEnclosed() {
        return packingListEnclosed;
    }

    /**
     * 设置packingListEnclosed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPackingListEnclosed(Boolean value) {
        this.packingListEnclosed = value;
    }

    /**
     * 获取shippersLoadAndCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShippersLoadAndCount() {
        return shippersLoadAndCount;
    }

    /**
     * 设置shippersLoadAndCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShippersLoadAndCount(BigInteger value) {
        this.shippersLoadAndCount = value;
    }

    /**
     * 获取bookingConfirmationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingConfirmationNumber() {
        return bookingConfirmationNumber;
    }

    /**
     * 设置bookingConfirmationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingConfirmationNumber(String value) {
        this.bookingConfirmationNumber = value;
    }

}
