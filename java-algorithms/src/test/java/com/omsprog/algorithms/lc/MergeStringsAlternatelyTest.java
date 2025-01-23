package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {
    @Test
    void test() {
        MergeStringsAlternately mS = new MergeStringsAlternately();
        assertEquals("apbqcr", mS.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", mS.mergeAlternately("ab", "pqrs"));
    }
}