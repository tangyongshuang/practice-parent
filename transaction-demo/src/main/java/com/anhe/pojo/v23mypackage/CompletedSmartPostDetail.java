
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides reply information specific to SmartPost shipments.
 * 
 * <p>CompletedSmartPostDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedSmartPostDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickUpCarrier" type="{http://fedex.com/ws/ship/v23}CarrierCodeType" minOccurs="0"/>
 *         &lt;element name="Machinable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedSmartPostDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "pickUpCarrier",
    "machinable"
})
public class CompletedSmartPostDetail {

    @XmlElement(name = "PickUpCarrier", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CarrierCodeType pickUpCarrier;
    @XmlElement(name = "Machinable", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean machinable;

    /**
     * 获取pickUpCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierCodeType }
     *     
     */
    public CarrierCodeType getPickUpCarrier() {
        return pickUpCarrier;
    }

    /**
     * 设置pickUpCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierCodeType }
     *     
     */
    public void setPickUpCarrier(CarrierCodeType value) {
        this.pickUpCarrier = value;
    }

    /**
     * 获取machinable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMachinable() {
        return machinable;
    }

    /**
     * 设置machinable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMachinable(Boolean value) {
        this.machinable = value;
    }

}
