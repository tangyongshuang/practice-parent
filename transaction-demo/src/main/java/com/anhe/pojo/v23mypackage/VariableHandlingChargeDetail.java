
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This definition of variable handling charge detail is intended for use in Jan 2011 corp load.
 * 
 * <p>VariableHandlingChargeDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VariableHandlingChargeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FixedValue" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="PercentValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RateElementBasis" type="{http://fedex.com/ws/ship/v23}RateElementBasisType" minOccurs="0"/>
 *         &lt;element name="RateTypeBasis" type="{http://fedex.com/ws/ship/v23}RateTypeBasisType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableHandlingChargeDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "fixedValue",
    "percentValue",
    "rateElementBasis",
    "rateTypeBasis"
})
public class VariableHandlingChargeDetail {

    @XmlElement(name = "FixedValue", namespace = "http://fedex.com/ws/ship/v23")
    protected Money fixedValue;
    @XmlElement(name = "PercentValue", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal percentValue;
    @XmlElement(name = "RateElementBasis", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RateElementBasisType rateElementBasis;
    @XmlElement(name = "RateTypeBasis", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RateTypeBasisType rateTypeBasis;

    /**
     * 获取fixedValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFixedValue() {
        return fixedValue;
    }

    /**
     * 设置fixedValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFixedValue(Money value) {
        this.fixedValue = value;
    }

    /**
     * 获取percentValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentValue() {
        return percentValue;
    }

    /**
     * 设置percentValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentValue(BigDecimal value) {
        this.percentValue = value;
    }

    /**
     * 获取rateElementBasis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RateElementBasisType }
     *     
     */
    public RateElementBasisType getRateElementBasis() {
        return rateElementBasis;
    }

    /**
     * 设置rateElementBasis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RateElementBasisType }
     *     
     */
    public void setRateElementBasis(RateElementBasisType value) {
        this.rateElementBasis = value;
    }

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

}
