/**
 * WSBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.w3schools.www.EdwindeRoos.message;

public class WSBindingSkeleton implements com.w3schools.www.EdwindeRoos.message.WSInterface, org.apache.axis.wsdl.Skeleton {
    private com.w3schools.www.EdwindeRoos.message.WSInterface impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.w3schools.com/EdwindeRoos", "BMIvalues"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3schools.com/EdwindeRoos", ">BMIvalues"), com.w3schools.www.EdwindeRoos.BMIvalues.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("calculateBMI", _params, new javax.xml.namespace.QName("http://www.w3schools.com/EdwindeRoos", "BMI"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "calculateBMI"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("calculateBMI") == null) {
            _myOperations.put("calculateBMI", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("calculateBMI")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("ApplicatieFout");
        _fault.setQName(new javax.xml.namespace.QName("http://www.w3schools.com/EdwindeRoos", "Error"));
        _fault.setClassName("com.w3schools.www.EdwindeRoos.Error");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3schools.com/EdwindeRoos", ">Error"));
        _oper.addFault(_fault);
    }

    public WSBindingSkeleton() {
        this.impl = new com.w3schools.www.EdwindeRoos.message.WSBindingImpl();
    }

    public WSBindingSkeleton(com.w3schools.www.EdwindeRoos.message.WSInterface impl) {
        this.impl = impl;
    }
    public float calculateBMI(com.w3schools.www.EdwindeRoos.BMIvalues request) throws java.rmi.RemoteException, com.w3schools.www.EdwindeRoos.Error
    {
        float ret = impl.calculateBMI(request);
        return ret;
    }

}
