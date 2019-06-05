
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CodAddTransportationChargesDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CodAddTransportationChargesDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateTypeBasis" type="{http://fedex.com/ws/ship/v23}RateTypeBasisType" minOccurs="0"/>
 *         &lt;element name="ChargeBasis" type="{http://fedex.com/ws/ship/v23}CodAddTransportationChargeBasisType" minOccurs="0"/>
 *         &lt;element name="ChargeBasisLevel" type="{http://fedex.com/ws/ship/v23}ChargeBasisLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodAddTransportationChargesDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "rateTypeBasis",
    "chargeBasis",
    "chargeBasisLevel"
})
public class CodAddTransportationChargesDetail {

    @XmlElement(name = "RateTypeBasis", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RateTypeBasisType rateTypeBasis;
    @XmlElement(name = "ChargeBasis", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CodAddTransportationChargeBasisType chargeBasis;
    @XmlElement(name = "ChargeBasisLevel", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ChargeBasisLevelType chargeBasisLevel;

    /**
     * 获取rateTypeBasis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateTypeBasisType }
     *     
     */
    public RateTypeBasisType getRateTypeBasis() {
        return rateTypeBasis;
    }

    /**
     * 设置rateTypeBasis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeBasisType }
     *     
     */
    public void setRateTypeBasis(RateTypeBasisType value) {
        this.rateTypeBasis = value;
    }

    /**
     * 获取chargeBasis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodAddTransportationChargeBasisType }
     *     
     */
    public CodAddTransportationChargeBasisType getChargeBasis() {
        return chargeBasis;
    }

    /**
     * 设置chargeBasis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodAddTransportationChargeBasisType }
     *     
     */
    public void setChargeBasis(CodAddTransportationChargeBasisType value) {
        this.chargeBasis = value;
    }

    /**
     * 获取chargeBasisLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChargeBasisLevelType }
     *     
     */
    public ChargeBasisLevelType getChargeBasisLevel() {
        return chargeBasisLevel;
    }

    /**
     * 设置chargeBasisLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBasisLevelType }
     *     
     */
    public void setChargeBasisLevel(ChargeBasisLevelType value) {
        this.chargeBasisLevel = value;
    }

}
