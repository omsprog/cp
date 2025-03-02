package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwo2DArraysBySummingValuesTest {
    @Test
    void test() {
        MergeTwo2DArraysBySummingValues mTA = new MergeTwo2DArraysBySummingValues();
        assertArrayEquals(new int[][]{{1,6},{2,3},{3,2},{4,6}},
                mTA.mergeArrays(new int[][] { {1,2},{2,3},{4,5} }, new int[][] {{1,4},{3,2},{4,1}}));
        assertArrayEquals(new int[][]{{1,3},{2,4},{3,6},{4,3},{5,5}},
                mTA.mergeArrays(new int[][] {{2,4},{3,6},{5,5}}, new int[][] {{1,3},{4,3}}));
    }
}