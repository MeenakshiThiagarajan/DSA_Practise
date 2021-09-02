package com.bumblebee.week3problems;

    /* Write a program to return the shortest substring having all the unique characters of the string
       Input: "abbcafcb" Output: "bcaf"
    * Input - String -> "abbcafcb"
    * Output - shortest substring with all unique characters from string
    * Data set - String -> "abbcafcb" utput: "bcaf"
    *            String ->  "
    * */

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FindShortestSubstringWithUniqueCharacters {
    @Test
    public void test1() {
        String s = "abbcafcb";
        // int[] input = {2,2,2,2,2,2};
        System.out.println(findShortestSubstring(s));
        Assert.assertEquals("bcaf", findShortestSubstring(s));
    }

    private String findShortestSubstring(String str) {
        Set<Character> targetSet = new TreeSet<>();
        for(int i=0; i<str.length()-1; i++) {
            targetSet.add(str.charAt(i));
        }
        int target = targetSet.size();
        List<Character> subStringSet = new ArrayList<>();
        for(int i=0; i<target; i++) {
            subStringSet.add(str.charAt(i));
        }
        if(subStringSet.equals(targetSet)) return subStringSet.stream().toString();

        for(int i=1; i<=str.length()-target; i++) {
            subStringSet.remove(i-1);
            subStringSet.add(str.charAt(i+target-1));// Deleting previous window element at the index(i-1)
            if(subStringSet.containsAll(targetSet)) return subStringSet.stream().toString();
        }
        return "no";
    }
}
