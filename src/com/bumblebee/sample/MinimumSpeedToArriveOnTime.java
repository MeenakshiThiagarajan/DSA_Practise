package com.bumblebee.sample;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSpeedToArriveOnTime {

    @Test
    public void test1() {
        double hour = 6;
        int[] dist = {1,3,2};
        System.out.println(findMinimumSpeed(dist, hour));
        Assert.assertEquals(1,findMinimumSpeed(dist, hour));
    }

    /* Pseudo code
    * Find the total distance and have that as the range of speed, if the total speed is 6 then the train can travel at
    * least speed by 1 or high speed by 6
    * Using binary search find the mid point and consider that as speed and calculate time taken using that speed and
    * check if that is lesser or greater that the time given
    *   if the time is lesser than the given time, reduce the speed (High = mid-1)
    *   if the time is greate than the given time, increase the speed (Low = mid+1)
    *
    *
    *
    * */


    private int findMinimumSpeed(int[] dist, double hour) {
        if(hour<=dist.length-1) return -1;
        int low = 1, high = 10000000;
        //iterate speed from 1 to 10^7
        int mid = 0;
        double totalTimeTaken = 0;
        while(low<=high) {
            mid = (low+high)/2;
            totalTimeTaken = 0;
            for(int i=0; i<dist.length-1; i++){
                //divide each distance/each speed, and round off to highest giving time
                totalTimeTaken  += Math.ceil((double) dist[i]/mid);
            }
            //add the last element/each speed to the sum
            totalTimeTaken = totalTimeTaken+(double) dist[dist.length-1]/mid;
            //check if total hours is less than targeted hour
            if(totalTimeTaken<hour) high = mid-1;
            //check if total hours is greater than targeted hour
            else if(totalTimeTaken>hour) low = mid+1;
            else return mid;
        }
        if(totalTimeTaken>hour) return mid+1;
        else return mid;
    }


}
