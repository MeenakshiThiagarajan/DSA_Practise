package com.bumblebee.september;

/*
* Input - String s = "{{())}}"
* Output - False
*
* */

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ConfirmValidParanthesis {
    @Test
    public void test1(){
        String s = "{{())}}";
        Assert.assertFalse(checkForValidParanthesis(s));
    }

    @Test
    public void test2(){
        String s = "{{(())}}";
        Assert.assertTrue(checkForValidParanthesis(s));
    }

    @Test
    public void test3(){
        String s = "}{";
        Assert.assertFalse(checkForValidParanthesis(s));
    }

    /* Initialize a stack
    * Initialise a HashMap with closing brace as key and opening brace as value
    * Iterate through the string and check if it contains in stack
    *   if not add to the stack
    *   if it contains in map, get the value and peek in the stack and
    *       if matches pop it
    *       else return false
    *
    *
    *
    *
    *
    *
    *
    * */
    private boolean checkForValidParanthesis(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.peek()!=map.get(s.charAt(i))) return false;
                if(!stack.empty() && stack.peek()==map.get(s.charAt(i))) stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if(!stack.empty()) return false;
        return true;
    }
}
