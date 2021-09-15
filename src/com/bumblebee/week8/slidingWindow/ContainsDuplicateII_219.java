package com.bumblebee.week8.slidingWindow;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/*
* Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
* such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
* */
public class ContainsDuplicateII_219 {
    @Test
    public void test1(){
        int [] nums = {1,2,3,1};
        int k = 3;
        Assert.assertTrue(containsNearbyDuplicate(nums, k));
    }

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        if(nums.length==k && nums.length==1) return false;
        for(int i=0; i<=k; i++) {
            if(i<nums.length){
                if(!set.add(nums[i])) return true;//to check duplicates within first window size
            }
        }

        for(int i=1; i<nums.length-k; i++) {
            set.remove(nums[i-1]); // Deleting previous window element at the index(i-1)
            if(!set.add(nums[i+k])) return true;
        }
        return false;
    }
}
