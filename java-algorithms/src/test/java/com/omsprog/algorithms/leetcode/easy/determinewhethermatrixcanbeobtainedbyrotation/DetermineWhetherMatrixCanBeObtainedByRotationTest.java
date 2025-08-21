package com.omsprog.algorithms.leetcode.easy.determinewhethermatrixcanbeobtainedbyrotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineWhetherMatrixCanBeObtainedByRotationTest {
    @Test
    void test() {
        DetermineWhetherMatrixCanBeObtainedByRotation determineWhetherMatrixCanBeObtainedByRotation = new DetermineWhetherMatrixCanBeObtainedByRotation();
        assertTrue(determineWhetherMatrixCanBeObtainedByRotation.findRotation(new int[][] {{0,1}, {1,0}}, new int[][] {{1,0}, {0,1}}));
        assertFalse(determineWhetherMatrixCanBeObtainedByRotation.findRotation(new int[][] {{0,1}, {1,1}}, new int[][] {{1,0}, {0,1}}));
        assertTrue(determineWhetherMatrixCanBeObtainedByRotation.findRotation(new int[][] {{0,0,0},{0,1,0},{1,1,1}}, new int[][] {{1,1,1},{0,1,0},{0,0,0}}));
    }
}