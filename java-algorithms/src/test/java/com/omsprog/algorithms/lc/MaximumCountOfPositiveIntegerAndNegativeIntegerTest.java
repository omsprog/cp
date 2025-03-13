package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumCountOfPositiveIntegerAndNegativeIntegerTest {
    @Test
    void test() {
        MaximumCountOfPositiveIntegerAndNegativeInteger mC = new MaximumCountOfPositiveIntegerAndNegativeInteger();
        assertEquals(3, mC.maximumCount(new int[] {-2,-1,-1,1,2,3}));
        assertEquals(3, mC.maximumCount(new int[] {-3,-2,-1,0,0,1,2}));
    }
}