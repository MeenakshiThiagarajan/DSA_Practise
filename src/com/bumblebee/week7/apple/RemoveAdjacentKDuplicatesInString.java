package com.bumblebee.week7.apple;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class RemoveAdjacentKDuplicatesInString {

    @Test
    public void testcase1() {
        String s = "abcd";
        int k=6;
        Assert.assertEquals("abcd",removeAdjacentKDuplicates(s,k));
    }

    private String removeAdjacentKDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<Character>();
        Stack<Integer> charCountStack = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if(!charStack.empty() && charStack.peek()==s.charAt(i)){
                int count = charCountStack.peek();
                charCountStack.push(count+1);
                charStack.push(s.charAt(i));
            }else{
                charCountStack.push(1);
                charStack.push(s.charAt(i));
            }
            if(charCountStack.peek()==k){
                int temp = k;
                while(temp>0){
                    charStack.pop();
                    charCountStack.pop();
                    temp--;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character chars:charStack) {
            result.append(chars);
        }
        return result.toString();
    }
}
