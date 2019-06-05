
package com.anhe.pojo.v23mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompletedHazardousSummaryDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompletedHazardousSummaryDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmallQuantityExceptionPackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedHazardousSummaryDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "smallQuantityExceptionPackageCount"
})
public class CompletedHazardousSummaryDetail {

    @XmlElement(name = "SmallQuantityExceptionPackageCount", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger smallQuantityExceptionPackageCount;

    /**
     * 获取smallQuantityExceptionPackageCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSmallQuantityExceptionPackageCount() {
        return smallQuantityExceptionPackageCount;
    }

    /**
     * 设置smallQuantityExceptionPackageCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSmallQuantityExceptionPackageCount(BigInteger value) {
        this.smallQuantityExceptionPackageCount = value;
    }

}
