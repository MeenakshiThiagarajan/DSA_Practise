package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSum {

    @Test
    public void test1() {
        int[] input = {1,-5,2,-3,7,1};
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(-6, returnMinimum(input));
    }

    @Test
    public void test2() {
        int[] input = {1,5,2,3,7,1};
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(1, returnMinimum(input));
    }

    @Test
    public void test3() {
        int[] input = {-1,2};
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(-1, returnMinimum(input));
    }

    private int returnMinimum(int[] input) {
        int windowSum = input[0], minSum = input[0];
        if(input.length==1) return input[0];
        if(input.length<1) throw new RuntimeException("new ");
        for(int i=1; i<input.length; i++) {
            windowSum = Math.min(windowSum+input[i],input[i]);
            minSum = Math.min(windowSum,minSum);
        }
        return minSum;
    }

}
