
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RadionuclideDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RadionuclideDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Radionuclide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://fedex.com/ws/ship/v23}RadionuclideActivity" minOccurs="0"/>
 *         &lt;element name="ExceptedPackagingIsReportableQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PhysicalForm" type="{http://fedex.com/ws/ship/v23}PhysicalFormType" minOccurs="0"/>
 *         &lt;element name="ChemicalForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadionuclideDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "radionuclide",
    "activity",
    "exceptedPackagingIsReportableQuantity",
    "physicalForm",
    "chemicalForm"
})
public class RadionuclideDetail {

    @XmlElement(name = "Radionuclide", namespace = "http://fedex.com/ws/ship/v23")
    protected String radionuclide;
    @XmlElement(name = "Activity", namespace = "http://fedex.com/ws/ship/v23")
    protected RadionuclideActivity activity;
    @XmlElement(name = "ExceptedPackagingIsReportableQuantity", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean exceptedPackagingIsReportableQuantity;
    @XmlElement(name = "PhysicalForm", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected PhysicalFormType physicalForm;
    @XmlElement(name = "ChemicalForm", namespace = "http://fedex.com/ws/ship/v23")
    protected String chemicalForm;

    /**
     * 获取radionuclide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadionuclide() {
        return radionuclide;
    }

    /**
     * 设置radionuclide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadionuclide(String value) {
        this.radionuclide = value;
    }

    /**
     * 获取activity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RadionuclideActivity }
     *     
     */
    public RadionuclideActivity getActivity() {
        return activity;
    }

    /**
     * 设置activity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RadionuclideActivity }
     *     
     */
    public void setActivity(RadionuclideActivity value) {
        this.activity = value;
    }

    /**
     * 获取exceptedPackagingIsReportableQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExceptedPackagingIsReportableQuantity() {
        return exceptedPackagingIsReportableQuantity;
    }

    /**
     * 设置exceptedPackagingIsReportableQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExceptedPackagingIsReportableQuantity(Boolean value) {
        this.exceptedPackagingIsReportableQuantity = value;
    }

    /**
     * 获取physicalForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhysicalFormType }
     *     
     */
    public PhysicalFormType getPhysicalForm() {
        return physicalForm;
    }

    /**
     * 设置physicalForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalFormType }
     *     
     */
    public void setPhysicalForm(PhysicalFormType value) {
        this.physicalForm = value;
    }

    /**
     * 获取chemicalForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalForm() {
        return chemicalForm;
    }

    /**
     * 设置chemicalForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalForm(String value) {
        this.chemicalForm = value;
    }

}
