package com.omsprog.algorithms.lc;

public class KthSymbolInGrammar {
    public int kthGrammar(int n, int k) {
        int pointerA = 1;
        int pointerB = (int) Math.pow(2, n - 1);
        int currentValue = 0;

        for(int i = 0; i < n - 1; i++) {
            int midPoint = pointerA + (pointerB - pointerA) / 2;
            if(k <= midPoint) // take left branch
                pointerB = midPoint;
            else { // take right branch
                pointerA = midPoint + 1;
                currentValue = currentValue == 0 ? 1 : 0;
            }
        }

        return currentValue;
    }
}
