package com.bumblebee.week8.slidingWindow;

/*
* Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array.

Return 0 if there is no such subarray.



Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
Example 4:

Input: nums = [1,1,0,0,1,1,1,0,1]
Output: 4
Example 5:

Input: nums = [0,0,0]
Output: 0
* */

public class LongestSubarrayOf1sAfterDeletingOneElement_1493 {

    private int longestSubarray(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]>1) throw new RuntimeException("Invalid input");
        // }
        int left = 0, max = 0, zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
            while(zeroCount > 1) {
                if (nums[left++] == 0)
                    zeroCount--;
            }
            max = Math.max(max, i - left + 1);
        }
        return max - 1;
    }
}
