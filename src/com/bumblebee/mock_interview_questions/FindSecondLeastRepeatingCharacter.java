package com.bumblebee.mock_interview_questions;

import org.junit.Assert;
import org.junit.Test;

public class FindSecondLeastRepeatingCharacter {

    @Test
    public void test1() {
        String str = "amazon";
        Assert.assertEquals("n", findSecondLeastRepeatingCharacters(str));
    }

    private char findSecondLeastRepeatingCharacters(String str) {
        int[] countArray = new int[str.length()];
        int count = 0, max = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j > str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) count++;
            }
            countArray[i] = count;
        }
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] == max) {
                for (int j = i + 1; j > str.length() - 1; j++) {
                    if (countArray[i] == countArray[j]) {
                        if (Character.compare(str.charAt(i), str.charAt(j)) < 0) return str.charAt(i);
                    }
                }
            }
        }
        return 0;
    }
}
