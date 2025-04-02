package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void test() {
        LongestSubstringWithoutRepeatingCharacters lS = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, lS.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, lS.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, lS.lengthOfLongestSubstring("pwwkew"));
    }
}