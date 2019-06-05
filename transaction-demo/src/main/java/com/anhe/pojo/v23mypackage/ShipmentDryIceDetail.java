
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Shipment-level totals of dry ice data across all packages.
 * 
 * <p>ShipmentDryIceDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShipmentDryIceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="TotalWeight" type="{http://fedex.com/ws/ship/v23}Weight"/>
 *         &lt;element name="ProcessingOptions" type="{http://fedex.com/ws/ship/v23}ShipmentDryIceProcessingOptionsRequested" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDryIceDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "packageCount",
    "totalWeight",
    "processingOptions"
})
public class ShipmentDryIceDetail {

    @XmlElement(name = "PackageCount", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageCount;
    @XmlElement(name = "TotalWeight", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected Weight totalWeight;
    @XmlElement(name = "ProcessingOptions", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentDryIceProcessingOptionsRequested processingOptions;

    /**
     * 获取packageCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageCount() {
        return packageCount;
    }

    /**
     * 设置packageCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageCount(BigInteger value) {
        this.packageCount = value;
    }

    /**
     * 获取totalWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }

    /**
     * 设置totalWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setTotalWeight(Weight value) {
        this.totalWeight = value;
    }

    /**
     * 获取processingOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDryIceProcessingOptionsRequested }
     *     
     */
    public ShipmentDryIceProcessingOptionsRequested getProcessingOptions() {
        return processingOptions;
    }

    /**
     * 设置processingOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDryIceProcessingOptionsRequested }
     *     
     */
    public void setProcessingOptions(ShipmentDryIceProcessingOptionsRequested value) {
        this.processingOptions = value;
    }

}
