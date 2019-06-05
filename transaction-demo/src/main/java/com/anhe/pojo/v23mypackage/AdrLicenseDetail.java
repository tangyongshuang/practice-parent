
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the details around the ADR license required for shipping.
 * 
 * <p>AdrLicenseDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AdrLicenseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseOrPermitDetail" type="{http://fedex.com/ws/ship/v23}LicenseOrPermitDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdrLicenseDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "licenseOrPermitDetail"
})
public class AdrLicenseDetail {

    @XmlElement(name = "LicenseOrPermitDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected LicenseOrPermitDetail licenseOrPermitDetail;

    /**
     * 获取licenseOrPermitDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LicenseOrPermitDetail }
     *     
     */
    public LicenseOrPermitDetail getLicenseOrPermitDetail() {
        return licenseOrPermitDetail;
    }

    /**
     * 设置licenseOrPermitDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseOrPermitDetail }
     *     
     */
    public void setLicenseOrPermitDetail(LicenseOrPermitDetail value) {
        this.licenseOrPermitDetail = value;
    }

}
