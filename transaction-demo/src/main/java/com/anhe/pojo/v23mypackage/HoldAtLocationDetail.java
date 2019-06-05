
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HoldAtLocationDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HoldAtLocationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocationContactAndAddress" type="{http://fedex.com/ws/ship/v23}ContactAndAddress" minOccurs="0"/>
 *         &lt;element name="LocationType" type="{http://fedex.com/ws/ship/v23}FedExLocationType" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldAtLocationDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "phoneNumber",
    "locationContactAndAddress",
    "locationType",
    "locationId"
})
public class HoldAtLocationDetail {

    @XmlElement(name = "PhoneNumber", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String phoneNumber;
    @XmlElement(name = "LocationContactAndAddress", namespace = "http://fedex.com/ws/ship/v23")
    protected ContactAndAddress locationContactAndAddress;
    @XmlElement(name = "LocationType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FedExLocationType locationType;
    @XmlElement(name = "LocationId", namespace = "http://fedex.com/ws/ship/v23")
    protected String locationId;

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

    /**
     * 获取locationContactAndAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getLocationContactAndAddress() {
        return locationContactAndAddress;
    }

    /**
     * 设置locationContactAndAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setLocationContactAndAddress(ContactAndAddress value) {
        this.locationContactAndAddress = value;
    }

    /**
     * 获取locationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FedExLocationType }
     *     
     */
    public FedExLocationType getLocationType() {
        return locationType;
    }

    /**
     * 设置locationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FedExLocationType }
     *     
     */
    public void setLocationType(FedExLocationType value) {
        this.locationType = value;
    }

    /**
     * 获取locationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * 设置locationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

}
