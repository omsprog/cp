package com.omsprog.algorithms.leetcode.easy.maximumnumberofpairsinarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfPairsInArrayTest {
    @Test
    void test() {
        MaximumNumberOfPairsInArray mNOPIA = new MaximumNumberOfPairsInArray();
        assertArrayEquals(new int[] {3,1}, mNOPIA.numberOfPairs(new int[] {1,3,2,1,3,2,2}));
        assertArrayEquals(new int[] {1,0}, mNOPIA.numberOfPairs(new int[] {1,1}));
        assertArrayEquals(new int[] {0,1}, mNOPIA.numberOfPairs(new int[] {0}));
    }
}