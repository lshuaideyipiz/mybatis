package edu.nf.homeWork.entity;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Pepole {

    String name;
    String sex;
    Integer age;

    public void say(){
        System.out.println("说话");
    };
}
