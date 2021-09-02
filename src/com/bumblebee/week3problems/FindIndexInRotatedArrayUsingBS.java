package com.bumblebee.week3problems;

/*
* There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your
* function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is
* [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7]
* might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1
* if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
*
*
*
*
*
*
* */
import org.junit.Assert;
import org.junit.Test;

public class FindIndexInRotatedArrayUsingBS {

    @Test
    public void test1() {
        int[] input = {4,5,6,7,0,1,2};
        int k = 0;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(4, findIndexOfK(input, k));
    }

    @Test
    public void test2() {
        int[] input = {4,5,6,7,0,1,2};
        int k = 6;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(2, findIndexOfK(input, k));
    }

    @Test
    public void test3() {
        int[] input = {4,5,6,7,0,1,2};
        int k = 5;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(1, findIndexOfK(input, k));
    }

    @Test
    public void test4() {
        int[] input = {5,6,7,0,1,2,4};
        int k = 7;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(2, findIndexOfK(input, k));
    }

    @Test
    public void test5() {
        int[] input = {5,6,7,0,1,2,4};
        int k = 8;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(-1, findIndexOfK(input, k));
    }
    /*
    * Get the input array and target k
    * Initialise low, high, mid
    *
    *
    *
    * */
    private int findIndexOfK(int[] input, int k) {
        int length = input.length;
        int low = 0, high = length-1, mid;
        /*while(low<high) {
            mid = (low+high)/2;
            if(input[mid]==k) return mid;
            if(input[mid+1]<= k) low = mid+1;
            if(input[mid+1] >= k) high = mid+1;
        }*/
        while(low<=high) {
             mid = (low+high)/2;
            if(input[mid]==k) return mid;
            if(input[mid]>input[low]) {
                if(input[low]>k && k<input[mid]) low = mid+1;
                else high = mid-1;
            }

            else if(input[mid]<input[high]) {
                if(input[high]<k && k>input[mid]) high = mid-1;
                else low = mid+1;
            }
        }
        return -1;
    }
}
