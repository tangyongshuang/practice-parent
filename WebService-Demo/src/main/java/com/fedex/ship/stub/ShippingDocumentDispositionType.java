/**
 * ShippingDocumentDispositionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;

public class ShippingDocumentDispositionType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShippingDocumentDispositionType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _DEFERRED_STORED = "DEFERRED_STORED";
    public static final String _EMAILED = "EMAILED";
    public static final String _QUEUED = "QUEUED";
    public static final String _RETURNED = "RETURNED";
    public static final String _STORED = "STORED";
    public static final ShippingDocumentDispositionType DEFERRED_STORED = new ShippingDocumentDispositionType(_DEFERRED_STORED);
    public static final ShippingDocumentDispositionType EMAILED = new ShippingDocumentDispositionType(_EMAILED);
    public static final ShippingDocumentDispositionType QUEUED = new ShippingDocumentDispositionType(_QUEUED);
    public static final ShippingDocumentDispositionType RETURNED = new ShippingDocumentDispositionType(_RETURNED);
    public static final ShippingDocumentDispositionType STORED = new ShippingDocumentDispositionType(_STORED);
    public String getValue() { return _value_;}
    public static ShippingDocumentDispositionType fromValue(String value)
          throws IllegalArgumentException {
        ShippingDocumentDispositionType enumeration = (ShippingDocumentDispositionType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ShippingDocumentDispositionType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ShippingDocumentDispositionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v23", "ShippingDocumentDispositionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
