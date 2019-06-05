
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContentRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContentRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivedQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentRecord", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "partNumber",
    "itemNumber",
    "receivedQuantity",
    "description"
})
public class ContentRecord {

    @XmlElement(name = "PartNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String partNumber;
    @XmlElement(name = "ItemNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String itemNumber;
    @XmlElement(name = "ReceivedQuantity", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger receivedQuantity;
    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected String description;

    /**
     * 获取partNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * 设置partNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * 获取itemNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * 设置itemNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * 获取receivedQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReceivedQuantity() {
        return receivedQuantity;
    }

    /**
     * 设置receivedQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReceivedQuantity(BigInteger value) {
        this.receivedQuantity = value;
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

}
