
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PriorityAlertDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PriorityAlertDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnhancementTypes" type="{http://fedex.com/ws/ship/v23}PriorityAlertEnhancementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityAlertDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "enhancementTypes",
    "content"
})
public class PriorityAlertDetail {

    @XmlElement(name = "EnhancementTypes", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<PriorityAlertEnhancementType> enhancementTypes;
    @XmlElement(name = "Content", namespace = "http://fedex.com/ws/ship/v23", required = true)
    protected List<String> content;

    /**
     * Gets the value of the enhancementTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhancementTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancementTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityAlertEnhancementType }
     * 
     * 
     */
    public List<PriorityAlertEnhancementType> getEnhancementTypes() {
        if (enhancementTypes == null) {
            enhancementTypes = new ArrayList<PriorityAlertEnhancementType>();
        }
        return this.enhancementTypes;
    }

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContent() {
        if (content == null) {
            content = new ArrayList<String>();
        }
        return this.content;
    }

}
