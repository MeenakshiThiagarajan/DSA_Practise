package com.bumblebee.week3problems;




/*
* Declare array of lemngth 128
* Both left and right pointer at zero
* If charcter is unique increment to one, move right to next
* When the char[input.charAt[right] > 1
*  move left
* char[input.charAt[left]--
* if(char[input.charAt[right]>1)
* max = right -left
*
*
*
*
*
* */


import org.junit.Test;

import java.util.Arrays;

public class LongestSubStrinWithoutDuplicates {

    @Test
    public void test1() {
        String s = "abcd";
       // int[] input = {2,2,2,2,2,2};
        System.out.println(returnLongestSubString(s));
        //Assert.assertEquals(0, returnProductOfAllNums(input));
    }

    @Test
    public void test2() {
        String s = "abbccd";
        // int[] input = {2,2,2,2,2,2};
        System.out.println(returnLongestSubString(s));
        //Assert.assertEquals(0, returnProductOfAllNums(input));
    }

    private int returnLongestSubString(String s) {
        int[] charCount = new int[128];
        int left = 0, right = 0, longMax = 0, max = 0;
        for (right = 0; right < s.length(); right++) {
            charCount[s.charAt(right)]++;
            while (charCount[s.charAt(right)] > 1)
                charCount[s.charAt(left++)]--;
            max = Math.max(max, right - left + 1);
        }
        return max;
    }


    }



