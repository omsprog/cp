package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionArrayAccordingToGivenPivotTest {
    @Test
    void test() {
        PartitionArrayAccordingToGivenPivot pA = new PartitionArrayAccordingToGivenPivot();
        assertArrayEquals(new int[] {9,5,3,10,10,12,14}, pA.pivotArray(new int[] {9,12,5,10,14,3,10}, 10));
        assertArrayEquals(new int[] {-3,2,4,3}, pA.pivotArray(new int[] {-3,4,3,2}, 2));
    }
}