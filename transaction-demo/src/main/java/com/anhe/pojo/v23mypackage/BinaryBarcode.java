
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Each instance of this data type represents a barcode whose content must be represented as binary data (i.e. not ASCII text).
 * 
 * <p>BinaryBarcode complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BinaryBarcode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}BinaryBarcodeType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryBarcode", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "value"
})
public class BinaryBarcode {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected BinaryBarcodeType type;
    @XmlElement(name = "Value", namespace = "http://fedex.com/ws/ship/v23")
    protected byte[] value;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BinaryBarcodeType }
     *     
     */
    public BinaryBarcodeType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryBarcodeType }
     *     
     */
    public void setType(BinaryBarcodeType value) {
        this.type = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

}
