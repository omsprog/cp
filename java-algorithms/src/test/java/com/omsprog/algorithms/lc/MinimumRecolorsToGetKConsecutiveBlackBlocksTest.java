package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRecolorsToGetKConsecutiveBlackBlocksTest {
    @Test
    void test() {
        MinimumRecolorsToGetKConsecutiveBlackBlocks mR = new MinimumRecolorsToGetKConsecutiveBlackBlocks();
        assertEquals(3, mR.minimumRecolors("WBBWWBBWBW", 7));
        assertEquals(0, mR.minimumRecolors("WBWBBBW", 2));
    }
}