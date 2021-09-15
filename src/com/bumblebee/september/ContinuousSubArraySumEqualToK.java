package com.bumblebee.september;

/*
* Given an array of integers nums and an integer k, return the total number of continuous subarrays whose
* sum equals to k.
Example 1:

Input: nums = [1,1,1], k = 2
Output: 2

Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
*/

import org.junit.Assert;
import org.junit.Test;

public class ContinuousSubArraySumEqualToK {
    @Test
    public void test1(){
        int[] input = {1,1,1};
        int k = 2;
        Assert.assertEquals(2, findSubArraySumEqualToK(input, k));
    }

    @Test
    public void test2(){
        int[] input = {1,2,3};
        int k = 3;
        Assert.assertEquals(2, findSubArraySumEqualToKUsingSlidingWindow(input, k));
    }

    @Test
    public void test3(){
        int[] input = {1,-1,0};
        int k = 0;
        Assert.assertEquals(3, findSubArraySumEqualToK(input, k));
    }

    @Test
    public void test4(){
        int[] input = {-1,1,0};
        int k = 0;
        Assert.assertEquals(3, findSubArraySumEqualToK(input, k));
    }

    @Test
    public void test5(){
        int[] input = {2,2,-1,2,3};
        int k = 5;
        Assert.assertEquals(2, findSubArraySumEqualToK(input, k));
    }

    @Test
    public void test6(){
        int[] input = {0,0};
        int k = 0;
        Assert.assertEquals(3, findSubArraySumEqualToK(input, k));
    }

    @Test
    public void test7(){
        int[] input = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        Assert.assertEquals(6, findSubArraySumEqualToK(input, k));
    }

    private int findSubArraySumEqualToK(int[] input, int k) {
        int count = 0, sum;
        for (int i = 0; i < input.length; i++) {
            sum = input[i];
            if(sum==k) {
                count++;
            }
            for (int j = i+1; j < input.length; j++) {
                sum += input[j];
                if(sum==k) {
                    count++;
                }
            }
        }
        return count;
    }

    private int findSubArraySumEqualToKUsingSlidingWindow(int[] input, int k) {
        int count = 0, sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            if(sum==k){
                count++;
            }

        }
        return count;
    }
}
