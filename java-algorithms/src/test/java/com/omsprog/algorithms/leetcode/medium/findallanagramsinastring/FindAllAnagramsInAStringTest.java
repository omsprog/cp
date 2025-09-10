package com.omsprog.algorithms.leetcode.medium.findallanagramsinastring;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsInAStringTest {
    @Test
    void test() {
        FindAllAnagramsInAString fAA = new FindAllAnagramsInAString();
        assertEquals(List.of(0,6), fAA.findAnagrams("cbaebabacd", "abc"));
        assertEquals(List.of(0,1,2), fAA.findAnagrams("abab", "ab"));
    }
}