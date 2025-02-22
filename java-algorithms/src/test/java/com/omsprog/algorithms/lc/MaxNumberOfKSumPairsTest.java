package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberOfKSumPairsTest {
    @Test
    void test() {
        MaxNumberOfKSumPairs mN = new MaxNumberOfKSumPairs();
        assertEquals(2, mN.maxOperations(new int[] {1,2,3,4}, 5));
        assertEquals(1, mN.maxOperations(new int[] {3,1,3,4,3}, 6));
    }
}