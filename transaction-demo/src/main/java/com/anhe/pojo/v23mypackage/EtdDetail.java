
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Electronic Trade document references used with the ETD special service.
 * 
 * <p>EtdDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EtdDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{http://fedex.com/ws/ship/v23}EtdAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestedDocumentCopies" type="{http://fedex.com/ws/ship/v23}RequestedShippingDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DocumentReferences" type="{http://fedex.com/ws/ship/v23}UploadDocumentReferenceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EtdDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "attributes",
    "requestedDocumentCopies",
    "documentReferences"
})
public class EtdDetail {

    @XmlElement(name = "Attributes", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<EtdAttributeType> attributes;
    @XmlElement(name = "RequestedDocumentCopies", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<RequestedShippingDocumentType> requestedDocumentCopies;
    @XmlElement(name = "DocumentReferences", namespace = "http://fedex.com/ws/ship/v23")
    protected List<UploadDocumentReferenceDetail> documentReferences;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EtdAttributeType }
     * 
     * 
     */
    public List<EtdAttributeType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<EtdAttributeType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the requestedDocumentCopies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedDocumentCopies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedDocumentCopies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedShippingDocumentType }
     * 
     * 
     */
    public List<RequestedShippingDocumentType> getRequestedDocumentCopies() {
        if (requestedDocumentCopies == null) {
            requestedDocumentCopies = new ArrayList<RequestedShippingDocumentType>();
        }
        return this.requestedDocumentCopies;
    }

    /**
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UploadDocumentReferenceDetail }
     * 
     * 
     */
    public List<UploadDocumentReferenceDetail> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<UploadDocumentReferenceDetail>();
        }
        return this.documentReferences;
    }

}
