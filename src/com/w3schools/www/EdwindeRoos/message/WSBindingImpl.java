/**
 * WSBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.w3schools.www.EdwindeRoos.message;

public class WSBindingImpl implements com.w3schools.www.EdwindeRoos.message.WSInterface{
    public float calculateBMI(com.w3schools.www.EdwindeRoos.BMIvalues request) throws java.rmi.RemoteException, com.w3schools.www.EdwindeRoos.Error {
        float BMI = (request.getWeight()/(request.getLength()*request.getLength()));
        if(request.getLength()<=0 || request.getWeight()<=0){
        	throw new com.w3schools.www.EdwindeRoos.Error("Input : length: "+ Float.toString(request.getLength())+", weight: "+ Float.toString(request.getWeight()),"Both input values must be positive");
        }
        return BMI;
    }
}