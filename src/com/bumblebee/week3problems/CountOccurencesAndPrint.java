package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesAndPrint {
    @Test
    public void test1() {
        String str = "aabbccddde";
        Assert.assertEquals("a2b2c2d3e1", findCountOfEach(str));

    }

    private String findCountOfEach(String str) {
        StringBuffer modifiedStr = new StringBuffer();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry entry : map.entrySet()) {
            modifiedStr.append(entry.getKey()).append(entry.getValue());
        }
        return modifiedStr.toString();
    }
}
