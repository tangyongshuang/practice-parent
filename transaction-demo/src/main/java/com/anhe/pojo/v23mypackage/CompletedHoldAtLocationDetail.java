
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompletedHoldAtLocationDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedHoldAtLocationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HoldingLocation" type="{http://fedex.com/ws/ship/v23}ContactAndAddress" minOccurs="0"/>
 *         &lt;element name="HoldingLocationType" type="{http://fedex.com/ws/ship/v23}FedExLocationType" minOccurs="0"/>
 *         &lt;element name="HoldingLocationTypeForDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedHoldAtLocationDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "holdingLocation",
    "holdingLocationType",
    "holdingLocationTypeForDisplay"
})
public class CompletedHoldAtLocationDetail {

    @XmlElement(name = "HoldingLocation", namespace = "http://fedex.com/ws/ship/v23")
    protected ContactAndAddress holdingLocation;
    @XmlElement(name = "HoldingLocationType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FedExLocationType holdingLocationType;
    @XmlElement(name = "HoldingLocationTypeForDisplay", namespace = "http://fedex.com/ws/ship/v23")
    protected String holdingLocationTypeForDisplay;

    /**
     * 获取holdingLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getHoldingLocation() {
        return holdingLocation;
    }

    /**
     * 设置holdingLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setHoldingLocation(ContactAndAddress value) {
        this.holdingLocation = value;
    }

    /**
     * 获取holdingLocationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FedExLocationType }
     *     
     */
    public FedExLocationType getHoldingLocationType() {
        return holdingLocationType;
    }

    /**
     * 设置holdingLocationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FedExLocationType }
     *     
     */
    public void setHoldingLocationType(FedExLocationType value) {
        this.holdingLocationType = value;
    }

    /**
     * 获取holdingLocationTypeForDisplay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldingLocationTypeForDisplay() {
        return holdingLocationTypeForDisplay;
    }

    /**
     * 设置holdingLocationTypeForDisplay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldingLocationTypeForDisplay(String value) {
        this.holdingLocationTypeForDisplay = value;
    }

}
