package com.bumblebee.week2problems;

import org.junit.Assert;
import org.junit.Test;

/*
Question : Merge Sorted Array

    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
    representing the number of elements in nums1 and nums2 respectively.Merge nums1 and nums2 into a single array
    sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
    and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

    Example 1:

    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    1) Did I understand the problem? Yes
        *         -> If No, Ask the person to provide more detail with example(s)
                      So from question there will always a majority element in the input
        *         -> If yes, go to next step !!
        --------Set of Questions to be asked--------
        *    What is the input(s)? --> In this program the input will be two integer arrays nums1 = length(m+n) num2 = length(n)
        *    What is the expected output? --> num1 array with merged elements from nums2
        *    Do I have constraints to solve the problem? --> Ask for constraints (If need to follow specific
                1. Algorithm
                2. Time complexity
                3. Space complexity

        *    Do I have all information to go to next step!! -> yes

    2) Test data set
        *    Prepare the positive, negative and edge cases
        *    In this problem
        -----> Positive Cases - Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output: [1,2,2,3,5,6]
        -----> Negative Cases -
        -----> Edge Cases -

    3) Do I know how to solve it? -> yes
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
        *   using 2 pointer

    6) If I know the alternate soltions -> find out the 'O' notations.
        --> Start with worst -> Improve -> end up with Best
        --> Write the options and benefits and code the best

    7) Psuedocode

*/
public class MergeSortedArray {

    @Test
    public void test1() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Assert.assertArrayEquals(new int[] {1,2,2,3,5,6}, mergeSortedArrayUsingTwoPointer(nums1, nums2));
        //Assert.assertArrayEquals(new int[] {1,2,2,3,5,6}, mergeSortedArrayBruteForce(nums1, nums2));

    }


    /* Pseudocode
    * Get the input arrays nums1, nums2
    * Intialize count as 0
    * Traverse through the array nums1 from the index nums1.length-nums2.length until nums1.length and the add the
    *   nums2 elements in nums1 array from count index of nums2 and increment count
    * Traverse through the nums1 till nums1.length using outer loop and check if the next element is smaller
    *   if true then swap the elements
    * */

    /*
    * Time Complexity -> O(m/2) + O(n^2)
    * Space Complexity -> O(m/2) + O(n)
    * */

    private int[] mergeSortedArrayBruteForce(int[] nums1, int[] nums2) {
        int count = 0;
        for(int i=nums1.length-nums2.length; i<nums1.length; i++) {
            nums1[i] = nums2[count++];
        }

        for(int i=0; i<nums1.length;i++) {
            int temp = 0;
            for(int j=i+1; j<nums1.length;j++) {
                if(nums1[j]<nums1[i]) {
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        return nums1;
    }


    /* Pseudocode
     * Get the input arrays nums1, nums2
     * Intialize count as 0
     * Traverse through the array nums1 from the index nums1.length-nums2.length until nums1.length and the add the
     *   nums2 elements in nums1 array from count index of nums2 and increment count
     * Traverse through the nums1 till nums1.length using outer loop and check if the next element is smaller
     *   if true then swap the elements
     * */

    /*
     * Time Complexity -> O(m/2) + O(n^2)
     * Space Complexity -> O(m/2) + O(n)
     * */

    private int[] mergeSortedArrayUsingTwoPointer(int[] nums1, int[] nums2) {

        int i = 0, j = 0, temp;

        while(i<nums1.length && j<nums2.length) {
            temp = 0;
            if(i>=nums1.length-nums2.length) nums1[i++] = nums2[j++];

            else if(nums2[j]>=nums1[i]) i++;

            else {
                temp = nums1[i];
                nums1[i++] = nums2[j];
                nums2[j] = temp;
            }

        }
        return nums1;
    }

}
