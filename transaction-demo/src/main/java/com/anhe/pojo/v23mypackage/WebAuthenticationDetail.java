
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used in authentication of the sender's identity.
 * 
 * <p>WebAuthenticationDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WebAuthenticationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentCredential" type="{http://fedex.com/ws/ship/v23}WebAuthenticationCredential" minOccurs="0"/>
 *         &lt;element name="UserCredential" type="{http://fedex.com/ws/ship/v23}WebAuthenticationCredential"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebAuthenticationDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "parentCredential",
    "userCredential"
})
public class WebAuthenticationDetail {

    @XmlElement(name = "ParentCredential", namespace = "http://fedex.com/ws/ship/v23")
    protected WebAuthenticationCredential parentCredential;
    @XmlElement(name = "UserCredential", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected WebAuthenticationCredential userCredential;

    /**
     * 获取parentCredential属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationCredential }
     *     
     */
    public WebAuthenticationCredential getParentCredential() {
        return parentCredential;
    }

    /**
     * 设置parentCredential属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationCredential }
     *     
     */
    public void setParentCredential(WebAuthenticationCredential value) {
        this.parentCredential = value;
    }

    /**
     * 获取userCredential属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationCredential }
     *     
     */
    public WebAuthenticationCredential getUserCredential() {
        return userCredential;
    }

    /**
     * 设置userCredential属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationCredential }
     *     
     */
    public void setUserCredential(WebAuthenticationCredential value) {
        this.userCredential = value;
    }

}
