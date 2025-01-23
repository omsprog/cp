package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {
    @Test
    void test() {
        NumberOfIslands nOI = new NumberOfIslands();
        assertEquals(1, nOI.numIslands(new char[][]{{ '1','1','1','1','0' },
                                                    { '1','1','0','1','0' },
                                                    { '1','1','0','0','0' },
                                                    { '0','0','0','0','0' }}));
    }
}