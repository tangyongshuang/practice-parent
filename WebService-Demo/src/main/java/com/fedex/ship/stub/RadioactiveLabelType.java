/**
 * RadioactiveLabelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;

public class RadioactiveLabelType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RadioactiveLabelType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _III_YELLOW = "III_YELLOW";
    public static final String _II_YELLOW = "II_YELLOW";
    public static final String _I_WHITE = "I_WHITE";
    public static final RadioactiveLabelType III_YELLOW = new RadioactiveLabelType(_III_YELLOW);
    public static final RadioactiveLabelType II_YELLOW = new RadioactiveLabelType(_II_YELLOW);
    public static final RadioactiveLabelType I_WHITE = new RadioactiveLabelType(_I_WHITE);
    public String getValue() { return _value_;}
    public static RadioactiveLabelType fromValue(String value)
          throws IllegalArgumentException {
        RadioactiveLabelType enumeration = (RadioactiveLabelType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static RadioactiveLabelType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(RadioactiveLabelType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v23", "RadioactiveLabelType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
