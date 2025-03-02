package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplyOperationsToAnArrayTest {
    @Test
    void test() {
        ApplyOperationsToAnArray aP = new ApplyOperationsToAnArray();
        assertArrayEquals(new int[]{ 1,4,2,0,0,0 },aP.applyOperations(new int[]{ 1,2,2,1,1,0 }));
        assertArrayEquals(new int[]{ 1,0 },aP.applyOperations(new int[]{ 0, 1 }));
    }
}