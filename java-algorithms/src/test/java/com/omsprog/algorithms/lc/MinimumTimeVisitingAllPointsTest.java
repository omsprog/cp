package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumTimeVisitingAllPointsTest {
    @Test
    void test() {
        MinimumTimeVisitingAllPoints mTV = new MinimumTimeVisitingAllPoints();
        assertEquals(7, mTV.minTimeToVisitAllPoints(new int[][] {{1, 1}, {3, 4}, {-1, 0}}));
    }
}