package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIITest {
    @Test
    void test() {
        ContainsDuplicate cD = new ContainsDuplicate();
        assertEquals(true, cD.containsDuplicate(new int[] { 1, 2, 3, 1 }));
    }
}