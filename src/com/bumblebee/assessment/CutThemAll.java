package com.bumblebee.assessment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutThemAll {
    @Test
    public void test1() {
        long minLength = 9;
        int[] input = {3, 5, 4, 3};
        List<Long> lengths = new ArrayList<>();
        lengths.add(3L);
        lengths.add(5L);
        lengths.add(4L);
        lengths.add(3L);


        System.out.println(findMinLengthCutting(lengths, minLength));
        Assert.assertEquals("Possible", findMinLengthCutting(lengths, minLength));
    }

    @Test
    public void test2() {
        long minLength = 7;
        int[] input = {4, 3, 2};
        List<Long> lengths = new ArrayList<>();
        lengths.add(4L);
        lengths.add(3L);
        lengths.add(2L);

        System.out.println(cutThemAll(lengths, minLength));
        //Assert.assertEquals("Possible", findMinLengthCutting(lengths, minLength));
        Assert.assertEquals("Possible", cutThemAll(lengths, minLength));
    }

    private String findMinLengthCutting(List<Long> lengths, long minLength) {
        int left = 0, right = lengths.size()-1, sum = 0;
        for(int i=0; i<lengths.size();i++){
            sum += lengths.get(i);
        }
        if(sum<minLength) return "Impossible";
        while(right-left>1){
            if(lengths.get(right)<lengths.get(left)) {
                sum -= lengths.get(right);
                if(sum<minLength) return "Impossible";
                //lengths.remove(lengths.get(right));
                right--;
            }
            if(right-left!=1 && lengths.get(right)>=lengths.get(left)) {
                sum -= lengths.get(left);
                if(sum<minLength) return "Impossible";
               // lengths.remove(lengths.get(left));
                left++;
            }
        }
       return "Possible";
    }

    public static String cutThemAll(List<Long> lengths, long minLength) {
        long max = 0;
        for (int i = 0; i < lengths.size()-1; i++) {
            max = Math.max(max, lengths.get(i) + lengths.get(i + 1));
        }
        if (max >= minLength) return "Possible";
        else return "Impossible";
    }

}
