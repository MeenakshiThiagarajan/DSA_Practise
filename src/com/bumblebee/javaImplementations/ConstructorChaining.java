package com.bumblebee.javaImplementations;

public class ConstructorChaining extends SuperConstructor{

    public ConstructorChaining(){
        System.out.println("Create object");
    }

    public ConstructorChaining(String name){
        super(name);
        System.out.println("Perform action with name");
    }
}
