package com.bumblebee.week2problems;

/*
Question : 1) A dieter consumes calories[i] calories on the i-th day. For every consecutive sequence of k days, they
            look at T, the total calories consumed during that sequence of k days:

    If T < lower, they performed poorly on their diet and lose 1 point;
    If T > upper, they performed well on their diet and gain 1 point;
    Otherwise, they performed normally and there is no change in points.
    Return the total number of points the dieter has after all calories.length days.

    Note that: The total points could be negative.

    Example 1:
    Input: calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3
    Output: 0
    Explaination: calories[0], calories[1] < lower and calories[3], calories[4] > upper, total points = 0.

    Example 2:
    Input: calories = [3,2], k = 2, lower = 0, upper = 1
    Output: 1
    Explaination: calories[0] + calories[1] > upper, total points = 1.

    Example 3:
    Input: calories = [6,5,0,0], k = 2, lower = 1, upper = 5
    Output: 0
    Explaination: calories[0] + calories[1] > upper, calories[2] + calories[3] < lower, total points = 0.

    1) Did I understand the problem? Yes
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be a integer array calorie, target k, lower
        and upper
        *    What is the expected output? --> num1 array with merged elements from nums2
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
                1. Algorithm
                2. Time complexity
                3. Space complexity

        *    Do I have all information to go to next step!! -> yes

    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output: [1,2,2,3,5,6]
        -----> Negative Cases -
        -----> Edge Cases -

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
        *   using 2 pointer

    6) If I know the alternate soltions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best

    7) Psuedocode
     */

import org.junit.Assert;
import org.junit.Test;

public class CaloriesIntake {
    @Test
    public void test1() {
        int[] input = {1,2,3,4,5};
        int sequenceDays = 1;
        int lower = 3, upper = 3;
        //Assert.assertEquals(0, calculatePointsForCalories(input, sequenceDays, lower, upper));
    }

    @Test
    public void test2() {
        int[] input = {3,2};
        int sequenceDays = 2;
        int lower = 0, upper = 1;
        //Assert.assertEquals(1, calculatePointsForCalories(input, sequenceDays, lower, upper));
    }

    @Test
    public void test3() {
        int[] input = {6,0,5,0};
        int sequenceDays = 2;
        int lower = 1, upper = 5;
        //Assert.assertEquals(1, calculatePointsForCalories(input, sequenceDays, lower, upper));
    }

    private int calculatePointsForCalories(int[] input, int sequenceDays, int lower, int upper) {
        int point = 0;
        int windowSum = 0;

        for(int i=0; i<sequenceDays; i++){
            windowSum += input[i];
        }
        if(windowSum<lower) point--;
        else if(windowSum>upper) point++;

        for(int i=sequenceDays; i<=input.length-sequenceDays; i++) {
            if(input[i]==0) windowSum = input[i+sequenceDays-1] - input[i-1];
            else windowSum += input[i+sequenceDays-1] - input[i-1];
            if(windowSum<lower) point--;
            else if(windowSum>upper) point++;
        }

        return point;
    }

    /*private int calculatePoints(int totalSum, int lower, int upper) {
        int point = 0;

        return point;
    }

    private int calculatePointsForCalories(int[] input, int sequenceDays, int lower, int upper) {
        int point = 0;
        int windowSum = 0;

        for(int i=0; i<sequenceDays; i++){
            windowSum += input[i];
        }
        if(windowSum<lower) point--;
        else if(windowSum>upper) point++;

        for(int i=sequenceDays; i<=input.length-sequenceDays; i++) {
            if(input[i]==0) windowSum = input[i+sequenceDays-1] - input[i-1];
            else windowSum += input[i+sequenceDays-1] - input[i-1];
            if(windowSum<lower) point--;
            else if(windowSum>upper) point++;
        }

        return point;
    }

    private int calculatePoints(int totalSum, int lower, int upper) {
        int point = 0;

        return point;
    }*/
}
