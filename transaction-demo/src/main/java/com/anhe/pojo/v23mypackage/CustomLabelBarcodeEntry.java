
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Constructed string, based on format and zero or more data fields, printed in specified barcode symbology.
 * 
 * <p>CustomLabelBarcodeEntry complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomLabelBarcodeEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position" type="{http://fedex.com/ws/ship/v23}CustomLabelPosition"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BarHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ThinBarWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BarcodeSymbology" type="{http://fedex.com/ws/ship/v23}BarcodeSymbologyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLabelBarcodeEntry", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "position",
    "format",
    "dataFields",
    "barHeight",
    "thinBarWidth",
    "barcodeSymbology"
})
public class CustomLabelBarcodeEntry {

    @XmlElement(name = "Position", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected CustomLabelPosition position;
    @XmlElement(name = "Format", namespace = "http://fedex.com/ws/ship/v23")
    protected String format;
    @XmlElement(name = "DataFields", namespace = "http://fedex.com/ws/ship/v23")
    protected List<String> dataFields;
    @XmlElement(name = "BarHeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Integer barHeight;
    @XmlElement(name = "ThinBarWidth", namespace = "http://fedex.com/ws/ship/v23")
    protected Integer thinBarWidth;
    @XmlElement(name = "BarcodeSymbology", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected BarcodeSymbologyType barcodeSymbology;

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelPosition }
     *     
     */
    public CustomLabelPosition getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelPosition }
     *     
     */
    public void setPosition(CustomLabelPosition value) {
        this.position = value;
    }

    /**
     * 获取format属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the dataFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataFields() {
        if (dataFields == null) {
            dataFields = new ArrayList<String>();
        }
        return this.dataFields;
    }

    /**
     * 获取barHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBarHeight() {
        return barHeight;
    }

    /**
     * 设置barHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBarHeight(Integer value) {
        this.barHeight = value;
    }

    /**
     * 获取thinBarWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThinBarWidth() {
        return thinBarWidth;
    }

    /**
     * 设置thinBarWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThinBarWidth(Integer value) {
        this.thinBarWidth = value;
    }

    /**
     * 获取barcodeSymbology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BarcodeSymbologyType }
     *     
     */
    public BarcodeSymbologyType getBarcodeSymbology() {
        return barcodeSymbology;
    }

    /**
     * 设置barcodeSymbology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeSymbologyType }
     *     
     */
    public void setBarcodeSymbology(BarcodeSymbologyType value) {
        this.barcodeSymbology = value;
    }

}
