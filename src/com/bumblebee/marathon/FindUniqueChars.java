package com.bumblebee.marathon;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class FindUniqueChars {

    @Test
    public void test1() {
        String s = "Testleaf";
        s=s.toLowerCase();
        uniqueChars(s);
        //Assert.assertEquals(0, calculatePointsForCalories(input, sequenceDays, lower, upper));
    }

    private void uniqueChars(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        char[] uniqueLetters = new char[set.size()];

        for (Character letter : set) {
            System.out.println(letter);
        }
    }
}



