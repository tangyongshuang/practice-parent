
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Documents the kind and quantity of an individual hazardous commodity in a package.
 * 
 * <p>ValidatedHazardousCommodityContent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ValidatedHazardousCommodityContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://fedex.com/ws/ship/v23}ValidatedHazardousCommodityDescription" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://fedex.com/ws/ship/v23}HazardousCommodityQuantityDetail" minOccurs="0"/>
 *         &lt;element name="MassPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://fedex.com/ws/ship/v23}HazardousCommodityOptionDetail" minOccurs="0"/>
 *         &lt;element name="NetExplosiveDetail" type="{http://fedex.com/ws/ship/v23}NetExplosiveDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidatedHazardousCommodityContent", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "description",
    "quantity",
    "massPoints",
    "options",
    "netExplosiveDetail"
})
public class ValidatedHazardousCommodityContent {

    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected ValidatedHazardousCommodityDescription description;
    @XmlElement(name = "Quantity", namespace = "http://fedex.com/ws/ship/v23")
    protected HazardousCommodityQuantityDetail quantity;
    @XmlElement(name = "MassPoints", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal massPoints;
    @XmlElement(name = "Options", namespace = "http://fedex.com/ws/ship/v23")
    protected HazardousCommodityOptionDetail options;
    @XmlElement(name = "NetExplosiveDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected NetExplosiveDetail netExplosiveDetail;

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ValidatedHazardousCommodityDescription }
     *     
     */
    public ValidatedHazardousCommodityDescription getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatedHazardousCommodityDescription }
     *     
     */
    public void setDescription(ValidatedHazardousCommodityDescription value) {
        this.description = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityQuantityDetail }
     *     
     */
    public HazardousCommodityQuantityDetail getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityQuantityDetail }
     *     
     */
    public void setQuantity(HazardousCommodityQuantityDetail value) {
        this.quantity = value;
    }

    /**
     * 获取massPoints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMassPoints() {
        return massPoints;
    }

    /**
     * 设置massPoints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMassPoints(BigDecimal value) {
        this.massPoints = value;
    }

    /**
     * 获取options属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityOptionDetail }
     *     
     */
    public HazardousCommodityOptionDetail getOptions() {
        return options;
    }

    /**
     * 设置options属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityOptionDetail }
     *     
     */
    public void setOptions(HazardousCommodityOptionDetail value) {
        this.options = value;
    }

    /**
     * 获取netExplosiveDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetExplosiveDetail }
     *     
     */
    public NetExplosiveDetail getNetExplosiveDetail() {
        return netExplosiveDetail;
    }

    /**
     * 设置netExplosiveDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetExplosiveDetail }
     *     
     */
    public void setNetExplosiveDetail(NetExplosiveDetail value) {
        this.netExplosiveDetail = value;
    }

}
