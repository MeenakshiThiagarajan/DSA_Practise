package com.bumblebee.week7.meetingProblems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindWhetherPersonCanAttendAllMeeting {
    @Test
    public void test1() {
        int[][] intervals = {{0,30},{5,10},{15,20}};
        System.out.println(findPersonCanAttendAllMeetings(intervals));
        Assert.assertFalse(findPersonCanAttendAllMeetings(intervals));
    }

    @Test
    public void test2() {
        int[][] intervals = {{7,10},{2,4}};
        System.out.println(findPersonCanAttendAllMeetings(intervals));
        Assert.assertTrue(findPersonCanAttendAllMeetings(intervals));
    }

    @Test
    public void test3() {
        int[][] intervals = {{25,30},{5,10},{15,20}};
        System.out.println(findPersonCanAttendAllMeetings(intervals));
        Assert.assertTrue(findPersonCanAttendAllMeetings(intervals));
    }


    private boolean findPersonCanAttendAllMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        int start = 0, end = 1;
        while(end<intervals.length) {
            if (intervals[start++][1] > intervals[end++][0]) return false;
        }
        return true;
    }
}
