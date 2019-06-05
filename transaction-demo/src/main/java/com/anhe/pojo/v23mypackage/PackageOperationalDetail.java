
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Package-level data required for labeling and/or movement.
 * 
 * <p>PackageOperationalDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PackageOperationalDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AstraHandlingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationalInstructions" type="{http://fedex.com/ws/ship/v23}OperationalInstruction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Barcodes" type="{http://fedex.com/ws/ship/v23}PackageBarcodes" minOccurs="0"/>
 *         &lt;element name="GroundServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageOperationalDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "astraHandlingText",
    "operationalInstructions",
    "barcodes",
    "groundServiceCode"
})
public class PackageOperationalDetail {

    @XmlElement(name = "AstraHandlingText", namespace = "http://fedex.com/ws/ship/v23")
    protected String astraHandlingText;
    @XmlElement(name = "OperationalInstructions", namespace = "http://fedex.com/ws/ship/v23")
    protected List<OperationalInstruction> operationalInstructions;
    @XmlElement(name = "Barcodes", namespace = "http://fedex.com/ws/ship/v23")
    protected PackageBarcodes barcodes;
    @XmlElement(name = "GroundServiceCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String groundServiceCode;

    /**
     * 获取astraHandlingText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstraHandlingText() {
        return astraHandlingText;
    }

    /**
     * 设置astraHandlingText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstraHandlingText(String value) {
        this.astraHandlingText = value;
    }

    /**
     * Gets the value of the operationalInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalInstruction }
     * 
     * 
     */
    public List<OperationalInstruction> getOperationalInstructions() {
        if (operationalInstructions == null) {
            operationalInstructions = new ArrayList<OperationalInstruction>();
        }
        return this.operationalInstructions;
    }

    /**
     * 获取barcodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageBarcodes }
     *     
     */
    public PackageBarcodes getBarcodes() {
        return barcodes;
    }

    /**
     * 设置barcodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageBarcodes }
     *     
     */
    public void setBarcodes(PackageBarcodes value) {
        this.barcodes = value;
    }

    /**
     * 获取groundServiceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundServiceCode() {
        return groundServiceCode;
    }

    /**
     * 设置groundServiceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundServiceCode(String value) {
        this.groundServiceCode = value;
    }

}
