package com.omsprog.algorithms.leetcode.medium.sortvowelsinastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortVowelsInAStringTest {
    @Test
    void test() {
        SortVowelsInAString sVIAS = new SortVowelsInAString();
        assertEquals("lEOtcede", sVIAS.sortVowels("lEetcOde"));
        assertEquals("lYmpH", sVIAS.sortVowels("lYmpH"));
    }
}