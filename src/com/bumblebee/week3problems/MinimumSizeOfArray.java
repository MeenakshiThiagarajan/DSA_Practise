package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeOfArray {
    @Test
    public void test1() {
        int[] input = {2,3,1,2,2,2,3};
        int target = 5;
        System.out.println(returnMinimumSizeOfArray(input, target));
        //Assert.assertEquals(8, returnHighestSum(input));
    }

    private int returnMinimumSizeOfArray(int[] input, int target) {
        int sum = 0;
        int length =0;
        for(int i=0; i<input.length; i++) {
            sum = input[i];
            if(sum==target) return 1;
            for(int j=i+1; j<input.length;i++) {
                sum += input[j];
                if(sum==target) length = Math.min(length,j+1);
                if(sum>target) break;

            }
        }
        return length;
    }
}
