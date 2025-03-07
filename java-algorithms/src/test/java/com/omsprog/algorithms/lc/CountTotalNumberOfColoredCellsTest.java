package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTotalNumberOfColoredCellsTest {
    @Test
    void test() {
        CountTotalNumberOfColoredCells cT = new CountTotalNumberOfColoredCells();
        assertEquals(5, cT.coloredCells(2));
        assertEquals(13, cT.coloredCells(3));
    }
}