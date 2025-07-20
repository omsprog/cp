package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestMountainInArrayTest {
    @Test
    void test() {
        LongestMountainInArray lM = new LongestMountainInArray();
        assertEquals(5, lM.longestMountain(new int[]{2,1,4,7,3,2,5}));
        assertEquals(0, lM.longestMountain(new int[]{2,2,2}));
    }
}