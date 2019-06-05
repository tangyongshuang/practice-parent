
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This information describes the kind of pending shipment being requested.
 * 
 * <p>PendingShipmentDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PendingShipmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}PendingShipmentType"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EmailLabelDetail" type="{http://fedex.com/ws/ship/v23}EMailLabelDetail" minOccurs="0"/>
 *         &lt;element name="ProcessingOptions" type="{http://fedex.com/ws/ship/v23}PendingShipmentProcessingOptionsRequested" minOccurs="0"/>
 *         &lt;element name="RecommendedDocumentSpecification" type="{http://fedex.com/ws/ship/v23}RecommendedDocumentSpecification" minOccurs="0"/>
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
@XmlType(name = "PendingShipmentDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "expirationDate",
    "emailLabelDetail",
    "processingOptions",
    "recommendedDocumentSpecification",
    "documentReferences"
})
public class PendingShipmentDetail {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected PendingShipmentType type;
    @XmlElement(name = "ExpirationDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "EmailLabelDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected EMailLabelDetail emailLabelDetail;
    @XmlElement(name = "ProcessingOptions", namespace = "http://fedex.com/ws/ship/v23")
    protected PendingShipmentProcessingOptionsRequested processingOptions;
    @XmlElement(name = "RecommendedDocumentSpecification", namespace = "http://fedex.com/ws/ship/v23")
    protected RecommendedDocumentSpecification recommendedDocumentSpecification;
    @XmlElement(name = "DocumentReferences", namespace = "http://fedex.com/ws/ship/v23")
    protected List<UploadDocumentReferenceDetail> documentReferences;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PendingShipmentType }
     *     
     */
    public PendingShipmentType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PendingShipmentType }
     *     
     */
    public void setType(PendingShipmentType value) {
        this.type = value;
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

    /**
     * 获取emailLabelDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMailLabelDetail }
     *     
     */
    public EMailLabelDetail getEmailLabelDetail() {
        return emailLabelDetail;
    }

    /**
     * 设置emailLabelDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMailLabelDetail }
     *     
     */
    public void setEmailLabelDetail(EMailLabelDetail value) {
        this.emailLabelDetail = value;
    }

    /**
     * 获取processingOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PendingShipmentProcessingOptionsRequested }
     *     
     */
    public PendingShipmentProcessingOptionsRequested getProcessingOptions() {
        return processingOptions;
    }

    /**
     * 设置processingOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PendingShipmentProcessingOptionsRequested }
     *     
     */
    public void setProcessingOptions(PendingShipmentProcessingOptionsRequested value) {
        this.processingOptions = value;
    }

    /**
     * 获取recommendedDocumentSpecification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecommendedDocumentSpecification }
     *     
     */
    public RecommendedDocumentSpecification getRecommendedDocumentSpecification() {
        return recommendedDocumentSpecification;
    }

    /**
     * 设置recommendedDocumentSpecification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendedDocumentSpecification }
     *     
     */
    public void setRecommendedDocumentSpecification(RecommendedDocumentSpecification value) {
        this.recommendedDocumentSpecification = value;
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
