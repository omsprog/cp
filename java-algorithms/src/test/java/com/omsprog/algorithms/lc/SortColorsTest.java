package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {
    @Test
    void test() {
        SortColors sC = new SortColors();
        int[] a1 = new int[]{2,0,2,1,1,0};
        sC.sortColors(a1);
        int[] a2 = new int[]{2,0,1};
        sC.sortColors(a2);

        assertArrayEquals(new int[] { 0,0,1,1,2,2 }, a1);
        assertArrayEquals(new int[] { 0,1,2 }, a2);
    }
}