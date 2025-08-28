package com.omsprog.algorithms.leetcode.medium.validsudoku;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board.length; c++) {
                char element = board[r][c];
                if(element == '.') continue;
                int val = element - '0' - 1;
                int boxIndex = (r / 3) * 3 + (c / 3);

                if(rows[r][val] || cols[c][val] || boxes[boxIndex][val] )
                    return false;
                rows[r][val] = true;
                cols[c][val] = true;
                boxes[boxIndex][val] = true;
            }
        }

        return true;
    }
}
