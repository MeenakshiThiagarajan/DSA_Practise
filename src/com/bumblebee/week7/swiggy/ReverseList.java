package com.bumblebee.week7.swiggy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    @Test
    public void test1() {
        List<Integer> input = new ArrayList<Integer>(5);
        input.add(5);
        input.add(6);
        input.add(4);
        input.add(5);
        input.add(3);
        System.out.println(reverseTheList(input));
        Assert.assertEquals(input,reverseTheList(input));
    }

    @Test
    public void test2() {
        List<Integer> input = new ArrayList<Integer>(5);
        input.add(5);
        System.out.println(reverseTheList(input));
        Assert.assertEquals(input,reverseTheList(input));
    }

    @Test(expected = RuntimeException.class)
    public void test3() {
        List<Integer> input = new ArrayList<>();
        System.out.println(reverseTheList(input));
        Assert.assertEquals(input,reverseTheList(input));
    }


    /*
    * Intialize two pointers left and right
    *   left = 0, right = input.size()
    *
    * Iterate through the list until left crosses right
    *   swap left and right
    * return the swapped list
    * 5 mins
    *
    * */


    //10 mins
    private List<Integer> reverseTheList(List<Integer> input) {
        int left = 0, right = input.size()-1;
        if(input.isEmpty()) throw new RuntimeException("Invalid input");
        if(input.size()==1) return input;
        while(left<right){
            int temp = input.get(right);
            input.set(right,input.get(left));
            input.set(left, temp);
            left++;
            right--;
        }
        return input;
    }


}
