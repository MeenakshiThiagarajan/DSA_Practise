package com.bumblebee.week2problems;

/*
Question : 1) Given a non-empty array of integers nums, every element appears twice except for one.
           Find that single one. You must implement a solution with a linear runtime complexity
           and use only constant extra space.

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
        */


import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

public class FindNumWithSingleOccurenceInArray {

    @Test
    public void test1() {
        int[] input = {1,1,1,3,3,4,3,2,4,2};
        Assert.assertTrue(containsDuplicateUsingSet(input));
    }

    @Test(expected = RuntimeException.class)
    public void test2() {
        int[] input = {1, 1, 2, 2, 4};
        //Assert.assertEquals("No element with single occurence", findSingleOccurenceElemenUsingMap(input));
    }

    /*
     * Time Complexity -> O(2n)
     * Space complexity -> O((n)
     * */
    /*private int findSingleOccurenceElemenUsingMap(int[] input) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < input.length; i++) {
            map.put(input[i], map.getOrDefault(input[i], 0) + 1);
        }


        map.values().stream().filter(x -> x.equals(1)).findFirst();
        if (key != 0) return key;
        else throw new RuntimeException("No element with single occurence");

    }*/

    /*private int findSingleOccurenceElementUsingTwoPointer(int[] nums) {

        /*if (input == null || input.length == 0) {
            return 0;
        }*/

       /* // assuming that we have left is an index of the other array
        int left = 1, right = nums.length;
        while(left<right) {
            if(nums[left] == nums[left-1]) return false;
        }

        input[left++] = input[input.length - 1];
        return left;
    }*/

        public boolean containsDuplicateUsingSet ( int[] nums){
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i])) return true;
            }
            return false;

        }
    }


