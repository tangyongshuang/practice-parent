
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Documents the kind and quantity of an individual hazardous commodity in a package.
 * 
 * <p>HazardousCommodityContent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HazardousCommodityContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://fedex.com/ws/ship/v23}HazardousCommodityDescription" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://fedex.com/ws/ship/v23}HazardousCommodityQuantityDetail" minOccurs="0"/>
 *         &lt;element name="InnerReceptacles" type="{http://fedex.com/ws/ship/v23}HazardousCommodityInnerReceptacleDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://fedex.com/ws/ship/v23}HazardousCommodityOptionDetail" minOccurs="0"/>
 *         &lt;element name="RadionuclideDetail" type="{http://fedex.com/ws/ship/v23}RadionuclideDetail" minOccurs="0"/>
 *         &lt;element name="NetExplosiveDetail" type="{http://fedex.com/ws/ship/v23}NetExplosiveDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousCommodityContent", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "description",
    "quantity",
    "innerReceptacles",
    "options",
    "radionuclideDetail",
    "netExplosiveDetail"
})
public class HazardousCommodityContent {

    @XmlElement(name = "Description", namespace = "http://fedex.com/ws/ship/v23")
    protected HazardousCommodityDescription description;
    @XmlElement(name = "Quantity", namespace = "http://fedex.com/ws/ship/v23")
    protected HazardousCommodityQuantityDetail quantity;
    @XmlElement(name = "InnerReceptacles", namespace = "http://fedex.com/ws/ship/v23")
    protected List<HazardousCommodityInnerReceptacleDetail> innerReceptacles;
    @XmlElement(name = "Options", namespace = "http://fedex.com/ws/ship/v23")
    protected HazardousCommodityOptionDetail options;
    @XmlElement(name = "RadionuclideDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected RadionuclideDetail radionuclideDetail;
    @XmlElement(name = "NetExplosiveDetail", namespace = "http://fedex.com/ws/ship/v23")
    protected NetExplosiveDetail netExplosiveDetail;

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityDescription }
     *     
     */
    public HazardousCommodityDescription getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityDescription }
     *     
     */
    public void setDescription(HazardousCommodityDescription value) {
        this.description = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityQuantityDetail }
     *     
     */
    public HazardousCommodityQuantityDetail getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityQuantityDetail }
     *     
     */
    public void setQuantity(HazardousCommodityQuantityDetail value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the innerReceptacles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innerReceptacles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnerReceptacles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousCommodityInnerReceptacleDetail }
     * 
     * 
     */
    public List<HazardousCommodityInnerReceptacleDetail> getInnerReceptacles() {
        if (innerReceptacles == null) {
            innerReceptacles = new ArrayList<HazardousCommodityInnerReceptacleDetail>();
        }
        return this.innerReceptacles;
    }

    /**
     * 获取options属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HazardousCommodityOptionDetail }
     *     
     */
    public HazardousCommodityOptionDetail getOptions() {
        return options;
    }

    /**
     * 设置options属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCommodityOptionDetail }
     *     
     */
    public void setOptions(HazardousCommodityOptionDetail value) {
        this.options = value;
    }

    /**
     * 获取radionuclideDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RadionuclideDetail }
     *     
     */
    public RadionuclideDetail getRadionuclideDetail() {
        return radionuclideDetail;
    }

    /**
     * 设置radionuclideDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RadionuclideDetail }
     *     
     */
    public void setRadionuclideDetail(RadionuclideDetail value) {
        this.radionuclideDetail = value;
    }

    /**
     * 获取netExplosiveDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NetExplosiveDetail }
     *     
     */
    public NetExplosiveDetail getNetExplosiveDetail() {
        return netExplosiveDetail;
    }

    /**
     * 设置netExplosiveDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NetExplosiveDetail }
     *     
     */
    public void setNetExplosiveDetail(NetExplosiveDetail value) {
        this.netExplosiveDetail = value;
    }

}
