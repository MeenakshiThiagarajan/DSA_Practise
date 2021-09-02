package com.bumblebee.week7.meetingProblems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindMinimumMeetingRoom {
    @Test
    public void test1() {
        String[][] meetingTimings = {{"09 00", "09 45"},{"09 30", "10 30"},{"10 40", "12 00"},{"11 00", "13 00"},{"11 45", "14 00"},{"16 00", "17 00"}};
        System.out.println(findMinMeetingRoomCount(meetingTimings));
        Assert.assertEquals(3,findMinMeetingRoomCount(meetingTimings));
    }

    /*Sort with the meeting end time and if end time are same sort with the meeting start time
      Initialize count value as number of meetings
      Declare two pointers I,j as I - end time of first meeting, j - start time of second meeting
      Iterate through the timings till I reaches last meeting end time
	    check if j>=I, if condition satisfies move I, decrement count
		else move j
    */
    private int findMinMeetingRoomCount(String[][] meetingTimings) {
        int minMeetingRoomCount = meetingTimings.length;
        int[][] meetings = new int[meetingTimings.length][2];
        for (int i = 0; i < meetings.length; i++) {
            meetings[i][0] = Integer.parseInt(meetingTimings[i][0].replace(" ",""));
            meetings[i][1] = Integer.parseInt(meetingTimings[i][1].replace(" ",""));
        }
        Arrays.sort(meetings,(a,b)->{
            if(a[1]!=b[1]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        int start = 0, end = 0;
        while(start<meetings.length) {
            if(meetings[start++][0]>=meetings[end][1]) {
                minMeetingRoomCount--;
                end++;
            }
        }
        return minMeetingRoomCount;
    }

}
