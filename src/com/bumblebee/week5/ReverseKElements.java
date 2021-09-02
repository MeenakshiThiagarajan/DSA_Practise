package com.bumblebee.week5;



/* Iterate till K-1 in the array and Push the elements from array to stack
* Declare a queue and add the elements from k to length of the array to queue
* Pop the elements from the stack and add to the output queue and then add the elements from queue
*
*
*
*
* */

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Stack;

public class ReverseKElements {
    @Test
    public void test1() {
        int[] input = {2,4,6,8,10};
        int k = 3;
        System.out.println(reverseKElements(input,k));
        //Assert.assertEquals(new  reverseKElements(input));
    }

    private ArrayDeque reverseKElements(int[] input, int k) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> outputQueue = new ArrayDeque<>();
        Stack<Integer> stack  = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if(i<k) stack.push(input[i]);
           else queue.offer(input[i]);
        }
        for (int i = 0; i < input.length; i++) {
            if(i<k) outputQueue.offer(stack.pop());
            else outputQueue.offer(queue.poll());
        }
        return outputQueue;
    }

}
