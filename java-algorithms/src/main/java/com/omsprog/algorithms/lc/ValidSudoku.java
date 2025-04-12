package com.omsprog.algorithms.lc;

import java.util.Set;
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowSet = new Set[9];
        Set<Character>[] colSet = new Set[9];
        Set<Character>[][] boxSet = new Set[3][3];

        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                char ch = board[r][c];

                if(ch == '.') continue;

                Set<Character> col = colSet[c];
                if(col == null) col = new HashSet<Character>();
                if(col.contains(ch)) return false;
                col.add(ch);
                colSet[c] = col;

                Set<Character> row = rowSet[r];
                if(row == null) row = new HashSet<Character>();
                if(row.contains(ch)) return false;
                row.add(ch);
                rowSet[r] = row;

                Set<Character> box = boxSet[r / 3][c / 3];
                if(box == null) box = new HashSet<Character>();
                if(box.contains(ch)) return false;
                box.add(ch);
                boxSet[r / 3][c / 3] = box;
            }
        }

        return true;
    }
}
