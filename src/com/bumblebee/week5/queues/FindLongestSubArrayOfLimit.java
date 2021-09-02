package com.bumblebee.week5.queues;

import org.junit.Test;

import java.util.ArrayDeque;

public class FindLongestSubArrayOfLimit {

    @Test
    public void test1() {
        int[] input = {8,2,4,7};
        int k = 4;
        System.out.println(findLongestSubArray(input,k));
        //Assert.assertEquals(new  reverseKElements(input));
    }

    private int findLongestSubArray(int[] input, int k) {
        int left = 0, right = 0;
        int longest  = Integer.MIN_VALUE, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while(left<input.length && right<input.length) {
            min = Math.min(min, Math.min(input[left], input[right]));
            max = Math.max(max, Math.max(input[left], input[right]));
            if(Math.abs(max-min)<=k) {
                longest = Math.max(longest, right-left+1);
                right++;
            } else {
                right = ++left;
                min = input[left];
                max = input[left];
            }
        }
        return longest;
    }

    private int findAbsdifference(int[] intarr, int k) {
        int left=0 , right=0;
        ArrayDeque<Integer> minque = new ArrayDeque<Integer>();
        ArrayDeque<Integer> maxque = new ArrayDeque<Integer>();
        while (left<intarr.length && right<intarr.length) {
            if(Math.abs(intarr[right]-intarr[left]) <=k) {
                minque.offer(intarr[right]);
                right++;
            }
            if(Math.abs(intarr[right]-intarr[left]) >k) {
                if(minque.peek()==intarr[left]) {
                    maxque.offer(minque.poll());
                }
                left++;
            }
        }
        return minque.size();
    }
}


