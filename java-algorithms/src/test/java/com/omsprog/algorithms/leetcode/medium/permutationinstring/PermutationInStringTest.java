package com.omsprog.algorithms.leetcode.medium.permutationinstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {
    @Test
    void test() {
        PermutationInString pS = new PermutationInString();
        assertTrue(pS.checkInclusion("ab", "eidbaooo"));
        assertFalse(pS.checkInclusion("ab", "eidboaoo"));
    }
}