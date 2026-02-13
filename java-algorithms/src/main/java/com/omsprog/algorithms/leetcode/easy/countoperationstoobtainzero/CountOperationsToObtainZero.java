package com.omsprog.algorithms.leetcode.easy.countoperationstoobtainzero;

public class CountOperationsToObtainZero {
    public int countOperations(int num1, int num2) {
        int numOperations = 0;

        while(num1 != 0 && num2 != 0) {
            if(num1 >= num2)
                num1 -= num2;
            else
                num2 -= num1;
            ++numOperations;
        }

        return numOperations;
    }
}
