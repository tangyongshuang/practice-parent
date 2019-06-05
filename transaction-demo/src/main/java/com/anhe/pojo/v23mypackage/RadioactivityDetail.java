
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RadioactivityDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RadioactivityDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransportIndex" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SurfaceReading" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CriticalitySafetyIndex" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Dimensions" type="{http://fedex.com/ws/ship/v23}Dimensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioactivityDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "transportIndex",
    "surfaceReading",
    "criticalitySafetyIndex",
    "dimensions"
})
public class RadioactivityDetail {

    @XmlElement(name = "TransportIndex", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal transportIndex;
    @XmlElement(name = "SurfaceReading", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal surfaceReading;
    @XmlElement(name = "CriticalitySafetyIndex", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal criticalitySafetyIndex;
    @XmlElement(name = "Dimensions", namespace = "http://fedex.com/ws/ship/v23")
    protected Dimensions dimensions;

    /**
     * 获取transportIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransportIndex() {
        return transportIndex;
    }

    /**
     * 设置transportIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransportIndex(BigDecimal value) {
        this.transportIndex = value;
    }

    /**
     * 获取surfaceReading属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSurfaceReading() {
        return surfaceReading;
    }

    /**
     * 设置surfaceReading属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSurfaceReading(BigDecimal value) {
        this.surfaceReading = value;
    }

    /**
     * 获取criticalitySafetyIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCriticalitySafetyIndex() {
        return criticalitySafetyIndex;
    }

    /**
     * 设置criticalitySafetyIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCriticalitySafetyIndex(BigDecimal value) {
        this.criticalitySafetyIndex = value;
    }

    /**
     * 获取dimensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * 设置dimensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setDimensions(Dimensions value) {
        this.dimensions = value;
    }

}
