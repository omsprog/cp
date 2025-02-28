package com.omsprog.algorithms.lc;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] original = new int[gain.length + 1];
        original[0] = 0;
        int max = 0;

        for(int i = 0; i < gain.length; i++) {
            int c = gain[i] + original[i];
            original[i + 1] = c;
            max = Math.max(c, max);
        }
        return max;
    }
}
