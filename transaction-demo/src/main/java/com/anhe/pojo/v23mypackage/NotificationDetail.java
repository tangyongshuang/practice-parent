
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotificationDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NotificationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationType" type="{http://fedex.com/ws/ship/v23}NotificationType" minOccurs="0"/>
 *         &lt;element name="EmailDetail" type="{http://fedex.com/ws/ship/v23}EMailDetail" minOccurs="0"/>
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
@XmlType(name = "NotificationDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "notificationType",
    "emailDetail",
    "localization"
})
public class NotificationDetail {

    @XmlElement(name = "NotificationType", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected NotificationType notificationType;
    @XmlElement(name = "EmailDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected EMailDetail emailDetail;
    @XmlElement(name = "Localization", namespace = "http://fedex.com/ws/ship/v23")
    protected Localization localization;

    /**
     * 获取notificationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * 设置notificationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotificationType(NotificationType value) {
        this.notificationType = value;
    }

    /**
     * 获取emailDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EMailDetail }
     *     
     */
    public EMailDetail getEmailDetail() {
        return emailDetail;
    }

    /**
     * 设置emailDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EMailDetail }
     *     
     */
    public void setEmailDetail(EMailDetail value) {
        this.emailDetail = value;
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
