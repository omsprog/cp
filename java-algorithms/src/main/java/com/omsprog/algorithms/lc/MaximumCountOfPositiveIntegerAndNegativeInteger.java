package com.omsprog.algorithms.lc;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;
        for(int num : nums) {
            if(num < 0) ++neg;
            else if(num > 0) ++pos;
        }
        return Math.max(neg, pos);
    }
}
