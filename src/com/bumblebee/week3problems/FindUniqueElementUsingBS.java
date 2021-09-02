package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

public class FindUniqueElementUsingBS {

    @Test
    public void test1() {
        int[] input = {1,1,2,2,3,4,4,5,5};
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(3, returnNonDuplicateNum(input));
    }

    @Test
    public void test2() {
        int[] input = {1,1,2,2,3,3,4,4,5};
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(5, returnNonDuplicateNum(input));
    }

    private int returnNonDuplicateNum(int[] input) {
        int low =0, high = input.length-1, mid = 0;
        while(low<=high) {
            mid = (low+high)/2;
            if(input[mid]!=input[mid-1] && input[mid]!=input[mid+1]) return input[mid];
            else if(input[mid-1]==input[mid] && (input.length-(mid-2))%2!=0) high = mid-1;
            else if(input[mid+1]==input[mid] && (input.length-(mid+2))%2!=0) low = mid+1;
        }
        return input[mid];
    }
}
