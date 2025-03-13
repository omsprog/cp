package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {
    @Test
    void test() {
        FibonacciNumber fN = new FibonacciNumber();
        assertEquals(1, fN.fib(2));
        assertEquals(2, fN.fib(3));
        assertEquals(3, fN.fib(4));
    }
}