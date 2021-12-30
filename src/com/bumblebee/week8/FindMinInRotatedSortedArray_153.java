package com.bumblebee.week8;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FindMinInRotatedSortedArray_153 {

    @Test
    public void test7() {
        String s = "paytmmoney";
        count(s);
    }

    @Test
    public void test2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        findMin(nums);
    }


    public int findMin(int[] nums) {
        // Use Binary search
        // Calculate low, high, mid
        // if mid is gretaer than high then smallest number lies within that range so make
        // low = Mid+1
        // else make high = Mid-1
        // Calculate the min by Math.min of min and mid

        int low = 0, high = nums.length - 1, mid = 0, min = Integer.MAX_VALUE;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.min(nums[0], nums[1]);
        mid = (low + high) / 2;
        if (nums[mid] > nums[high]) low = mid + 1;
        min = Math.min(min, nums[mid]);
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] < nums[high]) high = mid - 1;
            else low = mid + 1;

            min = Math.min(min, nums[mid]);
        }
        return min;

    }


    private int add(String s) {
        int sum = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                sum = sum + Integer.parseInt(String.valueOf(ch[i]));
            }

        }
        return sum;

    }

    @Test
    public void test1() {
        String s = "paytmmoney";
        count(s);
    }
    private void count(String s1) {
       String s = "paytmmoney";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);

        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue()>1) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }


    }


}


