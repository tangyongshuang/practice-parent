
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the version/level of a service operation expected by a caller (in each request) and performed by the callee (in each reply).
 * 
 * <p>VersionId complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VersionId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Intermediate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionId", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "serviceId",
    "major",
    "intermediate",
    "minor"
})
public class VersionId {

    @XmlElement(name = "ServiceId", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String serviceId;
    @XmlElement(name = "Major", namespace = "http://fedex.com/ws/ship/v23")
    protected int major;
    @XmlElement(name = "Intermediate", namespace = "http://fedex.com/ws/ship/v23")
    protected int intermediate;
    @XmlElement(name = "Minor", namespace = "http://fedex.com/ws/ship/v23")
    protected int minor;

    /**
     * 获取serviceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 设置serviceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * 获取major属性的值。
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * 设置major属性的值。
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * 获取intermediate属性的值。
     * 
     */
    public int getIntermediate() {
        return intermediate;
    }

    /**
     * 设置intermediate属性的值。
     * 
     */
    public void setIntermediate(int value) {
        this.intermediate = value;
    }

    /**
     * 获取minor属性的值。
     * 
     */
    public int getMinor() {
        return minor;
    }

    /**
     * 设置minor属性的值。
     * 
     */
    public void setMinor(int value) {
        this.minor = value;
    }

}
