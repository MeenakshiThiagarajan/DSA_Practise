package com.bumblebee.sample;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UniformString {
    @Test
    public void test1() {
        String input = "abbccaadf";
        int[] target_values = {4,2,5,3,7};
        System.out.println(findUniformString(input, target_values));
        Assert.assertEquals("Possible", findUniformString(input, target_values));
    }

    /* 8 mins
    * Initialize left and right pointers as 0
    * Initialize a map and put the values of target_values array and make values as false
    * Iterate through the string and check if charAt[left] equals charAt[right]
    *  if true add the values from left to right and check for value in key of the map,
    *       if present reset the value as true and increment right
    *       if not present ignore
    * if charAt[left] not equals charAt[right] make left = right
    * Return the values of the map as a string with commas
    */
    private String findUniformString(String input, int[] target_values) {
        int left = 0, right = 0;
        Map<Integer, String> resultValues = new HashMap<>();
        resultValues.put(4,"false");
        resultValues.put(2,"false");
        resultValues.put(5,"false");
        resultValues.put(3,"false");
        resultValues.put(7,"false");
        while(right<input.length()) {
            int sum = 0;
            if(input.charAt(left)==input.charAt(right)) {
                right++;}
            if(input.charAt(left)!=input.charAt(right)) {
                for(int i = left; i<right; i++) {
                    sum += Character.valueOf(input.charAt(left))-96;
                }

                if(resultValues.containsKey(sum)) {
                    int finalSum = sum;
                    resultValues.entrySet().stream().filter(x->x.getKey().equals(finalSum)).findFirst().get().setValue("true");
                }
                left = right;
            }
        }
        for (String result : resultValues.values()) {

        }
return null;
    }
}
