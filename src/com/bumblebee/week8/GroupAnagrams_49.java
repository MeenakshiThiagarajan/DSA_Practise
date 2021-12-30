package com.bumblebee.week8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49 {

    @Test
    public void test1(){
        String[] strs = {"dgggggggggg", "ddddddddddg"};
        groupAnagrams(strs);
    }



    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>, List<String>> map = new HashMap<>();
        for(String str : strs) {
            Map<Character, Integer> tempMap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                tempMap.put(str.charAt(i), tempMap.getOrDefault(str.charAt(i), 0)+1);
            }
            if(map.containsKey(tempMap)){
                map.get(tempMap).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(tempMap, list);
            }
        }
        List<List<String>> anagramList = new ArrayList<>();
        for(Map<Character, Integer> key : map.keySet()){
            List<String> tempList = map.get(key);
            //Collections.sort(tempList);
            anagramList.add(tempList);
        }
        return anagramList;

    }
}
