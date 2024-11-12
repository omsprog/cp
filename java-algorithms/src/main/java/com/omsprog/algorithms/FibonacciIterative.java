package com.omsprog.algorithms;

public class FibonacciIterative {

    public static int generate(int n) {
        int first = 0;
        int second = 1;
        int result = 0;

        if(n < 2) return n;

        for(int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}