package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalT = new ArrayList<>();
        pascalT.add(new ArrayList(List.of(1)));
        if(numRows == 1) return pascalT;
        pascalT.add(new ArrayList(List.of(1,1)));
        if(numRows == 2) return pascalT;

        int cRow = 2;
        for(; cRow < numRows; cRow++) {
            List<Integer> previousRow = pascalT.get(cRow - 1);
            int length = cRow + 1;
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int aux = 1; aux < length - 1; aux++) {
                int s = previousRow.get(aux - 1) + previousRow.get(aux);
                currentRow.add(s);
            }
            currentRow.add(1);
            pascalT.add(currentRow);
        }

        return pascalT;
    }
}
