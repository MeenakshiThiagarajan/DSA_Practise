package com.bumblebee.assessment;

import java.util.List;

public class KSubArray {


    public static void kSub(int k, List<Integer> nums) {
        long count = 0;
        if (k < 1 || k > 100) throw new RuntimeException("invalid input");
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % k == 0) count++;
            long sum = nums.get(i);
            for (int j = i + 1; j < nums.size(); j++) {
                sum += nums.get(j);
                if ((sum % k == 0)) {
                    System.out.println(count);
                    count++;
                }
            }
        }
    }
}
