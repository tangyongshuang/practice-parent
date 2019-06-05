
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TaxpayerIdentification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxpayerIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TinType" type="{http://fedex.com/ws/ship/v23}TinType"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxpayerIdentification", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "tinType",
    "number",
    "usage",
    "effectiveDate",
    "expirationDate"
})
public class TaxpayerIdentification {

    @XmlElement(name = "TinType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected TinType tinType;
    @XmlElement(name = "Number", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String number;
    @XmlElement(name = "Usage", namespace = "http://fedex.com/ws/ship/v23")
    protected String usage;
    @XmlElement(name = "EffectiveDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "ExpirationDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;

    /**
     * 获取tinType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TinType }
     *     
     */
    public TinType getTinType() {
        return tinType;
    }

    /**
     * 设置tinType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TinType }
     *     
     */
    public void setTinType(TinType value) {
        this.tinType = value;
    }

    /**
     * 获取number属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * 获取usage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * 设置usage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expirationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * 设置expirationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

}
