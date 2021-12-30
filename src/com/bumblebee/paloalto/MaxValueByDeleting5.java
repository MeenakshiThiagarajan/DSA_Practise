package com.bumblebee.paloalto;

import org.junit.Test;

import junit.framework.Assert;

public class MaxValueByDeleting5 {

    @Test
    public void test1() {
        int n = -15657;
        Assert.assertEquals(-1567, solution1(n));
    }

    @Test
    public void test2() {
        int n = 15958;
        Assert.assertEquals(1958, solution1(n));
    }

    private int solution1(int n) {
        boolean isPositive = true;
        if (n < 0) {
            isPositive = false;
            n *= -1;
        }
        String s = Integer.toString(n);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '5') {
                String temp = s.substring(0, i);
                StringBuilder sb = new StringBuilder(temp);
                sb.append(s.substring(i + 1));
                int tempInt = Integer.parseInt(sb.toString());

                if (!isPositive)
                    min = Math.min(tempInt, min);
                    ///max = Math.max(tempInt, max);
                else
                    max = Math.max(tempInt, max);
                //min = Math.min(tempInt, min);
            }
        }
        return !isPositive ? min * -1: max   ;

    }

    private int solution2(int n) {
        String s = Integer.toString(n);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '5') {
                String temp = s.substring(0, i) + s.substring(i + 1);
                int tempInt = Integer.parseInt(temp);
                max = Math.max(tempInt, max);
            }
        }
        return max;
    }

    private int solution3(int n) {
        String s = Integer.toString(n);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '5') {
                StringBuilder sb = new StringBuilder(s);
                max = Math.max(Integer.parseInt(sb.deleteCharAt(i).toString()), max);
            }
        }
        return max;
    }

}
