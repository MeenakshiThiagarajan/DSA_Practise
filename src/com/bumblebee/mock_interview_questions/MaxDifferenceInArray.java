package com.bumblebee.mock_interview_questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MaxDifferenceInArray {

    @Test
    public void test1() {
        int[] input = {1,2,4,7,5};
        //Assert.assertEquals(4, findNumOfOne(input));
        Assert.assertEquals(6,findMaxDifference(input));
        Assert.assertTrue(Arrays.equals(new int[]{0,3},findMaxDifferenceIndex(input)));
    }

    private int findMaxDifference(int[] input) {
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        if(input[0]<input[1]) {
            min = input[0];
            max = input[1];
        }
        if(input[0]>input[1]) {
            min = input[0];
            max = input[1];
        }

        for(int i = 2; i<input.length; i++) {
            if(min>input[i]) min = input[i];
            if(max<input[i]) max = input[i];
        }
        return max-min;
    }

    private int[] findMaxDifferenceIndex(int[] input) {
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE, minIndex = 0, maxIndex = 0;
        if(input[0]<input[1]) {
            min = input[0];
            max = input[1];
        }
        if(input[0]>input[1]) {
            min = input[0];
            max = input[1];
        }

        for(int i = 2; i<input.length; i++) {
            if(min>input[i]) {
                min = input[i];
                minIndex = i;
            }
            if(max<input[i]) {
                max = input[i];
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

}
