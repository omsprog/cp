package com.omsprog.algorithms.leetcode.medium.longestsubstringofallvowelsinorder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringOfAllVowelsInOrderTest {
    @Test
    void test() {
        LongestSubstringOfAllVowelsInOrder lSOAVIO = new LongestSubstringOfAllVowelsInOrder();
        assertEquals(13, lSOAVIO.longestBeautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu"));
        assertEquals(5, lSOAVIO.longestBeautifulSubstring("aeeeiiiioooauuuaeiou"));
        assertEquals(0, lSOAVIO.longestBeautifulSubstring("a"));
    }
}