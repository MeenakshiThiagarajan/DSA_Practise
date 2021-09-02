package com.bumblebee.week1assignment;

/*

Question : Given an array nums containing n distinct numbers in the range [0, n],
           return the only number in the range that is missing from the array.

    1) Did I understand the problem? Yes or No !!
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be a integer array
        *    What is the expected output? --> Integer that is missing in the range
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
                1. Algorithm
                2. Time complexity
                3. Space complexity
        *    Do I have all information to go to next step!!
        *    How big is your test data set will be? --> Ask for the test data(input) size to select the appropriate solution
        (Eg., size of the array)
    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - {0,1,2,4} -> Missing number -> 3
        -----> Negative Cases - {1,2,3} -> Missing number ->
        -----> Edge Cases - {1,3,4} -> 2

    3) Do I know how to solve it?
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
        *   -> Brute Force (Standard) --> using two for loops,
               Collections --> HahMap
        *   Other optimised solutions

    6) If I know the alternate soltions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best
    7) Psuedocode
        * Get the input integer array
        * Sort the array
        * Iterate through the array using for loop from i=1
        * Check arr[i] - arr[i-1] != 1
        * If true then return the difference of two elements as missing number
        *
        */


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MissingNumber {

    @Test
    public void test1() {
        int input[] = {1,2,3,5,6};
        Assert.assertEquals(findMissingNumber(input), 4);
        //Assert.assertEquals(findMissingNumberUsingBruteForce(input), 4);

    }

    @Test
    public void test2() {
        int input[] = {3,4,5,6};
        Assert.assertEquals(findMissingNumber(input), 2);

    }

    @Test(expected = RuntimeException.class)
    public void test3() {
        int input[] = {1,2,3,4,5,6};
        Assert.assertEquals(findMissingNumber(input), "No number missing in the range 0 to n");

    }

    /*@Test(expected = RuntimeException.class)
    public void test3() {
        int input[] = {-1,-3};
        Assert.assertEquals(findMissingNumber(input), "No number missing in the range 0 to n");

    }*/


    /*
    * Time Complexity ->  O(n logn)
    * Space complexitty -> O(1)
    *
    * */
    private int findMissingNumber(int input[]) {
        Arrays.sort(input);
        //int missingElement = 0;
        for(int i=1; i<input.length; i++) {
            if ((input[i] - input[i - 1]) != 1) {

                return input[i] - 1;
            }
        }
            throw new RuntimeException("No number missing in the range 0 to n");
    }

    private int findMissingNumberUsingFormula(int input[]) {
        int missingElement = 0;
        int min = input[0];
        int max = input[0];

        for(int i=1; i<input.length; i++) {
            if (max > input[i]) {
                min = input[i];
            }
            if (min < input[i]) {
                max = input[i];
            }
        }
        int sum = 0;
        if(min==0) {
           sum =  (max * (max + 1))/2;
        }
        else {
            sum = ((max * (max + 1))/2) - ((min * (min + 1))/2);
        }
        if(missingElement>=0)
            return missingElement;
        else
            throw new RuntimeException("No number missing in the range 0 to n");
    }


    /*
     * Time Complexity -> O(2n)
     * Space complexitty -> O(1)
     *
     * */
    private int findMissingNumberUsingBruteForce(int input[]) {
        int min = input[0];
        int max = input[0];

        for(int i=1; i<input.length; i++) {
            if (max > input[i]) {
                min = input[i];
            }
            if (min < input[i]) {
                max = input[i];
            }
        }
        int sum = (max * (max + 1))/2;
        for(int i=0; i<input.length; i++) {
            sum = sum - input[i];
        }

        if(sum>=0)
            return sum;
        else
            throw new RuntimeException("No number missing in the range 0 to n");
    }
}
