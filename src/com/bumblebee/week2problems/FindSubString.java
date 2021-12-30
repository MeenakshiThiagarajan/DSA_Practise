package com.bumblebee.week2problems;

/*
Question : Given an array of integers and an integer k, find out whether there are two
	distinct indices i and j in the array such that nums[i] = nums[j]
	and the absolute difference between i and j is at most k.
	Example 1:
	Input: nums = [1,2,3,1], k = 3
	Output: true
	Example 2:
	Input: nums = [1,0,1,1], k = 1
	Output: true
	Example 3:
	Input: nums = [1,2,3,1,2,3], k = 2
	Output: false
	Example 3:
	Input: nums = [1,2,3,2], k = 2
	Output: true

    1) Did I understand the problem? Yes
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be a integer array
        *    What is the expected output? --> Integer that occurs pn;y once in the array
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
                1. Algorithm
                2. Time complexity
                3. Space complexity
                constraints:
                1) Using 2 pointer technique
                2) Linear Time complexity - O(n)
                3) Space Complexity - O(1)

        *    Do I have all information to go to next step!! -> yes

    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - Input: nums = [2,2,1] Output: 1
        -----> Negative Cases - Input: nums = [4,1,2,1,2] Output: 4
        -----> Edge Cases - {1,3,4} -> 2

    3) Do I know how to solve it? -> yes
        * Yes - Great, is there an alternate? -> Yes
        * No - Can I break down the problem into sub problems?
        *

    4) Ask for hint (if you do not know how to solve it?)
        *  		-> Ask one time and thank the interviewer
        *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence
        *  		   level to get the next question

    5) Do I know alternate solutions as well?
        * 	Yes - What are those? -> using 2 pointer

    6) If I know the alternate solutions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best

    7) Psuedocode for Brute force method
        * Get the input integer array
        * Using for loop Put the array elements into the map
        * Stream and Check which key has value as one and return that key
        *
    Pseudocade
	* Get the interger array
	* loop through o to k-1
	    add the each element to set -> If duplicates return true
	* Loop through 1 to length of array -k
	    remove i-1 element from the set and add i+k-1 element to the set
	    If duplicates return true

	* Return false
 */


import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class FindSubString {
    @Test
    public void test1() {
        int[] input = {1,2,3,1};
        int k = 3;
        Assert.assertTrue(findIfPresent(input,k));
    }

    @Test
    public void test2() {
        int[] input = {1,0,1,1};
        int k = 1;
        Assert.assertTrue(findIfPresent(input,k));
    }

    @Test
    public void test3() {
        int[] input = {1,2,3,1,2,3};
        int k = 2;
        Assert.assertFalse(findIfPresent(input,k));
    }

    @Test
    public void test4() {
        int[] input = {1,2,3,2};
        int k = 2;
        Assert.assertTrue(findIfPresent(input,k));
    }

    @Test
    public void test5() {
        int[] input = {1,2,3,2,2,3};
        int k = 3;
        Assert.assertTrue(findIfPresent(input,k));
    }

    @Test
    public void test6() {
        int[] input = {1,2,3,1,2,3};
        int k = 2;
        Assert.assertFalse(findIfPresent(input,k));
    }

    /*
    * Time Complexity -> O(n) + O(m) -> O(m)
    * Space complexity -> O(n)
    *
    */

    private boolean findIfPresent(int[] input, int k) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<=k; i++) {
            if(!set.add(input[i])) return true;//to check duplicates within first window size
        }

        for(int i=1; i<input.length-k; i++) {
            set.remove(input[i-1]); // Deleting previous window element at the index(i-1)
            if(!set.add(input[i+k])) return true;
        }
        return false;
    }
}
