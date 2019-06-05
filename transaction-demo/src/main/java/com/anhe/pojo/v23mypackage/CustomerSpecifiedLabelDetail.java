
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
 * Allows customer-specified control of label content.
 * 
 * <p>CustomerSpecifiedLabelDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerSpecifiedLabelDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocTabContent" type="{http://fedex.com/ws/ship/v23}DocTabContent" minOccurs="0"/>
 *         &lt;element name="CustomContentPosition" type="{http://fedex.com/ws/ship/v23}RelativeVerticalPositionType" minOccurs="0"/>
 *         &lt;element name="CustomContent" type="{http://fedex.com/ws/ship/v23}CustomLabelDetail" minOccurs="0"/>
 *         &lt;element name="ConfigurableReferenceEntries" type="{http://fedex.com/ws/ship/v23}ConfigurableLabelReferenceEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaskedData" type="{http://fedex.com/ws/ship/v23}LabelMaskableDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecondaryBarcode" type="{http://fedex.com/ws/ship/v23}SecondaryBarcodeType" minOccurs="0"/>
 *         &lt;element name="TermsAndConditionsLocalization" type="{http://fedex.com/ws/ship/v23}Localization" minOccurs="0"/>
 *         &lt;element name="RegulatoryLabels" type="{http://fedex.com/ws/ship/v23}RegulatoryLabelContentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalLabels" type="{http://fedex.com/ws/ship/v23}AdditionalLabelsDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirWaybillSuppressionCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSpecifiedLabelDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "docTabContent",
    "customContentPosition",
    "customContent",
    "configurableReferenceEntries",
    "maskedData",
    "secondaryBarcode",
    "termsAndConditionsLocalization",
    "regulatoryLabels",
    "additionalLabels",
    "airWaybillSuppressionCount"
})
public class CustomerSpecifiedLabelDetail {

    @XmlElement(name = "DocTabContent", namespace = "http://fedex.com/ws/ship/v23")
    protected DocTabContent docTabContent;
    @XmlElement(name = "CustomContentPosition", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RelativeVerticalPositionType customContentPosition;
    @XmlElement(name = "CustomContent", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomLabelDetail customContent;
    @XmlElement(name = "ConfigurableReferenceEntries", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ConfigurableLabelReferenceEntry> configurableReferenceEntries;
    @XmlElement(name = "MaskedData", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<LabelMaskableDataType> maskedData;
    @XmlElement(name = "SecondaryBarcode", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected SecondaryBarcodeType secondaryBarcode;
    @XmlElement(name = "TermsAndConditionsLocalization", namespace = "http://fedex.com/ws/ship/v23")
    protected Localization termsAndConditionsLocalization;
    @XmlElement(name = "RegulatoryLabels", namespace = "http://fedex.com/ws/ship/v23")
    protected List<RegulatoryLabelContentDetail> regulatoryLabels;
    @XmlElement(name = "AdditionalLabels", namespace = "http://fedex.com/ws/ship/v23")
    protected List<AdditionalLabelsDetail> additionalLabels;
    @XmlElement(name = "AirWaybillSuppressionCount", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger airWaybillSuppressionCount;

    /**
     * 获取docTabContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocTabContent }
     *     
     */
    public DocTabContent getDocTabContent() {
        return docTabContent;
    }

    /**
     * 设置docTabContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabContent }
     *     
     */
    public void setDocTabContent(DocTabContent value) {
        this.docTabContent = value;
    }

    /**
     * 获取customContentPosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelativeVerticalPositionType }
     *     
     */
    public RelativeVerticalPositionType getCustomContentPosition() {
        return customContentPosition;
    }

    /**
     * 设置customContentPosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeVerticalPositionType }
     *     
     */
    public void setCustomContentPosition(RelativeVerticalPositionType value) {
        this.customContentPosition = value;
    }

    /**
     * 获取customContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomLabelDetail }
     *     
     */
    public CustomLabelDetail getCustomContent() {
        return customContent;
    }

    /**
     * 设置customContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLabelDetail }
     *     
     */
    public void setCustomContent(CustomLabelDetail value) {
        this.customContent = value;
    }

    /**
     * Gets the value of the configurableReferenceEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurableReferenceEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurableReferenceEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurableLabelReferenceEntry }
     * 
     * 
     */
    public List<ConfigurableLabelReferenceEntry> getConfigurableReferenceEntries() {
        if (configurableReferenceEntries == null) {
            configurableReferenceEntries = new ArrayList<ConfigurableLabelReferenceEntry>();
        }
        return this.configurableReferenceEntries;
    }

    /**
     * Gets the value of the maskedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maskedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaskedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelMaskableDataType }
     * 
     * 
     */
    public List<LabelMaskableDataType> getMaskedData() {
        if (maskedData == null) {
            maskedData = new ArrayList<LabelMaskableDataType>();
        }
        return this.maskedData;
    }

    /**
     * 获取secondaryBarcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SecondaryBarcodeType }
     *     
     */
    public SecondaryBarcodeType getSecondaryBarcode() {
        return secondaryBarcode;
    }

    /**
     * 设置secondaryBarcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryBarcodeType }
     *     
     */
    public void setSecondaryBarcode(SecondaryBarcodeType value) {
        this.secondaryBarcode = value;
    }

    /**
     * 获取termsAndConditionsLocalization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Localization }
     *     
     */
    public Localization getTermsAndConditionsLocalization() {
        return termsAndConditionsLocalization;
    }

    /**
     * 设置termsAndConditionsLocalization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Localization }
     *     
     */
    public void setTermsAndConditionsLocalization(Localization value) {
        this.termsAndConditionsLocalization = value;
    }

    /**
     * Gets the value of the regulatoryLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatoryLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatoryLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryLabelContentDetail }
     * 
     * 
     */
    public List<RegulatoryLabelContentDetail> getRegulatoryLabels() {
        if (regulatoryLabels == null) {
            regulatoryLabels = new ArrayList<RegulatoryLabelContentDetail>();
        }
        return this.regulatoryLabels;
    }

    /**
     * Gets the value of the additionalLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalLabelsDetail }
     * 
     * 
     */
    public List<AdditionalLabelsDetail> getAdditionalLabels() {
        if (additionalLabels == null) {
            additionalLabels = new ArrayList<AdditionalLabelsDetail>();
        }
        return this.additionalLabels;
    }

    /**
     * 获取airWaybillSuppressionCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAirWaybillSuppressionCount() {
        return airWaybillSuppressionCount;
    }

    /**
     * 设置airWaybillSuppressionCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAirWaybillSuppressionCount(BigInteger value) {
        this.airWaybillSuppressionCount = value;
    }

}
