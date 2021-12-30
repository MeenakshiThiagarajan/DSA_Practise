package com.bumblebee.week8;

public class Find007IsInOrder {

    private boolean Find007IsInOrder(int[] A){
        String val = "007";
        String toForm = "";
        for(int i : A) {
            if(i == 0 || i == 7) toForm += i+"";
            if(toForm.length() == 3) return toForm.equals(val);
        }
        return false;

    }
    private boolean Find007IsInOrder1(int[] A) {
        int n = A.length;
        int zero_count = 0, seven_count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0)
                zero_count++;
            else if (A[i] == 7){
                if (zero_count > 1) return true;
                else zero_count = 0;
            }

        }
        return false;
    }

}

