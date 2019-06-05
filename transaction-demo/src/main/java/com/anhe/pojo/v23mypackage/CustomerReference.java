
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerReference complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerReferenceType" type="{http://fedex.com/ws/ship/v23}CustomerReferenceType"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReference", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "customerReferenceType",
    "value"
})
public class CustomerReference {

    @XmlElement(name = "CustomerReferenceType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerReferenceType customerReferenceType;
    @XmlElement(name = "Value", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String value;

    /**
     * 获取customerReferenceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerReferenceType }
     *     
     */
    public CustomerReferenceType getCustomerReferenceType() {
        return customerReferenceType;
    }

    /**
     * 设置customerReferenceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReferenceType }
     *     
     */
    public void setCustomerReferenceType(CustomerReferenceType value) {
        this.customerReferenceType = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
