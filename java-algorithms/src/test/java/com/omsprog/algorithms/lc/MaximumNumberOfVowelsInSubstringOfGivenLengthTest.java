package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfVowelsInSubstringOfGivenLengthTest {
    @Test
    void test() {
        MaximumNumberOfVowelsInSubstringOfGivenLength mN = new MaximumNumberOfVowelsInSubstringOfGivenLength();
        assertEquals(3, mN.maxVowels("abciiidef", 3));
        assertEquals(2, mN.maxVowels("aeiou", 2));
        assertEquals(2, mN.maxVowels("leetcode", 3));
    }
}