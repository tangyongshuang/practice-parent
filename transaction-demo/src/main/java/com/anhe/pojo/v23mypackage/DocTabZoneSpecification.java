
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocTabZoneSpecification complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocTabZoneSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZoneNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LiteralValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Justification" type="{http://fedex.com/ws/ship/v23}DocTabZoneJustificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocTabZoneSpecification", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "zoneNumber",
    "header",
    "dataField",
    "literalValue",
    "justification"
})
public class DocTabZoneSpecification {

    @XmlElement(name = "ZoneNumber", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger zoneNumber;
    @XmlElement(name = "Header", namespace = "http://fedex.com/ws/ship/v23")
    protected String header;
    @XmlElement(name = "DataField", namespace = "http://fedex.com/ws/ship/v23")
    protected String dataField;
    @XmlElement(name = "LiteralValue", namespace = "http://fedex.com/ws/ship/v23")
    protected String literalValue;
    @XmlElement(name = "Justification", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected DocTabZoneJustificationType justification;

    /**
     * 获取zoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZoneNumber() {
        return zoneNumber;
    }

    /**
     * 设置zoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZoneNumber(BigInteger value) {
        this.zoneNumber = value;
    }

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * 获取dataField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataField() {
        return dataField;
    }

    /**
     * 设置dataField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataField(String value) {
        this.dataField = value;
    }

    /**
     * 获取literalValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiteralValue() {
        return literalValue;
    }

    /**
     * 设置literalValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiteralValue(String value) {
        this.literalValue = value;
    }

    /**
     * 获取justification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocTabZoneJustificationType }
     *     
     */
    public DocTabZoneJustificationType getJustification() {
        return justification;
    }

    /**
     * 设置justification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabZoneJustificationType }
     *     
     */
    public void setJustification(DocTabZoneJustificationType value) {
        this.justification = value;
    }

}
