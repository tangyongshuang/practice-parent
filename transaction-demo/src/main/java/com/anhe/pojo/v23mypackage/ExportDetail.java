
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExportDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExportDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="B13AFilingOption" type="{http://fedex.com/ws/ship/v23}B13AFilingOptionType" minOccurs="0"/>
 *         &lt;element name="ExportComplianceStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationControlDetail" type="{http://fedex.com/ws/ship/v23}DestinationControlDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "b13AFilingOption",
    "exportComplianceStatement",
    "permitNumber",
    "destinationControlDetail"
})
public class ExportDetail {

    @XmlElement(name = "B13AFilingOption", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected B13AFilingOptionType b13AFilingOption;
    @XmlElement(name = "ExportComplianceStatement", namespace = "http://fedex.com/ws/ship/v23")
    protected String exportComplianceStatement;
    @XmlElement(name = "PermitNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String permitNumber;
    @XmlElement(name = "DestinationControlDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected DestinationControlDetail destinationControlDetail;

    /**
     * 获取b13AFilingOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link B13AFilingOptionType }
     *     
     */
    public B13AFilingOptionType getB13AFilingOption() {
        return b13AFilingOption;
    }

    /**
     * 设置b13AFilingOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link B13AFilingOptionType }
     *     
     */
    public void setB13AFilingOption(B13AFilingOptionType value) {
        this.b13AFilingOption = value;
    }

    /**
     * 获取exportComplianceStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportComplianceStatement() {
        return exportComplianceStatement;
    }

    /**
     * 设置exportComplianceStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportComplianceStatement(String value) {
        this.exportComplianceStatement = value;
    }

    /**
     * 获取permitNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /**
     * 设置permitNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitNumber(String value) {
        this.permitNumber = value;
    }

    /**
     * 获取destinationControlDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestinationControlDetail }
     *     
     */
    public DestinationControlDetail getDestinationControlDetail() {
        return destinationControlDetail;
    }

    /**
     * 设置destinationControlDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationControlDetail }
     *     
     */
    public void setDestinationControlDetail(DestinationControlDetail value) {
        this.destinationControlDetail = value;
    }

}
