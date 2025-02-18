package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {
    @Test
    void test() {
        GreatestCommonDivisorOfStrings gCD = new GreatestCommonDivisorOfStrings();
        assertEquals("ABC", gCD.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", gCD.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", gCD.gcdOfStrings("LEET", "CODE"));
    }
}