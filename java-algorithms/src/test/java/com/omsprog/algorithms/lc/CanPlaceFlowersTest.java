package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {
    @Test
    void test() {
        CanPlaceFlowers cPF = new CanPlaceFlowers();
        assertEquals(true, cPF.canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
        assertEquals(false, cPF.canPlaceFlowers(new int[] {1,0,0,0,1}, 2));
        assertEquals(true, cPF.canPlaceFlowers(new int[] {0,0,1,0,1,0,0}, 2));
        assertEquals(false, cPF.canPlaceFlowers(new int[] {0,0,1,0,1,0,0}, 3));
    }
}