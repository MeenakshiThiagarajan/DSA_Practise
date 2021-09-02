package com.bumblebee.assessment;

import org.junit.Assert;
import org.junit.Test;

public class FindNumOfMeetings {
    @Test
    public void test1() {
        int[] scheduledStart = {1,1,2};
        int[] scheduledEnd = {3,2,4};
        System.out.println(findMeetingCount(scheduledStart,scheduledEnd));
        Assert.assertEquals(2,findMeetingCount(scheduledStart,scheduledEnd));
    }

    @Test
    public void test2() {
        int[] scheduledStart = {1,1,2,3};
        int[] scheduledEnd = {2,3,3,4};
        System.out.println(findMeetingCount(scheduledStart,scheduledEnd));
        Assert.assertEquals(3,findMeetingCount(scheduledStart,scheduledEnd));
    }

    private int findMeetingCount(int[] scheduledStart, int[] scheduledEnd) {
        int left = 0, right = 1,count = 0;
        while(right<scheduledStart.length) {
            if(scheduledStart[left]+scheduledStart[right]<=scheduledEnd[left]) {
                count++;
                right++;
            }
            else left++;
        }
        return count;
    }
}
