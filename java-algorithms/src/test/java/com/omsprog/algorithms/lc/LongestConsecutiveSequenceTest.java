package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    @Test
    void test() {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        assertEquals(4, lcs.longestConsecutive(new int[] {100,4,200,1,3,2}));
        assertEquals(9, lcs.longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
        assertEquals(3, lcs.longestConsecutive(new int[] {1,0,1,2}));
    }
}