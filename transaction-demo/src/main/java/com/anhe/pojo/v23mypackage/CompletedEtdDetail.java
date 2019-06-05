
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompletedEtdDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedEtdDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}CompletedEtdType" minOccurs="0"/>
 *         &lt;element name="UploadDocumentReferenceDetails" type="{http://fedex.com/ws/ship/v23}UploadDocumentReferenceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedEtdDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "folderId",
    "type",
    "uploadDocumentReferenceDetails"
})
public class CompletedEtdDetail {

    @XmlElement(name = "FolderId", namespace = "http://fedex.com/ws/ship/v23")
    protected String folderId;
    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CompletedEtdType type;
    @XmlElement(name = "UploadDocumentReferenceDetails", namespace = "http://fedex.com/ws/ship/v23")
    protected List<UploadDocumentReferenceDetail> uploadDocumentReferenceDetails;

    /**
     * 获取folderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * 设置folderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderId(String value) {
        this.folderId = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedEtdType }
     *     
     */
    public CompletedEtdType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedEtdType }
     *     
     */
    public void setType(CompletedEtdType value) {
        this.type = value;
    }

    /**
     * Gets the value of the uploadDocumentReferenceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uploadDocumentReferenceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUploadDocumentReferenceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UploadDocumentReferenceDetail }
     * 
     * 
     */
    public List<UploadDocumentReferenceDetail> getUploadDocumentReferenceDetails() {
        if (uploadDocumentReferenceDetails == null) {
            uploadDocumentReferenceDetails = new ArrayList<UploadDocumentReferenceDetail>();
        }
        return this.uploadDocumentReferenceDetails;
    }

}
