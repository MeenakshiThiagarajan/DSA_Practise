package com.bumblebee.week7.swiggy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FinfLongestEvenWord {

    @Test
    public void test1() {
        String s = "Time to write great coders";
        System.out.println(findLongestEvenWord(s));
        Assert.assertEquals(4,findLongestEvenWord(s));
    }

    private String findLongestEvenWord(String s) {
        int max = 0;

        String[] split = s.split("//s+");
        for(int i=0; i<split.length; i++) {
            //if(split[i].length()%2==0 && )
        }




        return null;
    }
}
