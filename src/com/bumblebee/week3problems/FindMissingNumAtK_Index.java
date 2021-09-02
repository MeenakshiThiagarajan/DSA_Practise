package com.bumblebee.week3problems;

/* Given an array arr positive integers sorted in a strictly increasing order, and an integer k. Find the kth positive
integer that is missing from this array.

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
*
*
*
* */



import org.junit.Assert;
import org.junit.Test;

public class FindMissingNumAtK_Index {

    @Test
    public void test1() {
        int[] input = {2,3,4,7,11};
        int k = 5;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(9, findMissingNumAtK(input, k));
    }

    @Test
    public void test2() {
        int[] input = {1,2,3,4};
        int k = 2;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(6, findMissingNumAtK(input, k));
    }

    @Test
    public void test3() {
        int[] input = {1,2,3,4};
        int k = 2;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(6, findMissingNumAtK(input, k));
    }

    @Test
    public void test4() {
        int[] input = {2,4,7,11,12,15};
        int k = 2;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(3, findMissingNumAtK(input, k));
    }



    /*
    * Get the input array and target k
    * Initiliaze low ->0, high -> length-1, mid ->low+high /2
    * Iterate til low is less than or equal to high
    * check if element at mid - index of mid -1 is less than k
    *   if true then low = mid+1
    *   else high = mid-1
    *  return high+k+1 (to get the missing number)
    * */

    private int findMissingNumAtK(int[] input, int k) {
        int low = 0, high = input.length-1, mid;
        while(low<=high) {
            mid = (low+high)/2;
            if(input[mid]-mid-1<k) low = mid+1;
            else high = mid-1;
        }
        return high+k+1;


    }
}
