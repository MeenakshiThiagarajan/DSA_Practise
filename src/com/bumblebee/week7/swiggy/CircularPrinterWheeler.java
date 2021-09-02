package com.bumblebee.week7.swiggy;

import org.junit.Assert;
import org.junit.Test;

public class CircularPrinterWheeler {
    @Test
    public void test1() {
        String s = "BZA";
        System.out.println(findMinTimeToPrint(s));
        Assert.assertEquals(4,findMinTimeToPrint(s));
    }

    /*
    * Calculate the length from A to starting index of String
    * Iterate through the string and
    *
    *
    * */


    private int findMinTimeToPrint(String s) {
        for (int i = 0; i < s.length(); i++) {

        }
        return 0;
    }

}
