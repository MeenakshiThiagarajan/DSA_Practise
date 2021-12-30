package com.bumblebee.week8;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SubArrayDivisibleByK_974 {
    @Test
    public void test1(){
        int [] nums = {4,5,0,-2,-3,1};
        int k = 5;
        Assert.assertEquals(7, subarraysDivByK(nums,k));
    }
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int num = sum%k;
            if(num<0) num += k;
            if(map.containsKey(num)) count += map.get(num);
            map.put(num, map.getOrDefault(num,0)+1);
        }
        return count;
    }
}

