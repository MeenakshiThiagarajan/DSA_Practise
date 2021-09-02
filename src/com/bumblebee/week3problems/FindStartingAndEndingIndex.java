package com.bumblebee.week3problems;

/* Given an array of integers nums sorted in ascending order, find the starting and ending position of a
given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

* Hint - Check mid-1 element equals k and index is 0 then traverse the array right side check k element index
*
* */

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindStartingAndEndingIndex {

    @Test
    public void test1() {
        int[] input = {5,7,7,8,8,10};
        int k = 8;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(Arrays.toString(new int[] {3,4}), Arrays.toString(findStartingAndEndingIndexOfK(input, k)));
    }

    private int[] findStartingAndEndingIndexOfK(int[] input, int k) {
        int low =0, high = input.length-1, mid;
        int index = 0;

        while(low<=high) {
            mid = (low+high)/2;
            if(input[mid]<k)  index = mid+1;
            if(input[mid]==k)  high = mid-1;
            else low = mid+1;
        }
        high = input.length-1;
        low = index;


        while(low<=high) {
            mid = (low+high)/2;
            if(input[mid]>k) return new int[] {index,mid-1};
            if(input[mid]==k)  low = mid+1;
            else high = mid-1;
        }
        return new int[] {-1,-1};


    }
}