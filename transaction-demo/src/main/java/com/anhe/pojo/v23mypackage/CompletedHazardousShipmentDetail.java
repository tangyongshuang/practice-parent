
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Computed shipment level hazardous commodity information.
 * 
 * <p>CompletedHazardousShipmentDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedHazardousShipmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HazardousSummaryDetail" type="{http://fedex.com/ws/ship/v23}CompletedHazardousSummaryDetail" minOccurs="0"/>
 *         &lt;element name="DryIceDetail" type="{http://fedex.com/ws/ship/v23}ShipmentDryIceDetail" minOccurs="0"/>
 *         &lt;element name="AdrLicense" type="{http://fedex.com/ws/ship/v23}AdrLicenseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedHazardousShipmentDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "hazardousSummaryDetail",
    "dryIceDetail",
    "adrLicense"
})
public class CompletedHazardousShipmentDetail {

    @XmlElement(name = "HazardousSummaryDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CompletedHazardousSummaryDetail hazardousSummaryDetail;
    @XmlElement(name = "DryIceDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentDryIceDetail dryIceDetail;
    @XmlElement(name = "AdrLicense", namespace = "http://fedex.com/ws/ship/v23")
    protected AdrLicenseDetail adrLicense;

    /**
     * 获取hazardousSummaryDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedHazardousSummaryDetail }
     *     
     */
    public CompletedHazardousSummaryDetail getHazardousSummaryDetail() {
        return hazardousSummaryDetail;
    }

    /**
     * 设置hazardousSummaryDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedHazardousSummaryDetail }
     *     
     */
    public void setHazardousSummaryDetail(CompletedHazardousSummaryDetail value) {
        this.hazardousSummaryDetail = value;
    }

    /**
     * 获取dryIceDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public ShipmentDryIceDetail getDryIceDetail() {
        return dryIceDetail;
    }

    /**
     * 设置dryIceDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDryIceDetail }
     *     
     */
    public void setDryIceDetail(ShipmentDryIceDetail value) {
        this.dryIceDetail = value;
    }

    /**
     * 获取adrLicense属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdrLicenseDetail }
     *     
     */
    public AdrLicenseDetail getAdrLicense() {
        return adrLicense;
    }

    /**
     * 设置adrLicense属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdrLicenseDetail }
     *     
     */
    public void setAdrLicense(AdrLicenseDetail value) {
        this.adrLicense = value;
    }

}
