package com.bumblebee.mock_interview_questions;

import org.junit.Assert;

import java.util.Arrays;

public class FindTheClosestIncreasingTemperature {
    public void test1() {
        int[] input = {32,33,34,31,28,36,37};
        //System.out.println(returnMinimum(input));
        //Assert.assertTrue(-Arrays.equals(new int[] {1}), returnClosestIncreasingTemperature(input));
    }

    private int[] returnClosestIncreasingTemperature(int[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if(i==input.length-1) result[i] = 0;
            for (int j = i+1; j < input.length; j++) {
                if(input[j] > input[i]) {
                    result[i] = j-i;
                    break;
                }
                if(j==input.length-1) result[i] = -1;
            }
        }
        return result;
    }


}
