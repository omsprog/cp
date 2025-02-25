package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualRowAndColumnPairsTest {
    @Test
    void test() {
        EqualRowAndColumnPairs eR = new EqualRowAndColumnPairs();
        assertEquals(1, eR.equalPairs(new int[][] {{3,2,1}, {1,7,6},{2,7,7}}));
    }
}