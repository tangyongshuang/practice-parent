
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This class describes the pickup characteristics of a shipment (e.g. for use in a tag request).
 * 
 * <p>PickupDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PickupDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReadyDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LatestPickupDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CourierInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{http://fedex.com/ws/ship/v23}PickupRequestType" minOccurs="0"/>
 *         &lt;element name="RequestSource" type="{http://fedex.com/ws/ship/v23}PickupRequestSourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "readyDateTime",
    "latestPickupDateTime",
    "courierInstructions",
    "requestType",
    "requestSource"
})
public class PickupDetail {

    @XmlElement(name = "ReadyDateTime", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar readyDateTime;
    @XmlElement(name = "LatestPickupDateTime", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestPickupDateTime;
    @XmlElement(name = "CourierInstructions", namespace = "http://fedex.com/ws/ship/v23")
    protected String courierInstructions;
    @XmlElement(name = "RequestType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PickupRequestType requestType;
    @XmlElement(name = "RequestSource", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PickupRequestSourceType requestSource;

    /**
     * 获取readyDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReadyDateTime() {
        return readyDateTime;
    }

    /**
     * 设置readyDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReadyDateTime(XMLGregorianCalendar value) {
        this.readyDateTime = value;
    }

    /**
     * 获取latestPickupDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestPickupDateTime() {
        return latestPickupDateTime;
    }

    /**
     * 设置latestPickupDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestPickupDateTime(XMLGregorianCalendar value) {
        this.latestPickupDateTime = value;
    }

    /**
     * 获取courierInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierInstructions() {
        return courierInstructions;
    }

    /**
     * 设置courierInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierInstructions(String value) {
        this.courierInstructions = value;
    }

    /**
     * 获取requestType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PickupRequestType }
     *     
     */
    public PickupRequestType getRequestType() {
        return requestType;
    }

    /**
     * 设置requestType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PickupRequestType }
     *     
     */
    public void setRequestType(PickupRequestType value) {
        this.requestType = value;
    }

    /**
     * 获取requestSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PickupRequestSourceType }
     *     
     */
    public PickupRequestSourceType getRequestSource() {
        return requestSource;
    }

    /**
     * 设置requestSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PickupRequestSourceType }
     *     
     */
    public void setRequestSource(PickupRequestSourceType value) {
        this.requestSource = value;
    }

}
