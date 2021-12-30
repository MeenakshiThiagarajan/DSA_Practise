package com.bumblebee.javaImplementations;

public class ExecutionSequence {

    {
        System.out.println("I am inside the instantiation block");
    }

    static{
        System.out.println("I am inside the static block");
    }

    ExecutionSequence() {
        System.out.println("I am the constructor");
    }

    ExecutionSequence(int value) {
        System.out.println("I am the constructor");
    }

    public static void main(String[] args) {
        ExecutionSequence exe = new ExecutionSequence();
        ExecutionSequence exe1 = new ExecutionSequence(10);
    }
}
