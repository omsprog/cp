package com.omsprog.algorithms.lc;

import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int expected = 0;
        int actual = 0;
        int counter = 0;
        Set<Integer> memory = new HashSet<>();
        int a = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                ++counter;
                expected = expected + counter;
                actual += grid[i][j];
                if(memory.contains(grid[i][j])) a = grid[i][j];
                else memory.add(grid[i][j]);
            }
        }

        // 1) expected = actual - a + missing
        // 2) missing = expected - actual + a
        // 3) missing = 10 - 8 + 2 = 4

        return new int[]{a, expected - actual + a};
    }
}
