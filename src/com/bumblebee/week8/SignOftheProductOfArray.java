package com.bumblebee.week8;

import org.junit.Assert;
import org.junit.Test;

public class SignOftheProductOfArray {
    @Test
    public void test1(){
        int[] input = {-1,-2,-3,-4,3,2,1};

        Assert.assertEquals(1, arraySign(input));
    }

    @Test
    public void test2(){
        int[] input = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};

        Assert.assertEquals(-1, arraySign(input));
    }



    public int arraySign(int[] nums) {
        int product = nums[0];
        for(int i=1; i<nums.length; i++){
            product *=nums[i];
        }

        if(product>0) return 1;
        if(product==0) return 0;
        else return -1;
    }
}
