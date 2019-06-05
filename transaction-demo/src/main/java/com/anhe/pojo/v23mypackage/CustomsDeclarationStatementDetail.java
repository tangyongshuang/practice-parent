
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This provides the information necessary to identify the different statements, declarations, acts, and/or certifications that apply to this shipment.
 * 
 * <p>CustomsDeclarationStatementDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomsDeclarationStatementDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Types" type="{http://fedex.com/ws/ship/v23}CustomsDeclarationStatementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NaftaLowValueStatementDetail" type="{http://fedex.com/ws/ship/v23}NaftaLowValueStatementDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsDeclarationStatementDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "types",
    "naftaLowValueStatementDetail"
})
public class CustomsDeclarationStatementDetail {

    @XmlElement(name = "Types", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<CustomsDeclarationStatementType> types;
    @XmlElement(name = "NaftaLowValueStatementDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected NaftaLowValueStatementDetail naftaLowValueStatementDetail;

    /**
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsDeclarationStatementType }
     * 
     * 
     */
    public List<CustomsDeclarationStatementType> getTypes() {
        if (types == null) {
            types = new ArrayList<CustomsDeclarationStatementType>();
        }
        return this.types;
    }

    /**
     * 获取naftaLowValueStatementDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NaftaLowValueStatementDetail }
     *     
     */
    public NaftaLowValueStatementDetail getNaftaLowValueStatementDetail() {
        return naftaLowValueStatementDetail;
    }

    /**
     * 设置naftaLowValueStatementDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaLowValueStatementDetail }
     *     
     */
    public void setNaftaLowValueStatementDetail(NaftaLowValueStatementDetail value) {
        this.naftaLowValueStatementDetail = value;
    }

}
