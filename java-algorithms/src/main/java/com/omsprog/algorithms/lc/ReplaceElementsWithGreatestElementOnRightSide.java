package com.omsprog.algorithms.lc;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--) {
            int c = arr[i];
            arr[i] = max;
            max = Math.max(max, c);
        }

        arr[arr.length - 1] = -1;
        return arr;
    }
}
