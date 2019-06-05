
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CustomDeliveryWindowDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomDeliveryWindowDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}CustomDeliveryWindowType" minOccurs="0"/>
 *         &lt;element name="RequestTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="RequestRange" type="{http://fedex.com/ws/ship/v23}DateRange" minOccurs="0"/>
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomDeliveryWindowDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "requestTime",
    "requestRange",
    "requestDate"
})
public class CustomDeliveryWindowDetail {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CustomDeliveryWindowType type;
    @XmlElement(name = "RequestTime", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar requestTime;
    @XmlElement(name = "RequestRange", namespace = "http://fedex.com/ws/ship/v23")
    protected DateRange requestRange;
    @XmlElement(name = "RequestDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomDeliveryWindowType }
     *     
     */
    public CustomDeliveryWindowType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDeliveryWindowType }
     *     
     */
    public void setType(CustomDeliveryWindowType value) {
        this.type = value;
    }

    /**
     * 获取requestTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTime() {
        return requestTime;
    }

    /**
     * 设置requestTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTime(XMLGregorianCalendar value) {
        this.requestTime = value;
    }

    /**
     * 获取requestRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getRequestRange() {
        return requestRange;
    }

    /**
     * 设置requestRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setRequestRange(DateRange value) {
        this.requestRange = value;
    }

    /**
     * 获取requestDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * 设置requestDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

}
