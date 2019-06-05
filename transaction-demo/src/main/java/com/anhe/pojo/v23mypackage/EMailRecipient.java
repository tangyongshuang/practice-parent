
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information describing the address of of the email recipient, role of the email recipient and languages that are requested to be supported.
 * 
 * <p>EMailRecipient complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EMailRecipient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://fedex.com/ws/ship/v23}AccessorRoleType" minOccurs="0"/>
 *         &lt;element name="OptionsRequested" type="{http://fedex.com/ws/ship/v23}EmailOptionsRequested" minOccurs="0"/>
 *         &lt;element name="Localization" type="{http://fedex.com/ws/ship/v23}Localization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMailRecipient", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "emailAddress",
    "role",
    "optionsRequested",
    "localization"
})
public class EMailRecipient {

    @XmlElement(name = "EmailAddress", namespace = "http://fedex.com/ws/ship/v23")
    protected String emailAddress;
    @XmlElement(name = "Role", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected AccessorRoleType role;
    @XmlElement(name = "OptionsRequested", namespace = "http://fedex.com/ws/ship/v23")
    protected EmailOptionsRequested optionsRequested;
    @XmlElement(name = "Localization", namespace = "http://fedex.com/ws/ship/v23")
    protected Localization localization;

    /**
     * 获取emailAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 设置emailAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * 获取role属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccessorRoleType }
     *     
     */
    public AccessorRoleType getRole() {
        return role;
    }

    /**
     * 设置role属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccessorRoleType }
     *     
     */
    public void setRole(AccessorRoleType value) {
        this.role = value;
    }

    /**
     * 获取optionsRequested属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmailOptionsRequested }
     *     
     */
    public EmailOptionsRequested getOptionsRequested() {
        return optionsRequested;
    }

    /**
     * 设置optionsRequested属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmailOptionsRequested }
     *     
     */
    public void setOptionsRequested(EmailOptionsRequested value) {
        this.optionsRequested = value;
    }

    /**
     * 获取localization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Localization }
     *     
     */
    public Localization getLocalization() {
        return localization;
    }

    /**
     * 设置localization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Localization }
     *     
     */
    public void setLocalization(Localization value) {
        this.localization = value;
    }

}
