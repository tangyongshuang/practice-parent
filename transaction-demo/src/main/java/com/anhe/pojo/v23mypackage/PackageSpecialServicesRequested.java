
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * These special services are available at the package level for some or all service types. If the shipper is requesting a special service which requires additional data, the package special service type must be present in the specialServiceTypes collection, and the supporting detail must be provided in the appropriate sub-object below.
 * 
 * <p>PackageSpecialServicesRequested complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PackageSpecialServicesRequested">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialServiceTypes" type="{http://fedex.com/ws/ship/v23}PackageSpecialServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodDetail" type="{http://fedex.com/ws/ship/v23}CodDetail" minOccurs="0"/>
 *         &lt;element name="DangerousGoodsDetail" type="{http://fedex.com/ws/ship/v23}DangerousGoodsDetail" minOccurs="0"/>
 *         &lt;element name="BatteryDetails" type="{http://fedex.com/ws/ship/v23}BatteryClassificationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DryIceWeight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="SignatureOptionDetail" type="{http://fedex.com/ws/ship/v23}SignatureOptionDetail" minOccurs="0"/>
 *         &lt;element name="PriorityAlertDetail" type="{http://fedex.com/ws/ship/v23}PriorityAlertDetail" minOccurs="0"/>
 *         &lt;element name="AlcoholDetail" type="{http://fedex.com/ws/ship/v23}AlcoholDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageSpecialServicesRequested", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "specialServiceTypes",
    "codDetail",
    "dangerousGoodsDetail",
    "batteryDetails",
    "dryIceWeight",
    "signatureOptionDetail",
    "priorityAlertDetail",
    "alcoholDetail"
})
public class PackageSpecialServicesRequested {

    @XmlElement(name = "SpecialServiceTypes", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<PackageSpecialServiceType> specialServiceTypes;
    @XmlElement(name = "CodDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CodDetail codDetail;
    @XmlElement(name = "DangerousGoodsDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected DangerousGoodsDetail dangerousGoodsDetail;
    @XmlElement(name = "BatteryDetails", namespace = "http://fedex.com/ws/ship/v23")
    protected List<BatteryClassificationDetail> batteryDetails;
    @XmlElement(name = "DryIceWeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight dryIceWeight;
    @XmlElement(name = "SignatureOptionDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected SignatureOptionDetail signatureOptionDetail;
    @XmlElement(name = "PriorityAlertDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected PriorityAlertDetail priorityAlertDetail;
    @XmlElement(name = "AlcoholDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected AlcoholDetail alcoholDetail;

    /**
     * Gets the value of the specialServiceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageSpecialServiceType }
     * 
     * 
     */
    public List<PackageSpecialServiceType> getSpecialServiceTypes() {
        if (specialServiceTypes == null) {
            specialServiceTypes = new ArrayList<PackageSpecialServiceType>();
        }
        return this.specialServiceTypes;
    }

    /**
     * 获取codDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodDetail }
     *     
     */
    public CodDetail getCodDetail() {
        return codDetail;
    }

    /**
     * 设置codDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodDetail }
     *     
     */
    public void setCodDetail(CodDetail value) {
        this.codDetail = value;
    }

    /**
     * 获取dangerousGoodsDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsDetail }
     *     
     */
    public DangerousGoodsDetail getDangerousGoodsDetail() {
        return dangerousGoodsDetail;
    }

    /**
     * 设置dangerousGoodsDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsDetail }
     *     
     */
    public void setDangerousGoodsDetail(DangerousGoodsDetail value) {
        this.dangerousGoodsDetail = value;
    }

    /**
     * Gets the value of the batteryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batteryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatteryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatteryClassificationDetail }
     * 
     * 
     */
    public List<BatteryClassificationDetail> getBatteryDetails() {
        if (batteryDetails == null) {
            batteryDetails = new ArrayList<BatteryClassificationDetail>();
        }
        return this.batteryDetails;
    }

    /**
     * 获取dryIceWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getDryIceWeight() {
        return dryIceWeight;
    }

    /**
     * 设置dryIceWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setDryIceWeight(Weight value) {
        this.dryIceWeight = value;
    }

    /**
     * 获取signatureOptionDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SignatureOptionDetail }
     *     
     */
    public SignatureOptionDetail getSignatureOptionDetail() {
        return signatureOptionDetail;
    }

    /**
     * 设置signatureOptionDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureOptionDetail }
     *     
     */
    public void setSignatureOptionDetail(SignatureOptionDetail value) {
        this.signatureOptionDetail = value;
    }

    /**
     * 获取priorityAlertDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriorityAlertDetail }
     *     
     */
    public PriorityAlertDetail getPriorityAlertDetail() {
        return priorityAlertDetail;
    }

    /**
     * 设置priorityAlertDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityAlertDetail }
     *     
     */
    public void setPriorityAlertDetail(PriorityAlertDetail value) {
        this.priorityAlertDetail = value;
    }

    /**
     * 获取alcoholDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AlcoholDetail }
     *     
     */
    public AlcoholDetail getAlcoholDetail() {
        return alcoholDetail;
    }

    /**
     * 设置alcoholDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholDetail }
     *     
     */
    public void setAlcoholDetail(AlcoholDetail value) {
        this.alcoholDetail = value;
    }

}
