package com.omsprog.algorithms.lc;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int lastIncreasingIndex = 0;
        int lastDecreasingIndex = 0;

        for(int a = 0; a < arr.length -1; a++) {
            if(!(arr[a] < arr[a + 1])) {
                lastIncreasingIndex = a;
                break;
            }
        }
        if(lastIncreasingIndex == 0) return false;

        for(int b = arr.length - 1; b > 0; b--) {
            if(!(arr[b - 1] > arr[b])) {
                lastDecreasingIndex = b;
                break;
            }
        }

        if(lastDecreasingIndex == arr.length - 1) return false;

        return lastIncreasingIndex == lastDecreasingIndex;
    }
}
