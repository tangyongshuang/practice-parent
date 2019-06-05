
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains all data required for additional (non-label) shipping documents to be produced in conjunction with a specific shipment.
 * 
 * <p>ShippingDocumentSpecification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShippingDocumentSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDocumentTypes" type="{http://fedex.com/ws/ship/v23}RequestedShippingDocumentType" maxOccurs="unbounded"/>
 *         &lt;element name="CertificateOfOrigin" type="{http://fedex.com/ws/ship/v23}CertificateOfOriginDetail" minOccurs="0"/>
 *         &lt;element name="CommercialInvoiceDetail" type="{http://fedex.com/ws/ship/v23}CommercialInvoiceDetail" minOccurs="0"/>
 *         &lt;element name="CustomPackageDocumentDetail" type="{http://fedex.com/ws/ship/v23}CustomDocumentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomShipmentDocumentDetail" type="{http://fedex.com/ws/ship/v23}CustomDocumentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExportDeclarationDetail" type="{http://fedex.com/ws/ship/v23}ExportDeclarationDetail" minOccurs="0"/>
 *         &lt;element name="GeneralAgencyAgreementDetail" type="{http://fedex.com/ws/ship/v23}GeneralAgencyAgreementDetail" minOccurs="0"/>
 *         &lt;element name="NaftaCertificateOfOriginDetail" type="{http://fedex.com/ws/ship/v23}NaftaCertificateOfOriginDetail" minOccurs="0"/>
 *         &lt;element name="Op900Detail" type="{http://fedex.com/ws/ship/v23}Op900Detail" minOccurs="0"/>
 *         &lt;element name="DangerousGoodsShippersDeclarationDetail" type="{http://fedex.com/ws/ship/v23}DangerousGoodsShippersDeclarationDetail" minOccurs="0"/>
 *         &lt;element name="FreightAddressLabelDetail" type="{http://fedex.com/ws/ship/v23}FreightAddressLabelDetail" minOccurs="0"/>
 *         &lt;element name="FreightBillOfLadingDetail" type="{http://fedex.com/ws/ship/v23}FreightBillOfLadingDetail" minOccurs="0"/>
 *         &lt;element name="ReturnInstructionsDetail" type="{http://fedex.com/ws/ship/v23}ReturnInstructionsDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDocumentSpecification", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "shippingDocumentTypes",
    "certificateOfOrigin",
    "commercialInvoiceDetail",
    "customPackageDocumentDetail",
    "customShipmentDocumentDetail",
    "exportDeclarationDetail",
    "generalAgencyAgreementDetail",
    "naftaCertificateOfOriginDetail",
    "op900Detail",
    "dangerousGoodsShippersDeclarationDetail",
    "freightAddressLabelDetail",
    "freightBillOfLadingDetail",
    "returnInstructionsDetail"
})
public class ShippingDocumentSpecification {

