
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Descriptive data for a physical location. May be used as an actual physical address (place to which one could go), or as a container of "address parts" which should be handled as a unit (such as a city-state-ZIP combination within the US).
 * 
 * <p>Address complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetLines" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrbanizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Residential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GeographicCoordinates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "streetLines",
    "city",
    "stateOrProvinceCode",
    "postalCode",
    "urbanizationCode",
    "countryCode",
    "countryName",
    "residential",
    "geographicCoordinates"
})
public class Address {

    @XmlElement(name = "StreetLines", namespace = "http://fedex.com/ws/ship/v23")
    protected List<String> streetLines;
    @XmlElement(name = "City", namespace = "http://fedex.com/ws/ship/v23")
    protected String city;
    @XmlElement(name = "StateOrProvinceCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String stateOrProvinceCode;
    @XmlElement(name = "PostalCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String postalCode;
    @XmlElement(name = "UrbanizationCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String urbanizationCode;
    @XmlElement(name = "CountryCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String countryCode;
    @XmlElement(name = "CountryName", namespace = "http://fedex.com/ws/ship/v23")
    protected String countryName;
    @XmlElement(name = "Residential", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean residential;
    @XmlElement(name = "GeographicCoordinates", namespace = "http://fedex.com/ws/ship/v23")
    protected String geographicCoordinates;

    /**
     * Gets the value of the streetLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStreetLines() {
        if (streetLines == null) {
            streetLines = new ArrayList<String>();
        }
        return this.streetLines;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取stateOrProvinceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    /**
     * 设置stateOrProvinceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvinceCode(String value) {
        this.stateOrProvinceCode = value;
    }

    /**
     * 获取postalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置postalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * 获取urbanizationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanizationCode() {
        return urbanizationCode;
    }

    /**
     * 设置urbanizationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanizationCode(String value) {
        this.urbanizationCode = value;
    }

    /**
     * 获取countryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置countryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * 获取countryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置countryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * 获取residential属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResidential() {
        return residential;
    }

    /**
     * 设置residential属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResidential(Boolean value) {
        this.residential = value;
    }

    /**
     * 获取geographicCoordinates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicCoordinates() {
        return geographicCoordinates;
    }

    /**
     * 设置geographicCoordinates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicCoordinates(String value) {
        this.geographicCoordinates = value;
    }

}
