package com.omsprog.algorithms.leetcode.easy.validanagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    @Test
    void test() {
        ValidAnagram vA = new ValidAnagram();
        assertTrue(vA.isAnagram("anagram", "nagaram"));
        assertFalse(vA.isAnagram("rat", "car"));
    }
}