package com.bumblebee.week8.slidingWindow;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MaxNumOfVowelsOfKLength {

    @Test
    public void test1(){
        String s = "abciiidef";
        int k = 3;
        maxVowels(s,k);
    }
    public int maxVowels(String s, int k) {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int count = 0, max = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++){
            sb.append(s.charAt(i));
            if(vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        max = Math.max(max,count);
        for(int i=1; i<=s.length()-k; i++){
            if(vowels.contains(sb.charAt(0))) count--;
            sb.deleteCharAt(0);
            if(vowels.contains(s.charAt(i+k-1))) count++;
            sb.append(s.charAt(i+k-1));
            max = Math.max(max,count);
        }
        return max;
    }
}
