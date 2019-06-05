
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Payor complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Payor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponsibleParty" type="{http://fedex.com/ws/ship/v23}Party" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payor", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "responsibleParty"
})
public class Payor {

    @XmlElement(name = "ResponsibleParty", namespace = "http://fedex.com/ws/ship/v23")
    protected Party responsibleParty;

    /**
     * 获取responsibleParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * 设置responsibleParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setResponsibleParty(Party value) {
        this.responsibleParty = value;
    }

}
