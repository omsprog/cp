package com.omsprog.algorithms.leetcode.easy.substringsofsizethreewithdistinctcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringsOfSizeThreeWithDistinctCharactersTest {
    @Test
    void test() {
        SubstringsOfSizeThreeWithDistinctCharacters sOSTWDC = new SubstringsOfSizeThreeWithDistinctCharacters();
        assertEquals(1, sOSTWDC.countGoodSubstrings("xyzzaz"));
        assertEquals(4, sOSTWDC.countGoodSubstrings("aababcabc"));
    }
}