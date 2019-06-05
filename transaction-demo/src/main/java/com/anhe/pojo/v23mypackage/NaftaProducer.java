
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NaftaProducer complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NaftaProducer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Producer" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaftaProducer", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "id",
    "producer"
})
public class NaftaProducer {

    @XmlElement(name = "Id", namespace = "http://fedex.com/ws/ship/v23")
    protected String id;
    @XmlElement(name = "Producer", namespace = "http://fedex.com/ws/ship/v23")
    protected Party producer;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * 获取producer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getProducer() {
        return producer;
    }

    /**
     * 设置producer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setProducer(Party value) {
        this.producer = value;
    }

}
