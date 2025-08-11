package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {
    @Test
    void test() {
        Permutations permutations = new Permutations();
        assertEquals(24, permutations.permute(new int[] {1,2,3,4}).size());
        assertEquals(2, permutations.permute(new int[] {0,1}).size());
    }
}