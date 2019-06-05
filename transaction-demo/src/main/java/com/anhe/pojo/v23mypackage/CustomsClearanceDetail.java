
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomsClearanceDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomsClearanceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Brokers" type="{http://fedex.com/ws/ship/v23}BrokerDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClearanceBrokerage" type="{http://fedex.com/ws/ship/v23}ClearanceBrokerageType" minOccurs="0"/>
 *         &lt;element name="CustomsOptions" type="{http://fedex.com/ws/ship/v23}CustomsOptionDetail" minOccurs="0"/>
 *         &lt;element name="ImporterOfRecord" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *         &lt;element name="RecipientCustomsId" type="{http://fedex.com/ws/ship/v23}RecipientCustomsId" minOccurs="0"/>
 *         &lt;element name="DutiesPayment" type="{http://fedex.com/ws/ship/v23}Payment" minOccurs="0"/>
 *         &lt;element name="DocumentContent" type="{http://fedex.com/ws/ship/v23}InternationalDocumentContentType" minOccurs="0"/>
 *         &lt;element name="CustomsValue" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="FreightOnValue" type="{http://fedex.com/ws/ship/v23}FreightOnValueType" minOccurs="0"/>
 *         &lt;element name="InsuranceCharges" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="PartiesToTransactionAreRelated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CommercialInvoice" type="{http://fedex.com/ws/ship/v23}CommercialInvoice" minOccurs="0"/>
 *         &lt;element name="Commodities" type="{http://fedex.com/ws/ship/v23}Commodity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExportDetail" type="{http://fedex.com/ws/ship/v23}ExportDetail" minOccurs="0"/>
 *         &lt;element name="RegulatoryControls" type="{http://fedex.com/ws/ship/v23}RegulatoryControlType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeclarationStatementDetail" type="{http://fedex.com/ws/ship/v23}CustomsDeclarationStatementDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsClearanceDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "brokers",
    "clearanceBrokerage",
    "customsOptions",
    "importerOfRecord",
    "recipientCustomsId",
    "dutiesPayment",
    "documentContent",
    "customsValue",
    "freightOnValue",
    "insuranceCharges",
    "partiesToTransactionAreRelated",
    "commercialInvoice",
    "commodities",
    "exportDetail",
    "regulatoryControls",
    "declarationStatementDetail"
})
public class CustomsClearanceDetail {

