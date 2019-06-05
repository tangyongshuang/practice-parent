
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the details about documents that are recommended to be included with the shipment for ease of shipment processing and transportation.
 * 
 * <p>RecommendedDocumentSpecification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RecommendedDocumentSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Types" type="{http://fedex.com/ws/ship/v23}RecommendedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendedDocumentSpecification", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "types"
})
public class RecommendedDocumentSpecification {

    @XmlElement(name = "Types", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<RecommendedDocumentType> types;

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecommendedDocumentType }
     * 
     * 
     */
    public List<RecommendedDocumentType> getTypes() {
        if (types == null) {
            types = new ArrayList<RecommendedDocumentType>();
        }
        return this.types;
    }

}
