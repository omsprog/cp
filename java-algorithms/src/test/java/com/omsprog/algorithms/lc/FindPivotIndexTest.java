package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {
    @Test
    void test() {
        FindPivotIndex fPI = new FindPivotIndex();
        assertEquals(3, fPI.pivotIndex(new int[] {1,7,3,6,5,6}));
        assertEquals(-1, fPI.pivotIndex(new int[] {1,2,3}));
        assertEquals(0, fPI.pivotIndex(new int[] {2,1,-1}));
    }
}