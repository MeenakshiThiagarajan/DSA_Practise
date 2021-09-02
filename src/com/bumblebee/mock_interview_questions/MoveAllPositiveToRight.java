package com.bumblebee.mock_interview_questions;

/*
Given an array of positive and negative numbers, move positive to right

*/

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class MoveAllPositiveToRight {

    @Test
    public void test1() {
        int[] input = {-1,2,3,-2,-3,5,6};
        //Assert.assertEquals(4, findNumOfOne(input));
        Assert.assertTrue(Arrays.equals(new int[]{-1,-2,-3,2,3,5,6},movePositiveToRight(input)));
    }

    @Test
    public void test2() {
        int[] input = {1,2,3,2,3,5,6};
        //Assert.assertEquals(4, findNumOfOne(input));
        Assert.assertTrue(Arrays.equals(new int[]{1,2,3,2,3,5,6},movePositiveToRight(input)));
    }

    @Test
    public void test3() {
        int[] input = {-1,-2,-3,-2,-3,-5,-6};
        //Assert.assertEquals(4, findNumOfOne(input));
        Assert.assertTrue(Arrays.equals(new int[]{-1,-2,-3,-2,-3,-5,-6},movePositiveToRight(input)));
    }

    private int[] movePositiveToRight(int[] input) {
        int left = 0, right = 0;
        while(right<input.length) {
            if(input[right]<0){
            int temp = input[right];
            input[right] = input[left];
            input[left++] = temp;
            }
            right++;
        }
        return input;
    }
}
