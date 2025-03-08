package com.omsprog.algorithms.lc;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int minOp = 0;
        int currentOperations = 0;
        int l = 0;
        int r = 0;


        for(r = 0; r < k; r++)
            if(blocks.charAt(r) == 'W') ++minOp;

        currentOperations = minOp;
        --r;

        while(r + 1 < blocks.length()) {
            if(blocks.charAt(l) == 'W') --currentOperations;
            ++l;
            ++r;
            if(blocks.charAt(r) == 'W') ++currentOperations;
            minOp = Math.min(minOp, currentOperations);
        }

        return minOp;
    }
}
