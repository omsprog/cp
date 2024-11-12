package com.omsprog.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceMemoTest {

    @Test
    void generate() {
        assertEquals(102334155, FibonacciSequenceMemo.generate(40));
    }
}