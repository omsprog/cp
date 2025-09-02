package com.omsprog.algorithms.leetcode.medium.sortmatrixbydiagonals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMatrixByDiagonals {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        for(int i = 0; i < n - 1; i++) {
            // collect
            List<Integer> toSort = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                toSort.add(grid[j][n - 1 - i + j]);
            }
            // sort and update
            Collections.sort(toSort);
            for(int j = 0; j <= i; j++) {
                grid[j][n - 1 - i + j] = toSort.get(j);
            }
        }

        for(int i = 0; i < n; i++) {
            // collect
            List<Integer> toSort = new ArrayList<Integer>();
            for(int j = 0; j < n - i; j++) {
                toSort.add(grid[i + j][j]);
            }
            // sort and update
            Collections.sort(toSort, Collections.reverseOrder());
            for(int j = 0; j < n - i; j++) {
                grid[i + j][j] = toSort.get(j);
            }
        }

        return grid;
    }
}
