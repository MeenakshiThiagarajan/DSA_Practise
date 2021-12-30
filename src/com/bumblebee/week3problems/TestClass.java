package com.bumblebee.week3problems;

/*
* Given an integer array of values and a target k, find the closest product of two distinct
* numbers that matches the target
* */


/*
*
* /*
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

    7) Psuedocode
	*
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestClass {
    @Test
    public void test1() {
        String s1 = "ab#cde#f";
        String s2 = "bacd";
        //System.out.println(permutationsInString(s1, s2));
        //Assert.assertTrue(permutationsInStringUsingMap(s1, s2));
        //Assert.assertTrue(permutationsInString(s1, s2));
        returnReverse(s1);
    }

    private String returnReverse(String s){
        int left = 0, right = s.length()-1;
        char[] chars = s.toCharArray();
        while(left<right){
            if(chars[left]=='#') left++;
            if(chars[right]=='#') right--;
            if(chars[left]!='#' && chars[right]!='#') {
                char temp = chars[right];
                chars[right--] = chars[left];
                chars[left++] = temp;
            }
        }
        System.out.println(Arrays.toString(chars));
        return Arrays.toString(chars);
    }
}
