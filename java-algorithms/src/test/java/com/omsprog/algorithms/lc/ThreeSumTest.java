package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    @Test
    void test() {
        ThreeSum tS = new ThreeSum();
        List<List<Integer>> expectedR = Arrays.asList(
                Arrays.asList(-1,1,0),
                Arrays.asList(-1,2,-1)
        );
        assertEquals(expectedR, tS.threeSum(new int[] {-1,0,1,2,-1,-4}));
    }
}