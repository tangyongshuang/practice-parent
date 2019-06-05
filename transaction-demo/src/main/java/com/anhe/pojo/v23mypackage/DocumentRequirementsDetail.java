
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocumentRequirementsDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocumentRequirementsDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequiredDocuments" type="{http://fedex.com/ws/ship/v23}RequiredDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GenerationDetails" type="{http://fedex.com/ws/ship/v23}DocumentGenerationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProhibitedDocuments" type="{http://fedex.com/ws/ship/v23}EnterpriseDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRequirementsDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "requiredDocuments",
    "generationDetails",
    "prohibitedDocuments"
})
public class DocumentRequirementsDetail {

    @XmlElement(name = "RequiredDocuments", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<RequiredDocumentType> requiredDocuments;
    @XmlElement(name = "GenerationDetails", namespace = "http://fedex.com/ws/ship/v23")
    protected List<DocumentGenerationDetail> generationDetails;
    @XmlElement(name = "ProhibitedDocuments", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<EnterpriseDocumentType> prohibitedDocuments;

    /**
     * Gets the value of the requiredDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredDocumentType }
     * 
     * 
     */
    public List<RequiredDocumentType> getRequiredDocuments() {
        if (requiredDocuments == null) {
            requiredDocuments = new ArrayList<RequiredDocumentType>();
        }
        return this.requiredDocuments;
    }

    /**
     * Gets the value of the generationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenerationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGenerationDetail }
     * 
     * 
     */
    public List<DocumentGenerationDetail> getGenerationDetails() {
        if (generationDetails == null) {
            generationDetails = new ArrayList<DocumentGenerationDetail>();
        }
        return this.generationDetails;
    }

    /**
     * Gets the value of the prohibitedDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prohibitedDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProhibitedDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnterpriseDocumentType }
     * 
     * 
     */
    public List<EnterpriseDocumentType> getProhibitedDocuments() {
        if (prohibitedDocuments == null) {
            prohibitedDocuments = new ArrayList<EnterpriseDocumentType>();
        }
        return this.prohibitedDocuments;
    }

}
