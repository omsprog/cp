package com.omsprog.algorithms.leetcode.medium.spiralmatrixiv;

import com.omsprog.algorithms.lc.ListNode;

public class SpiralMatrixIV {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int expectedLength = m * n;
        int left = 0, up = 0, right = 0, down = 0;
        int processed = 0;
        int[][] matrix = new int[m][n];

        while(true) {
            // right
            for(int i = left; i < n - right; i++) {
                int val = head == null ? - 1 : head.val;
                matrix[up][i] = val;
                ++processed;
                if(processed == expectedLength) return matrix;
                if(head != null) head = head.next;
            }
            ++up;

            // down
            for(int i = up; i < m - down; i++) {
                int val = head == null ? - 1 : head.val;
                matrix[i][n - 1 - right] = val;
                ++processed;
                if(processed == expectedLength) return matrix;
                if(head != null) head = head.next;
            }
            ++right;

            // left
            for(int i = n - 1 - right; i >= left; i--) {
                int val = head == null ? - 1 : head.val;
                matrix[m - 1 - down][i] = val;
                ++processed;
                if(processed == expectedLength) return matrix;
                if(head != null) head = head.next;
            }
            ++down;

            // up
            for(int i = m - 1 - down; i >= up; i--) {
                int val = head == null ? - 1 : head.val;
                matrix[i][left] = val;
                ++processed;
                if(processed == expectedLength) return matrix;
                if(head != null) head = head.next;
            }
            ++left;
        }
    }
}
