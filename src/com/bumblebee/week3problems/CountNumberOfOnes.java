package com.bumblebee.week3problems;

/*
* Given soerted array of 0's and 1's. Count number of 1's in the array
*
* input = int[] nums = [0,0,0,1,1,1,1] output = 4
*
*
*
* */


import org.junit.Assert;
import org.junit.Test;

public class CountNumberOfOnes {

    @Test
    public void test1() {
        int[] input = {0,0,0,1,1,1,1};
        //Assert.assertEquals(4, findNumOfOne(input));
        Assert.assertEquals(4, findNumOfOneUsingTwoPointer(input));
    }

    @Test
    public void test2() {
        int[] input = {0,0,0,0,0,0,0};
        //Assert.assertEquals(0, findNumOfOne(input));
       // Assert.assertEquals(0, findNumOfOneUsingTwoPointer(input));
        Assert.assertEquals(0, findNumOfOneUsingBS(input));

    }

    @Test
    public void test3() {
        int[] input = {1,1,1,1,1,1};
        //Assert.assertEquals(6, findNumOfOne(input));
        //Assert.assertEquals(6, findNumOfOneUsingTwoPointer(input));
        Assert.assertEquals(0, findNumOfOneUsingBS(input));
    }

    private int findNumOfOne(int[] input) {
        for(int i =0; i<input.length; i++) {
            if(input[i]==1) return input.length - i;
        }
        return 0;
    }

    private int findNumOfOneUsingTwoPointer(int[] input) {
        int left = 0, right = input.length-1;
        while(left <= right) {
            if(input[left]==1) return input.length-left;
            if(input[right]==0) return input.length-right-1;
           left++;
            right--;
        }
        return 0;
    }

    private int findNumOfOneUsingBS(int[] input) {
        int low = 0, high = input.length-1, mid;
        while(low <= high) {
            mid = (low+high)/2;
            if(input[mid]==1 && input[mid-1]==0) return input.length-mid;
            if(input[mid-1]==1) high = mid-1;
            if(input[mid]==1 || input[mid]==0) low = mid+1;
        }
        return 0;
    }
}
