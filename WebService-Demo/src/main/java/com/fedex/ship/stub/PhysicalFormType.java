/**
 * PhysicalFormType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;

public class PhysicalFormType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PhysicalFormType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _GAS = "GAS";
    public static final String _LIQUID = "LIQUID";
    public static final String _SOLID = "SOLID";
    public static final String _SPECIAL = "SPECIAL";
    public static final PhysicalFormType GAS = new PhysicalFormType(_GAS);
    public static final PhysicalFormType LIQUID = new PhysicalFormType(_LIQUID);
    public static final PhysicalFormType SOLID = new PhysicalFormType(_SOLID);
    public static final PhysicalFormType SPECIAL = new PhysicalFormType(_SPECIAL);
    public String getValue() { return _value_;}
    public static PhysicalFormType fromValue(String value)
          throws IllegalArgumentException {
        PhysicalFormType enumeration = (PhysicalFormType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static PhysicalFormType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(PhysicalFormType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v23", "PhysicalFormType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
