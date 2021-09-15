package com.bumblebee.september;

/* You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes,
where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

numberOfBoxesi is the number of boxes of type i.
numberOfUnitsPerBoxi is the number of units in each box of the type i.
You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck.
You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.



Example 1:

Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
Output: 8
Explanation: There are:
- 1 box of the first type that contains 3 units.
- 2 boxes of the second type that contain 2 units each.
- 3 boxes of the third type that contain 1 unit each.
You can take all the boxes of the first and second types, and one box of the third type.
The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
Example 2:

Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
Output: 91
* */

import org.junit.Test;

import java.util.Arrays;

public class MaxNumOfBoxesInTruck {

    @Test
    public void test1(){
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;
    }

    @Test
    public void test2(){
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
    }

    /* Initialise the sum = 0
    * Sort the array in descending order with respect to number of units using comparator
    * Iterate through the array Check the number of boxes and trucksize
    *   if number of boxes less than or equal to trucksize
    *       add the (number of units ) * (number of boxes) to the sum and subtract number of boxes value from trucksize
    *       until trucksize becomes 0
    *   if to number of boxes greater than trucksize
    *    add (number of unit) * (number of boxes equals trucksize) to the sum and subtract number of boxes value from trucksize
    * return the sum
    * */
    private int findMaxNumOfBoxes(int[][] boxTypes, int truckSize){
        int sum = 0;
        Arrays.sort(boxTypes,(a, b)->{
            if(a[1]!=b[1]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        for(int i=0; i<boxTypes.length; i++){
            if(boxTypes[0][i]==truckSize){

            }
        }

        return 0;
    }

}
