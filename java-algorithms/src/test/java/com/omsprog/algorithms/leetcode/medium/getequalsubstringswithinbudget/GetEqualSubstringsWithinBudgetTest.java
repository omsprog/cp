package com.omsprog.algorithms.leetcode.medium.getequalsubstringswithinbudget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetEqualSubstringsWithinBudgetTest {
    @Test
    void test() {
        GetEqualSubstringsWithinBudget gESWB = new GetEqualSubstringsWithinBudget();
        assertEquals(3, gESWB.equalSubstring("abcd", "bcdf", 3));
        assertEquals(1, gESWB.equalSubstring("abcd", "cdef", 3));
        assertEquals(1, gESWB.equalSubstring("abcd", "acde", 0));
    }
}