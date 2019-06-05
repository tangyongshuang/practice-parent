
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data required to produce a Certificate of Origin document. Remaining content (business data) to be defined once requirements have been completed.
 * 
 * <p>NaftaCertificateOfOriginDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NaftaCertificateOfOriginDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Format" type="{http://fedex.com/ws/ship/v23}ShippingDocumentFormat" minOccurs="0"/>
 *         &lt;element name="BlanketPeriod" type="{http://fedex.com/ws/ship/v23}DateRange" minOccurs="0"/>
 *         &lt;element name="ImporterSpecification" type="{http://fedex.com/ws/ship/v23}NaftaImporterSpecificationType" minOccurs="0"/>
 *         &lt;element name="SignatureContact" type="{http://fedex.com/ws/ship/v23}Contact" minOccurs="0"/>
 *         &lt;element name="ProducerSpecification" type="{http://fedex.com/ws/ship/v23}NaftaProducerSpecificationType" minOccurs="0"/>
 *         &lt;element name="Producers" type="{http://fedex.com/ws/ship/v23}NaftaProducer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerImageUsages" type="{http://fedex.com/ws/ship/v23}CustomerImageUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaftaCertificateOfOriginDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "format",
    "blanketPeriod",
    "importerSpecification",
    "signatureContact",
    "producerSpecification",
    "producers",
    "customerImageUsages"
})
public class NaftaCertificateOfOriginDetail {

    @XmlElement(name = "Format", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocumentFormat format;
    @XmlElement(name = "BlanketPeriod", namespace = "http://fedex.com/ws/ship/v23")
    protected DateRange blanketPeriod;
    @XmlElement(name = "ImporterSpecification", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected NaftaImporterSpecificationType importerSpecification;
    @XmlElement(name = "SignatureContact", namespace = "http://fedex.com/ws/ship/v23")
    protected Contact signatureContact;
    @XmlElement(name = "ProducerSpecification", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected NaftaProducerSpecificationType producerSpecification;
    @XmlElement(name = "Producers", namespace = "http://fedex.com/ws/ship/v23")
    protected List<NaftaProducer> producers;
    @XmlElement(name = "CustomerImageUsages", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomerImageUsage> customerImageUsages;

    /**
     * 获取format属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public ShippingDocumentFormat getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentFormat }
     *     
     */
    public void setFormat(ShippingDocumentFormat value) {
        this.format = value;
    }

    /**
     * 获取blanketPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getBlanketPeriod() {
        return blanketPeriod;
    }

    /**
     * 设置blanketPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setBlanketPeriod(DateRange value) {
        this.blanketPeriod = value;
    }

    /**
     * 获取importerSpecification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NaftaImporterSpecificationType }
     *     
     */
    public NaftaImporterSpecificationType getImporterSpecification() {
        return importerSpecification;
    }

    /**
     * 设置importerSpecification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaImporterSpecificationType }
     *     
     */
    public void setImporterSpecification(NaftaImporterSpecificationType value) {
        this.importerSpecification = value;
    }

    /**
     * 获取signatureContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getSignatureContact() {
        return signatureContact;
    }

    /**
     * 设置signatureContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setSignatureContact(Contact value) {
        this.signatureContact = value;
    }

    /**
     * 获取producerSpecification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NaftaProducerSpecificationType }
     *     
     */
    public NaftaProducerSpecificationType getProducerSpecification() {
        return producerSpecification;
    }

    /**
     * 设置producerSpecification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaProducerSpecificationType }
     *     
     */
    public void setProducerSpecification(NaftaProducerSpecificationType value) {
        this.producerSpecification = value;
    }

    /**
     * Gets the value of the producers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaftaProducer }
     * 
     * 
     */
    public List<NaftaProducer> getProducers() {
        if (producers == null) {
            producers = new ArrayList<NaftaProducer>();
        }
        return this.producers;
    }

    /**
     * Gets the value of the customerImageUsages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerImageUsages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerImageUsages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerImageUsage }
     * 
     * 
     */
    public List<CustomerImageUsage> getCustomerImageUsages() {
        if (customerImageUsages == null) {
            customerImageUsages = new ArrayList<CustomerImageUsage>();
        }
        return this.customerImageUsages;
    }

}
