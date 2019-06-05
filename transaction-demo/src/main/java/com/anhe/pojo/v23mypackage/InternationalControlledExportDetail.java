
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>InternationalControlledExportDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InternationalControlledExportDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}InternationalControlledExportType"/>
 *         &lt;element name="ForeignTradeZoneCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseOrPermitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseOrPermitExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalControlledExportDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "foreignTradeZoneCode",
    "entryNumber",
    "licenseOrPermitNumber",
    "licenseOrPermitExpirationDate"
})
public class InternationalControlledExportDetail {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected InternationalControlledExportType type;
    @XmlElement(name = "ForeignTradeZoneCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String foreignTradeZoneCode;
    @XmlElement(name = "EntryNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String entryNumber;
    @XmlElement(name = "LicenseOrPermitNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String licenseOrPermitNumber;
    @XmlElement(name = "LicenseOrPermitExpirationDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseOrPermitExpirationDate;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InternationalControlledExportType }
     *     
     */
    public InternationalControlledExportType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalControlledExportType }
     *     
     */
    public void setType(InternationalControlledExportType value) {
        this.type = value;
    }

    /**
     * 获取foreignTradeZoneCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignTradeZoneCode() {
        return foreignTradeZoneCode;
    }

    /**
     * 设置foreignTradeZoneCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignTradeZoneCode(String value) {
        this.foreignTradeZoneCode = value;
    }

    /**
     * 获取entryNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /**
     * 设置entryNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryNumber(String value) {
        this.entryNumber = value;
    }

    /**
     * 获取licenseOrPermitNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseOrPermitNumber() {
        return licenseOrPermitNumber;
    }

    /**
     * 设置licenseOrPermitNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseOrPermitNumber(String value) {
        this.licenseOrPermitNumber = value;
    }

    /**
     * 获取licenseOrPermitExpirationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicenseOrPermitExpirationDate() {
        return licenseOrPermitExpirationDate;
    }

    /**
     * 设置licenseOrPermitExpirationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLicenseOrPermitExpirationDate(XMLGregorianCalendar value) {
        this.licenseOrPermitExpirationDate = value;
    }

}
