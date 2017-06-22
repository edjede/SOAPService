/**
 * BMIvalues.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.w3schools.www.EdwindeRoos;

public class BMIvalues  implements java.io.Serializable {
    private float length;

    private float weight;

    public BMIvalues() {
    }

    public BMIvalues(
           float length,
           float weight) {
           this.length = length;
           this.weight = weight;
    }


    /**
     * Gets the length value for this BMIvalues.
     * 
     * @return length
     */
    public float getLength() {
        return length;
    }


    /**
     * Sets the length value for this BMIvalues.
     * 
     * @param length
     */
    public void setLength(float length) {
        this.length = length;
    }


    /**
     * Gets the weight value for this BMIvalues.
     * 
     * @return weight
     */
    public float getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this BMIvalues.
     * 
     * @param weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMIvalues)) return false;
        BMIvalues other = (BMIvalues) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.length == other.getLength() &&
            this.weight == other.getWeight();
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
        _hashCode += new Float(getLength()).hashCode();
        _hashCode += new Float(getWeight()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMIvalues.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.w3schools.com/EdwindeRoos", ">BMIvalues"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3schools.com/EdwindeRoos", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.w3schools.com/EdwindeRoos", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
