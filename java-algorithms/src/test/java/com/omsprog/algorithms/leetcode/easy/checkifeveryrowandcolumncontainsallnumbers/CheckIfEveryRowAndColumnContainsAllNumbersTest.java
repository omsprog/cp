package com.omsprog.algorithms.leetcode.easy.checkifeveryrowandcolumncontainsallnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfEveryRowAndColumnContainsAllNumbersTest {
    @Test
    void test() {
        CheckIfEveryRowAndColumnContainsAllNumbers cIE = new CheckIfEveryRowAndColumnContainsAllNumbers();
        assertTrue(cIE.checkValid(new int[][] {{1,2,3},{3,1,2},{2,3,1}}));
        assertFalse(cIE.checkValid(new int[][] {{1,1,1},{1,2,3},{1,2,3}}));
    }
}