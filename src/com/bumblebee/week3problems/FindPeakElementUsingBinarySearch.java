package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

public class FindPeakElementUsingBinarySearch {

    @Test
    public void test1() {
        int[] input = {1,-5,2,-3,7,1};
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(-6, returnPeakElement(input));
    }

    private int returnPeakElement(int[] input) {
        int low = 0, high = input.length-1, mid;
        while(low<high) {
            mid = (low+high)/2;
            if(input[mid]>input[mid-1] && input[mid]>input[mid+1]) return mid;
            else if(input[mid]<input[mid-1]);
        }return high;
    }
}
