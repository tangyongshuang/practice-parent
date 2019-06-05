
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Image to be included from printer's memory, or from a local file for offline clients.
 * 
 * <p>CustomLabelGraphicEntry complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomLabelGraphicEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Position" type="{http://fedex.com/ws/ship/v23}CustomLabelPosition" minOccurs="0"/>
 *         &lt;element name="PrinterGraphicId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileGraphicFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLabelGraphicEntry", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "position",
    "printerGraphicId",
    "fileGraphicFullName"
})
public class CustomLabelGraphicEntry {

    @XmlElement(name = "Position", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomLabelPosition position;
    @XmlElement(name = "PrinterGraphicId", namespace = "http://fedex.com/ws/ship/v23")
    protected String printerGraphicId;
    @XmlElement(name = "FileGraphicFullName", namespace = "http://fedex.com/ws/ship/v23")
    protected String fileGraphicFullName;

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
     * 获取printerGraphicId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterGraphicId() {
        return printerGraphicId;
    }

    /**
     * 设置printerGraphicId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterGraphicId(String value) {
        this.printerGraphicId = value;
    }

    /**
     * 获取fileGraphicFullName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileGraphicFullName() {
        return fileGraphicFullName;
    }

    /**
     * 设置fileGraphicFullName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileGraphicFullName(String value) {
        this.fileGraphicFullName = value;
    }

}
