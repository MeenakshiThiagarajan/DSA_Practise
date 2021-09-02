package com.bumblebee.mock_interview_questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindSubArrayWithTarget {
    @Test
    public void test1() {
        int input[] = {1,2,3,2,4,2,2};
        int k = 3;
        System.out.println((Arrays.toString(findMinSumSubArray(input,k))));
        //Assert.assertEquals(findMinSumSubArray(input, k), 2);

    }

    private int[] findMinSumSubArray(int[] input, int k) {
        int minSum = Integer.MIN_VALUE, windowSum = 0, startIndex = 0;
        for (int i = 0; i < k; i++) {
            windowSum +=input[i];
        }
        minSum = windowSum;
        for (int i = 1; i <= input.length-k; i++) {
            windowSum += input[i+k-1] - input[i-1];
            if(minSum>windowSum) {
                minSum = windowSum;
                startIndex = i;
            }
        }
        return Arrays.copyOfRange(input,startIndex,k);
    }
}
