package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {
    @Test
    void test() {
        FindPeakElement fPE = new FindPeakElement();
        assertEquals(2, fPE.findPeakElement(new int[] {1,2,3,1}));
        assertEquals(5, fPE.findPeakElement(new int[] {1,2,1,3,5,6,4}));
    }
}