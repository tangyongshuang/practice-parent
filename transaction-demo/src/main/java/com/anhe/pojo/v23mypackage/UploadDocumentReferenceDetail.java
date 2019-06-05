
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UploadDocumentReferenceDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UploadDocumentReferenceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentProducer" type="{http://fedex.com/ws/ship/v23}UploadDocumentProducerType" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://fedex.com/ws/ship/v23}UploadDocumentType" minOccurs="0"/>
 *         &lt;element name="DocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentIdProducer" type="{http://fedex.com/ws/ship/v23}UploadDocumentIdProducer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentReferenceDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "lineNumber",
    "customerReference",
    "description",
    "documentProducer",
    "documentType",
    "documentId",
    "documentIdProducer"
})
public class UploadDocumentReferenceDetail {

    @XmlElement(name = "LineNumber", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger lineNumber;
    @XmlElement(name = "CustomerReference", namespace = "http://fedex.com/ws/ship/v23")
    protected String customerReference;
    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected String description;
    @XmlElement(name = "DocumentProducer", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected UploadDocumentProducerType documentProducer;
    @XmlElement(name = "DocumentType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected UploadDocumentType documentType;
    @XmlElement(name = "DocumentId", namespace = "http://fedex.com/ws/ship/v23")
    protected String documentId;
    @XmlElement(name = "DocumentIdProducer", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected UploadDocumentIdProducer documentIdProducer;

    /**
     * 获取lineNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * 设置lineNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * 获取customerReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * 设置customerReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
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
     * 获取documentProducer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentProducerType }
     *     
     */
    public UploadDocumentProducerType getDocumentProducer() {
        return documentProducer;
    }

    /**
     * 设置documentProducer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentProducerType }
     *     
     */
    public void setDocumentProducer(UploadDocumentProducerType value) {
        this.documentProducer = value;
    }

    /**
     * 获取documentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentType }
     *     
     */
    public UploadDocumentType getDocumentType() {
        return documentType;
    }

    /**
     * 设置documentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentType }
     *     
     */
    public void setDocumentType(UploadDocumentType value) {
        this.documentType = value;
    }

    /**
     * 获取documentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * 设置documentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * 获取documentIdProducer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UploadDocumentIdProducer }
     *     
     */
    public UploadDocumentIdProducer getDocumentIdProducer() {
        return documentIdProducer;
    }

    /**
     * 设置documentIdProducer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UploadDocumentIdProducer }
     *     
     */
    public void setDocumentIdProducer(UploadDocumentIdProducer value) {
        this.documentIdProducer = value;
    }

}
