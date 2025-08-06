package com.omsprog.algorithms.lc;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public int minSwaps(String s) {
        int a = 0;
        int b = s.length() - 1;
        int result = 0;
        int aC = 0;
        int bC = 0;

        while(a < b) {
            while(aC >= 0) {
                if(a == b) return result;
                char c = s.charAt(a);
                if(c == '[')
                    ++aC;
                else
                    --aC;
                ++a;
            }
            --a;

            while(bC >= 0) {
                if(a == b) return result;
                char c = s.charAt(b);
                if(c == ']')
                    ++bC;
                else
                    --bC;
                --b;
            }
            ++result;
            aC = 1;
            bC = 1;
            ++a;
        }

        return result;
    }
}
