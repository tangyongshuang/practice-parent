
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipmentManifestDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShipmentManifestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManifestReferenceType" type="{http://fedex.com/ws/ship/v23}CustomerReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentManifestDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "manifestReferenceType"
})
public class ShipmentManifestDetail {

    @XmlElement(name = "ManifestReferenceType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CustomerReferenceType manifestReferenceType;

    /**
     * 获取manifestReferenceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerReferenceType }
     *     
     */
    public CustomerReferenceType getManifestReferenceType() {
        return manifestReferenceType;
    }

    /**
     * 设置manifestReferenceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReferenceType }
     *     
     */
    public void setManifestReferenceType(CustomerReferenceType value) {
        this.manifestReferenceType = value;
    }

}
