
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the information necessary for printing the NAFTA Low Value statement on customs documentation.
 * 
 * <p>NaftaLowValueStatementDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NaftaLowValueStatementDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{http://fedex.com/ws/ship/v23}CustomsRoleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaftaLowValueStatementDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "role"
})
public class NaftaLowValueStatementDetail {

    @XmlElement(name = "Role", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected CustomsRoleType role;

    /**
     * 获取role属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomsRoleType }
     *     
     */
    public CustomsRoleType getRole() {
        return role;
    }

    /**
     * 设置role属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsRoleType }
     *     
     */
    public void setRole(CustomsRoleType value) {
        this.role = value;
    }

}
