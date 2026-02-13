package com.omsprog.algorithms.leetcode.easy.maximumcountofpositiveintegerandnegativeinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumCountOfPositiveIntegerAndNegativeIntegerTest {
    @Test
    void test() {
        MaximumCountOfPositiveIntegerAndNegativeInteger solution = new MaximumCountOfPositiveIntegerAndNegativeInteger();
        assertEquals(3, solution.maximumCount(new int[] {-2,-1,-1,1,2,3}));
        assertEquals(3, solution.maximumCount(new int[] {-3,-2,-1,0,0,1,2}));
        assertEquals(4, solution.maximumCount(new int[] {5,20,66,1314}));
    }
}