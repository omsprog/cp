package com.omsprog.algorithms.lc;

public class LongestMountainInArrayTwoArrays {
    public int longestMountain(int[] arr) {
        int longestMountain = 0;
        int[] up = new int[arr.length];
        int[] down = new int[arr.length];

        for(int i = 1; i < up.length; i++) {
            if(arr[i - 1] < arr[i])
                up[i] = up[i - 1] + 1;
        }

        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] > arr[i + 1])
                down[i] = down[i + 1] + 1;
        }

        for(int i = 1; i < arr.length - 1; i++) {
            int localMountain;
            if(up[i] > 0 && down[i] > 0) {
                localMountain = up[i] + down[i] + 1;
                if(localMountain > longestMountain)
                    longestMountain = localMountain;
            }

        }

        return longestMountain;
    }
}
