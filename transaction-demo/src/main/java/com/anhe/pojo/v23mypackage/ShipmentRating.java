
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This class groups together all shipment-level rate data (across all rate types) as part of the response to a shipping request, which groups shipment-level data together and groups package-level data by package.
 * 
 * <p>ShipmentRating complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShipmentRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualRateType" type="{http://fedex.com/ws/ship/v23}ReturnedRateType" minOccurs="0"/>
 *         &lt;element name="EffectiveNetDiscount" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="ShipmentRateDetails" type="{http://fedex.com/ws/ship/v23}ShipmentRateDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentRating", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "actualRateType",
    "effectiveNetDiscount",
    "shipmentRateDetails"
})
public class ShipmentRating {

    @XmlElement(name = "ActualRateType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ReturnedRateType actualRateType;
    @XmlElement(name = "EffectiveNetDiscount", namespace = "http://fedex.com/ws/ship/v23")
    protected Money effectiveNetDiscount;
    @XmlElement(name = "ShipmentRateDetails", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ShipmentRateDetail> shipmentRateDetails;

    /**
     * 获取actualRateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnedRateType }
     *     
     */
    public ReturnedRateType getActualRateType() {
        return actualRateType;
    }

    /**
     * 设置actualRateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnedRateType }
     *     
     */
    public void setActualRateType(ReturnedRateType value) {
        this.actualRateType = value;
    }

    /**
     * 获取effectiveNetDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getEffectiveNetDiscount() {
        return effectiveNetDiscount;
    }

    /**
     * 设置effectiveNetDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setEffectiveNetDiscount(Money value) {
        this.effectiveNetDiscount = value;
    }

    /**
     * Gets the value of the shipmentRateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentRateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentRateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentRateDetail }
     * 
     * 
     */
    public List<ShipmentRateDetail> getShipmentRateDetails() {
        if (shipmentRateDetails == null) {
            shipmentRateDetails = new ArrayList<ShipmentRateDetail>();
        }
        return this.shipmentRateDetails;
    }

}
