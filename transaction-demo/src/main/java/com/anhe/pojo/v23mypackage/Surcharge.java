
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Surcharge complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Surcharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SurchargeType" type="{http://fedex.com/ws/ship/v23}SurchargeType" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://fedex.com/ws/ship/v23}SurchargeLevelType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://fedex.com/ws/ship/v23}Money"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Surcharge", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "surchargeType",
    "level",
    "description",
    "amount"
})
public class Surcharge {

    @XmlElement(name = "SurchargeType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected SurchargeType surchargeType;
    @XmlElement(name = "Level", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected SurchargeLevelType level;
    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected String description;
    @XmlElement(name = "Amount", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected Money amount;

    /**
     * 获取surchargeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SurchargeType }
     *     
     */
    public SurchargeType getSurchargeType() {
        return surchargeType;
    }

    /**
     * 设置surchargeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeType }
     *     
     */
    public void setSurchargeType(SurchargeType value) {
        this.surchargeType = value;
    }

    /**
     * 获取level属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SurchargeLevelType }
     *     
     */
    public SurchargeLevelType getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeLevelType }
     *     
     */
    public void setLevel(SurchargeLevelType value) {
        this.level = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmount(Money value) {
        this.amount = value;
    }

}
