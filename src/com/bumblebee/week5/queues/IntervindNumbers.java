package com.bumblebee.week5.queues;

import java.util.ArrayDeque;

public class IntervindNumbers {



    private ArrayDeque<Integer> findinterleaving(int[] intarr) {
        int left=0,right=intarr.length/2;
        ArrayDeque<Integer> arrdeq= new ArrayDeque<Integer>();
        while (	right<intarr.length) {
            arrdeq.offer(intarr[left++]);
            arrdeq.offer(intarr[right++]);
        }
        return arrdeq;
    }
}

