package com.bumblebee.week1assignment;

import java.util.Arrays;

public class MaxOccurence {


        public static void main(String[] args)
        {
            int[] arr = {2,2,2,2,6,6,1};
            int[] countArr = new int[arr.length];
            int count = 0;
            int midSize = arr.length/2;


            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i+1; j < arr.length; j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;


                        }
                    }
                if(count>midSize)
                        {
                }
            }
            System.out.println(count);
            System.out.println(Arrays.toString(countArr));
        }
    }


