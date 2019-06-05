
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The descriptive data for a point-of-contact person.
 * 
 * <p>Contact complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TollFreePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PagerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "contactId",
    "personName",
    "title",
    "companyName",
    "phoneNumber",
    "phoneExtension",
    "tollFreePhoneNumber",
    "pagerNumber",
    "faxNumber",
    "eMailAddress"
})
public class Contact {

    @XmlElement(name = "ContactId", namespace = "http://fedex.com/ws/ship/v23")
    protected String contactId;
    @XmlElement(name = "PersonName", namespace = "http://fedex.com/ws/ship/v23")
    protected String personName;
    @XmlElement(name = "Title", namespace = "http://fedex.com/ws/ship/v23")
    protected String title;
    @XmlElement(name = "CompanyName", namespace = "http://fedex.com/ws/ship/v23")
    protected String companyName;
    @XmlElement(name = "PhoneNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String phoneNumber;
    @XmlElement(name = "PhoneExtension", namespace = "http://fedex.com/ws/ship/v23")
    protected String phoneExtension;
    @XmlElement(name = "TollFreePhoneNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String tollFreePhoneNumber;
    @XmlElement(name = "PagerNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String pagerNumber;
    @XmlElement(name = "FaxNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String faxNumber;
    @XmlElement(name = "EMailAddress", namespace = "http://fedex.com/ws/ship/v23")
    protected String eMailAddress;

    /**
     * 获取contactId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * 设置contactId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * 获取personName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 设置personName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取companyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置companyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * 获取phoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置phoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * 获取phoneExtension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * 设置phoneExtension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtension(String value) {
        this.phoneExtension = value;
    }

    /**
     * 获取tollFreePhoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollFreePhoneNumber() {
        return tollFreePhoneNumber;
    }

    /**
     * 设置tollFreePhoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollFreePhoneNumber(String value) {
        this.tollFreePhoneNumber = value;
    }

    /**
     * 获取pagerNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerNumber() {
        return pagerNumber;
    }

    /**
     * 设置pagerNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerNumber(String value) {
        this.pagerNumber = value;
    }

    /**
     * 获取faxNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * 设置faxNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * 获取eMailAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAddress() {
        return eMailAddress;
    }

    /**
     * 设置eMailAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAddress(String value) {
        this.eMailAddress = value;
    }

}
