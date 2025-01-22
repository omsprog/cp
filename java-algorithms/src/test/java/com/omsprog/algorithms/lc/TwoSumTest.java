package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void test() {
        TwoSum tS = new TwoSum();
        assertArrayEquals(new int[] { 0, 1 }, tS.twoSum(new int[] { 2, 7, 11, 15 }, 9));
        assertArrayEquals(new int[] { 1, 2 }, tS.twoSum(new int[] { 3, 2, 4 }, 6));
    }
}