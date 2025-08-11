package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsIITest {
    @Test
    void test() {
        PermutationsII p = new PermutationsII();
        assertEquals(3, p.permuteUnique(new int[] {1,1,2}).size());
        assertEquals(6, p.permuteUnique(new int[] {1,2,3}).size());
    }
}