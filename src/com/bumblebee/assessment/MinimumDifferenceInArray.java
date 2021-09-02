package com.bumblebee.assessment;
/*
Given an array of n integers, rearrange them so that, sum of absolute difference of all element is minimised
and then compute sum of those differences.

Use Case: n = 5, arr = [5,1,3,7,3]

O/P : 6



*/

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class MinimumDifferenceInArray {
    @Test
    public void test1() {
        int[] input = {5,4,3,7,3};
        System.out.println(minimumDifference(input));
        Assert.assertEquals(4, minimumDifference(input));
    }

    private int minimumDifference(int[] input) {
       // Arrays.sort(input);
        int left =0, right =0;
        while(left<=right && right<input.length) {
             if(left==right && right!=input.length-1) right++;
            else if(input[left]>input[right]) {
                int temp = input[right];
                input[right] = input[left];
                input[left++] = temp;
            }
            else if(input[left]<input[right] && right!=input.length-1) right++;
            else break;

        }
        System.out.println(Arrays.toString(input));
        int minSum = 0;
        for (int i = 0; i < input.length-1; i++) {
            minSum += Math.abs((input[i]-input[i+1]));
        }
        return minSum;
    }


}
