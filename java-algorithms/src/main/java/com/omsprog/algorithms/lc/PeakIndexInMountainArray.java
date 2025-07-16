package com.omsprog.algorithms.lc;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int a = 0;
        int b = arr.length - 1;

        while(true) {
            int midPoint = (a + b) / 2;
            int previous = midPoint - 1;
            int next = midPoint + 1;
            if(arr[previous] < arr[midPoint] && arr[next] < arr[midPoint])
                return midPoint;
            else if(arr[previous] < arr[midPoint] && arr[midPoint] < arr[next])
                a = midPoint;
            else
                b = midPoint;
        }
    }
}
