package com.bumblebee.week2assignment;

import org.junit.Assert;
import org.junit.Test;

/*
Question : Given a string s and a character c that occurs in s,
           return an array of integers answer where answer.length == s.length and answer[i] is the distance
           from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
Example 1:

Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]

    1) Did I understand the problem? Yes
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be a String s and character c
        *    What is the expected output? --> Integer array that has the shortest distance of character c
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
                1. Algorithm
                2. Time complexity
                3. Space complexity
                constraints:
                1 <= s.length <= 104
                s[i] and c are lowercase English letters.
                It is guaranteed that c occurs at least once in s.

        *    Do I have all information to go to next step!! -> yes

    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - Input: s = "loveleetcode", c = "e"  Output: [3,2,1,0,1,0,0,1,2,2,1,0]
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
        *   Sliding window

    6) If I know the alternate soltions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best

    7) Psuedocode

    */
public class ShortestDistanceToACharacter {

    @Test
    public void test1() {
        String str = "loveleetcode";
        char ch = 'e';
        Assert.assertArrayEquals(new int[] {3,2,1,0,1,0,0,1,2,2,1,0}, findShortestDistanceToCharacterUsingBruteForce(str, ch));

    }

    /* Psuedocode for Brute force
        * Get the input String str and character ch
        * Initialize distance as length of the string
        * Traverse from left to right using for loop from oth index
        * Check if character at index i equals character ch
            if matches make distance as 0 and store it in result array at index i
            If not matches increment distance and store it in result array at index i
        * Traverse from right to left using for loop from length-1th index
        * Check if character at index i equals character ch
            if matches make distance as 0 and and check for min value using Math.min store it in result array at index i
            If not matches increment distance and check for min value using Math.min store it in result array at index i
        * return result array
      */

    /*
    * Time complexity -> O(2n)
    * Space Complexity -> O(n);
    * */
    private int[] findShortestDistanceToCharacterUsingBruteForce(String str, char ch) {
        int[] result = new int[str.length()];
        int distance = str.length();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==ch) distance = 0;
            result[i] = distance++;
        }
        distance = str.length();
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i)==ch) distance = 0;
            result[i] = Math.min(result[i], distance++);
        }
        return result;
    }

    /* Psuedocode for Equi directional Two pointer method
        * Get the input String str and character ch
        * Traverse from left to right using while until left and right index reaches the end of the string
        * If left index equals right index and character not equals to ch then increment right and when
        * character at right equals ch stop and start filling
        * matches make distance as 0 and store it in result array at index i
            If not matches increment distance and store it in result array at index i
        * Traverse from right to left using for loop from length-1th index
        * Check if character at index i equals character ch
            if matches make distance as 0 and and check for min value using Math.min store it in result array at index i
            If not matches increment distance and check for min value using Math.min store it in result array at index i
        * return result array
      */

    /*
     * Time complexity -> O(2n)
     * Space Complexity -> O(n);
     * */
    private int[] findShortestDistanceToCharacterUsingSlidingWindow(String str, char ch) {
        int[] result = new int[str.length()];
        int left = 0, right = 0;

        while(left<str.length() && right<str.length()) {

            if(str.charAt(left)==str.charAt(left))  return result;





        }

        for(int i=str.length()-1; i>=0; i--) {
            /*if(str.charAt(i)==ch) distance = 0;
            result[i] = Math.min(result[i], distance++);*/
        }
        return result;
    }
}