    @XmlElement(name = "ShippingDocumentTypes", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected List<RequestedShippingDocumentType> shippingDocumentTypes;
    @XmlElement(name = "CertificateOfOrigin", namespace = "http://fedex.com/ws/ship/v23")
    protected CertificateOfOriginDetail certificateOfOrigin;
    @XmlElement(name = "CommercialInvoiceDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CommercialInvoiceDetail commercialInvoiceDetail;
    @XmlElement(name = "CustomPackageDocumentDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomDocumentDetail> customPackageDocumentDetail;
    @XmlElement(name = "CustomShipmentDocumentDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected List<CustomDocumentDetail> customShipmentDocumentDetail;
    @XmlElement(name = "ExportDeclarationDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ExportDeclarationDetail exportDeclarationDetail;
    @XmlElement(name = "GeneralAgencyAgreementDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected GeneralAgencyAgreementDetail generalAgencyAgreementDetail;
    @XmlElement(name = "NaftaCertificateOfOriginDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected NaftaCertificateOfOriginDetail naftaCertificateOfOriginDetail;
    @XmlElement(name = "Op900Detail", namespace = "http://fedex.com/ws/ship/v23")
    protected Op900Detail op900Detail;
    @XmlElement(name = "DangerousGoodsShippersDeclarationDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected DangerousGoodsShippersDeclarationDetail dangerousGoodsShippersDeclarationDetail;
    @XmlElement(name = "FreightAddressLabelDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected FreightAddressLabelDetail freightAddressLabelDetail;
    @XmlElement(name = "FreightBillOfLadingDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected FreightBillOfLadingDetail freightBillOfLadingDetail;
    @XmlElement(name = "ReturnInstructionsDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ReturnInstructionsDetail returnInstructionsDetail;

    /**
     * Gets the value of the shippingDocumentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDocumentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDocumentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedShippingDocumentType }
     * 
     * 
     */
    public List<RequestedShippingDocumentType> getShippingDocumentTypes() {
        if (shippingDocumentTypes == null) {
            shippingDocumentTypes = new ArrayList<RequestedShippingDocumentType>();
        }
        return this.shippingDocumentTypes;
    }

    /**
     * 获取certificateOfOrigin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CertificateOfOriginDetail }
     *     
     */
    public CertificateOfOriginDetail getCertificateOfOrigin() {
        return certificateOfOrigin;
    }

    /**
     * 设置certificateOfOrigin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateOfOriginDetail }
     *     
     */
    public void setCertificateOfOrigin(CertificateOfOriginDetail value) {
        this.certificateOfOrigin = value;
    }

    /**
     * 获取commercialInvoiceDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommercialInvoiceDetail }
     *     
     */
    public CommercialInvoiceDetail getCommercialInvoiceDetail() {
        return commercialInvoiceDetail;
    }

    /**
     * 设置commercialInvoiceDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialInvoiceDetail }
     *     
     */
    public void setCommercialInvoiceDetail(CommercialInvoiceDetail value) {
        this.commercialInvoiceDetail = value;
    }

    /**
     * Gets the value of the customPackageDocumentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customPackageDocumentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomPackageDocumentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomDocumentDetail }
     * 
     * 
     */
    public List<CustomDocumentDetail> getCustomPackageDocumentDetail() {
        if (customPackageDocumentDetail == null) {
            customPackageDocumentDetail = new ArrayList<CustomDocumentDetail>();
        }
        return this.customPackageDocumentDetail;
    }

    /**
     * Gets the value of the customShipmentDocumentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customShipmentDocumentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomShipmentDocumentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomDocumentDetail }
     * 
     * 
     */
    public List<CustomDocumentDetail> getCustomShipmentDocumentDetail() {
        if (customShipmentDocumentDetail == null) {
            customShipmentDocumentDetail = new ArrayList<CustomDocumentDetail>();
        }
        return this.customShipmentDocumentDetail;
    }

    /**
     * 获取exportDeclarationDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExportDeclarationDetail }
     *     
     */
    public ExportDeclarationDetail getExportDeclarationDetail() {
        return exportDeclarationDetail;
    }

    /**
     * 设置exportDeclarationDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDeclarationDetail }
     *     
     */
    public void setExportDeclarationDetail(ExportDeclarationDetail value) {
        this.exportDeclarationDetail = value;
    }

    /**
     * 获取generalAgencyAgreementDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GeneralAgencyAgreementDetail }
     *     
     */
    public GeneralAgencyAgreementDetail getGeneralAgencyAgreementDetail() {
        return generalAgencyAgreementDetail;
    }

    /**
     * 设置generalAgencyAgreementDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralAgencyAgreementDetail }
     *     
     */
    public void setGeneralAgencyAgreementDetail(GeneralAgencyAgreementDetail value) {
        this.generalAgencyAgreementDetail = value;
    }

    /**
     * 获取naftaCertificateOfOriginDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NaftaCertificateOfOriginDetail }
     *     
     */
    public NaftaCertificateOfOriginDetail getNaftaCertificateOfOriginDetail() {
        return naftaCertificateOfOriginDetail;
    }

    /**
     * 设置naftaCertificateOfOriginDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaCertificateOfOriginDetail }
     *     
     */
    public void setNaftaCertificateOfOriginDetail(NaftaCertificateOfOriginDetail value) {
        this.naftaCertificateOfOriginDetail = value;
    }

    /**
     * 获取op900Detail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Op900Detail }
     *     
     */
    public Op900Detail getOp900Detail() {
        return op900Detail;
    }

    /**
     * 设置op900Detail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Op900Detail }
     *     
     */
    public void setOp900Detail(Op900Detail value) {
        this.op900Detail = value;
    }

    /**
     * 获取dangerousGoodsShippersDeclarationDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsShippersDeclarationDetail }
     *     
     */
    public DangerousGoodsShippersDeclarationDetail getDangerousGoodsShippersDeclarationDetail() {
        return dangerousGoodsShippersDeclarationDetail;
    }

    /**
     * 设置dangerousGoodsShippersDeclarationDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsShippersDeclarationDetail }
     *     
     */
    public void setDangerousGoodsShippersDeclarationDetail(DangerousGoodsShippersDeclarationDetail value) {
        this.dangerousGoodsShippersDeclarationDetail = value;
    }

    /**
     * 获取freightAddressLabelDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightAddressLabelDetail }
     *     
     */
    public FreightAddressLabelDetail getFreightAddressLabelDetail() {
        return freightAddressLabelDetail;
    }

    /**
     * 设置freightAddressLabelDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightAddressLabelDetail }
     *     
     */
    public void setFreightAddressLabelDetail(FreightAddressLabelDetail value) {
        this.freightAddressLabelDetail = value;
    }

    /**
     * 获取freightBillOfLadingDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightBillOfLadingDetail }
     *     
     */
    public FreightBillOfLadingDetail getFreightBillOfLadingDetail() {
        return freightBillOfLadingDetail;
    }

    /**
     * 设置freightBillOfLadingDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightBillOfLadingDetail }
     *     
     */
    public void setFreightBillOfLadingDetail(FreightBillOfLadingDetail value) {
        this.freightBillOfLadingDetail = value;
    }

    /**
     * 获取returnInstructionsDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnInstructionsDetail }
     *     
     */
    public ReturnInstructionsDetail getReturnInstructionsDetail() {
        return returnInstructionsDetail;
    }

    /**
     * 设置returnInstructionsDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInstructionsDetail }
     *     
     */
    public void setReturnInstructionsDetail(ReturnInstructionsDetail value) {
        this.returnInstructionsDetail = value;
    }

}
