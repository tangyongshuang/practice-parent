
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Descriptive data for the client submitting a transaction.
 * 
 * <p>ClientDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ClientDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MeterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IntegratorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ClientDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "accountNumber",
    "meterNumber",
    "integratorId",
    "localization"
})
public class ClientDetail {

    @XmlElement(name = "AccountNumber", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String accountNumber;
    @XmlElement(name = "MeterNumber", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String meterNumber;
    @XmlElement(name = "IntegratorId", namespace = "http://fedex.com/ws/ship/v23")
    protected String integratorId;
    @XmlElement(name = "Localization", namespace = "http://fedex.com/ws/ship/v23")
    protected Localization localization;

    /**
     * 获取accountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置accountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * 获取meterNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNumber() {
        return meterNumber;
    }

    /**
     * 设置meterNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNumber(String value) {
        this.meterNumber = value;
    }

    /**
     * 获取integratorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratorId() {
        return integratorId;
    }

    /**
     * 设置integratorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratorId(String value) {
        this.integratorId = value;
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
