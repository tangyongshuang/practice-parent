
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Three-dimensional volume/cubic measurement.
 * 
 * <p>Volume complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Volume">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Units" type="{http://fedex.com/ws/ship/v23}VolumeUnits" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Volume", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "units",
    "value"
})
public class Volume {

    @XmlElement(name = "Units", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected VolumeUnits units;
    @XmlElement(name = "Value", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal value;

    /**
     * 获取units属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeUnits }
     *     
     */
    public VolumeUnits getUnits() {
        return units;
    }

    /**
     * 设置units属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeUnits }
     *     
     */
    public void setUnits(VolumeUnits value) {
        this.units = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
