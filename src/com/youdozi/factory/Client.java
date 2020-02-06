package com.youdozi.factory;

public class Client {
    public static void main(String args[]){
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("B");
        classA.createType("C");
    }
}