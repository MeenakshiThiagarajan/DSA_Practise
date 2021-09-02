package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

/*
* Given an array of integers, return the highest sum of any consecutive elements in the array.
*
* {1,-5,2,-3,7,1}
*
* */
public class HighestSum {
    @Test
    public void test3() {
        int[] input = {1,-5,2,-3,7,1};
        System.out.println(returnHighestSum(input));
        Assert.assertEquals(8, returnHighestSum(input));
    }

    private int returnHighestSum(int[] input) {
        int highestSum = Integer.MIN_VALUE;
        for(int i=0; i<input.length;i++) {
            int sum = 0;
            for (int j = i; j < input.length; j++) {
                sum = sum + input[j];
                highestSum = Math.max(highestSum, sum);
            }
        }

        return highestSum;
    }

}
