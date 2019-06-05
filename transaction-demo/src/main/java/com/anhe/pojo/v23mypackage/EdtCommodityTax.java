
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EdtCommodityTax complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EdtCommodityTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HarmonizedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://fedex.com/ws/ship/v23}EdtTaxDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdtCommodityTax", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "harmonizedCode",
    "taxes"
})
public class EdtCommodityTax {

    @XmlElement(name = "HarmonizedCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String harmonizedCode;
    @XmlElement(name = "Taxes", namespace = "http://fedex.com/ws/ship/v23")
    protected List<EdtTaxDetail> taxes;

    /**
     * 获取harmonizedCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    /**
     * 设置harmonizedCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonizedCode(String value) {
        this.harmonizedCode = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdtTaxDetail }
     * 
     * 
     */
    public List<EdtTaxDetail> getTaxes() {
        if (taxes == null) {
            taxes = new ArrayList<EdtTaxDetail>();
        }
        return this.taxes;
    }

}
