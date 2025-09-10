package com.omsprog.algorithms.leetcode.easy.maximumaveragesubarrayi.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAverageSubarrayISlidingWindowTest {
    @Test
    void test() {
        MaximumAverageSubarrayISlidingWindow mASSW = new MaximumAverageSubarrayISlidingWindow();
        assertEquals(12.75000, mASSW.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        assertEquals(5.00000, mASSW.findMaxAverage(new int[] {5}, 1));
    }
}