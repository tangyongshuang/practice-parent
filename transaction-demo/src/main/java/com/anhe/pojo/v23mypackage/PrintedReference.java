
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a reference identifier printed on Freight bills of lading
 * 
 * <p>PrintedReference complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PrintedReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}PrintedReferenceType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintedReference", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "value"
})
public class PrintedReference {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PrintedReferenceType type;
    @XmlElement(name = "Value", namespace = "http://fedex.com/ws/ship/v23")
    protected String value;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrintedReferenceType }
     *     
     */
    public PrintedReferenceType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrintedReferenceType }
     *     
     */
    public void setType(PrintedReferenceType value) {
        this.type = value;
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
