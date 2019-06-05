
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerImageUsage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerImageUsage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}CustomerImageUsageType" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://fedex.com/ws/ship/v23}ImageId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerImageUsage", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "id"
})
public class CustomerImageUsage {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CustomerImageUsageType type;
    @XmlElement(name = "Id", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ImageId id;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerImageUsageType }
     *     
     */
    public CustomerImageUsageType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerImageUsageType }
     *     
     */
    public void setType(CustomerImageUsageType value) {
        this.type = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImageId }
     *     
     */
    public ImageId getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImageId }
     *     
     */
    public void setId(ImageId value) {
        this.id = value;
    }

}
