package com.omsprog.algorithms.leetcode.easy.maximumlengthsubstringwithtwooccurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthSubstringWithTwoOccurrencesTest {
    @Test
    void test() {
        MaximumLengthSubstringWithTwoOccurrences mLSWTO = new MaximumLengthSubstringWithTwoOccurrences();
        assertEquals(4, mLSWTO.maximumLengthSubstring("bcbbbcba"));
        assertEquals(2, mLSWTO.maximumLengthSubstring("aaaa"));
    }
}