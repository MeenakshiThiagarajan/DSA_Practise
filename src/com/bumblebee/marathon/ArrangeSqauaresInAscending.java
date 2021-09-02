package com.bumblebee.marathon;

import org.junit.Test;

import java.util.Arrays;

public class ArrangeSqauaresInAscending {

    @Test
    public void test1() {
        int[] input = {-2,0,4};
        System.out.println(Arrays.toString(sortSquares(input)));
        //Assert.assertEquals(0, returnProductOfAllNums(input));
    }

    private int[] sortSquares(int[] input) {
        int left = 0, right = input.length-1;
        int[] result = new int[input.length];

        while(left<=right) {
            if(Math.abs(input[left])> Math.abs(input[right])){
                int temp = input[right];
                input[right] = input[left];
                input[left] = temp;
                //result[right] = input[right] * input[right];
                right--;
            }
             if(Math.abs(input[left])<Math.abs(input[right])) {
                //result[right] = input[right] * input[right];
                right--;
            }
            if(Math.abs(input[left])==Math.abs(input[right]) || left==right){
                //result[right] = input[right]*input[right];
                right--;
            }
        }
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i] * input[i];
        }

        return input;
    }


}
