package com.omsprog.algorithms.leetcode.easy.countnegativenumbersinasortedmatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNegativeNumbersInASortedMatrixTest {
    @Test
    void test() {
        CountNegativeNumbersInASortedMatrix cnn = new CountNegativeNumbersInASortedMatrix();
        assertEquals(8, cnn.countNegatives(new int[][] {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}}));
        assertEquals(0, cnn.countNegatives(new int[][] {{3,2}, {1,0}}));
    }
}