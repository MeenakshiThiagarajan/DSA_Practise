package com.bumblebee.week1assignment;

/*

Question : Given an array of integers arr,
           write a function that returns true if and only if the number of
           occurrences of each value in the array is unique.

    1) Did I understand the problem? Yes or No !!
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be a integer array
        *    What is the expected output? --> true if the number of occurence of elements are unique else false
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
        -----> Positive Cases - {1,2,2,3,3,3} -> true
        -----> Negative Cases - {1,1,2,,3,2} -> false
        -----> Edge Cases -

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
        *   -> Brute Force (Standard) --> using hashmap and set
        *   Other optimised solutions --> No

    6) If I know the alternate soltions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best
    7) Psuedocode
        * Get the input integer array
        * Iterate through the elements using for loop and put in Hashmap
        * Get the values from the map stream it and convert to set
        * Compare the size of map values and set size
        * If size are equal element occurences are unique and so return true
        * Else return false
        *
        */

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueElement {

    @Test
    public void test1() {
        int input[] = {1,2,2,3,3,3};
        Assert.assertTrue(checkUniqueElementUsingHashMap(input));
    }

    @Test
    public void test2() {
        int input[] = {1,2,2,3,3,4};
        Assert.assertFalse(checkUniqueElementUsingHashMap(input));
    }

    /*
    * Time complexity - O(n)
    * Space complexity - O(1)
    *
    * */

    private boolean checkUniqueElementUsingHashMap(int input[]) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<input.length; i++) {
        if(map.containsKey(input[i])) {
            map.put(input[i], map.get(input[i])+1);
        }
        else {
            map.put(input[i], 1);
        }
    }
        if((map.values().size()) == (map.values().stream().collect(Collectors.toSet()).size()))
            return true;
        else
            return false;
        }
    }
