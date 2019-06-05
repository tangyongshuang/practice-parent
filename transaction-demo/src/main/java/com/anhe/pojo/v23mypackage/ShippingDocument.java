
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShippingDocument complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShippingDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}ReturnedShippingDocumentType" minOccurs="0"/>
 *         &lt;element name="Localizations" type="{http://fedex.com/ws/ship/v23}Localization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Grouping" type="{http://fedex.com/ws/ship/v23}ShippingDocumentGroupingType" minOccurs="0"/>
 *         &lt;element name="ShippingDocumentDisposition" type="{http://fedex.com/ws/ship/v23}ShippingDocumentDispositionType" minOccurs="0"/>
 *         &lt;element name="AccessReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageType" type="{http://fedex.com/ws/ship/v23}ShippingDocumentImageType" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="CopiesToPrint" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Parts" type="{http://fedex.com/ws/ship/v23}ShippingDocumentPart" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocument", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "localizations",
    "grouping",
    "shippingDocumentDisposition",
    "accessReference",
    "imageType",
    "resolution",
    "copiesToPrint",
    "parts"
})
public class ShippingDocument {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ReturnedShippingDocumentType type;
    @XmlElement(name = "Localizations", namespace = "http://fedex.com/ws/ship/v23")
    protected List<Localization> localizations;
    @XmlElement(name = "Grouping", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentGroupingType grouping;
    @XmlElement(name = "ShippingDocumentDisposition", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentDispositionType shippingDocumentDisposition;
    @XmlElement(name = "AccessReference", namespace = "http://fedex.com/ws/ship/v23")
    protected String accessReference;
    @XmlElement(name = "ImageType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentImageType imageType;
    @XmlElement(name = "Resolution", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger resolution;
    @XmlElement(name = "CopiesToPrint", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger copiesToPrint;
    @XmlElement(name = "Parts", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ShippingDocumentPart> parts;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnedShippingDocumentType }
     *     
     */
    public ReturnedShippingDocumentType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnedShippingDocumentType }
     *     
     */
    public void setType(ReturnedShippingDocumentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the localizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Localization }
     * 
     * 
     */
    public List<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new ArrayList<Localization>();
        }
        return this.localizations;
    }

    /**
     * 获取grouping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentGroupingType }
     *     
     */
    public ShippingDocumentGroupingType getGrouping() {
        return grouping;
    }

    /**
     * 设置grouping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentGroupingType }
     *     
     */
    public void setGrouping(ShippingDocumentGroupingType value) {
        this.grouping = value;
    }

    /**
     * 获取shippingDocumentDisposition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentDispositionType }
     *     
     */
    public ShippingDocumentDispositionType getShippingDocumentDisposition() {
        return shippingDocumentDisposition;
    }

    /**
     * 设置shippingDocumentDisposition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentDispositionType }
     *     
     */
    public void setShippingDocumentDisposition(ShippingDocumentDispositionType value) {
        this.shippingDocumentDisposition = value;
    }

    /**
     * 获取accessReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessReference() {
        return accessReference;
    }

    /**
     * 设置accessReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessReference(String value) {
        this.accessReference = value;
    }

    /**
     * 获取imageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentImageType }
     *     
     */
    public ShippingDocumentImageType getImageType() {
        return imageType;
    }

    /**
     * 设置imageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentImageType }
     *     
     */
    public void setImageType(ShippingDocumentImageType value) {
        this.imageType = value;
    }

    /**
     * 获取resolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResolution() {
        return resolution;
    }

    /**
     * 设置resolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResolution(BigInteger value) {
        this.resolution = value;
    }

    /**
     * 获取copiesToPrint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCopiesToPrint() {
        return copiesToPrint;
    }

    /**
     * 设置copiesToPrint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCopiesToPrint(BigInteger value) {
        this.copiesToPrint = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocumentPart }
     * 
     * 
     */
    public List<ShippingDocumentPart> getParts() {
        if (parts == null) {
            parts = new ArrayList<ShippingDocumentPart>();
        }
        return this.parts;
    }

}
