package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {
    @Test
    void test() {
        SpiralMatrix sM = new SpiralMatrix();
//        sM.spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
        sM.spiralOrder(new int[][] {{1,2,3,4},
                                    {5,6,7,8},
                                   {9,10,11,12}});
    }
}