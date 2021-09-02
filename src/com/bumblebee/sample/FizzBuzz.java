package com.bumblebee.sample;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz {
    @Test
    public void test1() {
        int input = 15;
        System.out.println(fizzBuzz(input));
        Assert.assertEquals("Possible", fizzBuzz(input));
    }

    @Test
    public void test2() {
        int input = 3;
        System.out.println(fizzBuzz(input));
        Assert.assertEquals("Possible", fizzBuzz(input));
    }

    @Test
    public void test3() {
        int input = 10;
        System.out.println(fizzBuzz(input));
        Assert.assertEquals("Possible", fizzBuzz(input));
    }

    /* 10 mins
    * Declare a list of Integers
    * Declare a map of Integer and String and put 3 and 5
    * Iterate through the nummbers and find if the number is divisible by 3 or 5
    *   if divisible get the value of 3 and 5
    * else the number itself
    * Add it to the list
    */



    //15 mins
    private List<String> fizzBuzz(int input) {
        List<String> fizzBuzzList= new ArrayList<>();
        int left = 1, right = input;
        Map<Integer, String> fizzBuzzMap = new HashMap<>();
        fizzBuzzMap.put(3, "Fizz");
        fizzBuzzMap.put(5, "Buzz");
        while(left<right) {
            String result = "";
            for (Integer divisor: fizzBuzzMap.keySet()) {
                if(left%divisor==0) result += fizzBuzzMap.get(divisor);
                if(right%divisor==0) result += fizzBuzzMap.get(divisor);
                if(left%divisor!=0) result = String.valueOf(left);
                if(right%divisor==0) result = String.valueOf(right);
                fizzBuzzList.add(result);
                left++;
                right--;
            }
        }
       return fizzBuzzList;
    }


}
