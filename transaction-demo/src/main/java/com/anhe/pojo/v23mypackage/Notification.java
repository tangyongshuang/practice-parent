
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The descriptive data regarding the result of the submitted transaction.
 * 
 * <p>Notification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Severity" type="{http://fedex.com/ws/ship/v23}NotificationSeverityType"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalizedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageParameters" type="{http://fedex.com/ws/ship/v23}NotificationParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "severity",
    "source",
    "code",
    "message",
    "localizedMessage",
    "messageParameters"
})
public class Notification {

    @XmlElement(name = "Severity", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected NotificationSeverityType severity;
    @XmlElement(name = "Source", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String source;
    @XmlElement(name = "Code", namespace = "http://fedex.com/ws/ship/v23")
    protected String code;
    @XmlElement(name = "Message", namespace = "http://fedex.com/ws/ship/v23")
    protected String message;
    @XmlElement(name = "LocalizedMessage", namespace = "http://fedex.com/ws/ship/v23")
    protected String localizedMessage;
    @XmlElement(name = "MessageParameters", namespace = "http://fedex.com/ws/ship/v23")
    protected List<NotificationParameter> messageParameters;

    /**
     * 获取severity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NotificationSeverityType }
     *     
     */
    public NotificationSeverityType getSeverity() {
        return severity;
    }

    /**
     * 设置severity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSeverityType }
     *     
     */
    public void setSeverity(NotificationSeverityType value) {
        this.severity = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * 获取localizedMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizedMessage() {
        return localizedMessage;
    }

    /**
     * 设置localizedMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizedMessage(String value) {
        this.localizedMessage = value;
    }

    /**
     * Gets the value of the messageParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationParameter }
     * 
     * 
     */
    public List<NotificationParameter> getMessageParameters() {
        if (messageParameters == null) {
            messageParameters = new ArrayList<NotificationParameter>();
        }
        return this.messageParameters;
    }

}
