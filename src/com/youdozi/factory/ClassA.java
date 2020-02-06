package com.youdozi.factory;

public class ClassA {

    public Type createType(String type){

        TypeFactory factory = new TypeFactory();
        Type returnType = factory.createType(type);

        return returnType;
    }
}
