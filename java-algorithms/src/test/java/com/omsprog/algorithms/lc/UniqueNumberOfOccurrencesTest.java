package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurrencesTest {
    @Test
    void test() {
        UniqueNumberOfOccurrences uNO = new UniqueNumberOfOccurrences();
        assertEquals(true, uNO.uniqueOccurrences(new int[] {1,2,2,1,1,3}));
        assertEquals(false, uNO.uniqueOccurrences(new int[] {1,2}));
        assertEquals(true, uNO.uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
    }
}