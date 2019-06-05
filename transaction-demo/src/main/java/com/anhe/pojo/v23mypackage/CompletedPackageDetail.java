
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompletedPackageDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedPackageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TrackingIds" type="{http://fedex.com/ws/ship/v23}TrackingId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GroupNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="OversizeClass" type="{http://fedex.com/ws/ship/v23}OversizeClassType" minOccurs="0"/>
 *         &lt;element name="PackageRating" type="{http://fedex.com/ws/ship/v23}PackageRating" minOccurs="0"/>
 *         &lt;element name="OperationalDetail" type="{http://fedex.com/ws/ship/v23}PackageOperationalDetail" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://fedex.com/ws/ship/v23}ShippingDocument" minOccurs="0"/>
 *         &lt;element name="PackageDocuments" type="{http://fedex.com/ws/ship/v23}ShippingDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodReturnDetail" type="{http://fedex.com/ws/ship/v23}CodReturnPackageDetail" minOccurs="0"/>
 *         &lt;element name="SignatureOption" type="{http://fedex.com/ws/ship/v23}SignatureOptionType" minOccurs="0"/>
 *         &lt;element name="DryIceWeight" type="{http://fedex.com/ws/ship/v23}Weight" minOccurs="0"/>
 *         &lt;element name="HazardousPackageDetail" type="{http://fedex.com/ws/ship/v23}CompletedHazardousPackageDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedPackageDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "sequenceNumber",
    "trackingIds",
    "groupNumber",
    "oversizeClass",
    "packageRating",
    "operationalDetail",
    "label",
    "packageDocuments",
    "codReturnDetail",
    "signatureOption",
    "dryIceWeight",
    "hazardousPackageDetail"
})
public class CompletedPackageDetail {

    @XmlElement(name = "SequenceNumber", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "TrackingIds", namespace = "http://fedex.com/ws/ship/v23")
    protected List<TrackingId> trackingIds;
    @XmlElement(name = "GroupNumber", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupNumber;
    @XmlElement(name = "OversizeClass", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected OversizeClassType oversizeClass;
    @XmlElement(name = "PackageRating", namespace = "http://fedex.com/ws/ship/v23")
    protected PackageRating packageRating;
    @XmlElement(name = "OperationalDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected PackageOperationalDetail operationalDetail;
    @XmlElement(name = "Label", namespace = "http://fedex.com/ws/ship/v23")
    protected ShippingDocument label;
    @XmlElement(name = "PackageDocuments", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ShippingDocument> packageDocuments;
    @XmlElement(name = "CodReturnDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CodReturnPackageDetail codReturnDetail;
    @XmlElement(name = "SignatureOption", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected SignatureOptionType signatureOption;
    @XmlElement(name = "DryIceWeight", namespace = "http://fedex.com/ws/ship/v23")
    protected Weight dryIceWeight;
    @XmlElement(name = "HazardousPackageDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CompletedHazardousPackageDetail hazardousPackageDetail;

    /**
     * 获取sequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 设置sequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the trackingIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingId }
     * 
     * 
     */
    public List<TrackingId> getTrackingIds() {
        if (trackingIds == null) {
            trackingIds = new ArrayList<TrackingId>();
        }
        return this.trackingIds;
    }

    /**
     * 获取groupNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupNumber() {
        return groupNumber;
    }

    /**
     * 设置groupNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupNumber(BigInteger value) {
        this.groupNumber = value;
    }

    /**
     * 获取oversizeClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OversizeClassType }
     *     
     */
    public OversizeClassType getOversizeClass() {
        return oversizeClass;
    }

    /**
     * 设置oversizeClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OversizeClassType }
     *     
     */
    public void setOversizeClass(OversizeClassType value) {
        this.oversizeClass = value;
    }

    /**
     * 获取packageRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageRating }
     *     
     */
    public PackageRating getPackageRating() {
        return packageRating;
    }

    /**
     * 设置packageRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageRating }
     *     
     */
    public void setPackageRating(PackageRating value) {
        this.packageRating = value;
    }

    /**
     * 获取operationalDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageOperationalDetail }
     *     
     */
    public PackageOperationalDetail getOperationalDetail() {
        return operationalDetail;
    }

    /**
     * 设置operationalDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageOperationalDetail }
     *     
     */
    public void setOperationalDetail(PackageOperationalDetail value) {
        this.operationalDetail = value;
    }

    /**
     * 获取label属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocument }
     *     
     */
    public ShippingDocument getLabel() {
        return label;
    }

    /**
     * 设置label属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocument }
     *     
     */
    public void setLabel(ShippingDocument value) {
        this.label = value;
    }

    /**
     * Gets the value of the packageDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocument }
     * 
     * 
     */
    public List<ShippingDocument> getPackageDocuments() {
        if (packageDocuments == null) {
            packageDocuments = new ArrayList<ShippingDocument>();
        }
        return this.packageDocuments;
    }

    /**
     * 获取codReturnDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodReturnPackageDetail }
     *     
     */
    public CodReturnPackageDetail getCodReturnDetail() {
        return codReturnDetail;
    }

    /**
     * 设置codReturnDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodReturnPackageDetail }
     *     
     */
    public void setCodReturnDetail(CodReturnPackageDetail value) {
        this.codReturnDetail = value;
    }

    /**
     * 获取signatureOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SignatureOptionType }
     *     
     */
    public SignatureOptionType getSignatureOption() {
        return signatureOption;
    }

    /**
     * 设置signatureOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureOptionType }
     *     
     */
    public void setSignatureOption(SignatureOptionType value) {
        this.signatureOption = value;
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
     * 获取hazardousPackageDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedHazardousPackageDetail }
     *     
     */
    public CompletedHazardousPackageDetail getHazardousPackageDetail() {
        return hazardousPackageDetail;
    }

    /**
     * 设置hazardousPackageDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedHazardousPackageDetail }
     *     
     */
    public void setHazardousPackageDetail(CompletedHazardousPackageDetail value) {
        this.hazardousPackageDetail = value;
    }

}
