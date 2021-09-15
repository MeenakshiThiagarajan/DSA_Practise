package com.bumblebee.september;
/*
* Longest Substring without repeating character


Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0
*
* */


import org.junit.Assert;
import org.junit.Test;

/*
*
* */
public class FIndLongestSubStringWithoutRepeatingChar {
    @Test
    public void test1() {
        String s = "abbccd";
        Assert.assertEquals(2, returnLongestSubString(s));
    }

    @Test
    public void test2() {
        String s = "bbbbb";
        Assert.assertEquals(1, returnLongestSubString(s));
    }

    @Test
    public void test3() {
        String s = "pwwkew";
        Assert.assertEquals(3, returnLongestSubString(s));
    }

    private int returnLongestSubString(String s) {
        int[] charCount = new int[128];
        int left = 0, right, max = 0;
        for(right=0; right<s.length(); right++){
            charCount[s.charAt(right)]++;
            while(charCount[s.charAt(right)]>1){
                charCount[s.charAt(left++)]--;
                max = Math.max(max,right-left+1);
            }
        }
        return max;
    }
}
