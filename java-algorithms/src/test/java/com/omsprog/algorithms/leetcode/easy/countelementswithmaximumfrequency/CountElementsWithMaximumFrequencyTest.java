package com.omsprog.algorithms.leetcode.easy.countelementswithmaximumfrequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountElementsWithMaximumFrequencyTest {
    @Test
    void test() {
        CountElementsWithMaximumFrequency countElementsWithMaximumFrequency = new CountElementsWithMaximumFrequency();
        assertEquals(4, countElementsWithMaximumFrequency.maxFrequencyElements(new int[] {1,2,2,3,1,4}));
        assertEquals(5, countElementsWithMaximumFrequency.maxFrequencyElements(new int[] {1,2,3,4,5}));
    }
}