    @XmlElement(name = "Brokers", namespace = "http://fedex.com/ws/ship/v23")
    protected List<BrokerDetail> brokers;
    @XmlElement(name = "ClearanceBrokerage", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ClearanceBrokerageType clearanceBrokerage;
    @XmlElement(name = "CustomsOptions", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomsOptionDetail customsOptions;
    @XmlElement(name = "ImporterOfRecord", namespace = "http://fedex.com/ws/ship/v23")
    protected Party importerOfRecord;
    @XmlElement(name = "RecipientCustomsId", namespace = "http://fedex.com/ws/ship/v23")
    protected RecipientCustomsId recipientCustomsId;
    @XmlElement(name = "DutiesPayment", namespace = "http://fedex.com/ws/ship/v23")
    protected Payment dutiesPayment;
    @XmlElement(name = "DocumentContent", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected InternationalDocumentContentType documentContent;
    @XmlElement(name = "CustomsValue", namespace = "http://fedex.com/ws/ship/v23")
    protected Money customsValue;
    @XmlElement(name = "FreightOnValue", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected FreightOnValueType freightOnValue;
    @XmlElement(name = "InsuranceCharges", namespace = "http://fedex.com/ws/ship/v23")
    protected Money insuranceCharges;
    @XmlElement(name = "PartiesToTransactionAreRelated", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean partiesToTransactionAreRelated;
    @XmlElement(name = "CommercialInvoice", namespace = "http://fedex.com/ws/ship/v23")
    protected CommercialInvoice commercialInvoice;
    @XmlElement(name = "Commodities", namespace = "http://fedex.com/ws/ship/v23")
    protected List<Commodity> commodities;
    @XmlElement(name = "ExportDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ExportDetail exportDetail;
    @XmlElement(name = "RegulatoryControls", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<RegulatoryControlType> regulatoryControls;
    @XmlElement(name = "DeclarationStatementDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CustomsDeclarationStatementDetail declarationStatementDetail;

    /**
     * Gets the value of the brokers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrokerDetail }
     * 
     * 
     */
    public List<BrokerDetail> getBrokers() {
        if (brokers == null) {
            brokers = new ArrayList<BrokerDetail>();
        }
        return this.brokers;
    }

    /**
     * 获取clearanceBrokerage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClearanceBrokerageType }
     *     
     */
    public ClearanceBrokerageType getClearanceBrokerage() {
        return clearanceBrokerage;
    }

    /**
     * 设置clearanceBrokerage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceBrokerageType }
     *     
     */
    public void setClearanceBrokerage(ClearanceBrokerageType value) {
        this.clearanceBrokerage = value;
    }

    /**
     * 获取customsOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomsOptionDetail }
     *     
     */
    public CustomsOptionDetail getCustomsOptions() {
        return customsOptions;
    }

    /**
     * 设置customsOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsOptionDetail }
     *     
     */
    public void setCustomsOptions(CustomsOptionDetail value) {
        this.customsOptions = value;
    }

    /**
     * 获取importerOfRecord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getImporterOfRecord() {
        return importerOfRecord;
    }

    /**
     * 设置importerOfRecord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setImporterOfRecord(Party value) {
        this.importerOfRecord = value;
    }

    /**
     * 获取recipientCustomsId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecipientCustomsId }
     *     
     */
    public RecipientCustomsId getRecipientCustomsId() {
        return recipientCustomsId;
    }

    /**
     * 设置recipientCustomsId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientCustomsId }
     *     
     */
    public void setRecipientCustomsId(RecipientCustomsId value) {
        this.recipientCustomsId = value;
    }

    /**
     * 获取dutiesPayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getDutiesPayment() {
        return dutiesPayment;
    }

    /**
     * 设置dutiesPayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setDutiesPayment(Payment value) {
        this.dutiesPayment = value;
    }

    /**
     * 获取documentContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InternationalDocumentContentType }
     *     
     */
    public InternationalDocumentContentType getDocumentContent() {
        return documentContent;
    }

    /**
     * 设置documentContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalDocumentContentType }
     *     
     */
    public void setDocumentContent(InternationalDocumentContentType value) {
        this.documentContent = value;
    }

    /**
     * 获取customsValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCustomsValue() {
        return customsValue;
    }

    /**
     * 设置customsValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCustomsValue(Money value) {
        this.customsValue = value;
    }

    /**
     * 获取freightOnValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreightOnValueType }
     *     
     */
    public FreightOnValueType getFreightOnValue() {
        return freightOnValue;
    }

    /**
     * 设置freightOnValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreightOnValueType }
     *     
     */
    public void setFreightOnValue(FreightOnValueType value) {
        this.freightOnValue = value;
    }

    /**
     * 获取insuranceCharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getInsuranceCharges() {
        return insuranceCharges;
    }

    /**
     * 设置insuranceCharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setInsuranceCharges(Money value) {
        this.insuranceCharges = value;
    }

    /**
     * 获取partiesToTransactionAreRelated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartiesToTransactionAreRelated() {
        return partiesToTransactionAreRelated;
    }

    /**
     * 设置partiesToTransactionAreRelated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartiesToTransactionAreRelated(Boolean value) {
        this.partiesToTransactionAreRelated = value;
    }

    /**
     * 获取commercialInvoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommercialInvoice }
     *     
     */
    public CommercialInvoice getCommercialInvoice() {
        return commercialInvoice;
    }

    /**
     * 设置commercialInvoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialInvoice }
     *     
     */
    public void setCommercialInvoice(CommercialInvoice value) {
        this.commercialInvoice = value;
    }

    /**
     * Gets the value of the commodities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commodity }
     * 
     * 
     */
    public List<Commodity> getCommodities() {
        if (commodities == null) {
            commodities = new ArrayList<Commodity>();
        }
        return this.commodities;
    }

    /**
     * 获取exportDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExportDetail }
     *     
     */
    public ExportDetail getExportDetail() {
        return exportDetail;
    }

    /**
     * 设置exportDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDetail }
     *     
     */
    public void setExportDetail(ExportDetail value) {
        this.exportDetail = value;
    }

    /**
     * Gets the value of the regulatoryControls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatoryControls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatoryControls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryControlType }
     * 
     * 
     */
    public List<RegulatoryControlType> getRegulatoryControls() {
        if (regulatoryControls == null) {
            regulatoryControls = new ArrayList<RegulatoryControlType>();
        }
        return this.regulatoryControls;
    }

    /**
     * 获取declarationStatementDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomsDeclarationStatementDetail }
     *     
     */
    public CustomsDeclarationStatementDetail getDeclarationStatementDetail() {
        return declarationStatementDetail;
    }

    /**
     * 设置declarationStatementDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDeclarationStatementDetail }
     *     
     */
    public void setDeclarationStatementDetail(CustomsDeclarationStatementDetail value) {
        this.declarationStatementDetail = value;
    }

}
