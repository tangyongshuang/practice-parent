
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LiabilityCoverageDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LiabilityCoverageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverageType" type="{http://fedex.com/ws/ship/v23}LiabilityCoverageType" minOccurs="0"/>
 *         &lt;element name="CoverageAmount" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiabilityCoverageDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "coverageType",
    "coverageAmount"
})
public class LiabilityCoverageDetail {

    @XmlElement(name = "CoverageType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected LiabilityCoverageType coverageType;
    @XmlElement(name = "CoverageAmount", namespace = "http://fedex.com/ws/ship/v23")
    protected Money coverageAmount;

    /**
     * 获取coverageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LiabilityCoverageType }
     *     
     */
    public LiabilityCoverageType getCoverageType() {
        return coverageType;
    }

    /**
     * 设置coverageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityCoverageType }
     *     
     */
    public void setCoverageType(LiabilityCoverageType value) {
        this.coverageType = value;
    }

    /**
     * 获取coverageAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCoverageAmount() {
        return coverageAmount;
    }

    /**
     * 设置coverageAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCoverageAmount(Money value) {
        this.coverageAmount = value;
    }

}
