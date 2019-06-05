
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InternationalTrafficInArmsRegulationsDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InternationalTrafficInArmsRegulationsDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseOrExemptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalTrafficInArmsRegulationsDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "licenseOrExemptionNumber"
})
public class InternationalTrafficInArmsRegulationsDetail {

    @XmlElement(name = "LicenseOrExemptionNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String licenseOrExemptionNumber;

    /**
     * 获取licenseOrExemptionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseOrExemptionNumber() {
        return licenseOrExemptionNumber;
    }

    /**
     * 设置licenseOrExemptionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseOrExemptionNumber(String value) {
        this.licenseOrExemptionNumber = value;
    }

}
