/**
 * EMailNotificationRecipientType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;

public class EMailNotificationRecipientType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EMailNotificationRecipientType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BROKER = "BROKER";
    public static final String _OTHER = "OTHER";
    public static final String _RECIPIENT = "RECIPIENT";
    public static final String _SHIPPER = "SHIPPER";
    public static final String _THIRD_PARTY = "THIRD_PARTY";
    public static final EMailNotificationRecipientType BROKER = new EMailNotificationRecipientType(_BROKER);
    public static final EMailNotificationRecipientType OTHER = new EMailNotificationRecipientType(_OTHER);
    public static final EMailNotificationRecipientType RECIPIENT = new EMailNotificationRecipientType(_RECIPIENT);
    public static final EMailNotificationRecipientType SHIPPER = new EMailNotificationRecipientType(_SHIPPER);
    public static final EMailNotificationRecipientType THIRD_PARTY = new EMailNotificationRecipientType(_THIRD_PARTY);
    public String getValue() { return _value_;}
    public static EMailNotificationRecipientType fromValue(String value)
          throws IllegalArgumentException {
        EMailNotificationRecipientType enumeration = (EMailNotificationRecipientType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static EMailNotificationRecipientType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMailNotificationRecipientType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v23", "EMailNotificationRecipientType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
