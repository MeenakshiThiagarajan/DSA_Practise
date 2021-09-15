package com.bumblebee.week8.slidingWindow;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubstringsSizeThreeDistinctCharacters_1876 {
    @Test
    public void test1(){
        String s = "aababcabc";
        countGoodSubstrings(s);
    }

    public int countGoodSubstrings(String s) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            if(map.size()==3) {
                count++;
            }
            if(map.size()>3){
                if(map.get(s.length()-i)>1){
                    map.put(s.charAt(s.length()-i-3-1), map.get(s.charAt(s.length()-i))-1);
                }
                else map.remove(s.charAt(s.length()-i));
            }
        }
        return count;
    }
}
