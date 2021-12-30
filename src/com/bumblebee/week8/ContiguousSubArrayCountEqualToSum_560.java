package com.bumblebee.week8;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ContiguousSubArrayCountEqualToSum_560 {
    @Test
    public void test1(){
        int [] nums = {1,2,3};
        int k = 3;
        Assert.assertEquals(2, subarraySum(nums,k));
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int num = sum-k;
            //if(num<0) num += k;
            if(map.containsKey(num)) count += map.get(num);
            map.put(sum, map.getOrDefault(sum,0)+1);

        }
        return count;
    }
}
