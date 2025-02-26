package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {
    @Test
    void test() {
        MaximumAverageSubarrayI mA = new MaximumAverageSubarrayI();
        assertEquals(12.75000d, mA.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
    }
}