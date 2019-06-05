
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NaftaCommodityDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NaftaCommodityDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreferenceCriterion" type="{http://fedex.com/ws/ship/v23}NaftaPreferenceCriterionCode" minOccurs="0"/>
 *         &lt;element name="ProducerDetermination" type="{http://fedex.com/ws/ship/v23}NaftaProducerDeterminationCode" minOccurs="0"/>
 *         &lt;element name="ProducerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetCostMethod" type="{http://fedex.com/ws/ship/v23}NaftaNetCostMethodCode" minOccurs="0"/>
 *         &lt;element name="NetCostDateRange" type="{http://fedex.com/ws/ship/v23}DateRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaftaCommodityDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "preferenceCriterion",
    "producerDetermination",
    "producerId",
    "netCostMethod",
    "netCostDateRange"
})
public class NaftaCommodityDetail {

    @XmlElement(name = "PreferenceCriterion", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected NaftaPreferenceCriterionCode preferenceCriterion;
    @XmlElement(name = "ProducerDetermination", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected NaftaProducerDeterminationCode producerDetermination;
    @XmlElement(name = "ProducerId", namespace = "http://fedex.com/ws/ship/v23")
    protected String producerId;
    @XmlElement(name = "NetCostMethod", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected NaftaNetCostMethodCode netCostMethod;
    @XmlElement(name = "NetCostDateRange", namespace = "http://fedex.com/ws/ship/v23")
    protected DateRange netCostDateRange;

    /**
     * 获取preferenceCriterion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NaftaPreferenceCriterionCode }
     *     
     */
    public NaftaPreferenceCriterionCode getPreferenceCriterion() {
        return preferenceCriterion;
    }

    /**
     * 设置preferenceCriterion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaPreferenceCriterionCode }
     *     
     */
    public void setPreferenceCriterion(NaftaPreferenceCriterionCode value) {
        this.preferenceCriterion = value;
    }

    /**
     * 获取producerDetermination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NaftaProducerDeterminationCode }
     *     
     */
    public NaftaProducerDeterminationCode getProducerDetermination() {
        return producerDetermination;
    }

    /**
     * 设置producerDetermination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaProducerDeterminationCode }
     *     
     */
    public void setProducerDetermination(NaftaProducerDeterminationCode value) {
        this.producerDetermination = value;
    }

    /**
     * 获取producerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerId() {
        return producerId;
    }

    /**
     * 设置producerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerId(String value) {
        this.producerId = value;
    }

    /**
     * 获取netCostMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NaftaNetCostMethodCode }
     *     
     */
    public NaftaNetCostMethodCode getNetCostMethod() {
        return netCostMethod;
    }

    /**
     * 设置netCostMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaNetCostMethodCode }
     *     
     */
    public void setNetCostMethod(NaftaNetCostMethodCode value) {
        this.netCostMethod = value;
    }

    /**
     * 获取netCostDateRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getNetCostDateRange() {
        return netCostDateRange;
    }

    /**
     * 设置netCostDateRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setNetCostDateRange(DateRange value) {
        this.netCostDateRange = value;
    }

}
