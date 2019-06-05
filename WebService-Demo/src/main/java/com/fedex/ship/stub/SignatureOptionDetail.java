/**
 * SignatureOptionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;

public class SignatureOptionDetail  implements java.io.Serializable {
    private com.fedex.ship.stub.SignatureOptionType optionType;

    private String signatureReleaseNumber;

    public SignatureOptionDetail() {
    }

    public SignatureOptionDetail(
           com.fedex.ship.stub.SignatureOptionType optionType,
           String signatureReleaseNumber) {
           this.optionType = optionType;
           this.signatureReleaseNumber = signatureReleaseNumber;
    }


    /**
     * Gets the optionType value for this SignatureOptionDetail.
     * 
     * @return optionType
     */
    public com.fedex.ship.stub.SignatureOptionType getOptionType() {
        return optionType;
    }


    /**
     * Sets the optionType value for this SignatureOptionDetail.
     * 
     * @param optionType
     */
    public void setOptionType(com.fedex.ship.stub.SignatureOptionType optionType) {
        this.optionType = optionType;
    }


    /**
     * Gets the signatureReleaseNumber value for this SignatureOptionDetail.
     * 
     * @return signatureReleaseNumber
     */
    public String getSignatureReleaseNumber() {
        return signatureReleaseNumber;
    }


    /**
     * Sets the signatureReleaseNumber value for this SignatureOptionDetail.
     * 
     * @param signatureReleaseNumber
     */
    public void setSignatureReleaseNumber(String signatureReleaseNumber) {
        this.signatureReleaseNumber = signatureReleaseNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SignatureOptionDetail)) return false;
        SignatureOptionDetail other = (SignatureOptionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.optionType==null && other.getOptionType()==null) || 
             (this.optionType!=null &&
              this.optionType.equals(other.getOptionType()))) &&
            ((this.signatureReleaseNumber==null && other.getSignatureReleaseNumber()==null) || 
             (this.signatureReleaseNumber!=null &&
              this.signatureReleaseNumber.equals(other.getSignatureReleaseNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOptionType() != null) {
            _hashCode += getOptionType().hashCode();
        }
        if (getSignatureReleaseNumber() != null) {
            _hashCode += getSignatureReleaseNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignatureOptionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v23", "SignatureOptionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v23", "OptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v23", "SignatureOptionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureReleaseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v23", "SignatureReleaseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
