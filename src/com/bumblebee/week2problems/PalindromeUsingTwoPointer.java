package com.bumblebee.week2problems;

/*
Question : Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
           Example 1:
           Input: s = "A man, a plan, a canal: Panama"
           Output: true

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
                Using 2 pointer technique
        *    Do I have all information to go to next step!! -> yes

    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - Input: s = "A man, a plan, a canal: Panama" Output: true
        -----> Negative Cases - Input: s = "race a car" Output: false
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
        *   using 2 pointer
        *   Other optimised solutions

    6) If I know the alternate soltions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best

    7) Psuedocode for Opposite directional Two pointer method
        * Get the input String
        * Convert the string to lowercase
        * Replace other than alphanumeric using [^a-zA-Z0-9]
        * Initialize left = 0 and right = str.length-1;
        * Initialize flag = false
        * Traverse the string using while until left < right
        * Check str.charAt[left] == str.charAt[right],
            if true, then
            left++
            right--
            flag = true;
           else return false
        */

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class PalindromeUsingTwoPointer {

    @Test
    public void test1() {
        String str = "A man, a plan, a canal: Panama";
        Assert.assertEquals(true, findPalindrome(str));

    }

    @Test
    public void test2() {
        String str = "race a car";
        Assert.assertEquals(false, findPalindrome(str));

    }

    @Test
    public void test3() {
        String str = "rr";
        Assert.assertEquals(true, findPalindrome(str));

    }

    @Test
    public void test4() {
        String str = "r";
        Assert.assertEquals(true, findPalindrome(str));

    }

    @Test
    public void test5() {
        String str = "";
        Assert.assertEquals(false, findPalindrome(str));

    }

    @Test
    public void test6() {
        String str = "$$$$$";
        Assert.assertEquals(false, findPalindrome(str));

    }

    /*
    * Time complexity -> O(n/2) + O(n) -> O(n)
    * Space complexity -> O(n)
    *
    * */

    private boolean findPalindrome(String str) {
        int left =0;
        boolean flag = false;
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int right = str.length()-1;
        while(left<=right){
            if(str.charAt(left++)==str.charAt(right--)) {
                flag = true;
            }
            else
                return false;
        }
        return flag;
    }
}
