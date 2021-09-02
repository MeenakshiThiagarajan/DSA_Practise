package com.bumblebee.week1assignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


/*

Question : Given two integer arrays nums1 and nums2, return an array of their intersection.
           Each element in the result must be unique and you may return the result in any order.

    1) Did I understand the problem? Yes or No !!
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be two integer arrays
        *    What is the expected output? --> Integer arry with common elements
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
                1. Algorithm
                2. Time complexity
                3. Space complexity
        *    Do I have all information to go to next step!!
        *    How big is your test data set will be? --> Ask for the test data(input) size to select the appropriate solution
        (Eg., size of the array)
    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - {3,2,2,2,4,2} -> Majority element 2
        -----> Negative Cases - {3,4,5,6,7,2} -> No majority element
        -----> Edge Cases -

    3) Do I know how to solve it?
        * Yes - Great, is there an alternate? -> Yes
        * No - Can I break down the problem into sub problems?
        *

    4) Ask for hint (if you do not know how to solve it?)
        *  		-> Ask one time and thank the interviewer
        *  		-> Worst Case! even after got the hint, we don't know how to solve, then convince them and prove with your confidence
        *  		   level to get the next question
        *

    5) Do I know alternate solutions as well?
        * 	Yes - What are those?
        *   Way of Approach to solve with the following
        *   -> Brute Force (Standard) --> using two for loops,
               Collections --> HahMap
        *   Other optimised solutions

    6) If I know the alternate soltions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best
    7) Psuedocode
        * Get the two input integer array, initialize count =0
        * Iterate through the arrays using for loops first one to pick element & second to compare the elements in second array
        * Check input1[i] == input2[j]
        * If condition is true store the value in count index of input1 and increment count
        * copy the input1 array till the index of count
        *
        */
public class Intersection {

    @Test
    public void test1() {
        int input1[] = {1, 2, 3, 2, 4, 2, 2};
        int input2[] = {2, 3, 5, 6};
        Assert.assertEquals(Arrays.toString(intersectionUsingStream(input1, input2)), Arrays.toString(new int[]{2, 3}));
    }

    @Test
    public void test2() {
        int input1[] = {1, 2, 3, 2, 4, 2, 2};
        int input2[] = {7, 8, 5, 6};
        Assert.assertEquals(intersectionUsingStream(input1, input2), "No common element");
    }

    private int[] intersection(int input1[], int input2[]) {
        int count = 0;

        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {

                if (input1[i] == input2[j]) {
                    input1[count] = input1[i];
                    count++;
                }
            }
        }
        if (count != 0)
            return Arrays.copyOfRange(input1, 0, count);
        else
            throw new RuntimeException("No common element");


    }


    /*
    * Get the input arrays
    * Stream it through Arrays.stream to find the distinct value
    * return intersection array
    *
    *
    * */

    public static int[] intersectionUsingStream(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1)
                .distinct()
                .filter(x -> Arrays.stream(nums2).anyMatch(y -> y == x))
                .toArray();
    }

    /*
    * Psuedo code
    *Sort the two array
	 *initialize variable i , j and k to 0
            *do a while loop and check if i and j less than length
     *if num1 of i less than num2 j value then increment j++
            *else if num1 i value greater than num2 j value then j++
            *else assign i value to the num1 based on k index
	 *
             *Time complexity - O(n log n)
     *Space complexity - O(n)
     *
    *
    * */


   public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                nums1[k++]=nums1[i];
                i++;
                j++;
            }
        }
		return  Arrays.copyOfRange(nums1, 0, k);
    }
}




