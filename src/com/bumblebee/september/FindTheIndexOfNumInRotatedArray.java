package com.bumblebee.september;

import org.junit.Assert;
import org.junit.Test;

/*
* Search in a rotated array


There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
*
* */
public class FindTheIndexOfNumInRotatedArray {
    @Test
    public void test1() {
        int[] input = {4,5,6,7,0,1,2};
        int k = 0;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(4, findIndexOfKUsingBS(input, k));
    }

    @Test
    public void test2() {
        int[] input = {4,5,6,7,0,1,2};
        int k = 6;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(2, findIndexOfKUsingBS(input, k));
    }

    @Test
    public void test3() {
        int[] input = {4,5,6,7,0,1,2};
        int k =3;
        Assert.assertEquals(-1, findIndexOfKUsingBS(input,k));
    }
    @Test
    public void test4() {
        int[] input = {1};
        int k =0;
        Assert.assertEquals(-1, findIndexOfKUsingBS(input,k));
    }

    private int findIndexOfKUsingBS(int[] input, int k) {
        int low = 0, high = input.length-1, mid;
        mid = (low+high)/2;
        if(input[mid]>input[high]) {
            if(input[low] < k && input[mid] > k) high = mid-1;
            else low = mid+1;
        }

        while(low<=high) {
            mid = (low + high) / 2;
            if (input[mid] == k) return mid;
            if (input[mid] < k) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
