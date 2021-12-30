package com.bumblebee.week7.swiggy;

import org.junit.Assert;
import org.junit.Test;

public class CircularPrinterWheeler {
    @Test
    public void test1() {
        String s = "BZA";
        System.out.println(findMinTimeToPrint(s));
        Assert.assertEquals(4,findTimeToPrint(s));
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

     /*
    Solution:-
    - convert the string into char array
    - iterate the array from start index to end
    - check the distance between the current character and A, also in reverse direction take the min of it add it to sum
    - return the sum
    ABCD, ZAZ
     */

    // Time complexity- O(n)
    //space complexitty - O(n)
    private int findTimeToPrint(String s) {
        char[] chars = s.toCharArray();
        int sum=Math.min(chars[0]-'A',26-(chars[0]-'A'));
        for (int i=1;i<s.length();i++){
            int diff=Math.abs(chars[i]-chars[i-1]);
            sum+=Math.min(diff,26-diff);
        }
        return sum;
    }

}
