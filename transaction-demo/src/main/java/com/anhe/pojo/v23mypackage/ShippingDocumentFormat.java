
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies characteristics of a shipping document to be produced.
 * 
 * <p>ShippingDocumentFormat complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dispositions" type="{http://fedex.com/ws/ship/v23}ShippingDocumentDispositionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TopOfPageOffset" type="{http://fedex.com/ws/ship/v23}LinearMeasure" minOccurs="0"/>
 *         &lt;element name="ImageType" type="{http://fedex.com/ws/ship/v23}ShippingDocumentImageType" minOccurs="0"/>
 *         &lt;element name="StockType" type="{http://fedex.com/ws/ship/v23}ShippingDocumentStockType" minOccurs="0"/>
 *         &lt;element name="ProvideInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsRequested" type="{http://fedex.com/ws/ship/v23}DocumentFormatOptionsRequested" minOccurs="0"/>
 *         &lt;element name="Localization" type="{http://fedex.com/ws/ship/v23}Localization" minOccurs="0"/>
 *         &lt;element name="CustomDocumentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentFormat", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "dispositions",
    "topOfPageOffset",
    "imageType",
    "stockType",
    "provideInstructions",
    "optionsRequested",
    "localization",
    "customDocumentIdentifier"
})
public class ShippingDocumentFormat {

    @XmlElement(name = "Dispositions", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ShippingDocumentDispositionDetail> dispositions;
    @XmlElement(name = "TopOfPageOffset", namespace = "http://fedex.com/ws/ship/v23")
    protected LinearMeasure topOfPageOffset;
    @XmlElement(name = "ImageType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentImageType imageType;
    @XmlElement(name = "StockType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentStockType stockType;
    @XmlElement(name = "ProvideInstructions", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean provideInstructions;
    @XmlElement(name = "OptionsRequested", namespace = "http://fedex.com/ws/ship/v23")
    protected DocumentFormatOptionsRequested optionsRequested;
    @XmlElement(name = "Localization", namespace = "http://fedex.com/ws/ship/v23")
    protected Localization localization;
    @XmlElement(name = "CustomDocumentIdentifier", namespace = "http://fedex.com/ws/ship/v23")
    protected String customDocumentIdentifier;

    /**
     * Gets the value of the dispositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocumentDispositionDetail }
     * 
     * 
     */
    public List<ShippingDocumentDispositionDetail> getDispositions() {
        if (dispositions == null) {
            dispositions = new ArrayList<ShippingDocumentDispositionDetail>();
        }
        return this.dispositions;
    }

    /**
     * 获取topOfPageOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LinearMeasure }
     *     
     */
    public LinearMeasure getTopOfPageOffset() {
        return topOfPageOffset;
    }

    /**
     * 设置topOfPageOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LinearMeasure }
     *     
     */
    public void setTopOfPageOffset(LinearMeasure value) {
        this.topOfPageOffset = value;
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
     * 获取stockType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentStockType }
     *     
     */
    public ShippingDocumentStockType getStockType() {
        return stockType;
    }

    /**
     * 设置stockType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentStockType }
     *     
     */
    public void setStockType(ShippingDocumentStockType value) {
        this.stockType = value;
    }

    /**
     * 获取provideInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvideInstructions() {
        return provideInstructions;
    }

    /**
     * 设置provideInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvideInstructions(Boolean value) {
        this.provideInstructions = value;
    }

    /**
     * 获取optionsRequested属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocumentFormatOptionsRequested }
     *     
     */
    public DocumentFormatOptionsRequested getOptionsRequested() {
        return optionsRequested;
    }

    /**
     * 设置optionsRequested属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFormatOptionsRequested }
     *     
     */
    public void setOptionsRequested(DocumentFormatOptionsRequested value) {
        this.optionsRequested = value;
    }

    /**
     * 获取localization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Localization }
     *     
     */
    public Localization getLocalization() {
        return localization;
    }

    /**
     * 设置localization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Localization }
     *     
     */
    public void setLocalization(Localization value) {
        this.localization = value;
    }

    /**
     * 获取customDocumentIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomDocumentIdentifier() {
        return customDocumentIdentifier;
    }

    /**
     * 设置customDocumentIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomDocumentIdentifier(String value) {
        this.customDocumentIdentifier = value;
    }

}
