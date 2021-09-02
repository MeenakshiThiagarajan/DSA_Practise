package com.bumblebee.week2problems;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/*
Question : Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.


Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

Example 3:

Input: nums = [0]
Output: [0]

    1) Did I understand the problem? Yes
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be a integer array
        *    What is the expected output? --> sort the colours in adjacent order
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
                1. Algorithm
                2. Time complexity
                3. Space complexity
                constraints:
                1) Using 3 pointer technique


        *    Do I have all information to go to next step!! -> yes

    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - Input: nums = [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
        -----> Negative Cases - Input: 2  Output: false
        -----> Edge Cases - 0 -> 2

    3) Do I know how to solve it? -> yes
        * Yes - Great, is there an alternate? -> Yes
        * No - Can I break down the problem into sub problems?
        *

    4) Ask for hint (if you do not know how to solve it?)
        *  		-> Ask one time and thank the interviewer
        *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence
        *  		   level to get the next question

    5) Do I know alternate solutions as well?
        * 	Yes - What are those? -> using 3 pointer

    6) If I know the alternate solutions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best

    7) Psuedocode for Brute force method
        * Get the input integer array
        * Using while loop get the digits and get the squares of it
        * Add the squares of the digits and store it in sum
        * Check if sum == 1
        * If condition satisfies, then return true
        * Else add the sum to the set and
        * Check which key has value as one and return that key
        *
        */
public class SortingColours {

    @Test
    public void test1() {
        int[] input = {2,0,2,1,1,0};
        Assert.assertEquals(true, Arrays.equals(new int[] {0,0,1,1,2,2},sortingColoursUsing3Pointer(input)));
    }

    private int[] sortingColoursUsing3Pointer(int[] input) {

        int low = 0,mid = 0, high = input.length-1;
        while(mid<high) {
            if(input[mid]==0) {
                int temp = input[low++];
                input[mid++] = temp;

            }

            else if(input[mid]==1) mid++;

            else {
                int temp = input[high];
                input[high--] = input[mid];
                input[mid] = temp;
            }

        }
        return input;
    }
}
