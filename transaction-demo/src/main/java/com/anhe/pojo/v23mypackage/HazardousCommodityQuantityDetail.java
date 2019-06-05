
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies amount and units for quantity of hazardous commodities.
 * 
 * <p>HazardousCommodityQuantityDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HazardousCommodityQuantityDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityType" type="{http://fedex.com/ws/ship/v23}HazardousCommodityQuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousCommodityQuantityDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "amount",
    "units",
    "quantityType"
})
public class HazardousCommodityQuantityDetail {

    @XmlElement(name = "Amount", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal amount;
    @XmlElement(name = "Units", namespace = "http://fedex.com/ws/ship/v23")
    protected String units;
    @XmlElement(name = "QuantityType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected HazardousCommodityQuantityType quantityType;

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * 获取units属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * 设置units属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * 获取quantityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityQuantityType }
     *     
     */
    public HazardousCommodityQuantityType getQuantityType() {
        return quantityType;
    }

    /**
     * 设置quantityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityQuantityType }
     *     
     */
    public void setQuantityType(HazardousCommodityQuantityType value) {
        this.quantityType = value;
    }

}
