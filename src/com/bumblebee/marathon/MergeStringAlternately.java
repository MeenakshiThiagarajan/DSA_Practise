package com.bumblebee.marathon;

/* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d
*
* Input -> Two strings
* Expected Output -> Merged string with letters alternately from two strings
* Constraints :
*
*
*
*
* */

import org.junit.Assert;
import org.junit.Test;

public class MergeStringAlternately {

    @Test
    public void test1() {
        int input = 15;
        /*int sequenceDays = 1;
        int lower = 3, upper = 3;*/
        print(input);
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            int left = 0, right = chars.length;
            while(left<right) {
                char temp;
                temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
            result += " "+chars[i];
        }
        return result;
    }


    public void print(int num) {

        for (int i = 1;i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }

        }
    }