package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimizeMaximumPairSumInArrayTest {
    @Test
    void test() {
        MinimizeMaximumPairSumInArray mM = new MinimizeMaximumPairSumInArray();
        assertEquals(7, mM.minPairSum(new int[] {3,5,2,3}));
        assertEquals(8, mM.minPairSum(new int[] {3,5,4,2,4,6}));
    }
}