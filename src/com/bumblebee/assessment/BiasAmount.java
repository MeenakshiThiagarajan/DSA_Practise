package com.bumblebee.assessment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiasAmount {
    @Test
    public void test1() {

        int[] input = {4, 2, 5, 1};
        List<Integer> lengths = new ArrayList<>();
        lengths.add(4);
        lengths.add(2);
        lengths.add(5);
        lengths.add(1);


        System.out.println(findMinBiasAmount(lengths));
        Assert.assertEquals(2, findMinBiasAmount(lengths));
    }

    private int findMinBiasAmount(List<Integer> lengths) {
        int left = 0, right = 1, sum = 0;
        Collections.sort(lengths);
        while (left < lengths.size()) {
            sum += (lengths.get(right) - lengths.get(left));
            left = left + 2;
            right = right + 2;
        }
        return sum;

    }

    private int findMinBiasAmountUsingForLoop(List<Integer> lengths) {
        int left = 0, right = 1, sum = 0;
        Collections.sort(lengths);
        while (left < lengths.size()) {
            sum += (lengths.get(right) - lengths.get(left));
            left = left + 2;
            right = right + 2;
        }
        return sum;

    }
}
