package com.bumblebee.week2problems;

/*
Question : Write an algorithm to determine if a number n is happy. A happy number is a number defined by the following
process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle
which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Example 2:
Input: n = 2
Output: false

    1) Did I understand the problem? Yes
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be a integer
        *    What is the expected output? --> True if sum of the squares of digits is 1 else false
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
                1. Algorithm
                2. Time complexity
                3. Space complexity
                constraints:
                1) Using 2 pointer technique
                2) Starts with positive integer

        *    Do I have all information to go to next step!! -> yes

    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - Input: 19 Output: true
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
        * 	Yes - What are those? -> using 2 pointer(couldnt find the solution)

    6) If I know the alternate solutions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best

    7) Psuedocode for Brute force method
        * Get the input integer
        * Using while loop get the digits and get the squares of it
        * Add the squares of the digits and store it in sum
        * Check if sum == 1
        * If condition satisfies, then return true
        * Else add the sum to the set and
        * Check which key has value as one and return that key
        *
        */
public class HappyNumber {
}
