package com.bumblebee.week7.swiggy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



//Lesson learnt  - Look for simpler solutions

public class FindUniqueCharacter {
    @Test
    public void test1() {
        String s = "statistics";
        System.out.println(findFirstUniqueCharacter(s));
        Assert.assertEquals(3,findFirstUniqueCharacter(s));
    }

    @Test
    public void test2() {
        String s = "aaaaa";
        System.out.println(findFirstUniqueCharacter(s));
        Assert.assertEquals(-1,findFirstUniqueCharacter(s));
    }



    /* 20 mins
    * Initialize a map to get the character count
    * Iterate through the string and put it in the map
    * Get the map values which is equal to 1
    * Compare the index of key whose value equal to 1 and get the min index
    * Return the char at min index
    *
    *

    *
    * Iterate through the string and check if the index and last index is same
    * if so return the index+1 as it is 1 based index
    * else return -1
    */

    //15 mins
    private int findFirstUniqueCharacter(String s) {
        /*Map<Character,Integer> map = new HashMap<Character, Integer>();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        Map<Character, Integer> result = map.entrySet().stream().filter(x -> x.getValue() == 1).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        for (Map.Entry<Character, Integer> entry: result.entrySet()) {
            min = Math.min(min,s.indexOf(entry.getKey()));
        }
        return s.charAt(min);*/
        for (int i = 1; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) return s.indexOf(s.charAt(i))+1;
        }
        return -1;
    }
}
