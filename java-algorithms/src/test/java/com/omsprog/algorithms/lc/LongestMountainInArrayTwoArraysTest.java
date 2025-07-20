package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestMountainInArrayTwoArraysTest {
    @Test
    void test() {
        LongestMountainInArrayTwoArrays lm = new LongestMountainInArrayTwoArrays();
        assertEquals(5, lm.longestMountain(new int[]{2,1,4,7,3,2,5}));
        assertEquals(0, lm.longestMountain(new int[]{2,2,2}));
    }
}