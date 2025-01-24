package com.omsprog.algorithms.lc;

public class ZigzagConversion {
    public String convert(String s, int numRows) {

        if(numRows >= s.length() || numRows == 1)
            return s;

        String[] rows = new String[numRows];
        StringBuilder finalStr = new StringBuilder();
        int currentRow = 0;
        boolean isDiagonal = false;

        for(int i = 0; i < s.length(); i++) {
            rows[currentRow] = rows[currentRow] == null ? String.valueOf(s.charAt(i)) : rows[currentRow] + s.charAt(i);

            currentRow = isDiagonal ? currentRow - 1 : currentRow + 1;

            if(currentRow == 0) {
                isDiagonal = false;
            }
            if(currentRow == numRows - 1) {
                isDiagonal = true;
            }
        }

        for(String row : rows)
            finalStr.append(row);

        return finalStr.toString();
    }
}
