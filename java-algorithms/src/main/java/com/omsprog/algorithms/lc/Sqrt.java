package com.omsprog.algorithms.lc;

public class Sqrt {
    public int mySqrt(int x) {
        if(x < 2) return x;

        int pointerA = 1;
        int pointerB = x;
        int result = 0;

        while(pointerA <= pointerB) {
            int midPoint = pointerA + (pointerB - pointerA) / 2;
            long midPointCalc = (long) midPoint * midPoint;

            if(midPointCalc == x) return midPoint;
            else if(midPointCalc < x) {
                result = midPoint;
                pointerA = midPoint + 1;
            } else pointerB = midPoint - 1;
        }

        return result;
    }
}
