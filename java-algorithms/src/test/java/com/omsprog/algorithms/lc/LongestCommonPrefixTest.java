package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    @Test
    void test() {
        LongestCommonPrefix lCP = new LongestCommonPrefix();
        assertEquals("fl", lCP.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        assertEquals("", lCP.longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }
}