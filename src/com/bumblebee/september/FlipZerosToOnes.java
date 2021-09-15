package com.bumblebee.september;

import org.junit.Assert;
import org.junit.Test;

/*
* Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can
flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6

Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
*/
public class FlipZerosToOnes {
    @Test
    public void test1(){
        int[] input = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        Assert.assertEquals(6, maxOccurenceOfOne(input, k));
    }

    @Test
    public void test2(){
        int[] input = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        Assert.assertEquals(10, maxOccurenceOfOne(input, k));
    }

    @Test
    public void test3(){
        int[] input = {0,0,0,1,};
        int k = 4;
        Assert.assertEquals(4, maxOccurenceOfOne(input, k));
    }

    private int maxOccurenceOfOne(int[] input, int k) {
        int maxOccurence = 0;
        for(int i=0; i<input.length; i++){
            int temp = k;
            boolean flag = true;
            for(int j=i; j<input.length; j++){
                if(input[j]==0){
                    temp--;

                    if(temp==-1){
                        maxOccurence = Math.max(maxOccurence,j-i-1);
                        flag = false;
                        break;
                    }
                }
            }
            if(flag)
                maxOccurence = Math.max(maxOccurence,input.length-i-1);
        }
        return maxOccurence;
    }
}
