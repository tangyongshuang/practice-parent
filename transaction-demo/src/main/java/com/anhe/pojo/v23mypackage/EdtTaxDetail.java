
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>EdtTaxDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EdtTaxDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxType" type="{http://fedex.com/ws/ship/v23}EdtTaxType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxableValue" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdtTaxDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "taxType",
    "effectiveDate",
    "name",
    "taxableValue",
    "description",
    "formula",
    "amount"
})
public class EdtTaxDetail {

    @XmlElement(name = "TaxType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected EdtTaxType taxType;
    @XmlElement(name = "EffectiveDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Name", namespace = "http://fedex.com/ws/ship/v23")
    protected String name;
    @XmlElement(name = "TaxableValue", namespace = "http://fedex.com/ws/ship/v23")
    protected Money taxableValue;
    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected String description;
    @XmlElement(name = "Formula", namespace = "http://fedex.com/ws/ship/v23")
    protected String formula;
    @XmlElement(name = "Amount", namespace = "http://fedex.com/ws/ship/v23")
    protected Money amount;

    /**
     * 获取taxType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EdtTaxType }
     *     
     */
    public EdtTaxType getTaxType() {
        return taxType;
    }

    /**
     * 设置taxType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EdtTaxType }
     *     
     */
    public void setTaxType(EdtTaxType value) {
        this.taxType = value;
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
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取taxableValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTaxableValue() {
        return taxableValue;
    }

    /**
     * 设置taxableValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTaxableValue(Money value) {
        this.taxableValue = value;
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
     * 获取formula属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * 设置formula属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
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
