package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingAndRepeatedValuesTest {
    @Test
    void test() {
        FindMissingAndRepeatedValues fM = new FindMissingAndRepeatedValues();
        assertArrayEquals(new int[] {2,4}, fM.findMissingAndRepeatedValues(new int[][] {{1,3}, {2,2}}));
        assertArrayEquals(new int[] {9,5}, fM.findMissingAndRepeatedValues(new int[][] {{9,1,7}, {8,9,2}, {3,4,6}}));
    }
}