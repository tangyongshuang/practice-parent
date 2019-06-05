
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
 * Constructed string, based on format and zero or more data fields, printed in specified printer font (for thermal labels) or generic font/size (for plain paper labels).
 * 
 * <p>CustomLabelTextBoxEntry complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomLabelTextBoxEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopLeftCorner" type="{http://fedex.com/ws/ship/v23}CustomLabelPosition" minOccurs="0"/>
 *         &lt;element name="BottomRightCorner" type="{http://fedex.com/ws/ship/v23}CustomLabelPosition" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://fedex.com/ws/ship/v23}CustomLabelPosition" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThermalFontId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Rotation" type="{http://fedex.com/ws/ship/v23}RotationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLabelTextBoxEntry", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "topLeftCorner",
    "bottomRightCorner",
    "position",
    "format",
    "dataFields",
    "thermalFontId",
    "fontName",
    "fontSize",
    "rotation"
})
public class CustomLabelTextBoxEntry {

    @XmlElement(name = "TopLeftCorner", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomLabelPosition topLeftCorner;
    @XmlElement(name = "BottomRightCorner", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomLabelPosition bottomRightCorner;
    @XmlElement(name = "Position", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomLabelPosition position;
    @XmlElement(name = "Format", namespace = "http://fedex.com/ws/ship/v23")
    protected String format;
    @XmlElement(name = "DataFields", namespace = "http://fedex.com/ws/ship/v23")
    protected List<String> dataFields;
    @XmlElement(name = "ThermalFontId", namespace = "http://fedex.com/ws/ship/v23")
    protected String thermalFontId;
    @XmlElement(name = "FontName", namespace = "http://fedex.com/ws/ship/v23")
    protected String fontName;
    @XmlElement(name = "FontSize", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fontSize;
    @XmlElement(name = "Rotation", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RotationType rotation;

    /**
     * 获取topLeftCorner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelPosition }
     *     
     */
    public CustomLabelPosition getTopLeftCorner() {
        return topLeftCorner;
    }

    /**
     * 设置topLeftCorner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelPosition }
     *     
     */
    public void setTopLeftCorner(CustomLabelPosition value) {
        this.topLeftCorner = value;
    }

    /**
     * 获取bottomRightCorner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelPosition }
     *     
     */
    public CustomLabelPosition getBottomRightCorner() {
        return bottomRightCorner;
    }

    /**
     * 设置bottomRightCorner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelPosition }
     *     
     */
    public void setBottomRightCorner(CustomLabelPosition value) {
        this.bottomRightCorner = value;
    }

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
     * 获取thermalFontId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThermalFontId() {
        return thermalFontId;
    }

    /**
     * 设置thermalFontId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThermalFontId(String value) {
        this.thermalFontId = value;
    }

    /**
     * 获取fontName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * 设置fontName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**
     * 获取fontSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFontSize() {
        return fontSize;
    }

    /**
     * 设置fontSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFontSize(BigInteger value) {
        this.fontSize = value;
    }

    /**
     * 获取rotation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RotationType }
     *     
     */
    public RotationType getRotation() {
        return rotation;
    }

    /**
     * 设置rotation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RotationType }
     *     
     */
    public void setRotation(RotationType value) {
        this.rotation = value;
    }

}
