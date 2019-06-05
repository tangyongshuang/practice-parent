
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data required to complete the Destionation Control Statement for US exports.
 * 
 * <p>DestinationControlDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DestinationControlDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatementTypes" type="{http://fedex.com/ws/ship/v23}DestinationControlStatementType" maxOccurs="unbounded"/>
 *         &lt;element name="DestinationCountries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationControlDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "statementTypes",
    "destinationCountries",
    "endUser"
})
public class DestinationControlDetail {

    @XmlElement(name = "StatementTypes", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected List<DestinationControlStatementType> statementTypes;
    @XmlElement(name = "DestinationCountries", namespace = "http://fedex.com/ws/ship/v23")
    protected String destinationCountries;
    @XmlElement(name = "EndUser", namespace = "http://fedex.com/ws/ship/v23")
    protected String endUser;

    /**
     * Gets the value of the statementTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestinationControlStatementType }
     * 
     * 
     */
    public List<DestinationControlStatementType> getStatementTypes() {
        if (statementTypes == null) {
            statementTypes = new ArrayList<DestinationControlStatementType>();
        }
        return this.statementTypes;
    }

    /**
     * 获取destinationCountries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountries() {
        return destinationCountries;
    }

    /**
     * 设置destinationCountries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountries(String value) {
        this.destinationCountries = value;
    }

    /**
     * 获取endUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndUser() {
        return endUser;
    }

    /**
     * 设置endUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndUser(String value) {
        this.endUser = value;
    }

}
