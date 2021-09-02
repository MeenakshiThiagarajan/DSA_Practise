package com.bumblebee.week7.apple;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/*
* Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two
whose elements sum up to a multiple of k, or false otherwise. An integer x is a multiple of k if there exists an
integer n such that x = n * k. 0 is always a multiple of k.

Example 1:
Input: nums = [23,2,4,6,7], k = 6
Output: true

* */

public class FindSumIsMultipleOfK {
    @Test
    public void testcase1() {
        int[] intarr= {23,2,4,6,7};
        int k=6;
        isMultipleOfK(intarr,k);
    }

    @Test
    public void testcase2() {
        int[] intarr= {23,2,6,4,7};
        int k=6;
        isMultipleOfK(intarr,k);
    }

    @Test
    public void testcase3() {
        int[] intarr= {21,6,12,8,4};
        int k=4;
        isMultipleOfK(intarr,k);
    }

    private boolean isMultipleOfK(int[] intarr, int k) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        int sum = 0, remainder = 0;
        remainder = intarr[0]%k;
        resultMap.put(remainder, 0);
        for (int i = 1; i < intarr.length ; i++) {
            sum = remainder+intarr[i];
            remainder = sum%k;
            if(sum==0) return true;
            if(resultMap.containsKey(remainder) && i - resultMap.get(remainder) > 1) return true;
            if(!resultMap.containsKey(remainder)) resultMap.put(remainder,i);
        }
        return false;
    }






}
