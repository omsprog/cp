package com.omsprog.algorithms.lc;

public class CountTotalNumberOfColoredCells {
    public long coloredCells(int n) {
        if(n == 0) return 0;

        long accum = 0;

        for(int i = 1; i <= n; i++) {
            accum = accum + (i * 4) - 4; // perimeter area then substract edges
        }

        return accum + 1;
    }
}
