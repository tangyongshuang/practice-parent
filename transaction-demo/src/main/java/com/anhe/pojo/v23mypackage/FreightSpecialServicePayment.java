
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies which party will be responsible for payment of any surcharges for Freight special services for which split billing is allowed.
 * 
 * <p>FreightSpecialServicePayment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FreightSpecialServicePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialService" type="{http://fedex.com/ws/ship/v23}ShipmentSpecialServiceType" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://fedex.com/ws/ship/v23}FreightShipmentRoleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightSpecialServicePayment", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "specialService",
    "paymentType"
})
public class FreightSpecialServicePayment {

    @XmlElement(name = "SpecialService", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShipmentSpecialServiceType specialService;
    @XmlElement(name = "PaymentType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightShipmentRoleType paymentType;

    /**
     * 获取specialService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentSpecialServiceType }
     *     
     */
    public ShipmentSpecialServiceType getSpecialService() {
        return specialService;
    }

    /**
     * 设置specialService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentSpecialServiceType }
     *     
     */
    public void setSpecialService(ShipmentSpecialServiceType value) {
        this.specialService = value;
    }

    /**
     * 获取paymentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightShipmentRoleType }
     *     
     */
    public FreightShipmentRoleType getPaymentType() {
        return paymentType;
    }

    /**
     * 设置paymentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightShipmentRoleType }
     *     
     */
    public void setPaymentType(FreightShipmentRoleType value) {
        this.paymentType = value;
    }

}
