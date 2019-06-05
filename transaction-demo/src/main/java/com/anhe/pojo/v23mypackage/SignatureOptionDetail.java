
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SignatureOptionDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SignatureOptionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionType" type="{http://fedex.com/ws/ship/v23}SignatureOptionType"/>
 *         &lt;element name="SignatureReleaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureOptionDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "optionType",
    "signatureReleaseNumber"
})
public class SignatureOptionDetail {

    @XmlElement(name = "OptionType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected SignatureOptionType optionType;
    @XmlElement(name = "SignatureReleaseNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String signatureReleaseNumber;

    /**
     * 获取optionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SignatureOptionType }
     *     
     */
    public SignatureOptionType getOptionType() {
        return optionType;
    }

    /**
     * 设置optionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureOptionType }
     *     
     */
    public void setOptionType(SignatureOptionType value) {
        this.optionType = value;
    }

    /**
     * 获取signatureReleaseNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureReleaseNumber() {
        return signatureReleaseNumber;
    }

    /**
     * 设置signatureReleaseNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureReleaseNumber(String value) {
        this.signatureReleaseNumber = value;
    }

}
