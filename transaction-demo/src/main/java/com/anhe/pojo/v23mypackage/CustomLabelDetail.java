
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomLabelDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomLabelDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoordinateUnits" type="{http://fedex.com/ws/ship/v23}CustomLabelCoordinateUnits" minOccurs="0"/>
 *         &lt;element name="TextEntries" type="{http://fedex.com/ws/ship/v23}CustomLabelTextEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GraphicEntries" type="{http://fedex.com/ws/ship/v23}CustomLabelGraphicEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BoxEntries" type="{http://fedex.com/ws/ship/v23}CustomLabelBoxEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TextBoxEntries" type="{http://fedex.com/ws/ship/v23}CustomLabelTextBoxEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BarcodeEntries" type="{http://fedex.com/ws/ship/v23}CustomLabelBarcodeEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLabelDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "coordinateUnits",
    "textEntries",
    "graphicEntries",
    "boxEntries",
    "textBoxEntries",
    "barcodeEntries"
})
public class CustomLabelDetail {

    @XmlElement(name = "CoordinateUnits", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CustomLabelCoordinateUnits coordinateUnits;
    @XmlElement(name = "TextEntries", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomLabelTextEntry> textEntries;
    @XmlElement(name = "GraphicEntries", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomLabelGraphicEntry> graphicEntries;
    @XmlElement(name = "BoxEntries", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomLabelBoxEntry> boxEntries;
    @XmlElement(name = "TextBoxEntries", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomLabelTextBoxEntry> textBoxEntries;
    @XmlElement(name = "BarcodeEntries", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomLabelBarcodeEntry> barcodeEntries;

    /**
     * 获取coordinateUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelCoordinateUnits }
     *     
     */
    public CustomLabelCoordinateUnits getCoordinateUnits() {
        return coordinateUnits;
    }

    /**
     * 设置coordinateUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelCoordinateUnits }
     *     
     */
    public void setCoordinateUnits(CustomLabelCoordinateUnits value) {
        this.coordinateUnits = value;
    }

    /**
     * Gets the value of the textEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomLabelTextEntry }
     * 
     * 
     */
    public List<CustomLabelTextEntry> getTextEntries() {
        if (textEntries == null) {
            textEntries = new ArrayList<CustomLabelTextEntry>();
        }
        return this.textEntries;
    }

    /**
     * Gets the value of the graphicEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomLabelGraphicEntry }
     * 
     * 
     */
    public List<CustomLabelGraphicEntry> getGraphicEntries() {
        if (graphicEntries == null) {
            graphicEntries = new ArrayList<CustomLabelGraphicEntry>();
        }
        return this.graphicEntries;
    }

    /**
     * Gets the value of the boxEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boxEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoxEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomLabelBoxEntry }
     * 
     * 
     */
    public List<CustomLabelBoxEntry> getBoxEntries() {
        if (boxEntries == null) {
            boxEntries = new ArrayList<CustomLabelBoxEntry>();
        }
        return this.boxEntries;
    }

    /**
     * Gets the value of the textBoxEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textBoxEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextBoxEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomLabelTextBoxEntry }
     * 
     * 
     */
    public List<CustomLabelTextBoxEntry> getTextBoxEntries() {
        if (textBoxEntries == null) {
            textBoxEntries = new ArrayList<CustomLabelTextBoxEntry>();
        }
        return this.textBoxEntries;
    }

    /**
     * Gets the value of the barcodeEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barcodeEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarcodeEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomLabelBarcodeEntry }
     * 
     * 
     */
    public List<CustomLabelBarcodeEntry> getBarcodeEntries() {
        if (barcodeEntries == null) {
            barcodeEntries = new ArrayList<CustomLabelBarcodeEntry>();
        }
        return this.barcodeEntries;
    }

}
