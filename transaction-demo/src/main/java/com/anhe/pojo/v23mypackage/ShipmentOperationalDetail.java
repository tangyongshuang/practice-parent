
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ShipmentOperationalDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShipmentOperationalDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UrsaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrsaSuffixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginLocationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OriginServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationLocationNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DestinationServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationLocationStateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DeliveryDay" type="{http://fedex.com/ws/ship/v23}DayOfWeekType" minOccurs="0"/>
 *         &lt;element name="PublishedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="CommitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CommitDay" type="{http://fedex.com/ws/ship/v23}DayOfWeekType" minOccurs="0"/>
 *         &lt;element name="TransitTime" type="{http://fedex.com/ws/ship/v23}TransitTimeType" minOccurs="0"/>
 *         &lt;element name="MaximumTransitTime" type="{http://fedex.com/ws/ship/v23}TransitTimeType" minOccurs="0"/>
 *         &lt;element name="CustomTransitTime" type="{http://fedex.com/ws/ship/v23}TransitTimeType" minOccurs="0"/>
 *         &lt;element name="IneligibleForMoneyBackGuarantee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeliveryEligibilities" type="{http://fedex.com/ws/ship/v23}GroundDeliveryEligibilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AstraPlannedServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AstraDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackagingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentOperationalDetail", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "ursaPrefixCode",
    "ursaSuffixCode",
    "originLocationId",
    "originLocationNumber",
    "originServiceArea",
    "destinationLocationId",
    "destinationLocationNumber",
    "destinationServiceArea",
    "destinationLocationStateOrProvinceCode",
    "deliveryDate",
    "deliveryDay",
    "publishedDeliveryTime",
    "commitDate",
    "commitDay",
    "transitTime",
    "maximumTransitTime",
    "customTransitTime",
    "ineligibleForMoneyBackGuarantee",
    "deliveryEligibilities",
    "astraPlannedServiceLevel",
    "astraDescription",
    "postalCode",
    "stateOrProvinceCode",
    "countryCode",
    "airportId",
    "serviceCode",
    "packagingCode",
    "scac"
})
public class ShipmentOperationalDetail {

