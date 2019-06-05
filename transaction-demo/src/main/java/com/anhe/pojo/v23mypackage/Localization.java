
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the representation of human-readable text.
 * 
 * <p>Localization complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Localization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocaleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Localization", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "languageCode",
    "localeCode"
})
public class Localization {

    @XmlElement(name = "LanguageCode", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected String languageCode;
    @XmlElement(name = "LocaleCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String localeCode;

    /**
     * 获取languageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 设置languageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * 获取localeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleCode() {
        return localeCode;
    }

    /**
     * 设置localeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleCode(String value) {
        this.localeCode = value;
    }

}
