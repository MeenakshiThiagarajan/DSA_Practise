package com.bumblebee.javaImplementations;

public interface Android {

    default void log() {
        System.out.println("Default Method");
    }

    public void tap();
}
