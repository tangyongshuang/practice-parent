
package com.anhe.pojo.v23mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Party complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Party">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tins" type="{http://fedex.com/ws/ship/v23}TaxpayerIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://fedex.com/ws/ship/v23}Contact" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://fedex.com/ws/ship/v23}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", namespace = "http://fedex.com/ws/ship/v23", propOrder = {
    "accountNumber",
    "tins",
    "contact",
    "address"
})
public class Party {

    @XmlElement(name = "AccountNumber", namespace = "http://fedex.com/ws/ship/v23")
    protected String accountNumber;
    @XmlElement(name = "Tins", namespace = "http://fedex.com/ws/ship/v23")
    protected List<TaxpayerIdentification> tins;
    @XmlElement(name = "Contact", namespace = "http://fedex.com/ws/ship/v23")
    protected Contact contact;
    @XmlElement(name = "Address", namespace = "http://fedex.com/ws/ship/v23")
    protected Address address;

    /**
     * 获取accountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置accountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the tins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxpayerIdentification }
     * 
     * 
     */
    public List<TaxpayerIdentification> getTins() {
        if (tins == null) {
            tins = new ArrayList<TaxpayerIdentification>();
        }
        return this.tins;
    }

    /**
     * 获取contact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * 设置contact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

}
