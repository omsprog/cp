package com.omsprog.algorithms.lc;

public class PowerOfTwo {
    private boolean isPowerOfTwoR(int n, long accum) {
        if(n == accum) return true;
        else if(accum > n || n <= 0) return false;
        else return isPowerOfTwoR(n, accum * 2);
    }

    public boolean isPowerOfTwo(int n) {
        return isPowerOfTwoR(n, 1);
    }
}
