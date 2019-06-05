
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProcessShipmentReply complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessShipmentReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HighestSeverity" type="{http://fedex.com/ws/ship/v23}NotificationSeverityType"/>
 *         &lt;element name="Notifications" type="{http://fedex.com/ws/ship/v23}Notification" maxOccurs="unbounded"/>
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/ship/v23}TransactionDetail" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://fedex.com/ws/ship/v23}VersionId"/>
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletedShipmentDetail" type="{http://fedex.com/ws/ship/v23}CompletedShipmentDetail" minOccurs="0"/>
 *         &lt;element name="ErrorLabels" type="{http://fedex.com/ws/ship/v23}ShippingDocument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessShipmentReply", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "highestSeverity",
    "notifications",
    "transactionDetail",
    "version",
    "jobId",
    "completedShipmentDetail",
    "errorLabels"
})
public class ProcessShipmentReply {

    @XmlElement(name = "HighestSeverity", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationSeverityType highestSeverity;
    @XmlElement(name = "Notifications", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected List<Notification> notifications;
    @XmlElement(name = "TransactionDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected VersionId version;
    @XmlElement(name = "JobId", namespace = "http://fedex.com/ws/ship/v23")
    protected String jobId;
    @XmlElement(name = "CompletedShipmentDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected CompletedShipmentDetail completedShipmentDetail;
    @XmlElement(name = "ErrorLabels", namespace = "http://fedex.com/ws/ship/v23")
    protected List<ShippingDocument> errorLabels;

    /**
     * 获取highestSeverity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotificationSeverityType }
     *     
     */
    public NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }

    /**
     * 设置highestSeverity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSeverityType }
     *     
     */
    public void setHighestSeverity(NotificationSeverityType value) {
        this.highestSeverity = value;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * 
     * 
     */
    public List<Notification> getNotifications() {
        if (notifications == null) {
            notifications = new ArrayList<Notification>();
        }
        return this.notifications;
    }

    /**
     * 获取transactionDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetail }
     *     
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * 设置transactionDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetail }
     *     
     */
    public void setTransactionDetail(TransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VersionId }
     *     
     */
    public VersionId getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VersionId }
     *     
     */
    public void setVersion(VersionId value) {
        this.version = value;
    }

    /**
     * 获取jobId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 设置jobId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * 获取completedShipmentDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompletedShipmentDetail }
     *     
     */
    public CompletedShipmentDetail getCompletedShipmentDetail() {
        return completedShipmentDetail;
    }

    /**
     * 设置completedShipmentDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedShipmentDetail }
     *     
     */
    public void setCompletedShipmentDetail(CompletedShipmentDetail value) {
        this.completedShipmentDetail = value;
    }

    /**
     * Gets the value of the errorLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocument }
     * 
     * 
     */
    public List<ShippingDocument> getErrorLabels() {
        if (errorLabels == null) {
            errorLabels = new ArrayList<ShippingDocument>();
        }
        return this.errorLabels;
    }

}
