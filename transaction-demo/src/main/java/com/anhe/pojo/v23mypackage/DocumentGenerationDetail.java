
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocumentGenerationDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocumentGenerationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}EnterpriseDocumentType" minOccurs="0"/>
 *         &lt;element name="MinimumCopiesRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Letterhead" type="{http://fedex.com/ws/ship/v23}RequirementType" minOccurs="0"/>
 *         &lt;element name="ElectronicSignature" type="{http://fedex.com/ws/ship/v23}RequirementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentGenerationDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "minimumCopiesRequired",
    "letterhead",
    "electronicSignature"
})
public class DocumentGenerationDetail {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected EnterpriseDocumentType type;
    @XmlElement(name = "MinimumCopiesRequired", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumCopiesRequired;
    @XmlElement(name = "Letterhead", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RequirementType letterhead;
    @XmlElement(name = "ElectronicSignature", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RequirementType electronicSignature;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseDocumentType }
     *     
     */
    public EnterpriseDocumentType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseDocumentType }
     *     
     */
    public void setType(EnterpriseDocumentType value) {
        this.type = value;
    }

    /**
     * 获取minimumCopiesRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumCopiesRequired() {
        return minimumCopiesRequired;
    }

    /**
     * 设置minimumCopiesRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumCopiesRequired(BigInteger value) {
        this.minimumCopiesRequired = value;
    }

    /**
     * 获取letterhead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequirementType }
     *     
     */
    public RequirementType getLetterhead() {
        return letterhead;
    }

    /**
     * 设置letterhead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementType }
     *     
     */
    public void setLetterhead(RequirementType value) {
        this.letterhead = value;
    }

    /**
     * 获取electronicSignature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequirementType }
     *     
     */
    public RequirementType getElectronicSignature() {
        return electronicSignature;
    }

    /**
     * 设置electronicSignature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementType }
     *     
     */
    public void setElectronicSignature(RequirementType value) {
        this.electronicSignature = value;
    }

}
