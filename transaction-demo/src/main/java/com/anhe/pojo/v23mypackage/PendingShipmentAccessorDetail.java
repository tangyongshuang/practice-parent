
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the details to be used by the user of the pending shipment
 * 
 * <p>PendingShipmentAccessorDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PendingShipmentAccessorDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{http://fedex.com/ws/ship/v23}AccessorRoleType" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailLabelUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingShipmentAccessorDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "role",
    "userId",
    "password",
    "emailLabelUrl"
})
public class PendingShipmentAccessorDetail {

    @XmlElement(name = "Role", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected AccessorRoleType role;
    @XmlElement(name = "UserId", namespace = "http://fedex.com/ws/ship/v23")
    protected String userId;
    @XmlElement(name = "Password", namespace = "http://fedex.com/ws/ship/v23")
    protected String password;
    @XmlElement(name = "EmailLabelUrl", namespace = "http://fedex.com/ws/ship/v23")
    protected String emailLabelUrl;

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
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取emailLabelUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailLabelUrl() {
        return emailLabelUrl;
    }

    /**
     * 设置emailLabelUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailLabelUrl(String value) {
        this.emailLabelUrl = value;
    }

}
