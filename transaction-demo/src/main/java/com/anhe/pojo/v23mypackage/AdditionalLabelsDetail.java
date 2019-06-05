
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies additional labels to be produced. All required labels for shipments will be produced without the need to request additional labels. These are only available as thermal labels.
 * 
 * <p>AdditionalLabelsDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AdditionalLabelsDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/ship/v23}AdditionalLabelsType"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalLabelsDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "type",
    "count"
})
public class AdditionalLabelsDetail {

    @XmlElement(name = "Type", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "string")
    protected AdditionalLabelsType type;
    @XmlElement(name = "Count", namespace = "http://fedex.com/ws/ship/v23", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdditionalLabelsType }
     *     
     */
    public AdditionalLabelsType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalLabelsType }
     *     
     */
    public void setType(AdditionalLabelsType value) {
        this.type = value;
    }

    /**
     * 获取count属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

}
