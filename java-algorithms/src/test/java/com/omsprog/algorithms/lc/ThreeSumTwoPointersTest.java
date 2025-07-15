package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTwoPointersTest {
    @Test
    void test() {
        ThreeSumTwoPointers tSTP = new ThreeSumTwoPointers();
        List<List<Integer>> expectedR = Arrays.asList(
                Arrays.asList(-1,-1,2),
                Arrays.asList(-1,0,1)
        );
        assertEquals(expectedR, tSTP.threeSum(new int[] {-1,0,1,2,-1,-4}));
    }
}