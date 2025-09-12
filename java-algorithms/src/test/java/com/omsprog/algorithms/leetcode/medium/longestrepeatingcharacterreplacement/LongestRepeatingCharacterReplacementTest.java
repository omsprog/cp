package com.omsprog.algorithms.leetcode.medium.longestrepeatingcharacterreplacement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {
    @Test
    void test() {
        LongestRepeatingCharacterReplacement lcr = new LongestRepeatingCharacterReplacement();
        assertEquals(4, lcr.characterReplacement("ABAB", 2));
        assertEquals(4, lcr.characterReplacement("AABABBA", 1));
    }
}