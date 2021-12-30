package com.bumblebee.javaImplementations;

import java.util.HashMap;
import java.util.Map;

public class LearnStreams {

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();

        employees.put("Name1", 31);
        employees.put("Name2", 29);
        employees.put("Name3", 34);
        employees.put("Name4", 30);
        employees.put("Name5", 35);
        System.out.println(employees.entrySet().stream().filter(x->x.getValue()>30).count());
    }
}
