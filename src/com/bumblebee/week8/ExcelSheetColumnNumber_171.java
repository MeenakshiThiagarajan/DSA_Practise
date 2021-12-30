package com.bumblebee.week8;

import org.junit.Assert;
import org.junit.Test;

/*
* Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding
column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...


Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
Example 4:

Input: columnTitle = "FXSHRXW"
Output: 2147483647
* */
public class ExcelSheetColumnNumber_171 {
    @Test
    public void test1(){
        String columnTitle = "A";
        Assert.assertEquals(1,titleToNumber(columnTitle));
    }

    public int titleToNumber(String columnTitle) {
        // Iterate through string from right ot left
        // Multiply the value with 26 for each column
        // return the total value
        int total = 0, product = 1;
        for(int i=columnTitle.length()-1; i>=0; i--){
            int val = (columnTitle.charAt(i)-'A'+1);
            total += val*product;
            product *= 26;
        }
        return total;
    }
}
