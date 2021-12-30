package com.bumblebee.paloalto;

import junit.framework.Assert;
import org.junit.Test;

import java.util.*;

public class DigitSum {

    @Test
    public void test1() {
        int[] A = { 51, 71, 17, 42 };
        Assert.assertEquals(93, solution1(A));
    }

    @Test
    public void test2() {
        int[] A = { 01, 10, 02, 20, 11 };
        Assert.assertEquals(31, solution2(A));
    }

    @Test
    public void test3() {
        int[] A = { 51, 32, 36 };
        Assert.assertEquals(-1, solution1(A));
    }

    public int solution1(int[] A) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int maxSum = -1;
        for (int eachNum : A) {
            int sum = digitSum(eachNum);
            if (sumMap.containsKey(sum)) {
                maxSum = Math.max(maxSum, sumMap.get(sum) + eachNum);
                if (eachNum > sumMap.get(sum)) {
                    sumMap.put(sum, eachNum);
                }
            } else {
                sumMap.put(sum, eachNum);
            }
        }
        return maxSum;
    }

    public int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    //I have changed flow with not contains in map and Pragat used 3rd solution

    public int solution2(int[] A) {
        int res = -1;
        if (A == null || A.length == 0) {
           return res;
        }
        int len = A.length;

        HashMap<Integer, List<Integer>> sumlist = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int currNum = A[i];
            int currSum = 0;
            //Calculate the digit sum
            while (currNum != 0) {
                currSum += currNum % 10;
                currNum /= 10;
            }
            if(!sumlist.containsKey(currSum)){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                sumlist.put(currSum, temp);
            }
            else {
                List<Integer> curId = sumlist.get(currSum);
                for (Integer j : curId) {
                    int num = A[j];
                    res = Math.max(res, num + A[i]);
                }
                sumlist.get(currSum).add(i);
            }
        }
        return res;
    }

    private int solution3(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0, n = arr[i];
            List<Integer> list = new ArrayList<Integer>();
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            if (map.containsKey(sum)) {
                list.addAll(map.get(sum));
                list.add(arr[i]);
                map.put(sum, list);
            } else {
                list.add(arr[i]);
                map.put(sum, list);
            }
        }
        int max = -1;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = new ArrayList<Integer>();
            list.addAll(entry.getValue());
            if (list.size() > 1) {
                Collections.sort(list);
                max = Math.max(max, list.get(list.size() - 1) + list.get(list.size() - 2));
            }
        }
        return max;
    }

}
