
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Completed package-level hazardous commodity information for a single package.
 * 
 * <p>CompletedHazardousPackageDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedHazardousPackageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accessibility" type="{http://fedex.com/ws/ship/v23}DangerousGoodsAccessibilityType" minOccurs="0"/>
 *         &lt;element name="CargoAircraftOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Regulation" type="{http://fedex.com/ws/ship/v23}HazardousCommodityRegulationType" minOccurs="0"/>
 *         &lt;element name="RadioactiveTransportIndex" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LabelType" type="{http://fedex.com/ws/ship/v23}RadioactiveLabelType" minOccurs="0"/>
 *         &lt;element name="Containers" type="{http://fedex.com/ws/ship/v23}ValidatedHazardousContainer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedHazardousPackageDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "referenceId",
    "accessibility",
    "cargoAircraftOnly",
    "regulation",
    "radioactiveTransportIndex",
    "labelType",
    "containers"
})
public class CompletedHazardousPackageDetail {

    @XmlElement(name = "ReferenceId", namespace = "http://fedex.com/ws/ship/v23")
    protected String referenceId;
    @XmlElement(name = "Accessibility", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected DangerousGoodsAccessibilityType accessibility;
    @XmlElement(name = "CargoAircraftOnly", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean cargoAircraftOnly;
    @XmlElement(name = "Regulation", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected HazardousCommodityRegulationType regulation;
    @XmlElement(name = "RadioactiveTransportIndex", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal radioactiveTransportIndex;
    @XmlElement(name = "LabelType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RadioactiveLabelType labelType;
    @XmlElement(name = "Containers", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ValidatedHazardousContainer> containers;

    /**
     * 获取referenceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * 设置referenceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * 获取accessibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsAccessibilityType }
     *     
     */
    public DangerousGoodsAccessibilityType getAccessibility() {
        return accessibility;
    }

    /**
     * 设置accessibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsAccessibilityType }
     *     
     */
    public void setAccessibility(DangerousGoodsAccessibilityType value) {
        this.accessibility = value;
    }

    /**
     * 获取cargoAircraftOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCargoAircraftOnly() {
        return cargoAircraftOnly;
    }

    /**
     * 设置cargoAircraftOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCargoAircraftOnly(Boolean value) {
        this.cargoAircraftOnly = value;
    }

    /**
     * 获取regulation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityRegulationType }
     *     
     */
    public HazardousCommodityRegulationType getRegulation() {
        return regulation;
    }

    /**
     * 设置regulation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityRegulationType }
     *     
     */
    public void setRegulation(HazardousCommodityRegulationType value) {
        this.regulation = value;
    }

    /**
     * 获取radioactiveTransportIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRadioactiveTransportIndex() {
        return radioactiveTransportIndex;
    }

    /**
     * 设置radioactiveTransportIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRadioactiveTransportIndex(BigDecimal value) {
        this.radioactiveTransportIndex = value;
    }

    /**
     * 获取labelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RadioactiveLabelType }
     *     
     */
    public RadioactiveLabelType getLabelType() {
        return labelType;
    }

    /**
     * 设置labelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RadioactiveLabelType }
     *     
     */
    public void setLabelType(RadioactiveLabelType value) {
        this.labelType = value;
    }

    /**
     * Gets the value of the containers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidatedHazardousContainer }
     * 
     * 
     */
    public List<ValidatedHazardousContainer> getContainers() {
        if (containers == null) {
            containers = new ArrayList<ValidatedHazardousContainer>();
        }
        return this.containers;
    }

}
