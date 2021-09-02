package com.bumblebee.marathon;

/**
 * 11) Given an array nums of n integers where n > 1, return an array output
 * such that output[i] is equal to the product of all the elements of nums
 * except nums[i]. Input: [1,2,3,4] Output: [24,12,8,6] Interview Question from
 * Amazon
 */

import org.junit.Test;

import java.util.Arrays;

public class ProductOfAllNums {

    @Test
    public void test1() {
        int[] input = {1,2,3,4,5};
        System.out.println(Arrays.toString(returnProductOfAllNums(input)));
        //Assert.assertEquals(0, returnProductOfAllNums(input));
    }

    @Test
    public void test2() {
        int[] input = {1,1,1,1,1};
        System.out.println(Arrays.toString(returnProductOfAllNums(input)));
        //Assert.assertEquals(0, returnProductOfAllNums(input));
    }

    @Test
    public void test3() {
        int[] input = {2,2,2,2,2,2};
        System.out.println(Arrays.toString(returnProductOfAllNums(input)));
        //Assert.assertEquals(0, returnProductOfAllNums(input));
    }

    private int[] returnProductOfAllNums(int[] input) {
        int product = 1;
        for(int i=0; i<input.length; i++) {
            product *= input[i];
        }
        for(int i=0; i<input.length; i++) {
            input[i] = product / input[i];
        }
        return input;
    }
}
