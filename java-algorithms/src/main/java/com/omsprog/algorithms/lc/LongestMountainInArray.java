package com.omsprog.algorithms.lc;

public class LongestMountainInArray {
    public int longestMountain(int[] arr) {
        int maxM = 0;

        for(int i = 0; i < arr.length; i++) {
            if(i != 0 && i != arr.length - 1 && arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int localM = 1;

                // to the left
                int l = i;
                while(l - 1 >= 0 && arr[l] > arr[l - 1]) {
                    --l;
                    ++localM;
                }

                // to the right
                int r = i;
                while(r + 1 < arr.length && arr[r] > arr[r + 1]) {
                    ++r;
                    ++localM;
                }

                if(localM > maxM) maxM = localM;
                i = r;
            }
        }

        return maxM;
    }
}
