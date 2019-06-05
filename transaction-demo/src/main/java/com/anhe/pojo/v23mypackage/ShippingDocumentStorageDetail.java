
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies how to store shipping documents.
 * 
 * <p>ShippingDocumentStorageDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentStorageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}ShippingDocumentStorageDetailType" minOccurs="0"/>
 *         &lt;element name="FilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileNaming" type="{http://fedex.com/ws/ship/v23}ShippingDocumentNamingType" minOccurs="0"/>
 *         &lt;element name="FileSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentStorageDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "filePath",
    "fileNaming",
    "fileSuffix"
})
public class ShippingDocumentStorageDetail {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentStorageDetailType type;
    @XmlElement(name = "FilePath", namespace = "http://fedex.com/ws/ship/v23")
    protected String filePath;
    @XmlElement(name = "FileNaming", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentNamingType fileNaming;
    @XmlElement(name = "FileSuffix", namespace = "http://fedex.com/ws/ship/v23")
    protected String fileSuffix;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentStorageDetailType }
     *     
     */
    public ShippingDocumentStorageDetailType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentStorageDetailType }
     *     
     */
    public void setType(ShippingDocumentStorageDetailType value) {
        this.type = value;
    }

    /**
     * 获取filePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置filePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * 获取fileNaming属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentNamingType }
     *     
     */
    public ShippingDocumentNamingType getFileNaming() {
        return fileNaming;
    }

    /**
     * 设置fileNaming属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentNamingType }
     *     
     */
    public void setFileNaming(ShippingDocumentNamingType value) {
        this.fileNaming = value;
    }

    /**
     * 获取fileSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSuffix() {
        return fileSuffix;
    }

    /**
     * 设置fileSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSuffix(String value) {
        this.fileSuffix = value;
    }

}
