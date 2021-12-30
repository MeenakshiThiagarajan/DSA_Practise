package com.bumblebee.week8;
/*
* Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

A subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.
Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
Example 2:

Input: arr = [1,2]
Output: 3
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
*
* */
public class SumOfOddLengthSubArray_1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            // No of subarrays that end with number at index i
            int end = i + 1;
            // No of subarrays that start with number at index i
            int start = arr.length - i;
            // Total number of subarrays that number at index i can make
            int total = end * start;
            // Dividing subarrays into odd and even subarrays
            int odd = total / 2;
            // If total no of subarray is odd then odd number of subarray=total/2
            if(total % 2 != 0)
                //  for e.g:- total = 5, odd = 2, even = 2 but odd should be 3 so odd+
                odd++;
            // now each number appears odd times in subarrays so odd*number add
            result += odd * arr[i];
        }
        return result;
    }
}
