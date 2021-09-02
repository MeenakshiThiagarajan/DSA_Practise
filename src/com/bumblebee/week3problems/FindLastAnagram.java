package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FindLastAnagram {

    @Test
    public void test1() {
        String str = "abddcadca";
        String target = "cad";
        //System.out.println(permutationsInString(s1, s2));
        //Assert.assertTrue(permutationsInStringUsingMap(s1, s2));
        Assert.assertEquals("dca",findLastAnagram(str, target));
    }

    private String findLastAnagram(String str, String target) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        String anagram ="";
        for(int i=0;
            i<target.length(); i++) {
            map1.put(target.charAt(i), map1.getOrDefault(target.charAt(i),0)+1);
        }
        int index = 0;
        int i = 0;
        while(i<str.length()) {
            map2.put(str.charAt(i), map2.getOrDefault(str.charAt(i),0)+1);
            if(map2.size()>target.length()) {
                map2.remove(str.charAt(str.length() - 1));
                if(map1.equals(map2)) anagram = str.substring(i,target.length()-1);

            }
            i++;
        }
        if(anagram.length()==target.length()) return anagram;
       else return null;
        }

    }

