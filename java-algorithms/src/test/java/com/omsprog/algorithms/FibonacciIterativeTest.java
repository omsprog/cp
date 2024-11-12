package com.omsprog.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FibonacciIterativeTest {

    @Test
    void generate() {
        assertEquals(102334155, FibonacciIterative.generate(40));
    }
}