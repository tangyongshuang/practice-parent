
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Customer-provided specifications for handling individual commodities.
 * 
 * <p>HazardousCommodityOptionDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HazardousCommodityOptionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabelTextOption" type="{http://fedex.com/ws/ship/v23}HazardousCommodityLabelTextOptionType" minOccurs="0"/>
 *         &lt;element name="CustomerSuppliedLabelText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousCommodityOptionDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "labelTextOption",
    "customerSuppliedLabelText"
})
public class HazardousCommodityOptionDetail {

    @XmlElement(name = "LabelTextOption", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected HazardousCommodityLabelTextOptionType labelTextOption;
    @XmlElement(name = "CustomerSuppliedLabelText", namespace = "http://fedex.com/ws/ship/v23")
    protected String customerSuppliedLabelText;

    /**
     * 获取labelTextOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityLabelTextOptionType }
     *     
     */
    public HazardousCommodityLabelTextOptionType getLabelTextOption() {
        return labelTextOption;
    }

    /**
     * 设置labelTextOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityLabelTextOptionType }
     *     
     */
    public void setLabelTextOption(HazardousCommodityLabelTextOptionType value) {
        this.labelTextOption = value;
    }

    /**
     * 获取customerSuppliedLabelText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSuppliedLabelText() {
        return customerSuppliedLabelText;
    }

    /**
     * 设置customerSuppliedLabelText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSuppliedLabelText(String value) {
        this.customerSuppliedLabelText = value;
    }

}
