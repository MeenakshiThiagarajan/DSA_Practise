package com.bumblebee.randomProblems;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/* Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

Return any possible rearrangement of s or return "" if not possible.



Example 1:

Input: s = "aab"
Output: "aba"
Example 2:

Input: s = "aaab"
Output: ""
* */

public class ReorganiseStringWithKDuplicates {
    @Test
    public void test1() {
        System.out.println(reorganizeString("aab"));
    }

    public String reorganizeString(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch: str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(map.entrySet());

        Map.Entry<Character, Integer> previousEntry = null;
        StringBuilder sb = new StringBuilder(str.length());

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();

            if (previousEntry != null && previousEntry.getValue() > 0) {
                maxHeap.offer(previousEntry);
            }

            sb.append(currentEntry.getKey());
            currentEntry.setValue(currentEntry.getValue() - 1);
            previousEntry = currentEntry;
        }

        return sb.toString().length() == str.length() ? sb.toString() : "";
    }

}