    @XmlElement(name = "UrsaPrefixCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String ursaPrefixCode;
    @XmlElement(name = "UrsaSuffixCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String ursaSuffixCode;
    @XmlElement(name = "OriginLocationId", namespace = "http://fedex.com/ws/ship/v23")
    protected String originLocationId;
    @XmlElement(name = "OriginLocationNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected Integer originLocationNumber;
    @XmlElement(name = "OriginServiceArea", namespace = "http://fedex.com/ws/ship/v23")
    protected String originServiceArea;
    @XmlElement(name = "DestinationLocationId", namespace = "http://fedex.com/ws/ship/v23")
    protected String destinationLocationId;
    @XmlElement(name = "DestinationLocationNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected Integer destinationLocationNumber;
    @XmlElement(name = "DestinationServiceArea", namespace = "http://fedex.com/ws/ship/v23")
    protected String destinationServiceArea;
    @XmlElement(name = "DestinationLocationStateOrProvinceCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String destinationLocationStateOrProvinceCode;
    @XmlElement(name = "DeliveryDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "DeliveryDay", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType deliveryDay;
    @XmlElement(name = "PublishedDeliveryTime", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar publishedDeliveryTime;
    @XmlElement(name = "CommitDate", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commitDate;
    @XmlElement(name = "CommitDay", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType commitDay;
    @XmlElement(name = "TransitTime", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected TransitTimeType transitTime;
    @XmlElement(name = "MaximumTransitTime", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected TransitTimeType maximumTransitTime;
    @XmlElement(name = "CustomTransitTime", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected TransitTimeType customTransitTime;
    @XmlElement(name = "IneligibleForMoneyBackGuarantee", namespace = "http://fedex.com/ws/ship/v23")
    protected Boolean ineligibleForMoneyBackGuarantee;
    @XmlElement(name = "DeliveryEligibilities", namespace = "http://fedex.com/ws/ship/v23")
    @XmlSchemaType(name = "string")
    protected List<GroundDeliveryEligibilityType> deliveryEligibilities;
    @XmlElement(name = "AstraPlannedServiceLevel", namespace = "http://fedex.com/ws/ship/v23")
    protected String astraPlannedServiceLevel;
    @XmlElement(name = "AstraDescription", namespace = "http://fedex.com/ws/ship/v23")
    protected String astraDescription;
    @XmlElement(name = "PostalCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String postalCode;
    @XmlElement(name = "StateOrProvinceCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String stateOrProvinceCode;
    @XmlElement(name = "CountryCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String countryCode;
    @XmlElement(name = "AirportId", namespace = "http://fedex.com/ws/ship/v23")
    protected String airportId;
    @XmlElement(name = "ServiceCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String serviceCode;
    @XmlElement(name = "PackagingCode", namespace = "http://fedex.com/ws/ship/v23")
    protected String packagingCode;
    @XmlElement(name = "Scac", namespace = "http://fedex.com/ws/ship/v23")
    protected String scac;

    /**
     * 获取ursaPrefixCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrsaPrefixCode() {
        return ursaPrefixCode;
    }

    /**
     * 设置ursaPrefixCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrsaPrefixCode(String value) {
        this.ursaPrefixCode = value;
    }

    /**
     * 获取ursaSuffixCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrsaSuffixCode() {
        return ursaSuffixCode;
    }

    /**
     * 设置ursaSuffixCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrsaSuffixCode(String value) {
        this.ursaSuffixCode = value;
    }

    /**
     * 获取originLocationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginLocationId() {
        return originLocationId;
    }

    /**
     * 设置originLocationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginLocationId(String value) {
        this.originLocationId = value;
    }

    /**
     * 获取originLocationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginLocationNumber() {
        return originLocationNumber;
    }

    /**
     * 设置originLocationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginLocationNumber(Integer value) {
        this.originLocationNumber = value;
    }

    /**
     * 获取originServiceArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginServiceArea() {
        return originServiceArea;
    }

    /**
     * 设置originServiceArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginServiceArea(String value) {
        this.originServiceArea = value;
    }

    /**
     * 获取destinationLocationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationId() {
        return destinationLocationId;
    }

    /**
     * 设置destinationLocationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationId(String value) {
        this.destinationLocationId = value;
    }

    /**
     * 获取destinationLocationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationLocationNumber() {
        return destinationLocationNumber;
    }

    /**
     * 设置destinationLocationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationLocationNumber(Integer value) {
        this.destinationLocationNumber = value;
    }

    /**
     * 获取destinationServiceArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }

    /**
     * 设置destinationServiceArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationServiceArea(String value) {
        this.destinationServiceArea = value;
    }

    /**
     * 获取destinationLocationStateOrProvinceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationStateOrProvinceCode() {
        return destinationLocationStateOrProvinceCode;
    }

    /**
     * 设置destinationLocationStateOrProvinceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationStateOrProvinceCode(String value) {
        this.destinationLocationStateOrProvinceCode = value;
    }

    /**
     * 获取deliveryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * 设置deliveryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * 获取deliveryDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDeliveryDay() {
        return deliveryDay;
    }

    /**
     * 设置deliveryDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDeliveryDay(DayOfWeekType value) {
        this.deliveryDay = value;
    }

    /**
     * 获取publishedDeliveryTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishedDeliveryTime() {
        return publishedDeliveryTime;
    }

    /**
     * 设置publishedDeliveryTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishedDeliveryTime(XMLGregorianCalendar value) {
        this.publishedDeliveryTime = value;
    }

    /**
     * 获取commitDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitDate() {
        return commitDate;
    }

    /**
     * 设置commitDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitDate(XMLGregorianCalendar value) {
        this.commitDate = value;
    }

    /**
     * 获取commitDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getCommitDay() {
        return commitDay;
    }

    /**
     * 设置commitDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setCommitDay(DayOfWeekType value) {
        this.commitDay = value;
    }

    /**
     * 获取transitTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransitTimeType }
     *     
     */
    public TransitTimeType getTransitTime() {
        return transitTime;
    }

    /**
     * 设置transitTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransitTimeType }
     *     
     */
    public void setTransitTime(TransitTimeType value) {
        this.transitTime = value;
    }

    /**
     * 获取maximumTransitTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransitTimeType }
     *     
     */
    public TransitTimeType getMaximumTransitTime() {
        return maximumTransitTime;
    }

    /**
     * 设置maximumTransitTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransitTimeType }
     *     
     */
    public void setMaximumTransitTime(TransitTimeType value) {
        this.maximumTransitTime = value;
    }

    /**
     * 获取customTransitTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransitTimeType }
     *     
     */
    public TransitTimeType getCustomTransitTime() {
        return customTransitTime;
    }

    /**
     * 设置customTransitTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransitTimeType }
     *     
     */
    public void setCustomTransitTime(TransitTimeType value) {
        this.customTransitTime = value;
    }

    /**
     * 获取ineligibleForMoneyBackGuarantee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIneligibleForMoneyBackGuarantee() {
        return ineligibleForMoneyBackGuarantee;
    }

    /**
     * 设置ineligibleForMoneyBackGuarantee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIneligibleForMoneyBackGuarantee(Boolean value) {
        this.ineligibleForMoneyBackGuarantee = value;
    }

    /**
     * Gets the value of the deliveryEligibilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryEligibilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryEligibilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroundDeliveryEligibilityType }
     * 
     * 
     */
    public List<GroundDeliveryEligibilityType> getDeliveryEligibilities() {
        if (deliveryEligibilities == null) {
            deliveryEligibilities = new ArrayList<GroundDeliveryEligibilityType>();
        }
        return this.deliveryEligibilities;
    }

    /**
     * 获取astraPlannedServiceLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstraPlannedServiceLevel() {
        return astraPlannedServiceLevel;
    }

    /**
     * 设置astraPlannedServiceLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstraPlannedServiceLevel(String value) {
        this.astraPlannedServiceLevel = value;
    }

    /**
     * 获取astraDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstraDescription() {
        return astraDescription;
    }

    /**
     * 设置astraDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstraDescription(String value) {
        this.astraDescription = value;
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
     * 获取airportId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportId() {
        return airportId;
    }

    /**
     * 设置airportId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportId(String value) {
        this.airportId = value;
    }

    /**
     * 获取serviceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * 设置serviceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * 获取packagingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingCode() {
        return packagingCode;
    }

    /**
     * 设置packagingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingCode(String value) {
        this.packagingCode = value;
    }

    /**
     * 获取scac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScac() {
        return scac;
    }

    /**
     * 设置scac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScac(String value) {
        this.scac = value;
    }

}
