
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Each occurrence of this class specifies a particular way in which a kind of shipping document is to be produced and provided.
 * 
 * <p>ShippingDocumentDispositionDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentDispositionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DispositionType" type="{http://fedex.com/ws/ship/v23}ShippingDocumentDispositionType" minOccurs="0"/>
 *         &lt;element name="Grouping" type="{http://fedex.com/ws/ship/v23}ShippingDocumentGroupingType" minOccurs="0"/>
 *         &lt;element name="StorageDetail" type="{http://fedex.com/ws/ship/v23}ShippingDocumentStorageDetail" minOccurs="0"/>
 *         &lt;element name="EMailDetail" type="{http://fedex.com/ws/ship/v23}ShippingDocumentEMailDetail" minOccurs="0"/>
 *         &lt;element name="PrintDetail" type="{http://fedex.com/ws/ship/v23}ShippingDocumentPrintDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentDispositionDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "dispositionType",
    "grouping",
    "storageDetail",
    "eMailDetail",
    "printDetail"
})
public class ShippingDocumentDispositionDetail {

    @XmlElement(name = "DispositionType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentDispositionType dispositionType;
    @XmlElement(name = "Grouping", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShippingDocumentGroupingType grouping;
    @XmlElement(name = "StorageDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocumentStorageDetail storageDetail;
    @XmlElement(name = "EMailDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocumentEMailDetail eMailDetail;
    @XmlElement(name = "PrintDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocumentPrintDetail printDetail;

    /**
     * 获取dispositionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentDispositionType }
     *     
     */
    public ShippingDocumentDispositionType getDispositionType() {
        return dispositionType;
    }

    /**
     * 设置dispositionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentDispositionType }
     *     
     */
    public void setDispositionType(ShippingDocumentDispositionType value) {
        this.dispositionType = value;
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
     * 获取storageDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentStorageDetail }
     *     
     */
    public ShippingDocumentStorageDetail getStorageDetail() {
        return storageDetail;
    }

    /**
     * 设置storageDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentStorageDetail }
     *     
     */
    public void setStorageDetail(ShippingDocumentStorageDetail value) {
        this.storageDetail = value;
    }

    /**
     * 获取eMailDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentEMailDetail }
     *     
     */
    public ShippingDocumentEMailDetail getEMailDetail() {
        return eMailDetail;
    }

    /**
     * 设置eMailDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentEMailDetail }
     *     
     */
    public void setEMailDetail(ShippingDocumentEMailDetail value) {
        this.eMailDetail = value;
    }

    /**
     * 获取printDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocumentPrintDetail }
     *     
     */
    public ShippingDocumentPrintDetail getPrintDetail() {
        return printDetail;
    }

    /**
     * 设置printDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocumentPrintDetail }
     *     
     */
    public void setPrintDetail(ShippingDocumentPrintDetail value) {
        this.printDetail = value;
    }

}
