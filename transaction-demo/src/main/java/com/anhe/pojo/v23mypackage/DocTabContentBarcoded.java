
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocTabContentBarcoded complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocTabContentBarcoded">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Symbology" type="{http://fedex.com/ws/ship/v23}BarcodeSymbologyType" minOccurs="0"/>
 *         &lt;element name="Specification" type="{http://fedex.com/ws/ship/v23}DocTabZoneSpecification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocTabContentBarcoded", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "symbology",
    "specification"
})
public class DocTabContentBarcoded {

    @XmlElement(name = "Symbology", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected BarcodeSymbologyType symbology;
    @XmlElement(name = "Specification", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected DocTabZoneSpecification specification;

    /**
     * 获取symbology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BarcodeSymbologyType }
     *     
     */
    public BarcodeSymbologyType getSymbology() {
        return symbology;
    }

    /**
     * 设置symbology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeSymbologyType }
     *     
     */
    public void setSymbology(BarcodeSymbologyType value) {
        this.symbology = value;
    }

    /**
     * 获取specification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DocTabZoneSpecification }
     *     
     */
    public DocTabZoneSpecification getSpecification() {
        return specification;
    }

    /**
     * 设置specification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DocTabZoneSpecification }
     *     
     */
    public void setSpecification(DocTabZoneSpecification value) {
        this.specification = value;
    }

}
