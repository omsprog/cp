package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayIntoEqualPairsTest {
    @Test
    void test() {
        DivideArrayIntoEqualPairs dA = new DivideArrayIntoEqualPairs();
        assertTrue(dA.divideArray(new int[] {3,2,3,2,2,2}));
        assertFalse(dA.divideArray(new int[] {1,2,3,4}));
    }
}