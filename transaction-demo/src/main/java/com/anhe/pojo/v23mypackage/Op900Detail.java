
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The instructions indicating how to print the OP-900 form for hazardous materials packages.
 * 
 * <p>Op900Detail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Op900Detail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Format" type="{http://fedex.com/ws/ship/v23}ShippingDocumentFormat" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://fedex.com/ws/ship/v23}CustomerReferenceType" minOccurs="0"/>
 *         &lt;element name="CustomerImageUsages" type="{http://fedex.com/ws/ship/v23}CustomerImageUsage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SignatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Op900Detail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "format",
    "reference",
    "customerImageUsages",
    "signatureName"
})
public class Op900Detail {

    @XmlElement(name = "Format", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocumentFormat format;
    @XmlElement(name = "Reference", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CustomerReferenceType reference;
    @XmlElement(name = "CustomerImageUsages", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomerImageUsage> customerImageUsages;
    @XmlElement(name = "SignatureName", namespace = "http://fedex.com/ws/ship/v23")
    protected String signatureName;

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
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerReferenceType }
     *     
     */
    public CustomerReferenceType getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReferenceType }
     *     
     */
    public void setReference(CustomerReferenceType value) {
        this.reference = value;
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

    /**
     * 获取signatureName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * 设置signatureName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

}
