
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProcessTagRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessTagRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/ship/v23}WebAuthenticationDetail"/>
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/ship/v23}ClientDetail"/>
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/ship/v23}TransactionDetail" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://fedex.com/ws/ship/v23}VersionId"/>
 *         &lt;element name="RequestedShipment" type="{http://fedex.com/ws/ship/v23}RequestedShipment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessTagRequest", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "requestedShipment"
})
public class ProcessTagRequest {

    @XmlElement(name = "WebAuthenticationDetail", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected VersionId version;
    @XmlElement(name = "RequestedShipment", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected RequestedShipment requestedShipment;

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
     * 获取requestedShipment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestedShipment }
     *     
     */
    public RequestedShipment getRequestedShipment() {
        return requestedShipment;
    }

    /**
     * 设置requestedShipment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedShipment }
     *     
     */
    public void setRequestedShipment(RequestedShipment value) {
        this.requestedShipment = value;
    }

}
