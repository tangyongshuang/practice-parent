
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BrokerDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BrokerDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}BrokerType" minOccurs="0"/>
 *         &lt;element name="Broker" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokerDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "broker"
})
public class BrokerDetail {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected BrokerType type;
    @XmlElement(name = "Broker", namespace = "http://fedex.com/ws/ship/v23")
    protected Party broker;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BrokerType }
     *     
     */
    public BrokerType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerType }
     *     
     */
    public void setType(BrokerType value) {
        this.type = value;
    }

    /**
     * 获取broker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getBroker() {
        return broker;
    }

    /**
     * 设置broker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setBroker(Party value) {
        this.broker = value;
    }

}
