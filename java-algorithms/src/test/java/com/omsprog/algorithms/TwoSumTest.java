package com.omsprog.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        assertArrayEquals(new int[] { 0, 1 }, TwoSum.twoSum(new int[] { 2,7,11,15 }, 9));
    }
}