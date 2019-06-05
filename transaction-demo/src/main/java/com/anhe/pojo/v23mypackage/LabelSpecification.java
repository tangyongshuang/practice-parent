
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelSpecification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LabelSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dispositions" type="{http://fedex.com/ws/ship/v23}ShippingDocumentDispositionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LabelFormatType" type="{http://fedex.com/ws/ship/v23}LabelFormatType"/>
 *         &lt;element name="ImageType" type="{http://fedex.com/ws/ship/v23}ShippingDocumentImageType" minOccurs="0"/>
 *         &lt;element name="LabelStockType" type="{http://fedex.com/ws/ship/v23}LabelStockType" minOccurs="0"/>
 *         &lt;element name="LabelPrintingOrientation" type="{http://fedex.com/ws/ship/v23}LabelPrintingOrientationType" minOccurs="0"/>
 *         &lt;element name="LabelOrder" type="{http://fedex.com/ws/ship/v23}LabelOrderType" minOccurs="0"/>
 *         &lt;element name="PrintedLabelOrigin" type="{http://fedex.com/ws/ship/v23}ContactAndAddress" minOccurs="0"/>
 *         &lt;element name="CustomerSpecifiedDetail" type="{http://fedex.com/ws/ship/v23}CustomerSpecifiedLabelDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelSpecification", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "dispositions",
    "labelFormatType",
    "imageType",
    "labelStockType",
    "labelPrintingOrientation",
    "labelOrder",
    "printedLabelOrigin",
    "customerSpecifiedDetail"
})
public class LabelSpecification {

    @XmlElement(name = "Dispositions", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ShippingDocumentDispositionDetail> dispositions;
    @XmlElement(name = "LabelFormatType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected LabelFormatType labelFormatType;
    @XmlElement(name = "ImageType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentImageType imageType;
    @XmlElement(name = "LabelStockType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected LabelStockType labelStockType;
    @XmlElement(name = "LabelPrintingOrientation", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected LabelPrintingOrientationType labelPrintingOrientation;
    @XmlElement(name = "LabelOrder", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected LabelOrderType labelOrder;
    @XmlElement(name = "PrintedLabelOrigin", namespace = "http://fedex.com/ws/ship/v23")
    protected ContactAndAddress printedLabelOrigin;
    @XmlElement(name = "CustomerSpecifiedDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomerSpecifiedLabelDetail customerSpecifiedDetail;

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
     * 获取labelFormatType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LabelFormatType }
     *     
     */
    public LabelFormatType getLabelFormatType() {
        return labelFormatType;
    }

    /**
     * 设置labelFormatType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LabelFormatType }
     *     
     */
    public void setLabelFormatType(LabelFormatType value) {
        this.labelFormatType = value;
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
     * 获取labelStockType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LabelStockType }
     *     
     */
    public LabelStockType getLabelStockType() {
        return labelStockType;
    }

    /**
     * 设置labelStockType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LabelStockType }
     *     
     */
    public void setLabelStockType(LabelStockType value) {
        this.labelStockType = value;
    }

    /**
     * 获取labelPrintingOrientation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LabelPrintingOrientationType }
     *     
     */
    public LabelPrintingOrientationType getLabelPrintingOrientation() {
        return labelPrintingOrientation;
    }

    /**
     * 设置labelPrintingOrientation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LabelPrintingOrientationType }
     *     
     */
    public void setLabelPrintingOrientation(LabelPrintingOrientationType value) {
        this.labelPrintingOrientation = value;
    }

    /**
     * 获取labelOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LabelOrderType }
     *     
     */
    public LabelOrderType getLabelOrder() {
        return labelOrder;
    }

    /**
     * 设置labelOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LabelOrderType }
     *     
     */
    public void setLabelOrder(LabelOrderType value) {
        this.labelOrder = value;
    }

    /**
     * 获取printedLabelOrigin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getPrintedLabelOrigin() {
        return printedLabelOrigin;
    }

    /**
     * 设置printedLabelOrigin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setPrintedLabelOrigin(ContactAndAddress value) {
        this.printedLabelOrigin = value;
    }

    /**
     * 获取customerSpecifiedDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSpecifiedLabelDetail }
     *     
     */
    public CustomerSpecifiedLabelDetail getCustomerSpecifiedDetail() {
        return customerSpecifiedDetail;
    }

    /**
     * 设置customerSpecifiedDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSpecifiedLabelDetail }
     *     
     */
    public void setCustomerSpecifiedDetail(CustomerSpecifiedLabelDetail value) {
        this.customerSpecifiedDetail = value;
    }

}
