package com.omsprog.algorithms.leetcode.easy.maximumaveragesubarrayi.buildandslide;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayIBuildAndSlideTest {
    @Test
    void test() {
        MaximumAverageSubarrayIBuildAndSlide mAS = new MaximumAverageSubarrayIBuildAndSlide();
        assertEquals(12.75000, mAS.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        assertEquals(5.00000, mAS.findMaxAverage(new int[] {5}, 1));
    }
}