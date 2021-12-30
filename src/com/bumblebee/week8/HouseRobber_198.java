package com.bumblebee.week8;

import junit.framework.Assert;
import org.junit.Test;

public class HouseRobber_198 {
    @Test
    public void test1() {
        int[] A = {2,7,9,3,1};
        Assert.assertEquals(12, rob(A));
    }

    @Test
    public void test2() {
        int[] A = {2,1,1,2};
        Assert.assertEquals(4, rob(A));
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
