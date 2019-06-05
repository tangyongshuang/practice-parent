
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReturnShipmentDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReturnShipmentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnType" type="{http://fedex.com/ws/ship/v23}ReturnType"/>
 *         &lt;element name="Rma" type="{http://fedex.com/ws/ship/v23}Rma" minOccurs="0"/>
 *         &lt;element name="ReturnEMailDetail" type="{http://fedex.com/ws/ship/v23}ReturnEMailDetail" minOccurs="0"/>
 *         &lt;element name="ReturnAssociation" type="{http://fedex.com/ws/ship/v23}ReturnAssociationDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnShipmentDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "returnType",
    "rma",
    "returnEMailDetail",
    "returnAssociation"
})
public class ReturnShipmentDetail {

    @XmlElement(name = "ReturnType", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected ReturnType returnType;
    @XmlElement(name = "Rma", namespace = "http://fedex.com/ws/ship/v23")
    protected Rma rma;
    @XmlElement(name = "ReturnEMailDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected ReturnEMailDetail returnEMailDetail;
    @XmlElement(name = "ReturnAssociation", namespace = "http://fedex.com/ws/ship/v23")
    protected ReturnAssociationDetail returnAssociation;

    /**
     * 获取returnType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnType }
     *     
     */
    public ReturnType getReturnType() {
        return returnType;
    }

    /**
     * 设置returnType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnType }
     *     
     */
    public void setReturnType(ReturnType value) {
        this.returnType = value;
    }

    /**
     * 获取rma属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Rma }
     *     
     */
    public Rma getRma() {
        return rma;
    }

    /**
     * 设置rma属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Rma }
     *     
     */
    public void setRma(Rma value) {
        this.rma = value;
    }

    /**
     * 获取returnEMailDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnEMailDetail }
     *     
     */
    public ReturnEMailDetail getReturnEMailDetail() {
        return returnEMailDetail;
    }

    /**
     * 设置returnEMailDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnEMailDetail }
     *     
     */
    public void setReturnEMailDetail(ReturnEMailDetail value) {
        this.returnEMailDetail = value;
    }

    /**
     * 获取returnAssociation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReturnAssociationDetail }
     *     
     */
    public ReturnAssociationDetail getReturnAssociation() {
        return returnAssociation;
    }

    /**
     * 设置returnAssociation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnAssociationDetail }
     *     
     */
    public void setReturnAssociation(ReturnAssociationDetail value) {
        this.returnAssociation = value;
    }

}
