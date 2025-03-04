package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicArrayTest {
    @Test
    void test() {
        MonotonicArray mA = new MonotonicArray();
        assertTrue(mA.isMonotonic(new int[] {1,2,2,3}));
        assertTrue(mA.isMonotonic(new int[] {6,5,4,4}));
        assertFalse(mA.isMonotonic(new int[] {1,3,2}));
        assertTrue(mA.isMonotonic(new int[] {10,10,10}));
        assertTrue(mA.isMonotonic(new int[] {10,10,11}));
    }
}