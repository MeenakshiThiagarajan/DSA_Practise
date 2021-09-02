package com.bumblebee.week3problems;

import org.junit.Assert;
import org.junit.Test;

public class FindSquareRoot {
    @Test
    public void test1() {
        int input = 15;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(3, SquareRootBinarySearch(input));
    }

    @Test
    public void test2() {
        int input = 16;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(4, SquareRootBinarySearch(input));
    }
    @Test
    public void test3() {
        int input = 1;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(1, SquareRootBinarySearch(input));
    }
    @Test
    public void test4() {
        int input = 4;
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(2, SquareRootBinarySearch(input));
    }

    /* Iterate starting num from 1 to given integer
    * check if num * num == target -> return num
    * If num * num > target break the loop and return num-1;
    *
    * */
    private int SquareRootLinearSearch(int input) {
        if(input<0) throw new RuntimeException("Invalid input");
        if(input==1) return 1;
        for(int i=1;i<=input/2;i++) {
            if(i * i == input) return i;
            else if(i * i > input) return i-1;
        }
        return 0;
    }


    /*
    * Intialize low = 1, high = inputNum/2
    * Find mid low+high/2
    * Check mid == mid * mid > inputNum make high -mid-1
    * Check mid == mid * mid < inputNum make low -mid+1
    * Continue til low crosses high
    *
    *
    * */
    private int SquareRootBinarySearch(int input) {
        int low = 1, high = input/2, mid = 0;
        if(input==1) return 1;
        while(low<high) {
            mid = (low+high) / 2;
            if(mid*mid == input) return mid;
            else if(mid*mid > input) high = mid-1;
           // else if(mid==low && mid*mid<input) return mid;
            else low = mid+1;

        }
       return high;
    }

}
