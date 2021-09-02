package com.bumblebee.week2problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.*;

public class IsomorphicStrings {

    @Test
    public void test1() {
        String str1 = "foo";
        String str2 = "bar";
        System.out.println(isIsomorphicStrings(str1, str2));
        Assert.assertTrue(isIsomorphicStrings(str1, str2));
    }

    @Test
    public void test2() {
        String str1 = "egg";
        String str2 = "add";
        System.out.println(isIsomorphicStrings(str1, str2));
        Assert.assertFalse(isIsomorphicStrings(str1, str2));
    }


    private boolean isIsomorphicStrings(String str1, String str2) {

        if(str1.length()!=str2.length()) return false;
        Map<Character, Set<Character>> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0;  i<str1.length(); i++) {
           char ch = str1.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, new HashSet<>());
                map.get(ch).add(str2.charAt(i));
            }
            else {
                if(map.get(ch).add(str2.charAt(i))) return false;
            }
        }

        for(Map.Entry<Character, Set<Character>> entry : map.entrySet()) {
            if(!set.add(entry.getValue().iterator().next())) return false;
        }


        return true;
    }



}
