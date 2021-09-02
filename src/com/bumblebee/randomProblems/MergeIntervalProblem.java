package com.bumblebee.randomProblems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeIntervalProblem {
    @Test
    public void test1(){
        int[][] intervals = {{1,3},{2,4},{6,9}};
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
    }

    @Test
    public void test2(){
        int[][] intervals = {{1,3},{4,5},{6,9}};
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
    }

    private int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> {
            return a[0]-b[0];
        });
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        int[] end = list.get(0);
        int endIndex = end[1];
        int j = 0;
        for (int i = 1; i < intervals.length; i++) {
            if(endIndex>=intervals[i][0]) {
                (list.get(j))[1] = Math.max(endIndex, intervals[i][1]);
            }
            else {
                list.add(intervals[i]);
                j++;
            }
            endIndex = (list.get(j))[1];
        }
        int[][] result = list.toArray(new int[list.size()][2]);
        return result ;

    }
}
