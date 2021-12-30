package com.bumblebee.javaImplementations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LearnReflection {

    public void run(){
        System.out.println("Started Running");
    }
    public void walk(int speed){
        System.out.println("Walking"+ speed);
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //new LearnReflection().walk(100);
        Class<?> classObj = Class.forName("com.bumblebee.javaImplementations.LearnReflection");
        Method[] methods = classObj.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        Object instance = classObj.newInstance();
        Method method = classObj.getMethod("walk", Integer.TYPE);
        Object invoke = method.invoke(instance, 200);


    }
}
