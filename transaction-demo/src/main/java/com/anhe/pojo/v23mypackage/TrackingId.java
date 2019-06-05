
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrackingId complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrackingId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackingIdType" type="{http://fedex.com/ws/ship/v23}TrackingIdType" minOccurs="0"/>
 *         &lt;element name="FormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UspsApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingId", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "trackingIdType",
    "formId",
    "uspsApplicationId",
    "trackingNumber"
})
public class TrackingId {

    @XmlElement(name = "TrackingIdType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected TrackingIdType trackingIdType;
    @XmlElement(name = "FormId", namespace = "http://fedex.com/ws/ship/v23")
    protected String formId;
    @XmlElement(name = "UspsApplicationId", namespace = "http://fedex.com/ws/ship/v23")
    protected String uspsApplicationId;
    @XmlElement(name = "TrackingNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String trackingNumber;

    /**
     * 获取trackingIdType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrackingIdType }
     *     
     */
    public TrackingIdType getTrackingIdType() {
        return trackingIdType;
    }

    /**
     * 设置trackingIdType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingIdType }
     *     
     */
    public void setTrackingIdType(TrackingIdType value) {
        this.trackingIdType = value;
    }

    /**
     * 获取formId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormId() {
        return formId;
    }

    /**
     * 设置formId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormId(String value) {
        this.formId = value;
    }

    /**
     * 获取uspsApplicationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUspsApplicationId() {
        return uspsApplicationId;
    }

    /**
     * 设置uspsApplicationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUspsApplicationId(String value) {
        this.uspsApplicationId = value;
    }

    /**
     * 获取trackingNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * 设置trackingNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

}
