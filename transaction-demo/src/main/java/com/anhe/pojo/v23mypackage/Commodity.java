
package com.anhe.pojo.v23mypackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Commodity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Commodity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{http://fedex.com/ws/ship/v23}CommodityPurposeType" minOccurs="0"/>
 *         &lt;element name="CountryOfManufacture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HarmonizedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://fedex.com/ws/ship/v23}Weight"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuantityUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalMeasures" type="{http://fedex.com/ws/ship/v23}Measure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="CustomsValue" type="{http://fedex.com/ws/ship/v23}Money" minOccurs="0"/>
 *         &lt;element name="ExciseConditions" type="{http://fedex.com/ws/ship/v23}EdtExciseCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExportLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportLicenseExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CIMarksAndNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NaftaDetail" type="{http://fedex.com/ws/ship/v23}NaftaCommodityDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "name",
    "numberOfPieces",
    "description",
    "purpose",
    "countryOfManufacture",
    "harmonizedCode",
    "weight",
    "quantity",
    "quantityUnits",
    "additionalMeasures",
    "unitPrice",
    "customsValue",
    "exciseConditions",
    "exportLicenseNumber",
    "exportLicenseExpirationDate",
    "ciMarksAndNumbers",
    "partNumber",
    "naftaDetail"
})
public class Commodity {

    @XmlElement(name = "Name", namespace = "http://fedex.com/ws/ship/v23")
    protected String name;
    @XmlElement(name = "NumberOfPieces", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPieces;
    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected String description;
    @XmlElement(name = "Purpose", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CommodityPurposeType purpose;
    @XmlElement(name = "CountryOfManufacture", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String countryOfManufacture;
    @XmlElement(name = "HarmonizedCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String harmonizedCode;
    @XmlElement(name = "Weight", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected Weight weight;
    @XmlElement(name = "Quantity", namespace = "http://fedex.com/ws/ship/v23")
    protected BigDecimal quantity;
    @XmlElement(name = "QuantityUnits", namespace = "http://fedex.com/ws/ship/v23")
    protected String quantityUnits;
    @XmlElement(name = "AdditionalMeasures", namespace = "http://fedex.com/ws/ship/v23")
    protected List<Measure> additionalMeasures;
    @XmlElement(name = "UnitPrice", namespace = "http://fedex.com/ws/ship/v23")
    protected Money unitPrice;
    @XmlElement(name = "CustomsValue", namespace = "http://fedex.com/ws/ship/v23")
    protected Money customsValue;
    @XmlElement(name = "ExciseConditions", namespace = "http://fedex.com/ws/ship/v23")
    protected List<EdtExciseCondition> exciseConditions;
    @XmlElement(name = "ExportLicenseNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String exportLicenseNumber;
    @XmlElement(name = "ExportLicenseExpirationDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exportLicenseExpirationDate;
    @XmlElement(name = "CIMarksAndNumbers", namespace = "http://fedex.com/ws/ship/v23")
    protected String ciMarksAndNumbers;
    @XmlElement(name = "PartNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String partNumber;
    @XmlElement(name = "NaftaDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected NaftaCommodityDetail naftaDetail;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取numberOfPieces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * 设置numberOfPieces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPieces(BigInteger value) {
        this.numberOfPieces = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取purpose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommodityPurposeType }
     *     
     */
    public CommodityPurposeType getPurpose() {
        return purpose;
    }

    /**
     * 设置purpose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPurposeType }
     *     
     */
    public void setPurpose(CommodityPurposeType value) {
        this.purpose = value;
    }

    /**
     * 获取countryOfManufacture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    /**
     * 设置countryOfManufacture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfManufacture(String value) {
        this.countryOfManufacture = value;
    }

    /**
     * 获取harmonizedCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    /**
     * 设置harmonizedCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonizedCode(String value) {
        this.harmonizedCode = value;
    }

    /**
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setWeight(Weight value) {
        this.weight = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * 获取quantityUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityUnits() {
        return quantityUnits;
    }

    /**
     * 设置quantityUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityUnits(String value) {
        this.quantityUnits = value;
    }

    /**
     * Gets the value of the additionalMeasures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMeasures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMeasures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Measure }
     * 
     * 
     */
    public List<Measure> getAdditionalMeasures() {
        if (additionalMeasures == null) {
            additionalMeasures = new ArrayList<Measure>();
        }
        return this.additionalMeasures;
    }

    /**
     * 获取unitPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnitPrice() {
        return unitPrice;
    }

    /**
     * 设置unitPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnitPrice(Money value) {
        this.unitPrice = value;
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
     * Gets the value of the exciseConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exciseConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExciseConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdtExciseCondition }
     * 
     * 
     */
    public List<EdtExciseCondition> getExciseConditions() {
        if (exciseConditions == null) {
            exciseConditions = new ArrayList<EdtExciseCondition>();
        }
        return this.exciseConditions;
    }

    /**
     * 获取exportLicenseNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportLicenseNumber() {
        return exportLicenseNumber;
    }

    /**
     * 设置exportLicenseNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportLicenseNumber(String value) {
        this.exportLicenseNumber = value;
    }

    /**
     * 获取exportLicenseExpirationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExportLicenseExpirationDate() {
        return exportLicenseExpirationDate;
    }

    /**
     * 设置exportLicenseExpirationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExportLicenseExpirationDate(XMLGregorianCalendar value) {
        this.exportLicenseExpirationDate = value;
    }

    /**
     * 获取ciMarksAndNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIMarksAndNumbers() {
        return ciMarksAndNumbers;
    }

    /**
     * 设置ciMarksAndNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIMarksAndNumbers(String value) {
        this.ciMarksAndNumbers = value;
    }

    /**
     * 获取partNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * 设置partNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * 获取naftaDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NaftaCommodityDetail }
     *     
     */
    public NaftaCommodityDetail getNaftaDetail() {
        return naftaDetail;
    }

    /**
     * 设置naftaDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaCommodityDetail }
     *     
     */
    public void setNaftaDetail(NaftaCommodityDetail value) {
        this.naftaDetail = value;
    }

}
