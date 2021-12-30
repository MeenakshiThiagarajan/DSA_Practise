package com.bumblebee.javaImplementations;

public class Mobile implements Samsung, Oneplus, Android{
    @Override
    public void tapOneplus() {
        System.out.println("tapped Oneplus");
    }

    @Override
    public void tapSamsung() {
        System.out.println("tapped samsung");
    }

    public static void main(String[] args) {
        new Mobile().log();
        Samsung.swipe();

    }

    @Override
    public void log() {
        Android.super.log();
    }

    @Override
    public void tap() {

    }
}
