package com.bumblebee.week7.swiggy;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class ProductSort {
    @Test
    public void test1() {
        int[] input = {4,5,6,5,4,3};
        System.out.println(findProductSort(input));
        //Assert.assertTrue(findProductSort(input));
    }



    /*
    * Initialize the Tree map
    * Put the array values in the map
    * Get the map values in the in the array
    * Time - 10 mins
    *
    * */
    // 55 mins
    private int[] findProductSort(int[] input) {
        Map<Integer, Integer> sortMap = new TreeMap<>();
        List<Integer> items = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            sortMap.put(input[i], sortMap.getOrDefault(input[i],0)+1);
        }
       // sortMap.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue()).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
        while(sortMap.size()>0) {
            int min = Collections.min(sortMap.values());
            Integer key = sortMap.entrySet().stream().filter(x -> x.getValue().equals(min)).findFirst().get().getKey();
            for(int i=0; i<min;i++){
                items.add((key));
            }
            sortMap.remove(sortMap.entrySet().stream().filter(x -> x.getValue().equals(min)).findFirst().get().getKey());
        }
        System.out.println(items);
        return input;
    }
}
