package com.bumblebee.week8.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

/*
* You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
* Any answer with a calculation error less than 10-5 will be accepted.



Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000


Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
*
* */
public class MaximumAverageSubarray_I_643 {
    @Test
    public void test1(){
        int[] input = {1,12,-5,-6,50,3};
        int k = 4;
        Assert.assertEquals(12.75000, findMaxAverage(input, k),0);
    }

    private double findMaxAverage(int[] input, int k) {
        double sum = 0;
        double average = 0;
        for(int i=0; i<k; i++){
            sum += input[i];
        }
        average = sum/k;
        for(int i=1; i<=input.length-k; i++){
            sum += input[i+k-1] - input[i-1];
            average = Math.max((sum/k), average);
        }
        return average;
    }
}
