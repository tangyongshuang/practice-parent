
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipmentEventNotificationSpecification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShipmentEventNotificationSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{http://fedex.com/ws/ship/v23}ShipmentNotificationRoleType" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://fedex.com/ws/ship/v23}NotificationEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotificationDetail" type="{http://fedex.com/ws/ship/v23}NotificationDetail" minOccurs="0"/>
 *         &lt;element name="FormatSpecification" type="{http://fedex.com/ws/ship/v23}ShipmentNotificationFormatSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentEventNotificationSpecification", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "role",
    "events",
    "notificationDetail",
    "formatSpecification"
})
public class ShipmentEventNotificationSpecification {

    @XmlElement(name = "Role", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected ShipmentNotificationRoleType role;
    @XmlElement(name = "Events", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<NotificationEventType> events;
    @XmlElement(name = "NotificationDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected NotificationDetail notificationDetail;
    @XmlElement(name = "FormatSpecification", namespace = "http://fedex.com/ws/ship/v23")
    protected ShipmentNotificationFormatSpecification formatSpecification;

    /**
     * 获取role属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNotificationRoleType }
     *     
     */
    public ShipmentNotificationRoleType getRole() {
        return role;
    }

    /**
     * 设置role属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNotificationRoleType }
     *     
     */
    public void setRole(ShipmentNotificationRoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationEventType }
     * 
     * 
     */
    public List<NotificationEventType> getEvents() {
        if (events == null) {
            events = new ArrayList<NotificationEventType>();
        }
        return this.events;
    }

    /**
     * 获取notificationDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotificationDetail }
     *     
     */
    public NotificationDetail getNotificationDetail() {
        return notificationDetail;
    }

    /**
     * 设置notificationDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationDetail }
     *     
     */
    public void setNotificationDetail(NotificationDetail value) {
        this.notificationDetail = value;
    }

    /**
     * 获取formatSpecification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNotificationFormatSpecification }
     *     
     */
    public ShipmentNotificationFormatSpecification getFormatSpecification() {
        return formatSpecification;
    }

    /**
     * 设置formatSpecification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNotificationFormatSpecification }
     *     
     */
    public void setFormatSpecification(ShipmentNotificationFormatSpecification value) {
        this.formatSpecification = value;
    }

}
