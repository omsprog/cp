package com.omsprog.algorithms.lc;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation : operations)
            if(operation.indexOf('+') != -1)
                ++x;
            else
                --x;
        return x;
    }
}
