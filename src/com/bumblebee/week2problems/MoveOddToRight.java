package com.bumblebee.week2problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/*
* Question : Given an integer array, move odd numbers to right
* 1) Questions to be asked
* Whats the input? Integer array
* Whats the expected output? Integer array with odd elements moved to the right
* Do I have any constraints? - No
*
* 2) Test data
*   Positive -> {3,2,1,5}-> {2,3,1,5}
*   Negative -> {1,3,5} -> {1,3,5}, {2,4,6} ->{2,4,6}
*   Edge -> {1,3,5} -> {1,3,5}
*
* 3) Do I know how to solve it? -> yes
        * Yes - Great, is there an alternate? -> Yes
        * No - Can I break down the problem into sub problems?
        *

* 4) Ask for hint (if you do not know how to solve it?)
        *  		-> Ask one time and thank the interviewer
        *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence
        *  		   level to get the next question
        *

    5) Do I know alternate solutions as well?
        * 	Yes - What are those?
        *   using 2 pointer

    6) If I know the alternate soltions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best

    7) Psuedocode
*/
public class MoveOddToRight {

    @Test
    public void test1() {
        int[] input = {2,3,4,1};
        //Assert.assertEquals(true, Arrays.equals(new int[] {2,4,3,1}, moveOddToRight(input)));
        Assert.assertEquals(true, Arrays.equals(new int[] {2,4,3,1}, moveOddToRightBruteForce(input)));
    }

    @Test
    public void test2() {
        int[] input = {2,2,2,2};
        Assert.assertEquals(true, Arrays.equals(new int[] {2,2,2,2}, moveOddToRight(input)));
    }

    @Test
    public void test3() {
        int[] input = {1,3,5,7};
        Assert.assertEquals(true, Arrays.equals(new int[] {1,3,5,7}, moveOddToRight(input)));
    }

    @Test
    public void test4() {
        int[] input = {2,3,5,7};
        Assert.assertEquals(true, Arrays.equals(new int[] {2,3,5,7}, moveOddToRight(input)));
    }

    @Test
    public void test5() {
        int[] input =  {7,3,5,7,6,8};
        Assert.assertEquals(true, Arrays.equals(new int[] {6,8,5,7,7,3}, moveOddToRight(input)));
        //Assert.assertEquals(true, Arrays.equals(new int[] {2,4,3,1}, moveOddToRightBruteForce(input)));
    }



    /*
    * Get the input array
    * Initialize two pointers as left from 0 and right from 0
    * Traverse the array until right reaches the length of array
    * Check for condition element in right bitwise and of 1 gives zero as result
    *   if condition satisfies then swap right and left element and increment left and right
    *   if not increment right
    */

    /*
    * Time Complexity -> O(n)
    * Space Complexity -> O(1)
    */
    private int[] moveOddToRight(int[] input) {
        int left = 0, right = 0;
        while(right<input.length) {
            if((input[right]&1)==0) {
                int temp = input[right];
                input[right++] = input[left];
                input[left++] = temp;
            }
            else right++;
        }
        return input;
    }

    private int[] moveOddToRightBruteForce(int[] input) {
        for(int i=0; i<input.length-1; i++) {
            if((input[i]&1)!=0 && input[i+1&1]==0) {
                int temp = 0;
                input[i+1] = temp;
                input[i+1] = input[i];
                input[i] = temp;
            }
        }
        return input;
    }
}
