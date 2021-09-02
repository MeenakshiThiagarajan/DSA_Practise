package com.bumblebee.randomProblems;


/*Given heights of n towers and a value k. We have to either increase or decrease height of every tower by k (only once) where k > 0. The task is to minimise the difference between the heights of the longest and the shortest tower after modifications, and output this difference.
Examples:
Input : arr[] = {1, 15, 10}, k = 6
Output : Maximum difference is 5.
Explanation : We change 1 to 7, 15 to
9 and 10 to 4. Maximum difference is 5
(between 4 and 9). We can't get a lower
difference.
* */


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HeightOfTowers {
    @Test
    public void test1() {
        int arr[] = {1, 15, 10};
        int k = 6;
        Assert.assertEquals(5, findDifferenceInHeights(arr,k));
    }

    @Test
    public void test2() {
        int arr[] = {1, 2, 3};
        int k = 2;
        Assert.assertEquals(2, findDifferenceInHeights(arr,k));
    }

    @Test
    public void test3() {
        int arr[] = {3,3,3};
        int k = 5;
        Assert.assertEquals(0, findDifferenceInHeights(arr,k));
    }

    /* Sort the given input array
    * Iterate through the array and check if greater or lower than K
    *   if lower add to it
    *   if greater subtract from it
    *  Find the min and max from the modified array and return the difference of it
    * */
    private int findDifferenceInHeights(int[] arr, int k) {
        Arrays.sort(arr);
        int diff = arr[arr.length-1]-arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(((arr[i]+k)-(arr.length-1))>diff) arr[i] = arr[i]-k;

        }
        Arrays.sort(arr);
        return arr[arr.length-1]-arr[0];

    }

}
