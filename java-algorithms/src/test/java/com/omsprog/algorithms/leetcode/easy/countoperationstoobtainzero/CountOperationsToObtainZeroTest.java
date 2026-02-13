package com.omsprog.algorithms.leetcode.easy.countoperationstoobtainzero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOperationsToObtainZeroTest {
    @Test
    void test() {
        CountOperationsToObtainZero countOperationsToObtainZero = new CountOperationsToObtainZero();
        assertEquals(3, countOperationsToObtainZero.countOperations(2, 3));
        assertEquals(1, countOperationsToObtainZero.countOperations(10, 10));
    }
}