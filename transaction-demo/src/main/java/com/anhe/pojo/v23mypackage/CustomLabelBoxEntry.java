
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Solid (filled) rectangular area on label.
 * 
 * <p>CustomLabelBoxEntry complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomLabelBoxEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopLeftCorner" type="{http://fedex.com/ws/ship/v23}CustomLabelPosition"/>
 *         &lt;element name="BottomRightCorner" type="{http://fedex.com/ws/ship/v23}CustomLabelPosition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLabelBoxEntry", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "topLeftCorner",
    "bottomRightCorner"
})
public class CustomLabelBoxEntry {

    @XmlElement(name = "TopLeftCorner", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected CustomLabelPosition topLeftCorner;
    @XmlElement(name = "BottomRightCorner", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected CustomLabelPosition bottomRightCorner;

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

}
