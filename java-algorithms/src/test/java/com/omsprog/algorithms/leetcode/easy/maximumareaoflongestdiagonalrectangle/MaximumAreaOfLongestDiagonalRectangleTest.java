package com.omsprog.algorithms.leetcode.easy.maximumareaoflongestdiagonalrectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAreaOfLongestDiagonalRectangleTest {
    @Test
    void test() {
        MaximumAreaOfLongestDiagonalRectangle maxArea = new MaximumAreaOfLongestDiagonalRectangle();
        assertEquals(48, maxArea.areaOfMaxDiagonal(new int[][] {{9,3},{8,6}}));
        assertEquals(12, maxArea.areaOfMaxDiagonal(new int[][] {{3,4},{4,3}}));
    }
}