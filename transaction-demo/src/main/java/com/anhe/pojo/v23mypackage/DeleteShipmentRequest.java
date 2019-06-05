
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>DeleteShipmentRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeleteShipmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/ship/v23}WebAuthenticationDetail"/>
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/ship/v23}ClientDetail"/>
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/ship/v23}TransactionDetail" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://fedex.com/ws/ship/v23}VersionId"/>
 *         &lt;element name="ShipTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TrackingId" type="{http://fedex.com/ws/ship/v23}TrackingId" minOccurs="0"/>
 *         &lt;element name="DeletionControl" type="{http://fedex.com/ws/ship/v23}DeletionControlType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteShipmentRequest", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "shipTimestamp",
    "trackingId",
    "deletionControl"
})
public class DeleteShipmentRequest {

    @XmlElement(name = "WebAuthenticationDetail", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected VersionId version;
    @XmlElement(name = "ShipTimestamp", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipTimestamp;
    @XmlElement(name = "TrackingId", namespace = "http://fedex.com/ws/ship/v23")
    protected TrackingId trackingId;
    @XmlElement(name = "DeletionControl", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected DeletionControlType deletionControl;

    /**
     * 获取webAuthenticationDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }

    /**
     * 设置webAuthenticationDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail value) {
        this.webAuthenticationDetail = value;
    }

    /**
     * 获取clientDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClientDetail }
     *     
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }

    /**
     * 设置clientDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetail }
     *     
     */
    public void setClientDetail(ClientDetail value) {
        this.clientDetail = value;
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
     * 获取shipTimestamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipTimestamp() {
        return shipTimestamp;
    }

    /**
     * 设置shipTimestamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipTimestamp(XMLGregorianCalendar value) {
        this.shipTimestamp = value;
    }

    /**
     * 获取trackingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrackingId }
     *     
     */
    public TrackingId getTrackingId() {
        return trackingId;
    }

    /**
     * 设置trackingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingId }
     *     
     */
    public void setTrackingId(TrackingId value) {
        this.trackingId = value;
    }

    /**
     * 获取deletionControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeletionControlType }
     *     
     */
    public DeletionControlType getDeletionControl() {
        return deletionControl;
    }

    /**
     * 设置deletionControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeletionControlType }
     *     
     */
    public void setDeletionControl(DeletionControlType value) {
        this.deletionControl = value;
    }

}
