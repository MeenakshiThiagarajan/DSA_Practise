package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PermutationsInString {

    @Test
    public void test3() {
        String s1 = "ab";
        String s2 = "bacd";
        //System.out.println(permutationsInString(s1, s2));
        //Assert.assertTrue(permutationsInStringUsingMap(s1, s2));
        Assert.assertTrue(permutationsInString(s1, s2));
    }

    private boolean permutationsInString(String s1, String s2) {
        char[] perms = s1.toCharArray();
        Arrays.sort(perms);
        for(int i=0; i<s2.length()-s1.length(); i++) {
            char[] searchChars = s2.substring(i, s1.length()+i).toCharArray();
            Arrays.sort(searchChars);
            if(Arrays.equals(searchChars, perms)) return true;
        }
        return false;
    }

    private boolean permutationsInStringUsingMap(String s1, String s2) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
        }
        int i =0;
        boolean flag = false;
        while(i<s2.length()) {
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0)+1);
            if(map2.size()>s1.length()) {
                map2.remove(s2.charAt(s1.length() - 1));
            }
             flag =  map1.equals(map2);
            if(!flag) i++;
            else return flag;
        }
        return false;
    }
}


