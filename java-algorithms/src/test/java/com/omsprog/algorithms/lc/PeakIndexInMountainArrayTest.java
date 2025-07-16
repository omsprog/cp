package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakIndexInMountainArrayTest {
    @Test
    void test() {
        PeakIndexInMountainArray pIMA = new PeakIndexInMountainArray();
        assertEquals(1, pIMA.peakIndexInMountainArray(new int[] {0,1,0}));
        assertEquals(1, pIMA.peakIndexInMountainArray(new int[] {0,2,1,0}));
        assertEquals(1, pIMA.peakIndexInMountainArray(new int[] {0,10,5,2}));
    }
}