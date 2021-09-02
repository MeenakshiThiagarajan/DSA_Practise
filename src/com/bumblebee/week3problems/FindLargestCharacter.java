package com.bumblebee.week3problems;

/*
* Given a sorted character array and a target character, find the next biggest character in the array.


char[] cha = {‘b’, ‘d’ , ‘h’};
char k = ‘e’
Output ->  h
*
*
*
* */


import org.junit.Assert;
import org.junit.Test;

public class FindLargestCharacter {

    @Test
    public void test1() {
        char[] input = {'b','d','h'};
        char k = 'e';
        //System.out.println(returnMinimum(input));
        Assert.assertEquals('h', findNextBiggestCharOfK(input, k));
    }

    @Test
    public void test2() {
        char[] input = {'b'};
        char k = 'c';
        //System.out.println(returnMinimum(input));
        Assert.assertEquals(' ', findNextBiggestCharOfK(input, k));
    }

    @Test
    public void test3() {
        char[] input = {'b','d','e','h','i'};
        char k = 'c';
        //System.out.println(returnMinimum(input));
        Assert.assertEquals('d', findNextBiggestCharOfK(input, k));
    }

    private char findNextBiggestCharOfK(char[] input, char k) {
        int low = 0, high = input.length-1, mid;
        while(low<=high) {
            mid = (low+high)/2;
            if(input[mid] > k) return input[mid];
            if(input[mid] <= k) low = mid+1;

        }
        return ' ';
    }
}
