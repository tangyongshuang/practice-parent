
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies data structures that may be re-used multiple times with s single shipment.
 * 
 * <p>ShipmentConfigurationData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShipmentConfigurationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DangerousGoodsPackageConfigurations" type="{http://fedex.com/ws/ship/v23}DangerousGoodsDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentConfigurationData", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "dangerousGoodsPackageConfigurations"
})
public class ShipmentConfigurationData {

    @XmlElement(name = "DangerousGoodsPackageConfigurations", namespace = "http://fedex.com/ws/ship/v23")
    protected List<DangerousGoodsDetail> dangerousGoodsPackageConfigurations;

    /**
     * Gets the value of the dangerousGoodsPackageConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsPackageConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsPackageConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousGoodsDetail }
     * 
     * 
     */
    public List<DangerousGoodsDetail> getDangerousGoodsPackageConfigurations() {
        if (dangerousGoodsPackageConfigurations == null) {
            dangerousGoodsPackageConfigurations = new ArrayList<DangerousGoodsDetail>();
        }
        return this.dangerousGoodsPackageConfigurations;
    }

}
