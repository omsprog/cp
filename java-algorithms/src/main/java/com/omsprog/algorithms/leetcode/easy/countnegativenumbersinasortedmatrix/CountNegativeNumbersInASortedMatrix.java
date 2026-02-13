package com.omsprog.algorithms.leetcode.easy.countnegativenumbersinasortedmatrix;

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int negativeCounter = 0;

        for(int[] row : grid) {
            int left = 0;
            int right = row.length - 1;

            while(left <= right) {
                int mid = left + (right - left) / 2;
                if(row[mid] >= 0)
                    left = mid + 1;
                else
                    right = mid - 1;
            }

            int negativeCounterRow = row.length - left;
            negativeCounter += negativeCounterRow;
        }

        return negativeCounter;
    }
}
