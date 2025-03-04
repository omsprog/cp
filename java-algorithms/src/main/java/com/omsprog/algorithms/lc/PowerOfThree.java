package com.omsprog.algorithms.lc;

public class PowerOfThree {
    public boolean isPowerOfThreeRecursive(int n, long accum) {
        if(n <= 0 || accum > n) return false;
        if(n == accum) return true;
        return isPowerOfThreeRecursive(n, accum * 3);
    }

    public boolean isPowerOfThree(int n) {
        return isPowerOfThreeRecursive(n, 1);
    }
}
