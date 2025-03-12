package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {
    @Test
    void test() {
        PascalTriangle pT = new PascalTriangle();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(List.of(1)));
        result.add(new ArrayList<>(List.of(1,1)));
        result.add(new ArrayList<>(List.of(1,2,1)));
        result.add(new ArrayList<>(List.of(1,3,3,1)));
        result.add(new ArrayList<>(List.of(1,4,6,4,1)));

        assertEquals(result, pT.generate(5));
    }
}