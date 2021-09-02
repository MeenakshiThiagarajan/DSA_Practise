package com.bumblebee.week2problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortingUsingEqiPointer {

    @Test
    public void test1() {
        int[] input = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(Arrays.toString(sortingInSameDirection(input)));
        //Assert.assertArrayEquals(new int[] {1,1,1,2,2,3,3,3,4,4}, sortingInSameDirection(input));
    }

    private int[] sortingInSameDirection(int[] input) {
        int left = 0, right = 0;
        while(right<input.length) {
            if(left==right) right++;
            if(right<left) {
                int temp = input[right];
                input[right++] = input[left];
                input[left] = temp;
            }
            if(left<right) left++;
        }
        return input;
    }
}
