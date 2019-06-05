
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RadionuclideActivity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RadionuclideActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://fedex.com/ws/ship/v23}RadioactivityUnitOfMeasure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadionuclideActivity", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "value",
    "unitOfMeasure"
})
public class RadionuclideActivity {

    @XmlElement(name = "Value", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal value;
    @XmlElement(name = "UnitOfMeasure", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RadioactivityUnitOfMeasure unitOfMeasure;

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

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RadioactivityUnitOfMeasure }
     *     
     */
    public RadioactivityUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RadioactivityUnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(RadioactivityUnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

}
