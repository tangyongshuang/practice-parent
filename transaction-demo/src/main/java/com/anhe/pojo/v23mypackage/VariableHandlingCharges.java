
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VariableHandlingCharges complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VariableHandlingCharges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariableHandlingCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="FixedVariableHandlingCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="PercentVariableHandlingCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="TotalCustomerCharge" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableHandlingCharges", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "variableHandlingCharge",
    "fixedVariableHandlingCharge",
    "percentVariableHandlingCharge",
    "totalCustomerCharge"
})
public class VariableHandlingCharges {

    @XmlElement(name = "VariableHandlingCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money variableHandlingCharge;
    @XmlElement(name = "FixedVariableHandlingCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money fixedVariableHandlingCharge;
    @XmlElement(name = "PercentVariableHandlingCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money percentVariableHandlingCharge;
    @XmlElement(name = "TotalCustomerCharge", namespace = "http://fedex.com/ws/ship/v23")
    protected Money totalCustomerCharge;

    /**
     * 获取variableHandlingCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getVariableHandlingCharge() {
        return variableHandlingCharge;
    }

    /**
     * 设置variableHandlingCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setVariableHandlingCharge(Money value) {
        this.variableHandlingCharge = value;
    }

    /**
     * 获取fixedVariableHandlingCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFixedVariableHandlingCharge() {
        return fixedVariableHandlingCharge;
    }

    /**
     * 设置fixedVariableHandlingCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFixedVariableHandlingCharge(Money value) {
        this.fixedVariableHandlingCharge = value;
    }

    /**
     * 获取percentVariableHandlingCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPercentVariableHandlingCharge() {
        return percentVariableHandlingCharge;
    }

    /**
     * 设置percentVariableHandlingCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPercentVariableHandlingCharge(Money value) {
        this.percentVariableHandlingCharge = value;
    }

    /**
     * 获取totalCustomerCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalCustomerCharge() {
        return totalCustomerCharge;
    }

    /**
     * 设置totalCustomerCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalCustomerCharge(Money value) {
        this.totalCustomerCharge = value;
    }

}
