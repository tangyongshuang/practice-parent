
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Dimensions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Dimensions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="Units" type="{http://fedex.com/ws/ship/v23}LinearUnits"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dimensions", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "length",
    "width",
    "height",
    "units"
})
public class Dimensions {

    @XmlElement(name = "Length", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger length;
    @XmlElement(name = "Width", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger width;
    @XmlElement(name = "Height", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger height;
    @XmlElement(name = "Units", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected LinearUnits units;

    /**
     * 获取length属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * 设置length属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * 获取units属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LinearUnits }
     *     
     */
    public LinearUnits getUnits() {
        return units;
    }

    /**
     * 设置units属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LinearUnits }
     *     
     */
    public void setUnits(LinearUnits value) {
        this.units = value;
    }

}
