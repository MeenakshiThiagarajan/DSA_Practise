package com.bumblebee.assessment;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GroupingItemsByNames {

    @Test
    public void test5() {
        List<String> transactions = new ArrayList<>();
        transactions.add("bin");
        transactions.add("bin");
        transactions.add("bin");
        transactions.add("can");
        groupByNames(transactions);
       // Assert.assertEquals(false, findPalindrome(str));

    }

    @Test
    public void test2() {
        List<String> transactions = new ArrayList<>();
        transactions.add("bin");
        transactions.add("bin");
        transactions.add("bin");
        transactions.add("can");
        transactions.add("Orange");
        transactions.add("Orange");
        transactions.add("Apple");
        transactions.add("Apple");
        transactions.add("Apple");
        groupByNames(transactions);
        // Assert.assertEquals(false, findPalindrome(str));

    }



    private List<String> groupByNames(List<String> transactions) {
    List<String> itemList = new ArrayList<String>();
    Map<String,Integer> items = new TreeMap<String,Integer>();
        for(int i = 0;i<transactions.size();i++) {
            items.put(transactions.get(i), items.getOrDefault(transactions.get(i), 0) + 1);
        }
        //items.entrySet().stream().sorted(Map.Entry<Integer)
        while(items.size()>0) {
            int max = Collections.max(items.values());
            itemList.add(items.entrySet().stream().filter(x->x.getValue().equals(max)).findFirst().get().getKey() + " " + max);
            items.remove(items.entrySet().stream().filter(x->x.getValue().equals(max)).findFirst().get().getKey());
            }
        return itemList;
    }

}
