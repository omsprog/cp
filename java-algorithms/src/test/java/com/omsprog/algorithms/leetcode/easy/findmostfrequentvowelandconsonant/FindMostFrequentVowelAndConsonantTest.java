package com.omsprog.algorithms.leetcode.easy.findmostfrequentvowelandconsonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMostFrequentVowelAndConsonantTest {
    @Test
    void test() {
        FindMostFrequentVowelAndConsonant fMFVAC = new FindMostFrequentVowelAndConsonant();
        assertEquals(6, fMFVAC.maxFreqSum("successes"));
        assertEquals(3, fMFVAC.maxFreqSum("aeiaeia"));
    }
}