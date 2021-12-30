package com.bumblebee.marathon;

import org.junit.Test;

import java.util.Arrays;

public class ArrangeSqauaresInAscending {

    @Test
    public void test1() {
        int[] input = {-10000, -9999, -7, -5, 0, 0, 10000};
        System.out.println(Arrays.toString(sortSquares(input)));
        //Assert.assertEquals(0, returnProductOfAllNums(input));
    }

    private int[] sortSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] result = new int[nums.length];

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                //result[right] = input[right] * input[right];
                right--;
            }
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                if (Math.abs(nums[right - 1]) < Math.abs(nums[right]))
                    //result[right] = input[right] * input[right];
                    right--;
                else {
                    int temp = nums[right];
                    nums[right] = nums[right - 1];
                    nums[right - 1] = temp;
                    //result[right] = input[right] * input[right];
                    right--;
                }
            }
            if (Math.abs(nums[left]) == Math.abs(nums[right]) || left == right) {
                //result[right] = input[right]*input[right];
                if (Math.abs(nums[right - 1]) < Math.abs(nums[right])) {
                    //result[right] = input[right] * input[right];
                    right--;
                } else {
                    left++;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        return nums;
    }
}



