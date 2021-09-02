package com.bumblebee.sample;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TargetSumInSubArray {

    //2 mins 15 sec
    @Test
    public void test1() {
        int target = 33;
        int[] input = {1,4,20,3,10,5};
        System.out.println(findTargetSumIsPresent(input, target));
        Assert.assertTrue(findTargetSumIsPresent(input, target));
    }

    @Test
    public void test2() {
        int target = 33;
        int[] input = {1,4,20,3,4,5};
        System.out.println(findTargetSumIsPresent(input, target));
        Assert.assertFalse(findTargetSumIsPresent(input, target));
    }

    /* Pseudo code 4 mins 37 sec
    * Initialize two pointers left = 0, right = 1
    * Add the to the sum by incrementing right and check if the max sum is equal to the target
    *   if true return true
    *   else if sum is greater than target increment left and make right = left+1 and continue checking for the target sum
    *
    *
    *
    * */

    //11 mins 34 sec
    private boolean findTargetSumIsPresent(int[] input, int target) {
        int left = 0, right = 1, maxSum = 0;
        maxSum  = input[left];
        /*while(left<right) {
            //maxSum = Math.max(input[left],input[left]+input[right]);

            maxSum += input[right];
            if(maxSum==target) return true;
            if(maxSum<target && right<input.length) right++;
            if(maxSum>target){
                left++;
                maxSum = input[left];
                right = left+1;
            }
        }*/
        for(int i=right; right<input.length; i++) {
            if(maxSum==target) return true;
            maxSum += input[right];
            if(maxSum<target && right<input.length) right++;
            if(maxSum>target) maxSum -= input[left++];
        }
        return false;
    }
}
