package com.omsprog.algorithms.leetcode.medium.containerwithmostwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    @Test
    void test() {
        ContainerWithMostWater cW = new ContainerWithMostWater();
        assertEquals(49, cW.maxArea(new int[] { 1,8,6,2,5,4,8,3,7 }));
        assertEquals(1, cW.maxArea(new int[] { 1,1 }));
    }
}