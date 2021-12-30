package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class MinimumSum {

    @Test
    public void test1() {
        //int[] input = {1,-5,2,-3,7,1};
        int N = 512;
        int K = 10;
        solution(N,K);
        //System.out.println(returnMinimum(input));
       //Assert.assertEquals(-6, returnMinimum(input));
    }

    @Test
    public void test2() {
        int[] input = {-2,-3,-1};
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(1, returnMinimum(input));
    }

    @Test
    public void test3() {
        int[] input = {-1,2};
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(-1, returnMinimum(input));
    }

    private int returnMinimum(int[] input) {
        int windowSum = input[0], minSum = input[0];
        if(input.length==1) return input[0];
        if(input.length<1) throw new RuntimeException("new ");
        for(int i=1; i<input.length; i++) {
            windowSum = Math.min(windowSum+input[i],input[i]);
            minSum = Math.min(windowSum,minSum);
        }
        return minSum;
    }

    public int solution(int N, int K) {
        String s = String.valueOf(N);
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(K>0) {
                String substring = s.substring(i, i + 1);
                 sum = 9 - Integer.parseInt(substring);
                if (sum > K) {
                    int i1 = Integer.parseInt(substring);
                    sb.append(i1 + K);
                } else {
                    int i1 = Integer.parseInt(substring);
                    sb.append(i1 + sum);
                }
            }
            else{
                sb.append(s.substring(i, i+1));
            }
            K -= sum;
        }
        return Integer.parseInt(sb.toString());
    }
}
