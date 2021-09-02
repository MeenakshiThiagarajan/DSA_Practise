package com.bumblebee.week1assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/*

Question : Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
           That is, for each nums[i] you have to count the number of
           valid j's such that j != i and nums[j] < nums[i].

    1) Did I understand the problem? Yes
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be a integer array
        *    What is the expected output? --> Integer array that has the count of smaller elements of each element
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
                1. Algorithm
                2. Time complexity
                3. Space complexity
                constraints:
                2 <= nums.length <= 500 i.e., array length should be between 2 and 500
                0 <= nums[i] <= 100 i.e., Array elemnts can be from 0 to 100
        *    Do I have all information to go to next step!! -> yes

    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - {8,1,2,2,3} -> {4,0,1,1,3}
        -----> Negative Cases - {1,1,1} -> {0,0,0}
        -----> Edge Cases - {1,3,4} -> 2

    3) Do I know how to solve it? -> yes
        * Yes - Great, is there an alternate? -> Yes
        * No - Can I break down the problem into sub problems?
        *

    4) Ask for hint (if you do not know how to solve it?)
        *  		-> Ask one time and thank the interviewer
        *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence
        *  		   level to get the next question
        *

    5) Do I know alternate solutions as well?
        * 	Yes - What are those?
        *   Way of Approach to solve with the following
        *   -> Brute Force (Standard) --> using two for loops
        *   Other optimised solutions

    6) If I know the alternate soltions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best

    7) Psuedocode for Brute force method
        * Get the input integer array
        * Initialize the another array result of length equal to input to store the o/p
        * Check whether the length of the array is 2<= length <=500, if ths fails return -1
        * Else Iterate the elements of input array using nested for loop
        * Initialize a count variable
        * check if i!=j, then check input[i] > input[j]
            If condition returns true, increment the count
        * End the inner loop store that in the result array at the ith index
        * Return the result array
        *
        */
public class FindNoOfSmallerElementsThanCurrent {

    @Test
    public void test1() {
        int input[] = {8,1,2,2,3};
        Assert.assertEquals(true, Arrays.equals(new int[]{4, 0, 1, 1, 3},
                findNoOfSmallerElementsThanCurrent(input)));
        /*Assert.assertEquals(true, Arrays.equals(new int[]{4, 0, 1, 1, 3},
                findNoOfSmallerElementsThanCurrentUsingPreviousElement(input)));*/
        Assert.assertEquals(Arrays.toString(new int[]{4, 0, 1, 1, 3}),
                Arrays.toString(findNoOfSmallerElementsThanCurrentUsingPreviousElement(input)));
    }

    @Test
    public void test2() {
        int input[] = {1,1,1,1};
        Assert.assertEquals(true, Arrays.equals(new int[]{0, 0, 0, 0},
                findNoOfSmallerElementsThanCurrent(input)));
        //Assert.assertEquals(findMissingNumberUsingBruteForce(input), 4);

    }

    @Test(expected = RuntimeException.class)
    public void test3() {
        int input[] = {1};
        Assert.assertEquals("Invalid input",
                findNoOfSmallerElementsThanCurrent(input));
        //Assert.assertEquals(findMissingNumberUsingBruteForce(input), 4);

    }

    /*
    * Time complexity -> O(n^2)
    * Space Complexity -> O(n)
    * */

    private int[] findNoOfSmallerElementsThanCurrent(int input[]) {
        int result[] = new int[input.length];
        int count;
        if(input.length<2)
            throw new RuntimeException("Invalid input");
        else {
            for(int i=0; i<input.length; i++) {
                count = 0;
                for(int j=0; j<input.length; j++ ) {
                    if(i!=j) {
                        if(input[i]>input[j])
                            count++;
                    }
                }
                result[i] = count;
            }
            return result;
        }
    }

    private int[] findNoOfSmallerElementsThanCurrentUsingPreviousElement(int input[]) {
        int result[] = new int[input.length];
        int count = 1;
        int temp = 0;
        if(input.length<2)
            throw new RuntimeException("Invalid input");
        else {
            for(int i=0; i<input.length-1; i++) {
                if(input[i] > input[i+1]) {
                    temp = input[i+1];
                    input[i+1] = input[i];
                    input[i] = temp;
                }
            }

            for(int i=0; i<input.length; i++) {
                if(i>0 && input[i]==input[i-1]) {
                        result[i] = i-1;
                    }
                    else {
                        result[result.length-1-i] = i;
                    }
            }
            return result;
        }
    }
}
