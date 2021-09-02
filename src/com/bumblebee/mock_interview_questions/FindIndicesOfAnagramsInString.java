package com.bumblebee.mock_interview_questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIndicesOfAnagramsInString {
    @Test
    public void test1() {
        String S1 = "abcdbac";
        String S2 = "abc";
        //System.out.println(permutationsInString(s1, s2));
        //Assert.assertTrue(permutationsInStringUsingMap(s1, s2));
        Assert.assertEquals("0,4", findLastAnagram(S1, S2));
    }

    private List<Integer> findLastAnagram(String S1, String S2) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        List<Integer> index = new ArrayList<>();
        for (int i = 0;i < S2.length(); i++) {
            map1.put(S2.charAt(i), map1.getOrDefault(S2.charAt(i), 0) + 1);
        }
        int i = 0;
        while (i < S1.length()) {
            map2.put(S1.charAt(i), map2.getOrDefault(S1.charAt(i), 0) + 1);
            if (map1.equals(map2)) index.add(map1.size()-i);
            else if (map2.size() > S2.length()) {
                map2.remove(S1.charAt(S2.length() - i));
            }
            i++;
        }
        if (index.size() != 0) return index;
        else return null;

    }
}
