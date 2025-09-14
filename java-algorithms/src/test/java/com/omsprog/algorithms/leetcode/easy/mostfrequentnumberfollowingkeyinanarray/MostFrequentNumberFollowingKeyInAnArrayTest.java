package com.omsprog.algorithms.leetcode.easy.mostfrequentnumberfollowingkeyinanarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentNumberFollowingKeyInAnArrayTest {
    @Test
    void test() {
        MostFrequentNumberFollowingKeyInAnArray mFNFKIA = new MostFrequentNumberFollowingKeyInAnArray();
        assertEquals(100, mFNFKIA.mostFrequent(new int[] {1,100,200,1,100}, 1));
        assertEquals(2, mFNFKIA.mostFrequent(new int[] {2,2,2,2,3}, 2));
    }
}