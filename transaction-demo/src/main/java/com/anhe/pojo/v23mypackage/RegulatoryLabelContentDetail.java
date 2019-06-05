
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies details needed to generate any label artifacts required due to regulatory requirements.
 * 
 * <p>RegulatoryLabelContentDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RegulatoryLabelContentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}RegulatoryLabelType" minOccurs="0"/>
 *         &lt;element name="GenerationOptions" type="{http://fedex.com/ws/ship/v23}CustomerSpecifiedLabelGenerationOptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryLabelContentDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "generationOptions"
})
public class RegulatoryLabelContentDetail {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected RegulatoryLabelType type;
    @XmlElement(name = "GenerationOptions", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<CustomerSpecifiedLabelGenerationOptionType> generationOptions;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryLabelType }
     *     
     */
    public RegulatoryLabelType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryLabelType }
     *     
     */
    public void setType(RegulatoryLabelType value) {
        this.type = value;
    }

    /**
     * Gets the value of the generationOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generationOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenerationOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSpecifiedLabelGenerationOptionType }
     * 
     * 
     */
    public List<CustomerSpecifiedLabelGenerationOptionType> getGenerationOptions() {
        if (generationOptions == null) {
            generationOptions = new ArrayList<CustomerSpecifiedLabelGenerationOptionType>();
        }
        return this.generationOptions;
    }

}
