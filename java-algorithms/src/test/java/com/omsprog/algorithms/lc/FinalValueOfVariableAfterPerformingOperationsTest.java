package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalValueOfVariableAfterPerformingOperationsTest {
    @Test
    void test() {
        FinalValueOfVariableAfterPerformingOperations fV = new FinalValueOfVariableAfterPerformingOperations();
        assertEquals(1, fV.finalValueAfterOperations(new String[] {"--X", "X++", "X++"}));
    }
}